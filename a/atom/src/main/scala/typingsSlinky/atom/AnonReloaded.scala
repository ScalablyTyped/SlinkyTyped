package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReloaded extends js.Object {
  var reloaded: Boolean = js.native
}

object AnonReloaded {
  @scala.inline
  def apply(reloaded: Boolean): AnonReloaded = {
    val __obj = js.Dynamic.literal(reloaded = reloaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReloaded]
  }
  @scala.inline
  implicit class AnonReloadedOps[Self <: AnonReloaded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReloaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloaded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

