package typingsSlinky.gapiClientReseller.gapi.client.reseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewalSettings extends js.Object {
  /** Identifies the resource as a subscription renewal setting. Value: subscriptions#renewalSettings */
  var kind: js.UndefOr[String] = js.native
  /**
    * Renewal settings for the annual commitment plan. For more detailed information, see renewal options in the administrator help center. When renewing a
    * subscription, the renewalType is a required property.
    */
  var renewalType: js.UndefOr[String] = js.native
}

object RenewalSettings {
  @scala.inline
  def apply(): RenewalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewalSettings]
  }
  @scala.inline
  implicit class RenewalSettingsOps[Self <: RenewalSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewalType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalType")(js.undefined)
        ret
    }
  }
  
}

