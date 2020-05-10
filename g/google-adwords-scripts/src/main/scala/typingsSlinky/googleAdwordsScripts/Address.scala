package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  def getCityName(): String = js.native
  def getCountryCode(): String = js.native
  def getPostalCode(): String = js.native
  def getProvinceCode(): String = js.native
  def getProvinceName(): String = js.native
  def getStreetAddress(): String = js.native
  def getStreetAddress2(): String = js.native
}

object Address {
  @scala.inline
  def apply(
    getCityName: () => String,
    getCountryCode: () => String,
    getPostalCode: () => String,
    getProvinceCode: () => String,
    getProvinceName: () => String,
    getStreetAddress: () => String,
    getStreetAddress2: () => String
  ): Address = {
    val __obj = js.Dynamic.literal(getCityName = js.Any.fromFunction0(getCityName), getCountryCode = js.Any.fromFunction0(getCountryCode), getPostalCode = js.Any.fromFunction0(getPostalCode), getProvinceCode = js.Any.fromFunction0(getProvinceCode), getProvinceName = js.Any.fromFunction0(getProvinceName), getStreetAddress = js.Any.fromFunction0(getStreetAddress), getStreetAddress2 = js.Any.fromFunction0(getStreetAddress2))
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCityName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCityName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCountryCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCountryCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPostalCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPostalCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProvinceCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProvinceCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProvinceName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProvinceName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStreetAddress(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStreetAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStreetAddress2(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStreetAddress2")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

