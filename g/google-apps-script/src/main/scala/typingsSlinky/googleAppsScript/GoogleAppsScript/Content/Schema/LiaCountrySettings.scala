package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiaCountrySettings extends js.Object {
  var about: js.UndefOr[LiaAboutPageSettings] = js.native
  var country: js.UndefOr[String] = js.native
  var hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.native
  var inventory: js.UndefOr[LiaInventorySettings] = js.native
  var onDisplayToOrder: js.UndefOr[LiaOnDisplayToOrderSettings] = js.native
  var posDataProvider: js.UndefOr[LiaPosDataProvider] = js.native
  var storePickupActive: js.UndefOr[Boolean] = js.native
}

object LiaCountrySettings {
  @scala.inline
  def apply(): LiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaCountrySettings]
  }
  @scala.inline
  implicit class LiaCountrySettingsOps[Self <: LiaCountrySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbout(value: LiaAboutPageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedLocalStorefrontActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedLocalStorefrontActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedLocalStorefrontActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedLocalStorefrontActive")(js.undefined)
        ret
    }
    @scala.inline
    def withInventory(value: LiaInventorySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisplayToOrder(value: LiaOnDisplayToOrderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisplayToOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDisplayToOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisplayToOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withPosDataProvider(value: LiaPosDataProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosDataProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withStorePickupActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storePickupActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorePickupActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storePickupActive")(js.undefined)
        ret
    }
  }
  
}

