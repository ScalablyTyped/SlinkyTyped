package typingsSlinky.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitEventBoolean extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
}

object EmitEventBoolean {
  @scala.inline
  def apply(): EmitEventBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitEventBoolean]
  }
  @scala.inline
  implicit class EmitEventBooleanOps[Self <: EmitEventBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmitEvent(value: Boolean): Self = this.set("emitEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitEvent: Self = this.set("emitEvent", js.undefined)
  }
  
}

