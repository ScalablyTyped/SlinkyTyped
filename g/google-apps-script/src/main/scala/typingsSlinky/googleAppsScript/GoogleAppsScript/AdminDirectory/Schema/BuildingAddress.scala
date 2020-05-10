package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingAddress extends js.Object {
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  var administrativeArea: js.UndefOr[String] = js.native
  var languageCode: js.UndefOr[String] = js.native
  var locality: js.UndefOr[String] = js.native
  var postalCode: js.UndefOr[String] = js.native
  var regionCode: js.UndefOr[String] = js.native
  var sublocality: js.UndefOr[String] = js.native
}

object BuildingAddress {
  @scala.inline
  def apply(): BuildingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingAddress]
  }
  @scala.inline
  implicit class BuildingAddressOps[Self <: BuildingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLines")(js.undefined)
        ret
    }
    @scala.inline
    def withAdministrativeArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrativeArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeArea")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
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
    def withRegionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSublocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublocality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSublocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublocality")(js.undefined)
        ret
    }
  }
  
}

