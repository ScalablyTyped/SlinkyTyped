package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarField
import typingsSlinky.relayRuntime.relayRuntimeStrings.scalar
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typingsSlinky.relayRuntime.relayStoreTypesMod.ReadOnlyRecordSourceProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle extends MissingFieldHandler {
  var kind: scalar = js.native
  def handle(
    field: NormalizationScalarField,
    record: js.UndefOr[Null | Record],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.Any = js.native
}

