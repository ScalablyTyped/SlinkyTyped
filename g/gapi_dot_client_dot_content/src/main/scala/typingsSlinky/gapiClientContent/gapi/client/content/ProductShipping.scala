package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductShipping extends js.Object {
  /** The CLDR territory code of the country to which an item will ship. */
  var country: js.UndefOr[String] = js.native
  /** The location where the shipping is applicable, represented by a location group name. */
  var locationGroupName: js.UndefOr[String] = js.native
  /** The numeric id of a location that the shipping rate applies to as defined in the AdWords API. */
  var locationId: js.UndefOr[String] = js.native
  /**
    * The postal code range that the shipping rate applies to, represented by a postal code, a postal code prefix followed by a &#42; wildcard, a range between
    * two postal codes or two postal code prefixes of equal length.
    */
  var postalCode: js.UndefOr[String] = js.native
  /** Fixed shipping price, represented as a number. */
  var price: js.UndefOr[Price] = js.native
  /** The geographic region to which a shipping rate applies. */
  var region: js.UndefOr[String] = js.native
  /** A free-form description of the service class or delivery speed. */
  var service: js.UndefOr[String] = js.native
}

object ProductShipping {
  @scala.inline
  def apply(): ProductShipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductShipping]
  }
  @scala.inline
  implicit class ProductShippingOps[Self <: ProductShipping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLocationGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

