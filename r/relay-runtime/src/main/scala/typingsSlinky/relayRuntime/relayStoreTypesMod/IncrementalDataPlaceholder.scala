package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typingsSlinky.relayRuntime.relayNetworkTypesMod.PayloadData
import typingsSlinky.relayRuntime.relayRuntimeStrings.defer_
import typingsSlinky.relayRuntime.relayRuntimeStrings.stream_
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayStoreTypesMod.DeferPlaceholder
  - typingsSlinky.relayRuntime.relayStoreTypesMod.StreamPlaceholder
*/
trait IncrementalDataPlaceholder extends StObject
object IncrementalDataPlaceholder {
  
  @scala.inline
  def DeferPlaceholder(
    data: PayloadData,
    kind: defer_,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): typingsSlinky.relayRuntime.relayStoreTypesMod.DeferPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.relayStoreTypesMod.DeferPlaceholder]
  }
  
  @scala.inline
  def StreamPlaceholder(
    kind: stream_,
    label: String,
    node: NormalizationSelectableNode,
    parentID: DataID,
    path: js.Array[String],
    variables: Variables
  ): typingsSlinky.relayRuntime.relayStoreTypesMod.StreamPlaceholder = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentID = parentID.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.relayStoreTypesMod.StreamPlaceholder]
  }
}
