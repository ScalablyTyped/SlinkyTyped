package typingsSlinky.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video frame level annotation results for text annotation (OCR). Contains
  * information regarding timestamp and bounding box locations for the frames
  * containing detected OCR text snippets.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame extends js.Object {
  
  /**
    * Bounding polygon of the detected text for this frame.
    */
  var rotatedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly] = js.native
  
  /**
    * Timestamp of this frame.
    */
  var timeOffset: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1TextFrameOps[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame] (val x: Self) extends AnyVal {
    
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
    def setRotatedBoundingBox(value: SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly): Self = this.set("rotatedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotatedBoundingBox: Self = this.set("rotatedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
  }
}
