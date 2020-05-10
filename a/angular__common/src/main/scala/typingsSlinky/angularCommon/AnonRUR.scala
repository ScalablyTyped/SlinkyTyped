package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRUR extends js.Object {
  var GEL: js.Array[js.UndefOr[String]] = js.native
  var KZT: js.Array[String] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var RUB: js.Array[String] = js.native
  var RUR: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TMT: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var UAH: js.Array[String] = js.native
  var XXX: js.Array[String] = js.native
}

object AnonRUR {
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
  ): AnonRUR = {
    val __obj = js.Dynamic.literal(GEL = GEL.asInstanceOf[js.Any], KZT = KZT.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], RUR = RUR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TMT = TMT.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], UAH = UAH.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRUR]
  }
  @scala.inline
  implicit class AnonRUROps[Self <: AnonRUR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGEL(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKZT(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KZT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRON(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUR(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTMT(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TMT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUAH(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UAH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXXX(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XXX")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

