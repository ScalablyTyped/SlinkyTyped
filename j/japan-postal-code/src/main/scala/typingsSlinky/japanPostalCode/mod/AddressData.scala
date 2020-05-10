package typingsSlinky.japanPostalCode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressData extends js.Object {
  var area: String = js.native
  var city: String = js.native
  var prefecture: String = js.native
  var street: String = js.native
}

object AddressData {
  @scala.inline
  def apply(area: String, city: String, prefecture: String, street: String): AddressData = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], prefecture = prefecture.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressData]
  }
  @scala.inline
  implicit class AddressDataOps[Self <: AddressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

