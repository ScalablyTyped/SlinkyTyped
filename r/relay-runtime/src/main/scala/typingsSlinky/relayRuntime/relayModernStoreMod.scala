package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typingsSlinky.relayRuntime.relayStoreTypesMod.ReaderSelector
import typingsSlinky.relayRuntime.relayStoreTypesMod.Snapshot
import typingsSlinky.relayRuntime.relayStoreTypesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernStore", JSImport.Namespace)
@js.native
object relayModernStoreMod extends js.Object {
  @js.native
  class RelayModernStore protected () extends Store {
    def this(source: MutableRecordSource) = this()
    def this(source: MutableRecordSource, options: AnonGcReleaseBufferSize) = this()
    def lookup(selector: ReaderSelector): Snapshot = js.native
    def toJSON(): js.Any = js.native
  }
  
}

