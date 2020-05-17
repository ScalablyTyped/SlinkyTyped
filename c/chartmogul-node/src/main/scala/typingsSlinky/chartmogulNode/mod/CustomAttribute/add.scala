package typingsSlinky.chartmogulNode.mod.CustomAttribute

import typingsSlinky.chartmogulNode.anon.Custom
import typingsSlinky.chartmogulNode.anon.CustomArray
import typingsSlinky.chartmogulNode.commonMod.Entries
import typingsSlinky.chartmogulNode.mod.Config
import typingsSlinky.chartmogulNode.mod.Customer.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "CustomAttribute.add")
@js.native
object add extends js.Object {
  def apply(config: Config, uuid: String, data: Custom): js.Promise[Entries[Customer]] = js.native
  def apply(config: Config, uuid: String, data: CustomArray): js.Promise[CustomAttributes] = js.native
}

