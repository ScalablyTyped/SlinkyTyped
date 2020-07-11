package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALL extends js.Object {
  var ALL: js.Array[String]
  var JPY: js.Array[String]
  var MKD: js.Array[String]
  var THB: js.Array[String]
  var USD: js.Array[String]
}

object ALL {
  @scala.inline
  def apply(
    ALL: js.Array[String],
    JPY: js.Array[String],
    MKD: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): ALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MKD = MKD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALL]
  }
  @scala.inline
  implicit class ALLOps[Self <: ALL] (val x: Self) extends AnyVal {
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
    def setALLVarargs(value: String*): Self = this.set("ALL", js.Array(value :_*))
    @scala.inline
    def setALL(value: js.Array[String]): Self = this.set("ALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMKDVarargs(value: String*): Self = this.set("MKD", js.Array(value :_*))
    @scala.inline
    def setMKD(value: js.Array[String]): Self = this.set("MKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

