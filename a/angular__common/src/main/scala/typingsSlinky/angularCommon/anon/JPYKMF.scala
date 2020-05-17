package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JPYKMF extends js.Object {
  var ESP: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var KMF: js.Array[js.UndefOr[String]] = js.native
  var MXN: js.Array[String] = js.native
  var RUB: js.Array[js.UndefOr[String]] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
}

object JPYKMF {
  @scala.inline
  def apply(
    ESP: js.Array[String],
    JPY: js.Array[String],
    KMF: js.Array[js.UndefOr[String]],
    MXN: js.Array[String],
    RUB: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): JPYKMF = {
    val __obj = js.Dynamic.literal(ESP = ESP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KMF = KMF.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYKMF]
  }
  @scala.inline
  implicit class JPYKMFOps[Self <: JPYKMF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withESP(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKMF(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMXN(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MXN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUB(value: js.Array[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUB")(value.asInstanceOf[js.Any])
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

