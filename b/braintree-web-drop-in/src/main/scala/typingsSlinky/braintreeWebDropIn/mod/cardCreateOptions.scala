package typingsSlinky.braintreeWebDropIn.mod

import typingsSlinky.braintreeWebDropIn.anon.AllowVaultCardOverride
import typingsSlinky.braintreeWebDropIn.anon.Fields
import typingsSlinky.braintreeWebDropIn.anon.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cardCreateOptions extends js.Object {
  var cardholderName: js.UndefOr[Boolean | Required] = js.native
  var clearFieldsAfterTokenization: js.UndefOr[Boolean] = js.native
  var overrides: Fields = js.native
  var vault: js.UndefOr[AllowVaultCardOverride] = js.native
}

object cardCreateOptions {
  @scala.inline
  def apply(overrides: Fields): cardCreateOptions = {
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
    def withOverrides(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardholderName(value: Boolean | Required): Self = {
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
    def withVault(value: AllowVaultCardOverride): Self = {
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

