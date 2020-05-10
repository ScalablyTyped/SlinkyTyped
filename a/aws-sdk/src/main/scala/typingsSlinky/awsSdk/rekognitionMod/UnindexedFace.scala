package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnindexedFace extends js.Object {
  /**
    * The structure that contains attributes of a face that IndexFacesdetected, but didn't index. 
    */
  var FaceDetail: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.FaceDetail] = js.native
  /**
    * An array of reasons that specify why a face wasn't indexed.    EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from the camera.   EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the MaxFaces input parameter for IndexFaces.   LOW_BRIGHTNESS - The image is too dark.   LOW_SHARPNESS - The image is too blurry.   LOW_CONFIDENCE - The face was detected with a low confidence.   SMALL_BOUNDING_BOX - The bounding box around the face is too small.  
    */
  var Reasons: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Reasons] = js.native
}

object UnindexedFace {
  @scala.inline
  def apply(): UnindexedFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnindexedFace]
  }
  @scala.inline
  implicit class UnindexedFaceOps[Self <: UnindexedFace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceDetail(value: FaceDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withReasons(value: Reasons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reasons")(js.undefined)
        ret
    }
  }
  
}

