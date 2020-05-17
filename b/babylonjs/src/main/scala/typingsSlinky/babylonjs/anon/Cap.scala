package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cap extends js.Object {
  var arc: js.UndefOr[Double] = js.native
  var backUVs: js.UndefOr[Vector4] = js.native
  var cap: js.UndefOr[Double] = js.native
  var diameter: js.UndefOr[Double] = js.native
  var diameterBottom: js.UndefOr[Double] = js.native
  var diameterTop: js.UndefOr[Double] = js.native
  var enclose: js.UndefOr[Boolean] = js.native
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  var frontUVs: js.UndefOr[Vector4] = js.native
  var hasRings: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var sideOrientation: js.UndefOr[Double] = js.native
  var subdivisions: js.UndefOr[Double] = js.native
  var tessellation: js.UndefOr[Double] = js.native
  var updatable: js.UndefOr[Boolean] = js.native
}

object Cap {
  @scala.inline
  def apply(): Cap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cap]
  }
  @scala.inline
  implicit class CapOps[Self <: Cap] (val x: Self) extends AnyVal {
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
    def withCap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(js.undefined)
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
    def withDiameterBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiameterBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withDiameterTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiameterTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameterTop")(js.undefined)
        ret
    }
    @scala.inline
    def withEnclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enclose")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceColors(value: js.Array[Color4]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceColors")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceUV(value: js.Array[Vector4]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceUV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceUV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceUV")(js.undefined)
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
    def withHasRings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasRings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRings")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withSubdivisions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(js.undefined)
        ret
    }
    @scala.inline
    def withTessellation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tessellation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTessellation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tessellation")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(js.undefined)
        ret
    }
  }
  
}

