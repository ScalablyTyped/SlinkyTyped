package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndArray extends js.Object {
  @JSName("$and")
  var $and: js.Array[_] = js.native
}

object AndArray {
  @scala.inline
  def apply($and: js.Array[_]): AndArray = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndArray]
  }
  @scala.inline
  implicit class AndArrayOps[Self <: AndArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$and(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

