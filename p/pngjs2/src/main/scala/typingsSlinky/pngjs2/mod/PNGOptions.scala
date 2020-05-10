package typingsSlinky.pngjs2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNGOptions extends js.Object {
  var checkCRC: js.UndefOr[Boolean] = js.native
  var colorType: js.UndefOr[Double] = js.native
  var deflateChunkSize: js.UndefOr[Double] = js.native
  var deflateFactory: js.UndefOr[js.Any] = js.native
  var deflateLevel: js.UndefOr[Double] = js.native
  var deflateStrategy: js.UndefOr[Double] = js.native
  var filterType: js.UndefOr[Double | js.Array[Double]] = js.native
  var height: js.UndefOr[Double] = js.native
  var inputHasAlpha: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PNGOptions {
  @scala.inline
  def apply(): PNGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNGOptions]
  }
  @scala.inline
  implicit class PNGOptionsOps[Self <: PNGOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckCRC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCRC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCRC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCRC")(js.undefined)
        ret
    }
    @scala.inline
    def withColorType(value: Double): Self = {
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
    def withDeflateFactory(value: js.Any): Self = {
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

