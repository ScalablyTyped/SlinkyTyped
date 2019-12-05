package typingsSlinky.applicationinsights.outLibraryQuickPulseEnvelopeFactoryMod

import typingsSlinky.applicationinsights.outDeclarationsContractsMod.Envelope
import typingsSlinky.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
import typingsSlinky.applicationinsights.outDeclarationsContractsQuickPulseTypesEnvelopeQuickPulseMod.EnvelopeQuickPulse
import typingsSlinky.applicationinsights.outDeclarationsContractsQuickPulseTypesMetricQuickPulseMod.MetricQuickPulse
import typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesMetricTelemetryMod.MetricTelemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/QuickPulseEnvelopeFactory", JSImport.Namespace)
@js.native
class ^ () extends QuickPulseEnvelopeFactory

@JSImport("applicationinsights/out/Library/QuickPulseEnvelopeFactory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var keys: js.Any = js.native
  /* private */ def aggregateProperties(envelope: js.Any): js.Any = js.native
  /* private */ def createQuickPulseDependencyDocument(envelope: js.Any): js.Any = js.native
  /* private */ def createQuickPulseDocument(envelope: js.Any): js.Any = js.native
  def createQuickPulseEnvelope(
    metrics: js.Array[MetricQuickPulse],
    documents: js.Array[DocumentQuickPulse],
    config: typingsSlinky.applicationinsights.outLibraryConfigMod.^,
    context: typingsSlinky.applicationinsights.outLibraryContextMod.^
  ): EnvelopeQuickPulse = js.native
  /* private */ def createQuickPulseEventDocument(envelope: js.Any): js.Any = js.native
  /* private */ def createQuickPulseExceptionDocument(envelope: js.Any): js.Any = js.native
  def createQuickPulseMetric(telemetry: MetricTelemetry): MetricQuickPulse = js.native
  /* private */ def createQuickPulseRequestDocument(envelope: js.Any): js.Any = js.native
  /* private */ def createQuickPulseTraceDocument(envelope: js.Any): js.Any = js.native
  def telemetryEnvelopeToQuickPulseDocument(envelope: Envelope): DocumentQuickPulse = js.native
}

