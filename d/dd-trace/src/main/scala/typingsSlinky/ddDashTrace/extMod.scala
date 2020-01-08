package typingsSlinky.ddDashTrace

import typingsSlinky.ddDashTrace.ddDashTraceNumbers.`-1`
import typingsSlinky.ddDashTrace.ddDashTraceNumbers.`0`
import typingsSlinky.ddDashTrace.ddDashTraceNumbers.`1`
import typingsSlinky.ddDashTrace.ddDashTraceNumbers.`2`
import typingsSlinky.ddDashTrace.ddDashTraceStrings._dd1DotsrDoteausr
import typingsSlinky.ddDashTrace.ddDashTraceStrings.`agent-exporter`
import typingsSlinky.ddDashTrace.ddDashTraceStrings.`log-exporter`
import typingsSlinky.ddDashTrace.ddDashTraceStrings.binary
import typingsSlinky.ddDashTrace.ddDashTraceStrings.client
import typingsSlinky.ddDashTrace.ddDashTraceStrings.consumer
import typingsSlinky.ddDashTrace.ddDashTraceStrings.error
import typingsSlinky.ddDashTrace.ddDashTraceStrings.http
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDotmethod
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDotrequestDotheaders
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDotresponseDotheaders
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDotroute
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDotstatus_code
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDoturl
import typingsSlinky.ddDashTrace.ddDashTraceStrings.http_headers
import typingsSlinky.ddDashTrace.ddDashTraceStrings.log
import typingsSlinky.ddDashTrace.ddDashTraceStrings.manualDotdrop
import typingsSlinky.ddDashTrace.ddDashTraceStrings.manualDotkeep
import typingsSlinky.ddDashTrace.ddDashTraceStrings.producer
import typingsSlinky.ddDashTrace.ddDashTraceStrings.resourceDotname
import typingsSlinky.ddDashTrace.ddDashTraceStrings.samplingDotpriority
import typingsSlinky.ddDashTrace.ddDashTraceStrings.server
import typingsSlinky.ddDashTrace.ddDashTraceStrings.serviceDotname
import typingsSlinky.ddDashTrace.ddDashTraceStrings.spanDotkind
import typingsSlinky.ddDashTrace.ddDashTraceStrings.spanDottype
import typingsSlinky.ddDashTrace.ddDashTraceStrings.text_map
import typingsSlinky.ddDashTrace.ddDashTraceStrings.web
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

