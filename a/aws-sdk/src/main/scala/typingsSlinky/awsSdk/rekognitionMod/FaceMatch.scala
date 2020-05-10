package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceMatch extends js.Object {
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image ID that you assigned.
    */
  var Face: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Face] = js.native
  /**
    * Confidence in the match of this face with the input face.
    */
  var Similarity: js.UndefOr[Percent] = js.native
}

object FaceMatch {
  @scala.inline
  def apply(): FaceMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceMatch]
  }
  @scala.inline
  implicit class FaceMatchOps[Self <: FaceMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFace(value: Face): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Face")(js.undefined)
        ret
    }
    @scala.inline
    def withSimilarity(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Similarity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimilarity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Similarity")(js.undefined)
        ret
    }
  }
  
}

