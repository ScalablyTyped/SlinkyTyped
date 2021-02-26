package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for the releasing of resources acquired by the implementing object. */
@js.native
trait XCloseable extends XInterface {
  
  /**
    * releases all resources connected to an object.
    * @throws SQLException if a database access error occurs.
    */
  def close(): Unit = js.native
}
object XCloseable {
  
  @scala.inline
  def apply(acquire: () => Unit, close: () => Unit, queryInterface: `type` => js.Any, release: () => Unit): XCloseable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), close = js.Any.fromFunction0(close), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCloseable]
  }
  
  @scala.inline
  implicit class XCloseableMutableBuilder[Self <: XCloseable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
