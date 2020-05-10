package typingsSlinky.omggif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var data_length: Double = js.native
  var data_offset: Double = js.native
  var delay: Double = js.native
  var disposal: Double = js.native
  var has_local_palette: Boolean = js.native
  var height: Double = js.native
  var interlaced: Boolean = js.native
  var palette_offset: Double | Null = js.native
  var palette_size: Double | Null = js.native
  var transparent_index: Double | Null = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Frame {
  @scala.inline
  def apply(
    data_length: Double,
    data_offset: Double,
    delay: Double,
    disposal: Double,
    has_local_palette: Boolean,
    height: Double,
    interlaced: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): Frame = {
    val __obj = js.Dynamic.literal(data_length = data_length.asInstanceOf[js.Any], data_offset = data_offset.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], disposal = disposal.asInstanceOf[js.Any], has_local_palette = has_local_palette.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlaced = interlaced.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisposal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_local_palette(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_local_palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterlaced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interlaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPalette_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPalette_offsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette_offset")(null)
        ret
    }
    @scala.inline
    def withPalette_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPalette_sizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette_size")(null)
        ret
    }
    @scala.inline
    def withTransparent_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparent_indexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent_index")(null)
        ret
    }
  }
  
}

