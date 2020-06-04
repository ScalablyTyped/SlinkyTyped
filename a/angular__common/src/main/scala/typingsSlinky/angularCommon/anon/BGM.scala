package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BGM extends js.Object {
  var ATS: js.Array[String]
  var AUD: js.Array[String]
  var BGM: js.Array[String]
  var BGO: js.Array[String]
  var CUC: js.Array[js.UndefOr[String]]
  var DEM: js.Array[String]
  var EUR: js.Array[scala.Nothing]
  var FKP: js.Array[js.UndefOr[String]]
  var GNF: js.Array[js.UndefOr[String]]
  var KMF: js.Array[js.UndefOr[String]]
  var RON: js.Array[js.UndefOr[String]]
  var RWF: js.Array[js.UndefOr[String]]
  var SYP: js.Array[scala.Nothing]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var ZMW: js.Array[js.UndefOr[String]]
}

object BGM {
  @scala.inline
  def apply(
    ATS: js.Array[String],
    AUD: js.Array[String],
    BGM: js.Array[String],
    BGO: js.Array[String],
    CUC: js.Array[js.UndefOr[String]],
    DEM: js.Array[String],
    EUR: js.Array[scala.Nothing],
    FKP: js.Array[js.UndefOr[String]],
    GNF: js.Array[js.UndefOr[String]],
    KMF: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    RWF: js.Array[js.UndefOr[String]],
    SYP: js.Array[scala.Nothing],
    THB: js.Array[String],
    TWD: js.Array[String],
    ZMW: js.Array[js.UndefOr[String]]
  ): BGM = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any], AUD = AUD.asInstanceOf[js.Any], BGM = BGM.asInstanceOf[js.Any], BGO = BGO.asInstanceOf[js.Any], CUC = CUC.asInstanceOf[js.Any], DEM = DEM.asInstanceOf[js.Any], EUR = EUR.asInstanceOf[js.Any], FKP = FKP.asInstanceOf[js.Any], GNF = GNF.asInstanceOf[js.Any], KMF = KMF.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RWF = RWF.asInstanceOf[js.Any], SYP = SYP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], ZMW = ZMW.asInstanceOf[js.Any])
    __obj.asInstanceOf[BGM]
  }
  @scala.inline
  implicit class BGMOps[Self <: BGM] (val x: Self) extends AnyVal {
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
    def setATS(value: js.Array[String]): Self = this.set("ATS", value.asInstanceOf[js.Any])
    @scala.inline
    def setAUD(value: js.Array[String]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBGM(value: js.Array[String]): Self = this.set("BGM", value.asInstanceOf[js.Any])
    @scala.inline
    def setBGO(value: js.Array[String]): Self = this.set("BGO", value.asInstanceOf[js.Any])
    @scala.inline
    def setCUC(value: js.Array[js.UndefOr[String]]): Self = this.set("CUC", value.asInstanceOf[js.Any])
    @scala.inline
    def setDEM(value: js.Array[String]): Self = this.set("DEM", value.asInstanceOf[js.Any])
    @scala.inline
    def setEUR(value: js.Array[scala.Nothing]): Self = this.set("EUR", value.asInstanceOf[js.Any])
    @scala.inline
    def setFKP(value: js.Array[js.UndefOr[String]]): Self = this.set("FKP", value.asInstanceOf[js.Any])
    @scala.inline
    def setGNF(value: js.Array[js.UndefOr[String]]): Self = this.set("GNF", value.asInstanceOf[js.Any])
    @scala.inline
    def setKMF(value: js.Array[js.UndefOr[String]]): Self = this.set("KMF", value.asInstanceOf[js.Any])
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setRWF(value: js.Array[js.UndefOr[String]]): Self = this.set("RWF", value.asInstanceOf[js.Any])
    @scala.inline
    def setSYP(value: js.Array[scala.Nothing]): Self = this.set("SYP", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setZMW(value: js.Array[js.UndefOr[String]]): Self = this.set("ZMW", value.asInstanceOf[js.Any])
  }
  
}

