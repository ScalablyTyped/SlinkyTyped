package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderAddress extends js.Object {
  /** CLDR country code (e.g. "US"). */
  var country: js.UndefOr[String] = js.native
  /**
    * Strings representing the lines of the printed label for mailing the order, for example:
    * John Smith
    * 1600 Amphitheatre Parkway
    * Mountain View, CA, 94043
    * United States
    */
  var fullAddress: js.UndefOr[js.Array[String]] = js.native
  /** Whether the address is a post office box. */
  var isPostOfficeBox: js.UndefOr[Boolean] = js.native
  /** City, town or commune. May also include dependent localities or sublocalities (e.g. neighborhoods or suburbs). */
  var locality: js.UndefOr[String] = js.native
  /** Postal Code or ZIP (e.g. "94043"). */
  var postalCode: js.UndefOr[String] = js.native
  /** Name of the recipient. */
  var recipientName: js.UndefOr[String] = js.native
  /** Top-level administrative subdivision of the country (e.g. "CA"). */
  var region: js.UndefOr[String] = js.native
  /** Street-level part of the address. */
  var streetAddress: js.UndefOr[js.Array[String]] = js.native
}

object OrderAddress {
  @scala.inline
  def apply(): OrderAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderAddress]
  }
  @scala.inline
  implicit class OrderAddressOps[Self <: OrderAddress] (val x: Self) extends AnyVal {
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
    def withFullAddress(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPostOfficeBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPostOfficeBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPostOfficeBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPostOfficeBox")(js.undefined)
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(js.undefined)
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
    def withRecipientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(js.undefined)
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
    def withStreetAddress(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(js.undefined)
        ret
    }
  }
  
}

