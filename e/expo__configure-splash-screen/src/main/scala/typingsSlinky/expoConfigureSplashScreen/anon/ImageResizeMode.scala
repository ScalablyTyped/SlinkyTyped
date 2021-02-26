package typingsSlinky.expoConfigureSplashScreen.anon

import typingsSlinky.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageResizeMode extends StObject {
  
  var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.native
}
object ImageResizeMode {
  
  @scala.inline
  def apply(): ImageResizeMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageResizeMode]
  }
  
  @scala.inline
  implicit class ImageResizeModeMutableBuilder[Self <: ImageResizeMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
  }
}
