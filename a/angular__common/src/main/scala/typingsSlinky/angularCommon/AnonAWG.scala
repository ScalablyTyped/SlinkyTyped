package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAWG extends js.Object {
  var ANG: js.Array[String] = js.native
  var AWG: js.Array[String] = js.native
  var BBD: js.Array[js.UndefOr[String]] = js.native
  var BSD: js.Array[js.UndefOr[String]] = js.native
  var HTG: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var MMK: js.Array[String] = js.native
  var PAB: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TTD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object AnonAWG {
  @scala.inline
  def apply(
    ANG: js.Array[String],
    AWG: js.Array[String],
    BBD: js.Array[js.UndefOr[String]],
    BSD: js.Array[js.UndefOr[String]],
    HTG: js.Array[String],
    JPY: js.Array[String],
    MMK: js.Array[String],
    PAB: js.Array[String],
    THB: js.Array[String],
    TTD: js.Array[String],
    USD: js.Array[String]
  ): AnonAWG = {
    val __obj = js.Dynamic.literal(ANG = ANG.asInstanceOf[js.Any], AWG = AWG.asInstanceOf[js.Any], BBD = BBD.asInstanceOf[js.Any], BSD = BSD.asInstanceOf[js.Any], HTG = HTG.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MMK = MMK.asInstanceOf[js.Any], PAB = PAB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TTD = TTD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAWG]
  }
  @scala.inline
  implicit class AnonAWGOps[Self <: AnonAWG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANG(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAWG(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBBD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BBD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBSD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BSD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTG(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMK(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MMK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTTD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TTD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

