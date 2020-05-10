package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndeterminate extends js.Object {
  var indeterminate: Boolean = js.native
}

object AnonIndeterminate {
  @scala.inline
  def apply(indeterminate: Boolean): AnonIndeterminate = {
    val __obj = js.Dynamic.literal(indeterminate = indeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndeterminate]
  }
  @scala.inline
  implicit class AnonIndeterminateOps[Self <: AnonIndeterminate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndeterminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

