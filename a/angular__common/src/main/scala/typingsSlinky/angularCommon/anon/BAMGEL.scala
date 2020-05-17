package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BAMGEL extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var BAM: js.Array[String] = js.native
  var GEL: js.Array[js.UndefOr[String]] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var NZD: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var VND: js.Array[js.UndefOr[String]] = js.native
}

object BAMGEL {
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    BAM: js.Array[String],
    GEL: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]]
  ): BAMGEL = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BAM = BAM.asInstanceOf[js.Any], GEL = GEL.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any])
    __obj.asInstanceOf[BAMGEL]
  }
  @scala.inline
  implicit class BAMGELOps[Self <: BAMGEL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBAM(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BAM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGEL(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKRW(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KRW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNZD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NZD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVND(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VND")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

