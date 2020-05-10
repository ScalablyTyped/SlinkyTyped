package typingsSlinky.amapJsApiAutocomplete.AMap.Autocomplete

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tip extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String = js.native
  /**
    * 地址
    */
  var address: String = js.native
  /**
    * 城市
    */
  var city: js.Array[_] = js.native
  /**
    * 所属区域
    */
  var district: String = js.native
  /**
    * ID
    */
  var id: String = js.native
  /**
    * 坐标经纬度
    */
  var location: LngLat = js.native
  /**
    * 名称
    */
  var name: String = js.native
  /**
    * 类型编码
    */
  var typecode: String = js.native
}

object Tip {
  @scala.inline
  def apply(
    adcode: String,
    address: String,
    city: js.Array[_],
    district: String,
    id: String,
    location: LngLat,
    name: String,
    typecode: String
  ): Tip = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typecode = typecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
  @scala.inline
  implicit class TipOps[Self <: Tip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypecode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typecode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

