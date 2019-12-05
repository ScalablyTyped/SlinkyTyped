package typingsSlinky.relayDashRuntime.relayDashRuntimeMod

import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typingsSlinky.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createNormalizationSelector")
@js.native
object createNormalizationSelector extends js.Object {
  def apply(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
}

