package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Face extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree).
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * Identifier that you assign to all the faces in the input image.
    */
  var ExternalImageId: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ExternalImageId] = js.native
  /**
    * Unique identifier that Amazon Rekognition assigns to the face.
    */
  var FaceId: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.FaceId] = js.native
  /**
    * Unique identifier that Amazon Rekognition assigns to the input image.
    */
  var ImageId: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ImageId] = js.native
}

object Face {
  @scala.inline
  def apply(): Face = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Face]
  }
  @scala.inline
  implicit class FaceOps[Self <: Face] (val x: Self) extends AnyVal {
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
    def withExternalImageId(value: ExternalImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceId(value: FaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withImageId(value: ImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
  }
  
}

