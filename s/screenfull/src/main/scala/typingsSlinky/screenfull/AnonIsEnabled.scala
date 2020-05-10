package typingsSlinky.screenfull

import typingsSlinky.screenfull.screenfullBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsEnabled extends js.Object {
  var isEnabled: `false` = js.native
}

object AnonIsEnabled {
  @scala.inline
  def apply(isEnabled: `false`): AnonIsEnabled = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsEnabled]
  }
  @scala.inline
  implicit class AnonIsEnabledOps[Self <: AnonIsEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEnabled(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

