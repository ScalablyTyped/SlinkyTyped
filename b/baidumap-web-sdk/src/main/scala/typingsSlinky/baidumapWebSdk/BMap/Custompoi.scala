package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Custompoi extends js.Object {
  var address: String = js.native
  var city: String = js.native
  var cityCode: Double = js.native
  var databoxId: String = js.native
  var district: String = js.native
  var districtCode: Double = js.native
  var extendedData: js.Any = js.native
  var phoneNumber: String = js.native
  var poiId: String = js.native
  var point: Point = js.native
  var postcode: String = js.native
  var province: String = js.native
  var provinceCode: Double = js.native
  var tags: js.Array[String] = js.native
  var title: String = js.native
  var typeId: Double = js.native
}

object Custompoi {
  @scala.inline
  def apply(
    address: String,
    city: String,
    cityCode: Double,
    databoxId: String,
    district: String,
    districtCode: Double,
    extendedData: js.Any,
    phoneNumber: String,
    poiId: String,
    point: Point,
    postcode: String,
    province: String,
    provinceCode: Double,
    tags: js.Array[String],
    title: String,
    typeId: Double
  ): Custompoi = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], cityCode = cityCode.asInstanceOf[js.Any], databoxId = databoxId.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], districtCode = districtCode.asInstanceOf[js.Any], extendedData = extendedData.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], poiId = poiId.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], provinceCode = provinceCode.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custompoi]
  }
  @scala.inline
  implicit class CustompoiOps[Self <: Custompoi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCityCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataboxId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databoxId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistrictCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("districtCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvinceCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provinceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

