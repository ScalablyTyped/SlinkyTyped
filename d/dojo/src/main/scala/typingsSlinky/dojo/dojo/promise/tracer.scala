package typingsSlinky.dojo.dojo.promise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/promise/tracer.html
  *
  * Trace promise fulfillment.
  * Trace promise fulfillment. Calling .trace() or .traceError() on a
  * promise enables tracing. Will emit resolved, rejected or progress
  * events.
  *
  */
@js.native
trait tracer extends js.Object {
  /**
    * Subscribe to traces.
    * See dojo/Evented#on().
    *
    * @param type resolved, rejected, or progress
    * @param listener The listener is passed the traced value and any argumentsthat were used with the .trace() call.
    */
  def on(`type`: String, listener: js.Function): Unit = js.native
}

object tracer {
  @scala.inline
  def apply(on: (String, js.Function) => Unit): tracer = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[tracer]
  }
  @scala.inline
  implicit class tracerOps[Self <: tracer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: (String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

