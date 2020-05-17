package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BNDCAD extends js.Object {
  var BND: js.Array[String] = js.native
  var CAD: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[String] = js.native
  var MXN: js.Array[js.UndefOr[String]] = js.native
  var MYR: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[js.UndefOr[String]] = js.native
}

object BNDCAD {
  @scala.inline
  def apply(
    BND: js.Array[String],
    CAD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    MYR: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[js.UndefOr[String]]
  ): BNDCAD = {
    val __obj = js.Dynamic.literal(BND = BND.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BNDCAD]
  }
  @scala.inline
  implicit class BNDCADOps[Self <: BNDCAD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBND(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCAD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMXN(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MXN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMYR(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

