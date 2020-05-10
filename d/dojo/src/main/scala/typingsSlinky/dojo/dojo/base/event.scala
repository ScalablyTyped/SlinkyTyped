package typingsSlinky.dojo.dojo.base

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/event.html
  *
  * This module defines dojo DOM event API.   Usually you should use dojo/on, and evt.stopPropagation() +
  * evt.preventDefault(), rather than this module.
  *
  */
@js.native
trait event extends js.Object {
  /**
    * normalizes properties on the event object including event
    * bubbling methods, keystroke normalization, and x/y positions
    *
    * @param evt native event object
    * @param sender node to treat as "currentTarget"
    */
  def fix(evt: Event_, sender: HTMLElement): Event_ = js.native
  /**
    * prevents propagation and clobbers the default action of the
    * passed event
    *
    * @param evt The event object. If omitted, window.event is used on IE.
    */
  def stop(evt: Event_): Unit = js.native
}

object event {
  @scala.inline
  def apply(fix: (Event_, HTMLElement) => Event_, stop: Event_ => Unit): event = {
    val __obj = js.Dynamic.literal(fix = js.Any.fromFunction2(fix), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[event]
  }
  @scala.inline
  implicit class eventOps[Self <: event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFix(value: (Event_, HTMLElement) => Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStop(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

