package typingsSlinky.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQIsNum extends js.Object {
  var qIsNum: Boolean = js.native
  var qString: String = js.native
}

object AnonQIsNum {
  @scala.inline
  def apply(qIsNum: Boolean, qString: String): AnonQIsNum = {
    val __obj = js.Dynamic.literal(qIsNum = qIsNum.asInstanceOf[js.Any], qString = qString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQIsNum]
  }
  @scala.inline
  implicit class AnonQIsNumOps[Self <: AnonQIsNum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQIsNum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

