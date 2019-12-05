package typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.Metrics.Customer

import typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.Config
import typingsSlinky.chartmogulDashNode.commonMod.CursorParams
import typingsSlinky.chartmogulDashNode.commonMod.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Metrics.Customer.subscriptions")
@js.native
object subscriptions extends js.Object {
  def apply(config: Config, uuid: String): js.Promise[Entries[MetricsSubscription]] = js.native
  def apply(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsSubscription]] = js.native
}

