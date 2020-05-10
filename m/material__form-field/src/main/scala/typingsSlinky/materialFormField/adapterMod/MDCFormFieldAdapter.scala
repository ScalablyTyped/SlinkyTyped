package typingsSlinky.materialFormField.adapterMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCFormFieldAdapter extends js.Object {
  def activateInputRipple(): Unit = js.native
  def deactivateInputRipple(): Unit = js.native
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
}

object MDCFormFieldAdapter {
  @scala.inline
  def apply(
    activateInputRipple: () => Unit,
    deactivateInputRipple: () => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    registerInteractionHandler: (String, EventListener) => Unit
  ): MDCFormFieldAdapter = {
    val __obj = js.Dynamic.literal(activateInputRipple = js.Any.fromFunction0(activateInputRipple), deactivateInputRipple = js.Any.fromFunction0(deactivateInputRipple), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler))
    __obj.asInstanceOf[MDCFormFieldAdapter]
  }
  @scala.inline
  implicit class MDCFormFieldAdapterOps[Self <: MDCFormFieldAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateInputRipple(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateInputRipple")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeactivateInputRipple(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateInputRipple")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

