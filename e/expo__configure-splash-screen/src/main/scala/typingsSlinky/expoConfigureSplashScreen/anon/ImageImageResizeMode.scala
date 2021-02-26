package typingsSlinky.expoConfigureSplashScreen.anon

import typingsSlinky.expoConfigureSplashScreen.constantsMod.SplashScreenImageResizeModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageImageResizeMode extends StObject {
  
  var image: js.UndefOr[String] = js.native
  
  var imageResizeMode: js.UndefOr[SplashScreenImageResizeModeType] = js.native
}
object ImageImageResizeMode {
  
  @scala.inline
  def apply(): ImageImageResizeMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageImageResizeMode]
  }
  
  @scala.inline
  implicit class ImageImageResizeModeMutableBuilder[Self <: ImageImageResizeMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageResizeMode(value: SplashScreenImageResizeModeType): Self = StObject.set(x, "imageResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageResizeModeUndefined: Self = StObject.set(x, "imageResizeMode", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
