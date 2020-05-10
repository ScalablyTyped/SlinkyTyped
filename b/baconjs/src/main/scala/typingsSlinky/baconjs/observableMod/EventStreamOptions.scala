package typingsSlinky.baconjs.observableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStreamOptions extends js.Object {
  var forceAsync: Boolean = js.native
}

object EventStreamOptions {
  @scala.inline
  def apply(forceAsync: Boolean): EventStreamOptions = {
    val __obj = js.Dynamic.literal(forceAsync = forceAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStreamOptions]
  }
  @scala.inline
  implicit class EventStreamOptionsOps[Self <: EventStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAsync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

