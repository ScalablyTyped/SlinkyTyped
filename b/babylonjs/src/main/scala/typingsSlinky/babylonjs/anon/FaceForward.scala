package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceForward extends js.Object {
  var faceForward: js.UndefOr[Boolean] = js.native
  var resolution: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var useDirectMapping: js.UndefOr[Boolean] = js.native
}

object FaceForward {
  @scala.inline
  def apply(): FaceForward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceForward]
  }
  @scala.inline
  implicit class FaceForwardOps[Self <: FaceForward] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceForward")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDirectMapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDirectMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDirectMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDirectMapping")(js.undefined)
        ret
    }
  }
  
}

