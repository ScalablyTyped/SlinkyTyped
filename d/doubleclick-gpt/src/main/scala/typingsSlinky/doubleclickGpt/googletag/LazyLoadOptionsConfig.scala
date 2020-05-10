package typingsSlinky.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyLoadOptionsConfig extends js.Object {
  var fetchMarginPercent: js.UndefOr[Double] = js.native
  var mobileScaling: js.UndefOr[Double] = js.native
  var renderMarginPercent: js.UndefOr[Double] = js.native
}

object LazyLoadOptionsConfig {
  @scala.inline
  def apply(): LazyLoadOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyLoadOptionsConfig]
  }
  @scala.inline
  implicit class LazyLoadOptionsConfigOps[Self <: LazyLoadOptionsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchMarginPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMarginPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMarginPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMarginPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileScaling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMarginPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMarginPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderMarginPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMarginPercent")(js.undefined)
        ret
    }
  }
  
}

