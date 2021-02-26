package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayStoreTypesMod.SingularReaderSelector
  - typingsSlinky.relayRuntime.relayStoreTypesMod.PluralReaderSelector
*/
trait ReaderSelector extends StObject
object ReaderSelector {
  
  @scala.inline
  def PluralReaderSelector(kind: String, selectors: js.Array[SingularReaderSelector]): typingsSlinky.relayRuntime.relayStoreTypesMod.PluralReaderSelector = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.relayStoreTypesMod.PluralReaderSelector]
  }
  
  @scala.inline
  def SingularReaderSelector(
    dataID: DataID,
    isWithinUnmatchedTypeRefinement: Boolean,
    kind: String,
    node: ReaderFragment,
    owner: RequestDescriptor,
    variables: Variables
  ): typingsSlinky.relayRuntime.relayStoreTypesMod.SingularReaderSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID.asInstanceOf[js.Any], isWithinUnmatchedTypeRefinement = isWithinUnmatchedTypeRefinement.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.relayStoreTypesMod.SingularReaderSelector]
  }
}
