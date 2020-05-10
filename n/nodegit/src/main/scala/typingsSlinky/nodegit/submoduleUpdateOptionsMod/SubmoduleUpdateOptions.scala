package typingsSlinky.nodegit.submoduleUpdateOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
import typingsSlinky.nodegit.fetchOptionsMod.FetchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmoduleUpdateOptions
  extends /* key */ StringDictionary[js.Any] {
  var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
  var cloneCheckoutStrategy: js.UndefOr[Double] = js.native
  var fetchOpts: js.UndefOr[FetchOptions] = js.native
  var version: js.UndefOr[Double] = js.native
}

object SubmoduleUpdateOptions {
  @scala.inline
  def apply(): SubmoduleUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmoduleUpdateOptions]
  }
  @scala.inline
  implicit class SubmoduleUpdateOptionsOps[Self <: SubmoduleUpdateOptions] (val x: Self) extends AnyVal {
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
    def withCloneCheckoutStrategy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneCheckoutStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneCheckoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneCheckoutStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchOpts(value: FetchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOpts")(js.undefined)
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

