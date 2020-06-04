package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RUR extends js.Object {
  var GEL: js.Array[js.UndefOr[String]]
  var KZT: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var RUB: js.Array[String]
  var RUR: js.Array[String]
  var THB: js.Array[String]
  var TMT: js.Array[String]
  var TWD: js.Array[String]
  var UAH: js.Array[String]
  var XXX: js.Array[String]
}

object RUR {
  @scala.inline
  def apply(
    GEL: js.Array[js.UndefOr[String]],
    KZT: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    RUB: js.Array[String],
    RUR: js.Array[String],
    THB: js.Array[String],
    TMT: js.Array[String],
    TWD: js.Array[String],
    UAH: js.Array[String],
    XXX: js.Array[String]
  ): RUR = {
    val __obj = js.Dynamic.literal(GEL = GEL.asInstanceOf[js.Any], KZT = KZT.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], RUR = RUR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TMT = TMT.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], UAH = UAH.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[RUR]
  }
  @scala.inline
  implicit class RUROps[Self <: RUR] (val x: Self) extends AnyVal {
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
    def setGEL(value: js.Array[js.UndefOr[String]]): Self = this.set("GEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setKZT(value: js.Array[String]): Self = this.set("KZT", value.asInstanceOf[js.Any])
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUB(value: js.Array[String]): Self = this.set("RUB", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUR(value: js.Array[String]): Self = this.set("RUR", value.asInstanceOf[js.Any])
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

