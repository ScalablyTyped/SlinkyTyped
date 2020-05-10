package typingsSlinky.rcTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChecked extends js.Object {
  var checked: js.Array[String] = js.native
  var halfChecked: js.Array[String] = js.native
}

object AnonChecked {
  @scala.inline
  def apply(checked: js.Array[String], halfChecked: js.Array[String]): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecked]
  }
  @scala.inline
  implicit class AnonCheckedOps[Self <: AnonChecked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHalfChecked(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfChecked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

