package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayProfiler extends js.Object {
  def attachAggregateHandler(name: String, handler: js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]): Unit = js.native
  def attachProfileHandler(
    name: String,
    handler: js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]
  ): Unit = js.native
}

object RelayProfiler {
  @scala.inline
  def apply(
    attachAggregateHandler: (String, js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => Unit,
    attachProfileHandler: (String, js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]) => Unit
  ): RelayProfiler = {
    val __obj = js.Dynamic.literal(attachAggregateHandler = js.Any.fromFunction2(attachAggregateHandler), attachProfileHandler = js.Any.fromFunction2(attachProfileHandler))
    __obj.asInstanceOf[RelayProfiler]
  }
  @scala.inline
  implicit class RelayProfilerOps[Self <: RelayProfiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachAggregateHandler(value: (String, js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachAggregateHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttachProfileHandler(
      value: (String, js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachProfileHandler")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

