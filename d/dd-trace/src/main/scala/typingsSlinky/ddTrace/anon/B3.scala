package typingsSlinky.ddTrace.anon

import typingsSlinky.ddTrace.ddTraceStrings.`agent-exporter`
import typingsSlinky.ddTrace.ddTraceStrings.`log-exporter`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait B3 extends js.Object {
  var b3: js.UndefOr[Boolean] = js.native
  /**
    * Whether to write traces to log output, rather than send to an agent
    * @default false
    */
  var exporter: js.UndefOr[`log-exporter` | `agent-exporter`] = js.native
  var thenables: js.UndefOr[Boolean] = js.native
}

object B3 {
  @scala.inline
  def apply(): B3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[B3]
  }
  @scala.inline
  implicit class B3Ops[Self <: B3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b3")(js.undefined)
        ret
    }
    @scala.inline
    def withExporter(value: `log-exporter` | `agent-exporter`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporter")(js.undefined)
        ret
    }
    @scala.inline
    def withThenables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThenables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenables")(js.undefined)
        ret
    }
  }
  
}

