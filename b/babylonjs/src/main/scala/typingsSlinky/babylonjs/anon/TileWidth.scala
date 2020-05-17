package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Color4
import typingsSlinky.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileWidth extends js.Object {
  var alignHorizontal: js.UndefOr[Double] = js.native
  var alignVertical: js.UndefOr[Double] = js.native
  var depth: js.UndefOr[Double] = js.native
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  var height: js.UndefOr[Double] = js.native
  var pattern: js.UndefOr[Double] = js.native
  var sideOrientation: js.UndefOr[Double] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TileWidth {
  @scala.inline
  def apply(): TileWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileWidth]
  }
  @scala.inline
  implicit class TileWidthOps[Self <: TileWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignVertical")(js.undefined)
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
    def withPattern(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
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
    def withTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

