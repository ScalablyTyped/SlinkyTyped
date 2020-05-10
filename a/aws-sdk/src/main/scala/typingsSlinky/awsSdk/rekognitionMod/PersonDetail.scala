package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonDetail extends js.Object {
  /**
    * Bounding box around the detected person.
    */
  var BoundingBox: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Face details for the detected person.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  /**
    * Identifier for the person detected person within a video. Use to keep track of the person throughout the video. The identifier is not stored by Amazon Rekognition.
    */
  var Index: js.UndefOr[PersonIndex] = js.native
}

object PersonDetail {
  @scala.inline
  def apply(): PersonDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonDetail]
  }
  @scala.inline
  implicit class PersonDetailOps[Self <: PersonDetail] (val x: Self) extends AnyVal {
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
    def withFace(value: FaceDetail): Self = {
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
    def withIndex(value: PersonIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(js.undefined)
        ret
    }
  }
  
}

