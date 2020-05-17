package typingsSlinky.knockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferUpdates extends js.Object {
  var deferUpdates: Boolean = js.native
  var useOnlyNativeEvents: Boolean = js.native
}

object DeferUpdates {
  @scala.inline
  def apply(deferUpdates: Boolean, useOnlyNativeEvents: Boolean): DeferUpdates = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any], useOnlyNativeEvents = useOnlyNativeEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferUpdates]
  }
  @scala.inline
  implicit class DeferUpdatesOps[Self <: DeferUpdates] (val x: Self) extends AnyVal {
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

