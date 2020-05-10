package typingsSlinky.expo

import typingsSlinky.expo.expoBooleans.`false`
import typingsSlinky.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsAvailable extends UpdateCheckResult {
  var isAvailable: `false` = js.native
}

object AnonIsAvailable {
  @scala.inline
  def apply(isAvailable: `false`): AnonIsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsAvailable]
  }
  @scala.inline
  implicit class AnonIsAvailableOps[Self <: AnonIsAvailable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAvailable(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

