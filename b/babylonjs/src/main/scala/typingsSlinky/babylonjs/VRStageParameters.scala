package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRStageParameters extends js.Object {
  var sittingToStandingTransform: js.UndefOr[js.typedarray.Float32Array] = js.native
  var sizeX: js.UndefOr[Double] = js.native
  var sizeY: js.UndefOr[Double] = js.native
}

object VRStageParameters {
  @scala.inline
  def apply(): VRStageParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRStageParameters]
  }
  @scala.inline
  implicit class VRStageParametersOps[Self <: VRStageParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSittingToStandingTransform(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sittingToStandingTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSittingToStandingTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sittingToStandingTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeX")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeY")(js.undefined)
        ret
    }
  }
  
}

