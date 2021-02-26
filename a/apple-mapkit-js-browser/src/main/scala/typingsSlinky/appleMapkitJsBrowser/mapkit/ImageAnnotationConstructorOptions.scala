package typingsSlinky.appleMapkitJsBrowser.mapkit

import typingsSlinky.appleMapkitJsBrowser.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing options for initializing an image annotation.
  */
@js.native
trait ImageAnnotationConstructorOptions extends AnnotationConstructorOptions {
  
  /**
    * An object containing URLs for the image assets in multiple resolutions.
    */
  var url: `1` = js.native
}
object ImageAnnotationConstructorOptions {
  
  @scala.inline
  def apply(url: `1`): ImageAnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnnotationConstructorOptions]
  }
  
  @scala.inline
  implicit class ImageAnnotationConstructorOptionsMutableBuilder[Self <: ImageAnnotationConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: `1`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
