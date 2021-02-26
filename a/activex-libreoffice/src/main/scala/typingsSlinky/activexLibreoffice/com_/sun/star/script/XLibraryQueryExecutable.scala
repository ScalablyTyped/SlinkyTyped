package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLibraryQueryExecutable extends XInterface {
  
  def HasExecutableCode(name: String): Boolean = js.native
}
object XLibraryQueryExecutable {
  
  @scala.inline
  def apply(
    HasExecutableCode: String => Boolean,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLibraryQueryExecutable = {
    val __obj = js.Dynamic.literal(HasExecutableCode = js.Any.fromFunction1(HasExecutableCode), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLibraryQueryExecutable]
  }
  
  @scala.inline
  implicit class XLibraryQueryExecutableMutableBuilder[Self <: XLibraryQueryExecutable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasExecutableCode(value: String => Boolean): Self = StObject.set(x, "HasExecutableCode", js.Any.fromFunction1(value))
  }
}
