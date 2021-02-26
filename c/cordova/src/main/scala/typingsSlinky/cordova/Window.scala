package typingsSlinky.cordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var cordova: Cordova = js.native
}
object Window {
  
  @scala.inline
  def apply(cordova: Cordova): Window = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCordova(value: Cordova): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
  }
}
