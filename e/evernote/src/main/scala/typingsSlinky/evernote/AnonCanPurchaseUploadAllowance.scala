package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanPurchaseUploadAllowance extends js.Object {
  var canPurchaseUploadAllowance: js.UndefOr[Boolean] = js.native
  var currentTime: js.UndefOr[Timestamp] = js.native
  var premium: js.UndefOr[Boolean] = js.native
  var premiumCancellationPending: js.UndefOr[Boolean] = js.native
  var premiumExpirationDate: js.UndefOr[Timestamp] = js.native
  var premiumExtendable: js.UndefOr[Boolean] = js.native
  var premiumPending: js.UndefOr[Boolean] = js.native
  var premiumRecurring: js.UndefOr[Boolean] = js.native
  var premiumUpgradable: js.UndefOr[Boolean] = js.native
}

object AnonCanPurchaseUploadAllowance {
  @scala.inline
  def apply(): AnonCanPurchaseUploadAllowance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCanPurchaseUploadAllowance]
  }
  @scala.inline
  implicit class AnonCanPurchaseUploadAllowanceOps[Self <: AnonCanPurchaseUploadAllowance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanPurchaseUploadAllowance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPurchaseUploadAllowance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanPurchaseUploadAllowance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPurchaseUploadAllowance")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPremium(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premium")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumCancellationPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumCancellationPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumCancellationPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumCancellationPending")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumExpirationDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumExtendable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumExtendable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumExtendable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumExtendable")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumPending")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumRecurring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumRecurring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumRecurring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumRecurring")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumUpgradable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumUpgradable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumUpgradable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumUpgradable")(js.undefined)
        ret
    }
  }
  
}

