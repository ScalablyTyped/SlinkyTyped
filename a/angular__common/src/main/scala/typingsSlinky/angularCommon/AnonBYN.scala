package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBYN extends js.Object {
  var BYN: js.Array[scala.Nothing] = js.native
  var DKK: js.Array[scala.Nothing] = js.native
  var HRK: js.Array[scala.Nothing] = js.native
  var ISK: js.Array[scala.Nothing] = js.native
  var NOK: js.Array[scala.Nothing] = js.native
  var PLN: js.Array[scala.Nothing] = js.native
  var RUR: js.Array[scala.Nothing] = js.native
  var SEK: js.Array[scala.Nothing] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
}

object AnonBYN {
  @scala.inline
  def apply(
    BYN: js.Array[scala.Nothing],
    DKK: js.Array[scala.Nothing],
    HRK: js.Array[scala.Nothing],
    ISK: js.Array[scala.Nothing],
    NOK: js.Array[scala.Nothing],
    PLN: js.Array[scala.Nothing],
    RUR: js.Array[scala.Nothing],
    SEK: js.Array[scala.Nothing],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): AnonBYN = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], DKK = DKK.asInstanceOf[js.Any], HRK = HRK.asInstanceOf[js.Any], ISK = ISK.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], RUR = RUR.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBYN]
  }
  @scala.inline
  implicit class AnonBYNOps[Self <: AnonBYN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBYN(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BYN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDKK(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHRK(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HRK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withISK(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOK(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPLN(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUR(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSEK(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEK")(value.asInstanceOf[js.Any])
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
  }
  
}

