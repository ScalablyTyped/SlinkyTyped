package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UZS extends js.Object {
  var JPY: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var UZS: js.Array[String] = js.native
}

object UZS {
  @scala.inline
  def apply(JPY: js.Array[String], THB: js.Array[String], USD: js.Array[String], UZS: js.Array[String]): UZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], UZS = UZS.asInstanceOf[js.Any])
    __obj.asInstanceOf[UZS]
  }
  @scala.inline
  implicit class UZSOps[Self <: UZS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUZS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UZS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

