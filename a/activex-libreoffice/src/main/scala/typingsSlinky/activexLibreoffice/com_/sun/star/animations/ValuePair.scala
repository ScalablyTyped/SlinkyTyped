package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValuePair extends js.Object {
  var First: js.Any = js.native
  var Second: js.Any = js.native
}

object ValuePair {
  @scala.inline
  def apply(First: js.Any, Second: js.Any): ValuePair = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuePair]
  }
  @scala.inline
  implicit class ValuePairOps[Self <: ValuePair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("First")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Second")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

