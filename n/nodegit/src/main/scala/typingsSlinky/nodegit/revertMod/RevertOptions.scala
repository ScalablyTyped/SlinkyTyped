package typingsSlinky.nodegit.revertMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
import typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevertOptions
  extends /* key */ StringDictionary[js.Any] {
  var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
  var mainline: js.UndefOr[Double] = js.native
  var mergeOpts: js.UndefOr[MergeOptions] = js.native
  var version: js.UndefOr[Double] = js.native
}

object RevertOptions {
  @scala.inline
  def apply(): RevertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertOptions]
  }
  @scala.inline
  implicit class RevertOptionsOps[Self <: RevertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckoutOpts(value: CheckoutOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckoutOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withMainline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainline")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeOpts(value: MergeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOpts")(js.undefined)
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

