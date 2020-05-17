package typingsSlinky.reactNativeMaterialKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checked extends js.Object {
  var checked: Boolean = js.native
}

object Checked {
  @scala.inline
  def apply(checked: Boolean): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  @scala.inline
  implicit class CheckedOps[Self <: Checked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

