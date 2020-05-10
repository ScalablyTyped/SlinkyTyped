package typingsSlinky.pngAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageOptions extends js.Object {
  var checkCRC: js.UndefOr[Boolean] = js.native
  var deflateChunkSize: js.UndefOr[Double] = js.native
  var deflateLevel: js.UndefOr[Double] = js.native
  var deflateStrategy: js.UndefOr[EDeflateStrategy] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var filterType: js.UndefOr[EFilterType] = js.native
  var height: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object IImageOptions {
  @scala.inline
  def apply(): IImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageOptions]
  }
  @scala.inline
  implicit class IImageOptionsOps[Self <: IImageOptions] (val x: Self) extends AnyVal {
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
    def withDeflateStrategy(value: EDeflateStrategy): Self = {
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
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: EFilterType): Self = {
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

