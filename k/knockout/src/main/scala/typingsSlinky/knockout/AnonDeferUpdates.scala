package typingsSlinky.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeferUpdates extends js.Object {
  var deferUpdates: Boolean = js.native
  var useOnlyNativeEvents: Boolean = js.native
}

object AnonDeferUpdates {
  @scala.inline
  def apply(deferUpdates: Boolean, useOnlyNativeEvents: Boolean): AnonDeferUpdates = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any], useOnlyNativeEvents = useOnlyNativeEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeferUpdates]
  }
  @scala.inline
  implicit class AnonDeferUpdatesOps[Self <: AnonDeferUpdates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseOnlyNativeEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOnlyNativeEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

