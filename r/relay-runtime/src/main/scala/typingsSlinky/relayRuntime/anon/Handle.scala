package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationScalarField
import typingsSlinky.relayRuntime.relayRuntimeStrings.scalar
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typingsSlinky.relayRuntime.relayStoreTypesMod.ReadOnlyRecordSourceProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handle extends MissingFieldHandler {
  
  def handle(
    field: NormalizationScalarField,
    record: js.UndefOr[scala.Nothing],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.Any = js.native
  def handle(field: NormalizationScalarField, record: Null, args: Variables, store: ReadOnlyRecordSourceProxy): js.Any = js.native
  def handle(field: NormalizationScalarField, record: Record, args: Variables, store: ReadOnlyRecordSourceProxy): js.Any = js.native
  
  var kind: scalar = js.native
}
