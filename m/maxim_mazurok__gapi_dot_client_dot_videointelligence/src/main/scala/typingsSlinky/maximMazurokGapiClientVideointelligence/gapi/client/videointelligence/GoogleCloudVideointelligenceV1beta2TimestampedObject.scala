package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2TimestampedObject extends js.Object {
  
  /** Optional. The attributes of the object in the bounding box. */
  var attributes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2DetectedAttribute]] = js.native
  
  /** Optional. The detected landmarks. */
  var landmarks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2DetectedLandmark]] = js.native
  
  /** Normalized Bounding box in a frame, where the object is located. */
  var normalizedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox] = js.native
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this object. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1beta2TimestampedObject {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2TimestampedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2TimestampedObject]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2TimestampedObjectOps[Self <: GoogleCloudVideointelligenceV1beta2TimestampedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributesVarargs(value: GoogleCloudVideointelligenceV1beta2DetectedAttribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[GoogleCloudVideointelligenceV1beta2DetectedAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setLandmarksVarargs(value: GoogleCloudVideointelligenceV1beta2DetectedLandmark*): Self = this.set("landmarks", js.Array(value :_*))
    
    @scala.inline
    def setLandmarks(value: js.Array[GoogleCloudVideointelligenceV1beta2DetectedLandmark]): Self = this.set("landmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandmarks: Self = this.set("landmarks", js.undefined)
    
    @scala.inline
    def setNormalizedBoundingBox(value: GoogleCloudVideointelligenceV1beta2NormalizedBoundingBox): Self = this.set("normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedBoundingBox: Self = this.set("normalizedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
  }
}
