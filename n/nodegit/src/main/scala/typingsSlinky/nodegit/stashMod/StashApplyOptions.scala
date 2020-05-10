package typingsSlinky.nodegit.stashMod

import typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StashApplyOptions extends js.Object {
  var checkoutOptions: js.UndefOr[CheckoutOptions] = js.native
  var flags: js.UndefOr[Double] = js.native
  var progressCb: js.UndefOr[js.Function] = js.native
  var progressPayload: js.UndefOr[js.Any] = js.native
  var version: js.UndefOr[Double] = js.native
}

object StashApplyOptions {
  @scala.inline
  def apply(): StashApplyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StashApplyOptions]
  }
  @scala.inline
  implicit class StashApplyOptionsOps[Self <: StashApplyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckoutOptions(value: CheckoutOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCb(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCb")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

