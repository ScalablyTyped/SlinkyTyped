package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Vector3
import typingsSlinky.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RibbonCloseArray extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.native
  var cap: js.UndefOr[Double] = js.native
  var frontUVs: js.UndefOr[Vector4] = js.native
  var instance: js.UndefOr[typingsSlinky.babylonjs.BABYLON.Mesh] = js.native
  var invertUV: js.UndefOr[Boolean] = js.native
  var path: js.Array[Vector3] = js.native
  var ribbonCloseArray: js.UndefOr[Boolean] = js.native
  var ribbonClosePath: js.UndefOr[Boolean] = js.native
  var rotationFunction: js.UndefOr[js.Any] = js.native
  var scaleFunction: js.UndefOr[js.Any] = js.native
  var shape: js.Array[Vector3] = js.native
  var sideOrientation: js.UndefOr[Double] = js.native
  var updatable: js.UndefOr[Boolean] = js.native
}

object RibbonCloseArray {
  @scala.inline
  def apply(path: js.Array[Vector3], shape: js.Array[Vector3]): RibbonCloseArray = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonCloseArray]
  }
  @scala.inline
  implicit class RibbonCloseArrayOps[Self <: RibbonCloseArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withInstance(value: typingsSlinky.babylonjs.BABYLON.Mesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertUV(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertUV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertUV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertUV")(js.undefined)
        ret
    }
    @scala.inline
    def withRibbonCloseArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonCloseArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRibbonCloseArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonCloseArray")(js.undefined)
        ret
    }
    @scala.inline
    def withRibbonClosePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonClosePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRibbonClosePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonClosePath")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFunction")(js.undefined)
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

