package typingsSlinky.lwip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GifBufferParams extends js.Object {
  var colors: js.UndefOr[Double] = js.native
  var interlaced: js.UndefOr[Boolean] = js.native
  var threshold: Double = js.native
  var transparency: js.UndefOr[Boolean | String] = js.native
}

object GifBufferParams {
  @scala.inline
  def apply(threshold: Double): GifBufferParams = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GifBufferParams]
  }
  @scala.inline
  implicit class GifBufferParamsOps[Self <: GifBufferParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: Double): Self = {
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
    def withInterlaced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interlaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterlaced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interlaced")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparency(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
  }
  
}

