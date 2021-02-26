package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to set the size of the underlying data of a stream to zero. */
@js.native
trait XTruncate extends XInterface {
  
  /** sets the size of the underlying data of the stream to zero. */
  def truncate(): Unit = js.native
}
object XTruncate {
  
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, truncate: () => Unit): XTruncate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), truncate = js.Any.fromFunction0(truncate))
    __obj.asInstanceOf[XTruncate]
  }
  
  @scala.inline
  implicit class XTruncateMutableBuilder[Self <: XTruncate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTruncate(value: () => Unit): Self = StObject.set(x, "truncate", js.Any.fromFunction0(value))
  }
}
