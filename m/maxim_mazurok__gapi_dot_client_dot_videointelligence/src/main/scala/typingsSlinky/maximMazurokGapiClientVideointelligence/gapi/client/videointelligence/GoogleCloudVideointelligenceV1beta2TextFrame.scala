package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2TextFrame extends js.Object {
  
  /** Bounding polygon of the detected text for this frame. */
  var rotatedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly] = js.native
  
  /** Timestamp of this frame. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1beta2TextFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2TextFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2TextFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2TextFrameOps[Self <: GoogleCloudVideointelligenceV1beta2TextFrame] (val x: Self) extends AnyVal {
    
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
    def setRotatedBoundingBox(value: GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly): Self = this.set("rotatedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotatedBoundingBox: Self = this.set("rotatedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
  }
}
