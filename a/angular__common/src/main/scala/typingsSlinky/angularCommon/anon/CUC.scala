package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CUC extends js.Object {
  var ATS: js.Array[String] = js.native
  var AUD: js.Array[String] = js.native
  var BGM: js.Array[String] = js.native
  var BGO: js.Array[String] = js.native
  var CUC: js.Array[js.UndefOr[String]] = js.native
  var DEM: js.Array[String] = js.native
  var FKP: js.Array[js.UndefOr[String]] = js.native
  var GNF: js.Array[js.UndefOr[String]] = js.native
  var KMF: js.Array[js.UndefOr[String]] = js.native
  var LUF: js.Array[String] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var RWF: js.Array[js.UndefOr[String]] = js.native
  var SYP: js.Array[scala.Nothing] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var ZMW: js.Array[js.UndefOr[String]] = js.native
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
    def withATS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ATS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBGM(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BGM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBGO(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BGO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCUC(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CUC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEM(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFKP(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FKP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGNF(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GNF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKMF(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLUF(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LUF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRON(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRWF(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RWF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSYP(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SYP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZMW(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZMW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

