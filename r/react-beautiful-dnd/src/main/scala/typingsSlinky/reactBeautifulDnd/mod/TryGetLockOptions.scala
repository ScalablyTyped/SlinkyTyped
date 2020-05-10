package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryGetLockOptions extends js.Object {
  var sourceEvent: js.UndefOr[Event_] = js.native
}

object TryGetLockOptions {
  @scala.inline
  def apply(): TryGetLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TryGetLockOptions]
  }
  @scala.inline
  implicit class TryGetLockOptionsOps[Self <: TryGetLockOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceEvent(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEvent")(js.undefined)
        ret
    }
  }
  
}

