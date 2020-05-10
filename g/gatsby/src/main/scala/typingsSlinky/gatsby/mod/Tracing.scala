package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracing extends js.Object {
  var parentSpan: js.Object = js.native
  var startSpan: js.Function = js.native
  var tracer: js.Object = js.native
}

object Tracing {
  @scala.inline
  def apply(parentSpan: js.Object, startSpan: js.Function, tracer: js.Object): Tracing = {
    val __obj = js.Dynamic.literal(parentSpan = parentSpan.asInstanceOf[js.Any], startSpan = startSpan.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracing]
  }
  @scala.inline
  implicit class TracingOps[Self <: Tracing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentSpan(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartSpan(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracer(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

