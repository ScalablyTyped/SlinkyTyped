package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecognizeCelebritiesRequest extends StObject {
  
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typingsSlinky.awsSdk.rekognitionMod.Image = js.native
}
object RecognizeCelebritiesRequest {
  
  @scala.inline
  def apply(Image: Image): RecognizeCelebritiesRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeCelebritiesRequest]
  }
  
  @scala.inline
  implicit class RecognizeCelebritiesRequestMutableBuilder[Self <: RecognizeCelebritiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
  }
}
