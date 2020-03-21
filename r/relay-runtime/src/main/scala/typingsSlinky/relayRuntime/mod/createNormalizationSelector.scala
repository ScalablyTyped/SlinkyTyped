package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.NormalizationSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createNormalizationSelector")
@js.native
object createNormalizationSelector extends js.Object {
  def apply(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
}

