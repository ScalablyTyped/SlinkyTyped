package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AFNJPY extends js.Object {
  var AFN: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object AFNJPY {
  @scala.inline
  def apply(AFN: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AFNJPY = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFNJPY]
  }
  @scala.inline
  implicit class AFNJPYOps[Self <: AFNJPY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAFN(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AFN")(value.asInstanceOf[js.Any])
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

