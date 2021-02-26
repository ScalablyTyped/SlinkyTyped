package typingsSlinky.chromecastCafSender

import typingsSlinky.chromecastCafSender.anon.Typeofcast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Global object
////////////////////
@js.native
trait Window extends StObject {
  
  def __onGCastApiAvailable(available: Boolean): Unit = js.native
  
  var cast: Typeofcast = js.native
}
object Window {
  
  @scala.inline
  def apply(__onGCastApiAvailable: Boolean => Unit, cast: Typeofcast): Window = {
    val __obj = js.Dynamic.literal(__onGCastApiAvailable = js.Any.fromFunction1(__onGCastApiAvailable), cast = cast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCast(value: Typeofcast): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__onGCastApiAvailable(value: Boolean => Unit): Self = StObject.set(x, "__onGCastApiAvailable", js.Any.fromFunction1(value))
  }
}
