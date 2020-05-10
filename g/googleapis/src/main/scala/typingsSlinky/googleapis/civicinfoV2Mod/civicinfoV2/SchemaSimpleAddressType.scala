package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple representation of an address.
  */
@js.native
trait SchemaSimpleAddressType extends js.Object {
  /**
    * The city or town for the address.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * The street name and number of this address.
    */
  var line1: js.UndefOr[String] = js.native
  /**
    * The second line the address, if needed.
    */
  var line2: js.UndefOr[String] = js.native
  /**
    * The third line of the address, if needed.
    */
  var line3: js.UndefOr[String] = js.native
  /**
    * The name of the location.
    */
  var locationName: js.UndefOr[String] = js.native
  /**
    * The US two letter state abbreviation of the address.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The US Postal Zip Code of the address.
    */
  var zip: js.UndefOr[String] = js.native
}

object SchemaSimpleAddressType {
  @scala.inline
  def apply(): SchemaSimpleAddressType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSimpleAddressType]
  }
  @scala.inline
  implicit class SchemaSimpleAddressTypeOps[Self <: SchemaSimpleAddressType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withLine1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line1")(js.undefined)
        ret
    }
    @scala.inline
    def withLine2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line2")(js.undefined)
        ret
    }
    @scala.inline
    def withLine3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line3")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withZip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(js.undefined)
        ret
    }
  }
  
}

