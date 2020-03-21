package typingsSlinky.chartmogulNode.mod.CustomAttribute

import typingsSlinky.chartmogulNode.AnonCustom
import typingsSlinky.chartmogulNode.AnonCustomArray
import typingsSlinky.chartmogulNode.commonMod.Entries
import typingsSlinky.chartmogulNode.mod.Config
import typingsSlinky.chartmogulNode.mod.Customer.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "CustomAttribute.add")
@js.native
object add extends js.Object {
  def apply(config: Config, uuid: String, data: AnonCustom): js.Promise[Entries[Customer]] = js.native
  def apply(config: Config, uuid: String, data: AnonCustomArray): js.Promise[CustomAttributes] = js.native
}

