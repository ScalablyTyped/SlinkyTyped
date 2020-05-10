package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBAM extends js.Object {
  var BAM: js.Array[String] = js.native
  var CZK: js.Array[String] = js.native
  var PLN: js.Array[String] = js.native
  var RSD: js.Array[String] = js.native
  var TRY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object AnonBAM {
  @scala.inline
  def apply(
    BAM: js.Array[String],
    CZK: js.Array[String],
    PLN: js.Array[String],
    RSD: js.Array[String],
    TRY: js.Array[String],
    USD: js.Array[String]
  ): AnonBAM = {
    val __obj = js.Dynamic.literal(BAM = BAM.asInstanceOf[js.Any], CZK = CZK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], RSD = RSD.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBAM]
  }
  @scala.inline
  implicit class AnonBAMOps[Self <: AnonBAM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBAM(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BAM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCZK(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CZK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPLN(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRY")(value.asInstanceOf[js.Any])
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

