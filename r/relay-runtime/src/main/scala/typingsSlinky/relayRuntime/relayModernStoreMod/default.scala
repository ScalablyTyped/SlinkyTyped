package typingsSlinky.relayRuntime.relayModernStoreMod

import typingsSlinky.relayRuntime.anon.GcReleaseBufferSize
import typingsSlinky.relayRuntime.relayStoreTypesMod.MutableRecordSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernStore", JSImport.Default)
@js.native
class default protected () extends RelayModernStore {
  def this(source: MutableRecordSource) = this()
  def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
}

