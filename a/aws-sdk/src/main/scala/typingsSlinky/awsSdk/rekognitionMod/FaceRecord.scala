package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceRecord extends js.Object {
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned. 
    */
  var Face: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Face] = js.native
  /**
    * Structure containing attributes of the face that the algorithm detected.
    */
  var FaceDetail: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.FaceDetail] = js.native
}

object FaceRecord {
  @scala.inline
  def apply(): FaceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceRecord]
  }
  @scala.inline
  implicit class FaceRecordOps[Self <: FaceRecord] (val x: Self) extends AnyVal {
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
  }
  
}

