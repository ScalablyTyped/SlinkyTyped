package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1Image extends StObject {
  
  /** Optional. Height of the image in number of pixels. */
  var height: js.UndefOr[Double] = js.native
  
  /** Required. URL of the image with a length limit of 5 KiB. */
  var uri: js.UndefOr[String] = js.native
  
  /** Optional. Width of the image in number of pixels. */
  var width: js.UndefOr[Double] = js.native
}
object GoogleCloudRecommendationengineV1beta1Image {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1Image]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ImageMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
