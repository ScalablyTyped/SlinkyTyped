package typingsSlinky.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCommunityCliTypes.androidMod.AndroidProjectParams
import typingsSlinky.reactNativeCommunityCliTypes.iosMod.IOSProjectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Android
  extends /* key */ StringDictionary[js.Any] {
  
  var android: js.UndefOr[AndroidProjectParams] = js.native
  
  var ios: js.UndefOr[IOSProjectParams] = js.native
}
object Android {
  
  @scala.inline
  def apply(): Android = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Android]
  }
  
  @scala.inline
  implicit class AndroidMutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: AndroidProjectParams): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setIos(value: IOSProjectParams): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
