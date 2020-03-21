package typingsSlinky.ddTrace

import typingsSlinky.ddTrace.ddTraceNumbers.`-1`
import typingsSlinky.ddTrace.ddTraceNumbers.`0`
import typingsSlinky.ddTrace.ddTraceNumbers.`1`
import typingsSlinky.ddTrace.ddTraceNumbers.`2`
import typingsSlinky.ddTrace.ddTraceStrings._dd1DotsrDoteausr
import typingsSlinky.ddTrace.ddTraceStrings.`agent-exporter`
import typingsSlinky.ddTrace.ddTraceStrings.`log-exporter`
import typingsSlinky.ddTrace.ddTraceStrings.binary
import typingsSlinky.ddTrace.ddTraceStrings.client
import typingsSlinky.ddTrace.ddTraceStrings.consumer
import typingsSlinky.ddTrace.ddTraceStrings.error
import typingsSlinky.ddTrace.ddTraceStrings.http
import typingsSlinky.ddTrace.ddTraceStrings.httpDotmethod
import typingsSlinky.ddTrace.ddTraceStrings.httpDotrequestDotheaders
import typingsSlinky.ddTrace.ddTraceStrings.httpDotresponseDotheaders
import typingsSlinky.ddTrace.ddTraceStrings.httpDotroute
import typingsSlinky.ddTrace.ddTraceStrings.httpDotstatus_code
import typingsSlinky.ddTrace.ddTraceStrings.httpDoturl
import typingsSlinky.ddTrace.ddTraceStrings.http_headers
import typingsSlinky.ddTrace.ddTraceStrings.log
import typingsSlinky.ddTrace.ddTraceStrings.manualDotdrop
import typingsSlinky.ddTrace.ddTraceStrings.manualDotkeep
import typingsSlinky.ddTrace.ddTraceStrings.producer
import typingsSlinky.ddTrace.ddTraceStrings.resourceDotname
import typingsSlinky.ddTrace.ddTraceStrings.samplingDotpriority
import typingsSlinky.ddTrace.ddTraceStrings.server
import typingsSlinky.ddTrace.ddTraceStrings.serviceDotname
import typingsSlinky.ddTrace.ddTraceStrings.spanDotkind
import typingsSlinky.ddTrace.ddTraceStrings.spanDottype
import typingsSlinky.ddTrace.ddTraceStrings.text_map
import typingsSlinky.ddTrace.ddTraceStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dd-trace/ext", JSImport.Namespace)
@js.native
object extMod extends js.Object {
  @js.native
  object exporters extends js.Object {
    var AGENT: `agent-exporter` = js.native
    var LOG: `log-exporter` = js.native
  }
  
  @js.native
  object formats extends js.Object {
    var BINARY: binary = js.native
    var HTTP_HEADERS: http_headers = js.native
    var LOG: log = js.native
    var TEXT_MAP: text_map = js.native
  }
  
  @js.native
  object kinds extends js.Object {
    var CLIENT: client = js.native
    var CONSUMER: consumer = js.native
    var PRODUCER: producer = js.native
    var SERVER: server = js.native
  }
  
  @js.native
  object priority extends js.Object {
    var AUTO_KEEP: `1` = js.native
    var AUTO_REJECT: `0` = js.native
    var USER_KEEP: `2` = js.native
    var USER_REJECT: `-1` = js.native
  }
  
  @js.native
  object tags extends js.Object {
    var ANALYTICS: _dd1DotsrDoteausr = js.native
    var ERROR: error = js.native
    var HTTP_METHOD: httpDotmethod = js.native
    var HTTP_REQUEST_HEADERS: httpDotrequestDotheaders = js.native
    var HTTP_RESPONSE_HEADERS: httpDotresponseDotheaders = js.native
    var HTTP_ROUTE: httpDotroute = js.native
    var HTTP_STATUS_CODE: httpDotstatus_code = js.native
    var HTTP_URL: httpDoturl = js.native
    var MANUAL_DROP: manualDotdrop = js.native
    var MANUAL_KEEP: manualDotkeep = js.native
    var RESOURCE_NAME: resourceDotname = js.native
    var SAMPLING_PRIORITY: samplingDotpriority = js.native
    var SERVICE_NAME: serviceDotname = js.native
    var SPAN_KIND: spanDotkind = js.native
    var SPAN_TYPE: spanDottype = js.native
  }
  
  @js.native
  object types extends js.Object {
    var HTTP: http = js.native
    var WEB: web = js.native
  }
  
}

