package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceDetectionParams extends js.Object {
  var faceindex: js.UndefOr[ImgixParamType] = js.native
  var facepad: js.UndefOr[ImgixParamType] = js.native
  var faces: js.UndefOr[ImgixParamType] = js.native
}

object FaceDetectionParams {
  @scala.inline
  def apply(): FaceDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetectionParams]
  }
  @scala.inline
  implicit class FaceDetectionParamsOps[Self <: FaceDetectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceindex(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceindex")(js.undefined)
        ret
    }
    @scala.inline
    def withFacepad(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facepad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacepad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facepad")(js.undefined)
        ret
    }
    @scala.inline
    def withFaces(value: ImgixParamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(js.undefined)
        ret
    }
  }
  
}

