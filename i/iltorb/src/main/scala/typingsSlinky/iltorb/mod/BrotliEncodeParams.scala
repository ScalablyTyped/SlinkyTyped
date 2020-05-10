package typingsSlinky.iltorb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrotliEncodeParams extends js.Object {
  var disable_literal_context_modeling: js.UndefOr[Boolean] = js.native
  var lgblock: js.UndefOr[Double] = js.native
  var lgwin: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[Double] = js.native
  var quality: js.UndefOr[Double] = js.native
  var size_hint: js.UndefOr[Double] = js.native
}

object BrotliEncodeParams {
  @scala.inline
  def apply(): BrotliEncodeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrotliEncodeParams]
  }
  @scala.inline
  implicit class BrotliEncodeParamsOps[Self <: BrotliEncodeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable_literal_context_modeling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_literal_context_modeling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_literal_context_modeling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_literal_context_modeling")(js.undefined)
        ret
    }
    @scala.inline
    def withLgblock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgblock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgblock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgblock")(js.undefined)
        ret
    }
    @scala.inline
    def withLgwin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgwin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgwin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgwin")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withSize_hint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size_hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize_hint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size_hint")(js.undefined)
        ret
    }
  }
  
}

