package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAndArray extends js.Object {
  @JSName("$and")
  var $and: js.Array[_] = js.native
}

object AnonAndArray {
  @scala.inline
  def apply($and: js.Array[_]): AnonAndArray = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndArray]
  }
  @scala.inline
  implicit class AnonAndArrayOps[Self <: AnonAndArray] (val x: Self) extends AnyVal {
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

