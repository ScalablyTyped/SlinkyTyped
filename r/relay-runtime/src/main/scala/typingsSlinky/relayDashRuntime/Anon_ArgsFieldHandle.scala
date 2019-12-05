package typingsSlinky.relayDashRuntime

import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordSourceProxy
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Record
import typingsSlinky.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationLinkedField
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsSlinky.relayDashRuntime.relayDashRuntimeStrings.linked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsFieldHandle extends MissingFieldHandler {
  var kind: linked = js.native
  def handle(
    field: NormalizationLinkedField,
    record: js.UndefOr[scala.Nothing],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.UndefOr[DataID | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[DataID | Null] = js.native
  def handle(field: NormalizationLinkedField, record: Record, args: Variables, store: ReadOnlyRecordSourceProxy): js.UndefOr[DataID | Null] = js.native
}

