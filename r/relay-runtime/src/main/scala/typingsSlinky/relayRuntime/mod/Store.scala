package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.anon.GcReleaseBufferSize
import typingsSlinky.relayRuntime.relayModernStoreMod.RelayModernStore
import typingsSlinky.relayRuntime.relayStoreTypesMod.MutableRecordSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Store")
@js.native
class Store protected () extends RelayModernStore {
  def this(source: MutableRecordSource) = this()
  def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
}

