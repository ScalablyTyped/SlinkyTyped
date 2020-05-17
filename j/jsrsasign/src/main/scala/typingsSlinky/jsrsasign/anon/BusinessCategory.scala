package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessCategory extends js.Object {
  var C: String = js.native
  var CN: String = js.native
  var DC: String = js.native
  var DN: String = js.native
  var E: String = js.native
  var L: String = js.native
  var O: String = js.native
  var OU: String = js.native
  var SN: String = js.native
  var ST: String = js.native
  var STREET: String = js.native
  var UID: String = js.native
  var businessCategory: String = js.native
  var jurisdictionOfIncorporationC: String = js.native
  var jurisdictionOfIncorporationL: String = js.native
  var jurisdictionOfIncorporationSP: String = js.native
  var postalCode: String = js.native
  var serialNumber: String = js.native
}

object BusinessCategory {
  @scala.inline
  def apply(
    C: String,
    CN: String,
    DC: String,
    DN: String,
    E: String,
    L: String,
    O: String,
    OU: String,
    SN: String,
    ST: String,
    STREET: String,
    UID: String,
    businessCategory: String,
    jurisdictionOfIncorporationC: String,
    jurisdictionOfIncorporationL: String,
    jurisdictionOfIncorporationSP: String,
    postalCode: String,
    serialNumber: String
  ): BusinessCategory = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], DC = DC.asInstanceOf[js.Any], DN = DN.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], OU = OU.asInstanceOf[js.Any], SN = SN.asInstanceOf[js.Any], ST = ST.asInstanceOf[js.Any], STREET = STREET.asInstanceOf[js.Any], UID = UID.asInstanceOf[js.Any], businessCategory = businessCategory.asInstanceOf[js.Any], jurisdictionOfIncorporationC = jurisdictionOfIncorporationC.asInstanceOf[js.Any], jurisdictionOfIncorporationL = jurisdictionOfIncorporationL.asInstanceOf[js.Any], jurisdictionOfIncorporationSP = jurisdictionOfIncorporationSP.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessCategory]
  }
  @scala.inline
  implicit class BusinessCategoryOps[Self <: BusinessCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOU(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTREET(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STREET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusinessCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJurisdictionOfIncorporationC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdictionOfIncorporationC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJurisdictionOfIncorporationL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdictionOfIncorporationL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJurisdictionOfIncorporationSP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdictionOfIncorporationSP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

