package typingsSlinky.relayDashRuntime

import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordSourceProxy
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Record
import typingsSlinky.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationScalarField
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typingsSlinky.relayDashRuntime.relayDashRuntimeStrings.scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsField extends MissingFieldHandler {
  var kind: scalar = js.native
  def handle(
    field: NormalizationScalarField,
    record: js.UndefOr[scala.Nothing],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.Any = js.native
  def handle(field: NormalizationScalarField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.Any = js.native
  def handle(field: NormalizationScalarField, record: Record, args: Variables, store: ReadOnlyRecordSourceProxy): js.Any = js.native
}

