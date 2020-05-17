package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiameterY extends js.Object {
  var arc: js.UndefOr[Double] = js.native
  var backUVs: js.UndefOr[Vector4] = js.native
  var diameter: js.UndefOr[Double] = js.native
  var diameterX: js.UndefOr[Double] = js.native
  var diameterY: js.UndefOr[Double] = js.native
  var diameterZ: js.UndefOr[Double] = js.native
  var frontUVs: js.UndefOr[Vector4] = js.native
  var segments: js.UndefOr[Double] = js.native
  var sideOrientation: js.UndefOr[Double] = js.native
  var slice: js.UndefOr[Double] = js.native
}

object DiameterY {
  @scala.inline
  def apply(): DiameterY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiameterY]
  }
  @scala.inline
  implicit class DiameterYOps[Self <: DiameterY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(js.undefined)
        ret
    }
    @scala.inline
    def withBackUVs(value: Vector4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backUVs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackUVs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backUVs")(js.undefined)
        ret
    }
    @scala.inline
    def withDiameter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameter")(js.undefined)
        ret
    }
    @scala.inline
    def withDiameterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiameterX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterX")(js.undefined)
        ret
    }
    @scala.inline
    def withDiameterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiameterY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterY")(js.undefined)
        ret
    }
    @scala.inline
    def withDiameterZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiameterZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterZ")(js.undefined)
        ret
    }
    @scala.inline
    def withFrontUVs(value: Vector4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frontUVs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrontUVs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frontUVs")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withSideOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withSlice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.undefined)
        ret
    }
  }
  
}

