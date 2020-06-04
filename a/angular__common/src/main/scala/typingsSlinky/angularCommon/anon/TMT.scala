package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMT extends js.Object {
  var BYN: js.Array[String]
  var GEL: js.Array[js.UndefOr[String]]
  var RON: js.Array[js.UndefOr[String]]
  var RUB: js.Array[String]
  var THB: js.Array[String]
  var TMT: js.Array[String]
  var TWD: js.Array[String]
  var UAH: js.Array[String]
  var XXX: js.Array[String]
}

object TMT {
  @scala.inline
  def apply(
    BYN: js.Array[String],
    GEL: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    RUB: js.Array[String],
    THB: js.Array[String],
    TMT: js.Array[String],
    TWD: js.Array[String],
    UAH: js.Array[String],
    XXX: js.Array[String]
  ): TMT = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], GEL = GEL.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TMT = TMT.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], UAH = UAH.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMT]
  }
  @scala.inline
  implicit class TMTOps[Self <: TMT] (val x: Self) extends AnyVal {
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
    def setBYN(value: js.Array[String]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setGEL(value: js.Array[js.UndefOr[String]]): Self = this.set("GEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUB(value: js.Array[String]): Self = this.set("RUB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTMT(value: js.Array[String]): Self = this.set("TMT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUAH(value: js.Array[String]): Self = this.set("UAH", value.asInstanceOf[js.Any])
    @scala.inline
    def setXXX(value: js.Array[String]): Self = this.set("XXX", value.asInstanceOf[js.Any])
  }
  
}

