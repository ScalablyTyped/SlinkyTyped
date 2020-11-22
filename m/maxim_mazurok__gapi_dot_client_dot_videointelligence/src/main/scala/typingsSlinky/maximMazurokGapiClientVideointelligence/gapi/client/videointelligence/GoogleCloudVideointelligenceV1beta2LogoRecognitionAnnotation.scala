package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation extends js.Object {
  
  /** Entity category information to specify the logo class that all the logo tracks within this LogoRecognitionAnnotation are recognized as. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1beta2Entity] = js.native
  
  /** All video segments where the recognized logo appears. There might be multiple instances of the same logo class appearing in one VideoSegment. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]] = js.native
  
  /** All logo tracks where the recognized logo appears. Each track corresponds to one logo instance appearing in consecutive frames. */
  var tracks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2Track]] = js.native
}
object GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotationOps[Self <: GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: GoogleCloudVideointelligenceV1beta2Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1beta2VideoSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: GoogleCloudVideointelligenceV1beta2Track*): Self = this.set("tracks", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[GoogleCloudVideointelligenceV1beta2Track]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
}
