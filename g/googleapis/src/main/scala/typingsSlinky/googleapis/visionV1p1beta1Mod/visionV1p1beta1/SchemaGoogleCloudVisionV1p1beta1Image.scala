package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Client image to perform Google Cloud Vision API tasks over.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1Image extends StObject {
  
  /**
    * Image content, represented as a stream of bytes. Note: As with all
    * `bytes` fields, protobuffers use a pure binary representation, whereas
    * JSON representations use base64.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Google Cloud Storage image location, or publicly-accessible image URL. If
    * both `content` and `source` are provided for an image, `content` takes
    * precedence and is used to perform the image annotation request.
    */
  var source: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ImageSource] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1Image {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1Image]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1ImageMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaGoogleCloudVisionV1p1beta1ImageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
