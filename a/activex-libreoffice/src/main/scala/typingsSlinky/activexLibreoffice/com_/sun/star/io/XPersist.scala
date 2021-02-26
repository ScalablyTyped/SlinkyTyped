package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to write this object to an URL or read it from an URL. */
@js.native
trait XPersist extends XInterface {
  
  /** reads all the persistent data of the object from the URL. */
  def read(URL: String): Unit = js.native
  
  /** writes all the persistent data of the object to the URL. */
  def write(URL: String): Unit = js.native
}
object XPersist {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    read: String => Unit,
    release: () => Unit,
    write: String => Unit
  ): XPersist = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[XPersist]
  }
  
  @scala.inline
  implicit class XPersistMutableBuilder[Self <: XPersist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRead(value: String => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
