package typingsSlinky.braintreeWebDropIn.mod

import typingsSlinky.braintreeWebDropIn.AnonAllowVaultCardOverride
import typingsSlinky.braintreeWebDropIn.AnonFields
import typingsSlinky.braintreeWebDropIn.AnonRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cardCreateOptions extends js.Object {
  var cardholderName: js.UndefOr[Boolean | AnonRequired] = js.native
  var clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.native
  var overrides: AnonFields = js.native
  var vault: js.UndefOr[AnonAllowVaultCardOverride] = js.native
}

object cardCreateOptions {
  @scala.inline
  def apply(overrides: AnonFields): cardCreateOptions = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardCreateOptions]
  }
  @scala.inline
  implicit class cardCreateOptionsOps[Self <: cardCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverrides(value: AnonFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardholderName(value: Boolean | AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardholderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(js.undefined)
        ret
    }
    @scala.inline
    def withClearFieldsAfterTokenization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFieldsAfterTokenization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearFieldsAfterTokenization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFieldsAfterTokenization")(js.undefined)
        ret
    }
    @scala.inline
    def withVault(value: AnonAllowVaultCardOverride): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vault")(js.undefined)
        ret
    }
  }
  
}

