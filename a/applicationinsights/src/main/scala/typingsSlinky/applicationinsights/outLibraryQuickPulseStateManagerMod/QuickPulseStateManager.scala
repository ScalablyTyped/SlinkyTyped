package typingsSlinky.applicationinsights.outLibraryQuickPulseStateManagerMod

import typingsSlinky.applicationinsights.outDeclarationsContractsMod.Envelope
import typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesMetricTelemetryMod.MetricTelemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** State Container for sending to the QuickPulse Service */
@js.native
trait QuickPulseStateManager extends js.Object {
  var _collectors: js.Any = js.native
  var _documents: js.Any = js.native
  var _handle: js.Any = js.native
  var _isCollectingData: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _lastSendSucceeded: js.Any = js.native
  var _lastSuccessTime: js.Any = js.native
  var _metrics: js.Any = js.native
  var _sender: js.Any = js.native
  var config: typingsSlinky.applicationinsights.outLibraryConfigMod.^ = js.native
  var context: typingsSlinky.applicationinsights.outLibraryContextMod.^ = js.native
  /**
    * Add the metric to this buffer. If same metric already exists in this buffer, add weight to it
    * @param telemetry
    */
  /* private */ def _addMetric(telemetry: js.Any): js.Any = js.native
  /* private */ def _goQuickPulse(): js.Any = js.native
  /* private */ def _ping(envelope: js.Any): js.Any = js.native
  /* private */ def _post(envelope: js.Any): js.Any = js.native
  /**
    * Change the current QPS send state. (shouldPOST == undefined) --> error, but do not change the state yet.
    */
  /* private */ def _quickPulseDone(): js.Any = js.native
  /* private */ def _quickPulseDone(shouldPOST: js.Any): js.Any = js.native
  /* private */ def _quickPulseDone(shouldPOST: js.Any, res: js.Any): js.Any = js.native
  /* private */ def _resetQuickPulseBuffer(): js.Any = js.native
  /**
    *
    * @param collector
    */
  def addCollector(collector: js.Any): Unit = js.native
  /**
    * Add a document to the current buffer
    * @param envelope
    */
  def addDocument(envelope: Envelope): Unit = js.native
  /**
    * Enable or disable communication with QuickPulseService
    * @param isEnabled
    */
  def enable(isEnabled: Boolean): Unit = js.native
  /**
    * Enable or disable all collectors in this instance
    * @param enable
    */
  /* private */ def enableCollectors(enable: js.Any): js.Any = js.native
  /**
    * Override of TelemetryClient.trackMetric
    */
  def trackMetric(telemetry: MetricTelemetry): Unit = js.native
}

