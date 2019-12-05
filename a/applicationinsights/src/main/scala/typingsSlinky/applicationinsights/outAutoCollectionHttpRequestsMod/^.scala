package typingsSlinky.applicationinsights.outAutoCollectionHttpRequestsMod

import typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesNodeHttpRequestTelemetryMod.NodeHttpRequestTelemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/HttpRequests", JSImport.Namespace)
@js.native
class ^ protected () extends AutoCollectHttpRequests {
  def this(client: typingsSlinky.applicationinsights.outLibraryTelemetryClientMod.^) = this()
}

@JSImport("applicationinsights/out/AutoCollection/HttpRequests", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var INSTANCE: AutoCollectHttpRequests = js.native
  var alreadyAutoCollectedFlag: js.Any = js.native
  /**
    * Add the target correlationId to the response headers, if not already provided.
    */
  /* private */ def addResponseCorrelationIdHeader(client: js.Any, response: js.Any): js.Any = js.native
  /* private */ def endRequest(client: js.Any, requestParser: js.Any, telemetry: js.Any): js.Any = js.native
  /* private */ def endRequest(client: js.Any, requestParser: js.Any, telemetry: js.Any, ellapsedMilliseconds: js.Any): js.Any = js.native
  /* private */ def endRequest(
    client: js.Any,
    requestParser: js.Any,
    telemetry: js.Any,
    ellapsedMilliseconds: js.Any,
    error: js.Any
  ): js.Any = js.native
  /**
    * Tracks a request by listening to the response 'finish' event
    */
  def trackRequest(
    client: typingsSlinky.applicationinsights.outLibraryTelemetryClientMod.^,
    telemetry: NodeHttpRequestTelemetry
  ): Unit = js.native
  def trackRequest(
    client: typingsSlinky.applicationinsights.outLibraryTelemetryClientMod.^,
    telemetry: NodeHttpRequestTelemetry,
    _requestParser: typingsSlinky.applicationinsights.outAutoCollectionHttpRequestParserMod.^
  ): Unit = js.native
  /**
    * Tracks a request synchronously (doesn't wait for response 'finish' event)
    */
  def trackRequestSync(
    client: typingsSlinky.applicationinsights.outLibraryTelemetryClientMod.^,
    telemetry: NodeHttpRequestTelemetry
  ): Unit = js.native
}

