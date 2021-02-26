package typingsSlinky.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Android extends StObject {
  
  var android: Error = js.native
  
  var ios: Error = js.native
}
object Android {
  
  @scala.inline
  def apply(android: Error, ios: Error): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  
  @scala.inline
  implicit class AndroidMutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: Error): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos(value: Error): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
