package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceDetail extends js.Object {
  /**
    * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the highest estimated age.
    */
  var AgeRange: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.AgeRange] = js.native
  /**
    * Indicates whether or not the face has a beard, and the confidence level in the determination.
    */
  var Beard: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Beard] = js.native
  /**
    * Bounding box of the face. Default attribute.
    */
  var BoundingBox: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default attribute.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The emotions that appear to be expressed on the face, and the confidence level in the determination. The API is only making a determination of the physical appearance of a person's face. It is not a determination of the person’s internal emotional state and should not be used in such a way. For example, a person pretending to have a sad face might not be sad emotionally.
    */
  var Emotions: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Emotions] = js.native
  /**
    * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
    */
  var Eyeglasses: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Eyeglasses] = js.native
  /**
    * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
    */
  var EyesOpen: js.UndefOr[EyeOpen] = js.native
  /**
    * The predicted gender of a detected face. 
    */
  var Gender: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Gender] = js.native
  /**
    * Indicates the location of landmarks on the face. Default attribute.
    */
  var Landmarks: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Landmarks] = js.native
  /**
    * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
    */
  var MouthOpen: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.MouthOpen] = js.native
  /**
    * Indicates whether or not the face has a mustache, and the confidence level in the determination.
    */
  var Mustache: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Mustache] = js.native
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
    */
  var Pose: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Pose] = js.native
  /**
    * Identifies image brightness and sharpness. Default attribute.
    */
  var Quality: js.UndefOr[ImageQuality] = js.native
  /**
    * Indicates whether or not the face is smiling, and the confidence level in the determination.
    */
  var Smile: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Smile] = js.native
  /**
    * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
    */
  var Sunglasses: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Sunglasses] = js.native
}

object FaceDetail {
  @scala.inline
  def apply(): FaceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetail]
  }
  @scala.inline
  implicit class FaceDetailOps[Self <: FaceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgeRange(value: AgeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeard(value: Beard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Beard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Beard")(js.undefined)
        ret
    }
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
    def withEmotions(value: Emotions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Emotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Emotions")(js.undefined)
        ret
    }
    @scala.inline
    def withEyeglasses(value: Eyeglasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eyeglasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEyeglasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eyeglasses")(js.undefined)
        ret
    }
    @scala.inline
    def withEyesOpen(value: EyeOpen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EyesOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEyesOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EyesOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: Gender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gender")(js.undefined)
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
    def withMouthOpen(value: MouthOpen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MouthOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouthOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MouthOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withMustache(value: Mustache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mustache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMustache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mustache")(js.undefined)
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
    @scala.inline
    def withSmile(value: Smile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Smile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Smile")(js.undefined)
        ret
    }
    @scala.inline
    def withSunglasses(value: Sunglasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sunglasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSunglasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sunglasses")(js.undefined)
        ret
    }
  }
  
}

