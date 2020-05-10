package typingsSlinky.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var merchantIdentifier: js.UndefOr[String] = js.native
  var validationURL: String = js.native
}

object AnonDisplayName {
  @scala.inline
  def apply(validationURL: String): AnonDisplayName = {
    val __obj = js.Dynamic.literal(validationURL = validationURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
  @scala.inline
  implicit class AnonDisplayNameOps[Self <: AnonDisplayName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantIdentifier")(js.undefined)
        ret
    }
  }
  
}

