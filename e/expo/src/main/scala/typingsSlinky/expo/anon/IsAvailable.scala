package typingsSlinky.expo.anon

import typingsSlinky.expo.expoBooleans.`false`
import typingsSlinky.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsAvailable extends UpdateCheckResult {
  var isAvailable: `false` = js.native
}

object IsAvailable {
  @scala.inline
  def apply(isAvailable: `false`): IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAvailable]
  }
  @scala.inline
  implicit class IsAvailableOps[Self <: IsAvailable] (val x: Self) extends AnyVal {
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

