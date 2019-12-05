package typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod

import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typingsSlinky.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsSlinky.relayDashRuntime.relayDashRuntimeStrings.defer_
import typingsSlinky.relayDashRuntime.relayDashRuntimeStrings.stream_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libStoreRelayStoreTypesMod.DeferPlaceholder
  - typings.relayDashRuntime.libStoreRelayStoreTypesMod.StreamPlaceholder
*/
trait IncrementalDataPlaceholder extends js.Object

object IncrementalDataPlaceholder {
  @scala.inline
  def DeferPlaceholder(
    data: PayloadData,
    kind: defer_,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): IncrementalDataPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IncrementalDataPlaceholder]
  }
  @scala.inline
  def StreamPlaceholder(
    kind: stream_,
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): IncrementalDataPlaceholder = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IncrementalDataPlaceholder]
  }
}

