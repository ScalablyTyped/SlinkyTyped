package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.anon.GcReleaseBufferSize
import typingsSlinky.relayRuntime.relayModernStoreMod.default
import typingsSlinky.relayRuntime.relayStoreTypesMod.MutableRecordSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime", "Store")
@js.native
class Store protected () extends default {
  def this(source: MutableRecordSource) = this()
  def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
}
