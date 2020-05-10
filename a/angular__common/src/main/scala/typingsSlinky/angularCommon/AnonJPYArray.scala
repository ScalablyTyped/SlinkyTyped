package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJPYArray extends js.Object {
  var JPY: js.Array[String] = js.native
}

object AnonJPYArray {
  @scala.inline
  def apply(JPY: js.Array[String]): AnonJPYArray = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJPYArray]
  }
  @scala.inline
  implicit class AnonJPYArrayOps[Self <: AnonJPYArray] (val x: Self) extends AnyVal {
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
  }
  
}

