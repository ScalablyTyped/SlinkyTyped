package typingsSlinky.chartmogulNode.mod.Metrics.Customer

import typingsSlinky.chartmogulNode.commonMod.CursorParams
import typingsSlinky.chartmogulNode.commonMod.Entries
import typingsSlinky.chartmogulNode.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chartmogul-node", "Metrics.Customer.activities")
@js.native
object activities extends js.Object {
  
  def apply(config: Config, uuid: String): js.Promise[Entries[MetricsActivity]] = js.native
  def apply(config: Config, uuid: String, params: CursorParams): js.Promise[Entries[MetricsActivity]] = js.native
}
