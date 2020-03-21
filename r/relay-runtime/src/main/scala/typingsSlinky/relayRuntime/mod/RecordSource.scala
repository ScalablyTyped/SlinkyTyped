package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.relayRecordSourceMod.RelayRecordSource
import typingsSlinky.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "RecordSource")
@js.native
class RecordSource () extends RelayRecordSource {
  def this(records: RecordMap) = this()
}

/* static members */
@JSImport("relay-runtime", "RecordSource")
@js.native
object RecordSource extends js.Object {
  def create(): MutableRecordSource = js.native
  def create(records: RecordMap): MutableRecordSource = js.native
}

