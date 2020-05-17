package typingsSlinky.braintreeWebDropIn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowVaultCardOverride extends js.Object {
  var allowVaultCardOverride: js.UndefOr[Boolean] = js.native
  var vaultCard: js.UndefOr[Boolean] = js.native
}

object AllowVaultCardOverride {
  @scala.inline
  def apply(): AllowVaultCardOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowVaultCardOverride]
  }
  @scala.inline
  implicit class AllowVaultCardOverrideOps[Self <: AllowVaultCardOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowVaultCardOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVaultCardOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVaultCardOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVaultCardOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withVaultCard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultCard")(js.undefined)
        ret
    }
  }
  
}

