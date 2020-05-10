package typingsSlinky.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceLandmarks extends js.Object {
  var eyeLeftBottom: point = js.native
  var eyeLeftInner: point = js.native
  var eyeLeftOuter: point = js.native
  var eyeLeftTop: point = js.native
  var eyeRightBottom: point = js.native
  var eyeRightInner: point = js.native
  var eyeRightOuter: point = js.native
  var eyeRightTop: point = js.native
  var eyebrowLeftInner: point = js.native
  var eyebrowLeftOuter: point = js.native
  var eyebrowRightInner: point = js.native
  var eyebrowRightOuter: point = js.native
  var mouthLeft: point = js.native
  var mouthRight: point = js.native
  var noseLeftAlarOutTip: point = js.native
  var noseLeftAlarTop: point = js.native
  var noseRightAlarOutTip: point = js.native
  var noseRightAlarTop: point = js.native
  var noseRootLeft: point = js.native
  var noseRootRight: point = js.native
  var noseTip: point = js.native
  var pupilLeft: point = js.native
  var pupilRight: point = js.native
  var underLipBottom: point = js.native
  var underLipTop: point = js.native
  var upperLipBottom: point = js.native
  var upperLipTop: point = js.native
}

object FaceLandmarks {
  @scala.inline
  def apply(
    eyeLeftBottom: point,
    eyeLeftInner: point,
    eyeLeftOuter: point,
    eyeLeftTop: point,
    eyeRightBottom: point,
    eyeRightInner: point,
    eyeRightOuter: point,
    eyeRightTop: point,
    eyebrowLeftInner: point,
    eyebrowLeftOuter: point,
    eyebrowRightInner: point,
    eyebrowRightOuter: point,
    mouthLeft: point,
    mouthRight: point,
    noseLeftAlarOutTip: point,
    noseLeftAlarTop: point,
    noseRightAlarOutTip: point,
    noseRightAlarTop: point,
    noseRootLeft: point,
    noseRootRight: point,
    noseTip: point,
    pupilLeft: point,
    pupilRight: point,
    underLipBottom: point,
    underLipTop: point,
    upperLipBottom: point,
    upperLipTop: point
  ): FaceLandmarks = {
    val __obj = js.Dynamic.literal(eyeLeftBottom = eyeLeftBottom.asInstanceOf[js.Any], eyeLeftInner = eyeLeftInner.asInstanceOf[js.Any], eyeLeftOuter = eyeLeftOuter.asInstanceOf[js.Any], eyeLeftTop = eyeLeftTop.asInstanceOf[js.Any], eyeRightBottom = eyeRightBottom.asInstanceOf[js.Any], eyeRightInner = eyeRightInner.asInstanceOf[js.Any], eyeRightOuter = eyeRightOuter.asInstanceOf[js.Any], eyeRightTop = eyeRightTop.asInstanceOf[js.Any], eyebrowLeftInner = eyebrowLeftInner.asInstanceOf[js.Any], eyebrowLeftOuter = eyebrowLeftOuter.asInstanceOf[js.Any], eyebrowRightInner = eyebrowRightInner.asInstanceOf[js.Any], eyebrowRightOuter = eyebrowRightOuter.asInstanceOf[js.Any], mouthLeft = mouthLeft.asInstanceOf[js.Any], mouthRight = mouthRight.asInstanceOf[js.Any], noseLeftAlarOutTip = noseLeftAlarOutTip.asInstanceOf[js.Any], noseLeftAlarTop = noseLeftAlarTop.asInstanceOf[js.Any], noseRightAlarOutTip = noseRightAlarOutTip.asInstanceOf[js.Any], noseRightAlarTop = noseRightAlarTop.asInstanceOf[js.Any], noseRootLeft = noseRootLeft.asInstanceOf[js.Any], noseRootRight = noseRootRight.asInstanceOf[js.Any], noseTip = noseTip.asInstanceOf[js.Any], pupilLeft = pupilLeft.asInstanceOf[js.Any], pupilRight = pupilRight.asInstanceOf[js.Any], underLipBottom = underLipBottom.asInstanceOf[js.Any], underLipTop = underLipTop.asInstanceOf[js.Any], upperLipBottom = upperLipBottom.asInstanceOf[js.Any], upperLipTop = upperLipTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceLandmarks]
  }
  @scala.inline
  implicit class FaceLandmarksOps[Self <: FaceLandmarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEyeLeftBottom(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeLeftBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeLeftInner(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeLeftInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeLeftOuter(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeLeftOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeLeftTop(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeLeftTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeRightBottom(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeRightBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeRightInner(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeRightInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeRightOuter(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeRightOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeRightTop(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeRightTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyebrowLeftInner(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyebrowLeftInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyebrowLeftOuter(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyebrowLeftOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyebrowRightInner(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyebrowRightInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyebrowRightOuter(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyebrowRightOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouthLeft(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouthLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouthRight(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouthRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoseLeftAlarOutTip(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noseLeftAlarOutTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoseLeftAlarTop(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noseLeftAlarTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoseRightAlarOutTip(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noseRightAlarOutTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoseRightAlarTop(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noseRightAlarTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoseRootLeft(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noseRootLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoseRootRight(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noseRootRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoseTip(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noseTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPupilLeft(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pupilLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPupilRight(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pupilRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderLipBottom(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underLipBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderLipTop(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underLipTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperLipBottom(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLipBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperLipTop(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLipTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

