package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JPYKMF extends js.Object {
  var ESP: js.Array[String]
  var JPY: js.Array[String]
  var KMF: js.Array[js.UndefOr[String]]
  var MXN: js.Array[String]
  var RUB: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setESPVarargs(value: String*): Self = this.set("ESP", js.Array(value :_*))
    @scala.inline
    def setESP(value: js.Array[String]): Self = this.set("ESP", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setKMFVarargs(value: js.UndefOr[String]*): Self = this.set("KMF", js.Array(value :_*))
    @scala.inline
    def setKMF(value: js.Array[js.UndefOr[String]]): Self = this.set("KMF", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXNVarargs(value: String*): Self = this.set("MXN", js.Array(value :_*))
    @scala.inline
    def setMXN(value: js.Array[String]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUBVarargs(value: js.UndefOr[String]*): Self = this.set("RUB", js.Array(value :_*))
    @scala.inline
    def setRUB(value: js.Array[js.UndefOr[String]]): Self = this.set("RUB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
  }
  
}

