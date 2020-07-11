package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CUC extends js.Object {
  var ATS: js.Array[String]
  var AUD: js.Array[String]
  var BGM: js.Array[String]
  var BGO: js.Array[String]
  var CUC: js.Array[js.UndefOr[String]]
  var DEM: js.Array[String]
  var FKP: js.Array[js.UndefOr[String]]
  var GNF: js.Array[js.UndefOr[String]]
  var KMF: js.Array[js.UndefOr[String]]
  var LUF: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var RWF: js.Array[js.UndefOr[String]]
  var SYP: js.Array[scala.Nothing]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var ZMW: js.Array[js.UndefOr[String]]
}

object CUC {
  @scala.inline
  def apply(
    ATS: js.Array[String],
    AUD: js.Array[String],
    BGM: js.Array[String],
    BGO: js.Array[String],
    CUC: js.Array[js.UndefOr[String]],
    DEM: js.Array[String],
    FKP: js.Array[js.UndefOr[String]],
    GNF: js.Array[js.UndefOr[String]],
    KMF: js.Array[js.UndefOr[String]],
    LUF: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    RWF: js.Array[js.UndefOr[String]],
    SYP: js.Array[scala.Nothing],
    THB: js.Array[String],
    TWD: js.Array[String],
    ZMW: js.Array[js.UndefOr[String]]
  ): CUC = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any], AUD = AUD.asInstanceOf[js.Any], BGM = BGM.asInstanceOf[js.Any], BGO = BGO.asInstanceOf[js.Any], CUC = CUC.asInstanceOf[js.Any], DEM = DEM.asInstanceOf[js.Any], FKP = FKP.asInstanceOf[js.Any], GNF = GNF.asInstanceOf[js.Any], KMF = KMF.asInstanceOf[js.Any], LUF = LUF.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RWF = RWF.asInstanceOf[js.Any], SYP = SYP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], ZMW = ZMW.asInstanceOf[js.Any])
    __obj.asInstanceOf[CUC]
  }
  @scala.inline
  implicit class CUCOps[Self <: CUC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setATSVarargs(value: String*): Self = this.set("ATS", js.Array(value :_*))
    @scala.inline
    def setATS(value: js.Array[String]): Self = this.set("ATS", value.asInstanceOf[js.Any])
    @scala.inline
    def setAUDVarargs(value: String*): Self = this.set("AUD", js.Array(value :_*))
    @scala.inline
    def setAUD(value: js.Array[String]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBGMVarargs(value: String*): Self = this.set("BGM", js.Array(value :_*))
    @scala.inline
    def setBGM(value: js.Array[String]): Self = this.set("BGM", value.asInstanceOf[js.Any])
    @scala.inline
    def setBGOVarargs(value: String*): Self = this.set("BGO", js.Array(value :_*))
    @scala.inline
    def setBGO(value: js.Array[String]): Self = this.set("BGO", value.asInstanceOf[js.Any])
    @scala.inline
    def setCUCVarargs(value: js.UndefOr[String]*): Self = this.set("CUC", js.Array(value :_*))
    @scala.inline
    def setCUC(value: js.Array[js.UndefOr[String]]): Self = this.set("CUC", value.asInstanceOf[js.Any])
    @scala.inline
    def setDEMVarargs(value: String*): Self = this.set("DEM", js.Array(value :_*))
    @scala.inline
    def setDEM(value: js.Array[String]): Self = this.set("DEM", value.asInstanceOf[js.Any])
    @scala.inline
    def setFKPVarargs(value: js.UndefOr[String]*): Self = this.set("FKP", js.Array(value :_*))
    @scala.inline
    def setFKP(value: js.Array[js.UndefOr[String]]): Self = this.set("FKP", value.asInstanceOf[js.Any])
    @scala.inline
    def setGNFVarargs(value: js.UndefOr[String]*): Self = this.set("GNF", js.Array(value :_*))
    @scala.inline
    def setGNF(value: js.Array[js.UndefOr[String]]): Self = this.set("GNF", value.asInstanceOf[js.Any])
    @scala.inline
    def setKMFVarargs(value: js.UndefOr[String]*): Self = this.set("KMF", js.Array(value :_*))
    @scala.inline
    def setKMF(value: js.Array[js.UndefOr[String]]): Self = this.set("KMF", value.asInstanceOf[js.Any])
    @scala.inline
    def setLUFVarargs(value: String*): Self = this.set("LUF", js.Array(value :_*))
    @scala.inline
    def setLUF(value: js.Array[String]): Self = this.set("LUF", value.asInstanceOf[js.Any])
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setRWFVarargs(value: js.UndefOr[String]*): Self = this.set("RWF", js.Array(value :_*))
    @scala.inline
    def setRWF(value: js.Array[js.UndefOr[String]]): Self = this.set("RWF", value.asInstanceOf[js.Any])
    @scala.inline
    def setSYPVarargs(value: scala.Nothing*): Self = this.set("SYP", js.Array(value :_*))
    @scala.inline
    def setSYP(value: js.Array[scala.Nothing]): Self = this.set("SYP", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setZMWVarargs(value: js.UndefOr[String]*): Self = this.set("ZMW", js.Array(value :_*))
    @scala.inline
    def setZMW(value: js.Array[js.UndefOr[String]]): Self = this.set("ZMW", value.asInstanceOf[js.Any])
  }
  
}

