package typingsSlinky.ddTrace.anon

import typingsSlinky.ddTrace.ddTraceStrings.`agent-exporter`
import typingsSlinky.ddTrace.ddTraceStrings.`log-exporter`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait B3 extends js.Object {
  var b3: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to write traces to log output, rather than send to an agent
    * @default false
    */
  var exporter: js.UndefOr[`log-exporter` | `agent-exporter`] = js.undefined
  var thenables: js.UndefOr[Boolean] = js.undefined
}

object B3 {
  @scala.inline
  def apply(
    b3: js.UndefOr[Boolean] = js.undefined,
    exporter: `log-exporter` | `agent-exporter` = null,
    thenables: js.UndefOr[Boolean] = js.undefined
  ): B3 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b3)) __obj.updateDynamic("b3")(b3.get.asInstanceOf[js.Any])
    if (exporter != null) __obj.updateDynamic("exporter")(exporter.asInstanceOf[js.Any])
    if (!js.isUndefined(thenables)) __obj.updateDynamic("thenables")(thenables.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[B3]
  }
}

