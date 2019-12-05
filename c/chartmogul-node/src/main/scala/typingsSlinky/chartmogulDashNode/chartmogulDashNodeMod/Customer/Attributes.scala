package typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.Customer

import typingsSlinky.chartmogulDashNode.chartmogulDashNodeMod.Config
import typingsSlinky.chartmogulDashNode.commonMod.Map
import typingsSlinky.chartmogulDashNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var clearbit: js.UndefOr[Map] = js.undefined
  var custom: js.UndefOr[Map] = js.undefined
  var stripe: js.UndefOr[Map] = js.undefined
  var tags: js.UndefOr[Strings] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(clearbit: Map = null, custom: Map = null, stripe: Map = null, tags: Strings = null): Attributes = {
    val __obj = js.Dynamic.literal()
    if (clearbit != null) __obj.updateDynamic("clearbit")(clearbit.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

@JSImport("chartmogul-node", "Customer.attributes")
@js.native
object attributes extends js.Object {
  def apply(config: Config, uuid: String): js.Promise[Attributes] = js.native
}

