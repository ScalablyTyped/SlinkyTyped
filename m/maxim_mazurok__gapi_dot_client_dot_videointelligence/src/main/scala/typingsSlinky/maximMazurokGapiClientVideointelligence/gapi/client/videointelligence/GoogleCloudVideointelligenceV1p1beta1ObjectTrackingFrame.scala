package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrame extends js.Object {
  
  /** The normalized bounding box location of this object track for the frame. */
  var normalizedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1p1beta1NormalizedBoundingBox] = js.native
  
  /** The timestamp of the frame in microseconds. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrameOps[Self <: GoogleCloudVideointelligenceV1p1beta1ObjectTrackingFrame] (val x: Self) extends AnyVal {
    
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
    def setNormalizedBoundingBox(value: GoogleCloudVideointelligenceV1p1beta1NormalizedBoundingBox): Self = this.set("normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedBoundingBox: Self = this.set("normalizedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
  }
}
