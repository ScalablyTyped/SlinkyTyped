package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectTextRequest extends StObject {
  
  /**
    * Optional parameters that let you set the criteria that the text must meet to be included in your response.
    */
  var Filters: js.UndefOr[DetectTextFilters] = js.native
  
  /**
    * The input image as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Rekognition operations, you can't pass image bytes.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typingsSlinky.awsSdk.rekognitionMod.Image = js.native
}
object DetectTextRequest {
  
  @scala.inline
  def apply(Image: Image): DetectTextRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectTextRequest]
  }
  
  @scala.inline
  implicit class DetectTextRequestMutableBuilder[Self <: DetectTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: DetectTextFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
  }
}
