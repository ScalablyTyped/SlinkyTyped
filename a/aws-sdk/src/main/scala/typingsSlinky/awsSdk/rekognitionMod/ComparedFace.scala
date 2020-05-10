package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComparedFace extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Level of confidence that what the bounding box contains is a face.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * An array of facial landmarks.
    */
  var Landmarks: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Landmarks] = js.native
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw.
    */
  var Pose: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Pose] = js.native
  /**
    * Identifies face image brightness and sharpness. 
    */
  var Quality: js.UndefOr[ImageQuality] = js.native
}

object ComparedFace {
  @scala.inline
  def apply(): ComparedFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparedFace]
  }
  @scala.inline
  implicit class ComparedFaceOps[Self <: ComparedFace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBox(value: BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoundingBox")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidence(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withLandmarks(value: Landmarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Landmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Landmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withPose(value: Pose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pose")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: ImageQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quality")(js.undefined)
        ret
    }
  }
  
}

