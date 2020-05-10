package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.BABYLON.Color4
import typingsSlinky.babylonjs.BABYLON.Vector2
import typingsSlinky.babylonjs.BABYLON.Vector3
import typingsSlinky.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClosePath extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.native
  var closeArray: js.UndefOr[Boolean] = js.native
  var closePath: js.UndefOr[Boolean] = js.native
  var colors: js.UndefOr[js.Array[Color4]] = js.native
  var frontUVs: js.UndefOr[Vector4] = js.native
  var invertUV: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  var sideOrientation: js.UndefOr[Double] = js.native
  var uvs: js.UndefOr[js.Array[Vector2]] = js.native
}

object AnonClosePath {
  @scala.inline
  def apply(pathArray: js.Array[js.Array[Vector3]]): AnonClosePath = {
    val __obj = js.Dynamic.literal(pathArray = pathArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClosePath]
  }
  @scala.inline
  implicit class AnonClosePathOps[Self <: AnonClosePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathArray(value: js.Array[js.Array[Vector3]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathArray")(value.asInstanceOf[js.Any])
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
    def withCloseArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeArray")(js.undefined)
        ret
    }
    @scala.inline
    def withClosePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[Color4]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
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
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
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
    def withUvs(value: js.Array[Vector2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUvs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvs")(js.undefined)
        ret
    }
  }
  
}

