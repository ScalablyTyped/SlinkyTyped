package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingSettings extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var postalCodeGroups: js.UndefOr[js.Array[PostalCodeGroup]] = js.native
  var services: js.UndefOr[js.Array[Service]] = js.native
}

object ShippingSettings {
  @scala.inline
  def apply(): ShippingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingSettings]
  }
  @scala.inline
  implicit class ShippingSettingsOps[Self <: ShippingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCodeGroups(value: js.Array[PostalCodeGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

