package typingsSlinky.jimp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropOnlyFrames extends js.Object {
  var cropOnlyFrames: js.UndefOr[Boolean] = js.native
  var cropSymmetric: js.UndefOr[Boolean] = js.native
  var leaveBorder: js.UndefOr[Double] = js.native
  var tolerance: js.UndefOr[Double] = js.native
}

object CropOnlyFrames {
  @scala.inline
  def apply(): CropOnlyFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropOnlyFrames]
  }
  @scala.inline
  implicit class CropOnlyFramesOps[Self <: CropOnlyFrames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropOnlyFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropOnlyFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropOnlyFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropOnlyFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withCropSymmetric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropSymmetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropSymmetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropSymmetric")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveBorder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaveBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
  }
  
}

