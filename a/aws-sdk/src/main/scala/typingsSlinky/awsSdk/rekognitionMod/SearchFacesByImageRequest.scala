package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFacesByImageRequest extends StObject {
  
  /**
    * ID of the collection to search.
    */
  var CollectionId: typingsSlinky.awsSdk.rekognitionMod.CollectionId = js.native
  
  /**
    * (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
  
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typingsSlinky.awsSdk.rekognitionMod.Image = js.native
  
  /**
    * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence in the match.
    */
  var MaxFaces: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.MaxFaces] = js.native
  
  /**
    * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't searched for in the collection. If you specify AUTO, Amazon Rekognition chooses the quality bar. If you specify LOW, MEDIUM, or HIGH, filtering removes all faces that don’t meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you specify NONE, no filtering is performed. The default value is NONE.  To use quality filtering, the collection you are using must be associated with version 3 of the face model or higher.
    */
  var QualityFilter: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.QualityFilter] = js.native
}
object SearchFacesByImageRequest {
  
  @scala.inline
  def apply(CollectionId: CollectionId, Image: Image): SearchFacesByImageRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFacesByImageRequest]
  }
  
  @scala.inline
  implicit class SearchFacesByImageRequestMutableBuilder[Self <: SearchFacesByImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceMatchThreshold(value: Percent): Self = StObject.set(x, "FaceMatchThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceMatchThresholdUndefined: Self = StObject.set(x, "FaceMatchThreshold", js.undefined)
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFaces(value: MaxFaces): Self = StObject.set(x, "MaxFaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFacesUndefined: Self = StObject.set(x, "MaxFaces", js.undefined)
    
    @scala.inline
    def setQualityFilter(value: QualityFilter): Self = StObject.set(x, "QualityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityFilterUndefined: Self = StObject.set(x, "QualityFilter", js.undefined)
  }
}
