package typingsSlinky.chartmogulNode.mod.Metrics.Customer

import typingsSlinky.chartmogulNode.commonMod.CursorParams
import typingsSlinky.chartmogulNode.commonMod.Entries
import typingsSlinky.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chartmogul-node", "Metrics.Customer.subscriptions")
@js.native
object subscriptions extends js.Object {
  
  def apply(config: Config, uuid: String): js.Promise[Entries[MetricsSubscription]] = js.native
  def apply(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsSubscription]] = js.native
}
