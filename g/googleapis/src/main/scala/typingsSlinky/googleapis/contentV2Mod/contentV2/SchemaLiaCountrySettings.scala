package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiaCountrySettings extends js.Object {
  /**
    * The settings for the About page.
    */
  var about: js.UndefOr[SchemaLiaAboutPageSettings] = js.native
  /**
    * CLDR country code (e.g. &quot;US&quot;).
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The status of the &quot;Merchant hosted local storefront&quot; feature.
    */
  var hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.native
  /**
    * LIA inventory verification settings.
    */
  var inventory: js.UndefOr[SchemaLiaInventorySettings] = js.native
  /**
    * LIA &quot;On Display To Order&quot; settings.
    */
  var onDisplayToOrder: js.UndefOr[SchemaLiaOnDisplayToOrderSettings] = js.native
  /**
    * The POS data provider linked with this country.
    */
  var posDataProvider: js.UndefOr[SchemaLiaPosDataProvider] = js.native
  /**
    * The status of the &quot;Store pickup&quot; feature.
    */
  var storePickupActive: js.UndefOr[Boolean] = js.native
}

object SchemaLiaCountrySettings {
  @scala.inline
  def apply(): SchemaLiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaCountrySettings]
  }
  @scala.inline
  implicit class SchemaLiaCountrySettingsOps[Self <: SchemaLiaCountrySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbout(value: SchemaLiaAboutPageSettings): Self = {
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
    def withInventory(value: SchemaLiaInventorySettings): Self = {
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
    def withOnDisplayToOrder(value: SchemaLiaOnDisplayToOrderSettings): Self = {
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
    def withPosDataProvider(value: SchemaLiaPosDataProvider): Self = {
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

