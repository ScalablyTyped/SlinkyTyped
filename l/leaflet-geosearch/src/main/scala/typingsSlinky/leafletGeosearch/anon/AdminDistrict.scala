package typingsSlinky.leafletGeosearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminDistrict extends js.Object {
  var adminDistrict: String = js.native
  var adminDistrict2: String = js.native
  var countryRegion: String = js.native
  var formattedAddress: String = js.native
  var landmark: String = js.native
  var locality: String = js.native
  var neighborhood: String = js.native
}

object AdminDistrict {
  @scala.inline
  def apply(
    adminDistrict: String,
    adminDistrict2: String,
    countryRegion: String,
    formattedAddress: String,
    landmark: String,
    locality: String,
    neighborhood: String
  ): AdminDistrict = {
    val __obj = js.Dynamic.literal(adminDistrict = adminDistrict.asInstanceOf[js.Any], adminDistrict2 = adminDistrict2.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], landmark = landmark.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDistrict]
  }
  @scala.inline
  implicit class AdminDistrictOps[Self <: AdminDistrict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdminDistrict2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrict2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLandmark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeighborhood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborhood")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

