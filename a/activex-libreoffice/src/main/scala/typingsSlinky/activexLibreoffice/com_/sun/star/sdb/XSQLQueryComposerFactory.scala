package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a factory for instances of service {@link com.sun.star.sdb.SQLQueryComposer} . */
@js.native
trait XSQLQueryComposerFactory extends XInterface {
  
  /**
    * creates a new query composer.
    * @returns the {@link SQLQueryComposer} object
    */
  def createQueryComposer(): XSQLQueryComposer = js.native
}
object XSQLQueryComposerFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createQueryComposer: () => XSQLQueryComposer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSQLQueryComposerFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createQueryComposer = js.Any.fromFunction0(createQueryComposer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSQLQueryComposerFactory]
  }
  
  @scala.inline
  implicit class XSQLQueryComposerFactoryMutableBuilder[Self <: XSQLQueryComposerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateQueryComposer(value: () => XSQLQueryComposer): Self = StObject.set(x, "createQueryComposer", js.Any.fromFunction0(value))
  }
}
