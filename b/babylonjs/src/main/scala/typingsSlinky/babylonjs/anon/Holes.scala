package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Holes extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.native
  var depth: js.UndefOr[Double] = js.native
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  var frontUVs: js.UndefOr[Vector4] = js.native
  var holes: js.UndefOr[js.Array[js.Array[Vector3]]] = js.native
  var shape: js.Array[Vector3] = js.native
  var sideOrientation: js.UndefOr[Double] = js.native
  var updatable: js.UndefOr[Boolean] = js.native
}

object Holes {
  @scala.inline
  def apply(shape: js.Array[Vector3]): Holes = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holes]
  }
  @scala.inline
  implicit class HolesOps[Self <: Holes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShape(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
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
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
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
    def withHoles(value: js.Array[js.Array[Vector3]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holes")(js.undefined)
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

