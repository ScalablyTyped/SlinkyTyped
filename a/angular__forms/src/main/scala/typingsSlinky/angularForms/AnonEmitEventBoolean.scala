package typingsSlinky.angularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmitEventBoolean extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.native
}

object AnonEmitEventBoolean {
  @scala.inline
  def apply(): AnonEmitEventBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEmitEventBoolean]
  }
  @scala.inline
  implicit class AnonEmitEventBooleanOps[Self <: AnonEmitEventBoolean] (val x: Self) extends AnyVal {
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
  }
  
}

