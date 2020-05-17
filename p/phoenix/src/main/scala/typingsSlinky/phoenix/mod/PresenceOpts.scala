package typingsSlinky.phoenix.mod

import typingsSlinky.phoenix.anon.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresenceOpts extends js.Object {
  var events: js.UndefOr[Diff] = js.native
}

object PresenceOpts {
  @scala.inline
  def apply(): PresenceOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresenceOpts]
  }
  @scala.inline
  implicit class PresenceOptsOps[Self <: PresenceOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: Diff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
  }
  
}

