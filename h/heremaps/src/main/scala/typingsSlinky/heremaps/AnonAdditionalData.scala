package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdditionalData extends js.Object {
  var AdditionalData: js.Array[AnonKey] = js.native
  var City: String = js.native
  var Country: String = js.native
  var County: String = js.native
  var District: String = js.native
  var HouseNumber: String = js.native
  var Label: String = js.native
  var PostalCode: String = js.native
  var State: String = js.native
  var Street: String = js.native
}

object AnonAdditionalData {
  @scala.inline
  def apply(
    AdditionalData: js.Array[AnonKey],
    City: String,
    Country: String,
    County: String,
    District: String,
    HouseNumber: String,
    Label: String,
    PostalCode: String,
    State: String,
    Street: String
  ): AnonAdditionalData = {
    val __obj = js.Dynamic.literal(AdditionalData = AdditionalData.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], County = County.asInstanceOf[js.Any], District = District.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalData]
  }
  @scala.inline
  implicit class AnonAdditionalDataOps[Self <: AnonAdditionalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalData(value: js.Array[AnonKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("County")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("District")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHouseNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HouseNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Street")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

