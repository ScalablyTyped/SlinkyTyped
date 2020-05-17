package typingsSlinky.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitEvent extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.native
  var onlySelf: js.UndefOr[Boolean] = js.native
}

object EmitEvent {
  @scala.inline
  def apply(): EmitEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitEvent]
  }
  @scala.inline
  implicit class EmitEventOps[Self <: EmitEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlySelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlySelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelf")(js.undefined)
        ret
    }
  }
  
}

