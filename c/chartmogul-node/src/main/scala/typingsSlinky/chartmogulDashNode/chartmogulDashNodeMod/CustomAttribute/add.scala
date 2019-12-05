package typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.CustomAttribute

import typingsSlinky.chartmogulDashNode.Anon_Custom
import typingsSlinky.chartmogulDashNode.Anon_CustomArray
import typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.Config
import typingsSlinky.chartmogulDashNode.commonMod.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "CustomAttribute.add")
@js.native
object add extends js.Object {
  def apply(config: Config, uuid: String, data: Anon_Custom): js.Promise[
    Entries[typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.Customer.Customer]
  ] = js.native
  def apply(config: Config, uuid: String, data: Anon_CustomArray): js.Promise[CustomAttributes] = js.native
}

