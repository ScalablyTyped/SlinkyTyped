package typingsSlinky.reactDaumPostcode.mod

import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.E
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.J
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.K
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.N
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.R
import typingsSlinky.reactDaumPostcode.reactDaumPostcodeStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressData extends js.Object {
  var address: String = js.native
  var addressEnglish: String = js.native
  var addressType: R | J = js.native
  var apartment: Y | N = js.native
  var autoJibunAddress: String = js.native
  var autoJibunAddressEnglish: String = js.native
  var autoRoadAddress: String = js.native
  var autoRoadAddressEnglish: String = js.native
  var bcode: String = js.native
  var bname: String = js.native
  var bname1: String = js.native
  var bname2: String = js.native
  var buildingCode: String = js.native
  var buildingName: String = js.native
  var hname: String = js.native
  var jibunAddress: String = js.native
  var jibunAddressEnglish: String = js.native
  var noSelected: Y | N = js.native
  var postcode: String = js.native
  var postcode1: String = js.native
  var postcode2: String = js.native
  var postcodeSeq: String = js.native
  var query: String = js.native
  var roadAddress: String = js.native
  var roadname: String = js.native
  var roadnameCode: String = js.native
  var sido: String = js.native
  var sigungu: String = js.native
  var sigunguCode: String = js.native
  var userLanguageType: K | E = js.native
  var userSelectedType: R | J = js.native
  var zonecode: String = js.native
}

object AddressData {
  @scala.inline
  def apply(
    address: String,
    addressEnglish: String,
    addressType: R | J,
    apartment: Y | N,
    autoJibunAddress: String,
    autoJibunAddressEnglish: String,
    autoRoadAddress: String,
    autoRoadAddressEnglish: String,
    bcode: String,
    bname: String,
    bname1: String,
    bname2: String,
    buildingCode: String,
    buildingName: String,
    hname: String,
    jibunAddress: String,
    jibunAddressEnglish: String,
    noSelected: Y | N,
    postcode: String,
    postcode1: String,
    postcode2: String,
    postcodeSeq: String,
    query: String,
    roadAddress: String,
    roadname: String,
    roadnameCode: String,
    sido: String,
    sigungu: String,
    sigunguCode: String,
    userLanguageType: K | E,
    userSelectedType: R | J,
    zonecode: String
  ): AddressData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressEnglish = addressEnglish.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], apartment = apartment.asInstanceOf[js.Any], autoJibunAddress = autoJibunAddress.asInstanceOf[js.Any], autoJibunAddressEnglish = autoJibunAddressEnglish.asInstanceOf[js.Any], autoRoadAddress = autoRoadAddress.asInstanceOf[js.Any], autoRoadAddressEnglish = autoRoadAddressEnglish.asInstanceOf[js.Any], bcode = bcode.asInstanceOf[js.Any], bname = bname.asInstanceOf[js.Any], bname1 = bname1.asInstanceOf[js.Any], bname2 = bname2.asInstanceOf[js.Any], buildingCode = buildingCode.asInstanceOf[js.Any], buildingName = buildingName.asInstanceOf[js.Any], hname = hname.asInstanceOf[js.Any], jibunAddress = jibunAddress.asInstanceOf[js.Any], jibunAddressEnglish = jibunAddressEnglish.asInstanceOf[js.Any], noSelected = noSelected.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], postcode1 = postcode1.asInstanceOf[js.Any], postcode2 = postcode2.asInstanceOf[js.Any], postcodeSeq = postcodeSeq.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], roadAddress = roadAddress.asInstanceOf[js.Any], roadname = roadname.asInstanceOf[js.Any], roadnameCode = roadnameCode.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sigungu = sigungu.asInstanceOf[js.Any], sigunguCode = sigunguCode.asInstanceOf[js.Any], userLanguageType = userLanguageType.asInstanceOf[js.Any], userSelectedType = userSelectedType.asInstanceOf[js.Any], zonecode = zonecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressData]
  }
  @scala.inline
  implicit class AddressDataOps[Self <: AddressData] (val x: Self) extends AnyVal {
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
    def withAddressEnglish(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressEnglish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddressType(value: R | J): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApartment(value: Y | N): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apartment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoJibunAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoJibunAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoJibunAddressEnglish(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoJibunAddressEnglish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRoadAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRoadAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRoadAddressEnglish(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRoadAddressEnglish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBname1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bname1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBname2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bname2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildingCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJibunAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jibunAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJibunAddressEnglish(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jibunAddressEnglish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSelected(value: Y | N): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcodeSeq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcodeSeq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoadAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roadAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoadname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roadname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoadnameCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roadnameCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSido(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sido")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigungu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigungu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigunguCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigunguCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserLanguageType(value: K | E): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLanguageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSelectedType(value: R | J): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSelectedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZonecode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zonecode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

