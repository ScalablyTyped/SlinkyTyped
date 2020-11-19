package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.SingularReaderSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime", "createReaderSelector")
@js.native
object createReaderSelector extends js.Object {
  
  def apply(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = js.native
  def apply(
    fragment: ReaderFragment,
    dataID: DataID,
    variables: Variables,
    request: RequestDescriptor,
     // default: `false`
  isWithinUnmatchedTypeRefinement: Boolean
  ): SingularReaderSelector = js.native
}
