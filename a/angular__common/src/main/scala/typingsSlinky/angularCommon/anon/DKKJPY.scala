package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DKKJPY extends js.Object {
  var DKK: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object DKKJPY {
  @scala.inline
  def apply(DKK: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): DKKJPY = {
    val __obj = js.Dynamic.literal(DKK = DKK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKKJPY]
  }
  @scala.inline
  implicit class DKKJPYOps[Self <: DKKJPY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDKK(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
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

