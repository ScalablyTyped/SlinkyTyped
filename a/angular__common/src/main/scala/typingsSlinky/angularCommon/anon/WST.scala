package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WST extends js.Object {
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var WST: js.Array[String] = js.native
}

object WST {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], WST: js.Array[String]): WST = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], WST = WST.asInstanceOf[js.Any])
    __obj.asInstanceOf[WST]
  }
  @scala.inline
  implicit class WSTOps[Self <: WST] (val x: Self) extends AnyVal {
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
    def withUSD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWST(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WST")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

