package typingsSlinky.pngjs.mod

import typingsSlinky.pngjs.AnonBlue
import typingsSlinky.pngjs.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackerOptions extends js.Object {
  var bgColor: js.UndefOr[AnonBlue] = js.native
  var bitDepth: js.UndefOr[BitDepth] = js.native
  var colorType: js.UndefOr[ColorType] = js.native
  var deflateChunkSize: js.UndefOr[Double] = js.native
  var deflateFactory: js.UndefOr[FnCall] = js.native
  var deflateLevel: js.UndefOr[Double] = js.native
  var deflateStrategy: js.UndefOr[Double] = js.native
  var filterType: js.UndefOr[Double | js.Array[Double]] = js.native
  var inputColorType: js.UndefOr[ColorType] = js.native
  var inputHasAlpha: js.UndefOr[Boolean] = js.native
}

object PackerOptions {
  @scala.inline
  def apply(): PackerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackerOptions]
  }
  @scala.inline
  implicit class PackerOptionsOps[Self <: PackerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgColor(value: AnonBlue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBitDepth(value: BitDepth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withColorType(value: ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorType")(js.undefined)
        ret
    }
    @scala.inline
    def withDeflateChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflateChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateChunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDeflateFactory(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflateFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withDeflateLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflateLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeflateStrategy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflateStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withInputColorType(value: ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputColorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputColorType")(js.undefined)
        ret
    }
    @scala.inline
    def withInputHasAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputHasAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputHasAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputHasAlpha")(js.undefined)
        ret
    }
  }
  
}

