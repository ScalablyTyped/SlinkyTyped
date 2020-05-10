package typingsSlinky.pngjs.mod

import typingsSlinky.pngjs.pngjsNumbers.`16`
import typingsSlinky.pngjs.pngjsNumbers.`1`
import typingsSlinky.pngjs.pngjsNumbers.`2`
import typingsSlinky.pngjs.pngjsNumbers.`3`
import typingsSlinky.pngjs.pngjsNumbers.`4`
import typingsSlinky.pngjs.pngjsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var alpha: Boolean = js.native
  var bpp: `1` | `2` | `3` | `4` = js.native
  var color: Boolean = js.native
  var colorType: ColorType = js.native
  var depth: `1` | `2` | `4` | `8` | `16` = js.native
  var height: Double = js.native
  var interlace: Boolean = js.native
  var palette: Boolean = js.native
  var width: Double = js.native
}

object Metadata {
  @scala.inline
  def apply(
    alpha: Boolean,
    bpp: `1` | `2` | `3` | `4`,
    color: Boolean,
    colorType: ColorType,
    depth: `1` | `2` | `4` | `8` | `16`,
    height: Double,
    interlace: Boolean,
    palette: Boolean,
    width: Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bpp = bpp.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlace = interlace.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBpp(value: `1` | `2` | `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bpp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorType(value: ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: `1` | `2` | `4` | `8` | `16`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterlace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interlace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPalette(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

