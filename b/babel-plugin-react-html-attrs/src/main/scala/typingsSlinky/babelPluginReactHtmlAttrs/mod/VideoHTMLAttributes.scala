package typingsSlinky.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoHTMLAttributes[T] extends MediaHTMLAttributes[T] {
  
  var disablePictureInPicture: js.UndefOr[Boolean] = js.native
  
  var disablepictureinpicture: js.UndefOr[Boolean | String] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var poster: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object VideoHTMLAttributes {
  
  @scala.inline
  def apply[T](): VideoHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class VideoHTMLAttributesMutableBuilder[Self <: VideoHTMLAttributes[_], T] (val x: Self with VideoHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setDisablePictureInPicture(value: Boolean): Self = StObject.set(x, "disablePictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
