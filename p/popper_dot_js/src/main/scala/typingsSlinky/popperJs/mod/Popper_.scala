package typingsSlinky.popperJs.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popper_ extends js.Object {
  var options: PopperOptions = js.native
  var popper: Element = js.native
  var reference: Element | ReferenceObject = js.native
  def destroy(): Unit = js.native
  def disableEventListeners(): Unit = js.native
  def enableEventListeners(): Unit = js.native
  def scheduleUpdate(): Unit = js.native
  def update(): Unit = js.native
}

object Popper_ {
  @scala.inline
  def apply(
    destroy: () => Unit,
    disableEventListeners: () => Unit,
    enableEventListeners: () => Unit,
    options: PopperOptions,
    popper: Element,
    reference: Element | ReferenceObject,
    scheduleUpdate: () => Unit,
    update: () => Unit
  ): Popper_ = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableEventListeners = js.Any.fromFunction0(disableEventListeners), enableEventListeners = js.Any.fromFunction0(enableEventListeners), options = options.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Popper_]
  }
  @scala.inline
  implicit class Popper_Ops[Self <: Popper_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableEventListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEventListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableEventListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEventListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: PopperOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopper(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: Element | ReferenceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

