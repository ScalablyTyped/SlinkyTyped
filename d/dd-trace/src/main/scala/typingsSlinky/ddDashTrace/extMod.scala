package typingsSlinky.ddDashTrace

import typingsSlinky.ddDashTrace.ddDashTraceNumbers.`-1`
import typingsSlinky.ddDashTrace.ddDashTraceNumbers.`0`
import typingsSlinky.ddDashTrace.ddDashTraceNumbers.`1`
import typingsSlinky.ddDashTrace.ddDashTraceNumbers.`2`
import typingsSlinky.ddDashTrace.ddDashTraceStrings._dd1DOTsrDOTeausr
import typingsSlinky.ddDashTrace.ddDashTraceStrings.`agent-exporter`
import typingsSlinky.ddDashTrace.ddDashTraceStrings.`log-exporter`
import typingsSlinky.ddDashTrace.ddDashTraceStrings.binary
import typingsSlinky.ddDashTrace.ddDashTraceStrings.client
import typingsSlinky.ddDashTrace.ddDashTraceStrings.consumer
import typingsSlinky.ddDashTrace.ddDashTraceStrings.error
import typingsSlinky.ddDashTrace.ddDashTraceStrings.http
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDOTmethod
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDOTrequestDOTheaders
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDOTresponseDOTheaders
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDOTroute
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDOTstatus_code
import typingsSlinky.ddDashTrace.ddDashTraceStrings.httpDOTurl
import typingsSlinky.ddDashTrace.ddDashTraceStrings.http_headers
import typingsSlinky.ddDashTrace.ddDashTraceStrings.log
import typingsSlinky.ddDashTrace.ddDashTraceStrings.manualDOTdrop
import typingsSlinky.ddDashTrace.ddDashTraceStrings.manualDOTkeep
import typingsSlinky.ddDashTrace.ddDashTraceStrings.producer
import typingsSlinky.ddDashTrace.ddDashTraceStrings.resourceDOTname
import typingsSlinky.ddDashTrace.ddDashTraceStrings.samplingDOTpriority
import typingsSlinky.ddDashTrace.ddDashTraceStrings.server
import typingsSlinky.ddDashTrace.ddDashTraceStrings.serviceDOTname
import typingsSlinky.ddDashTrace.ddDashTraceStrings.spanDOTkind
import typingsSlinky.ddDashTrace.ddDashTraceStrings.spanDOTtype
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
    var ANALYTICS: _dd1DOTsrDOTeausr = js.native
    var ERROR: error = js.native
    var HTTP_METHOD: httpDOTmethod = js.native
    var HTTP_REQUEST_HEADERS: httpDOTrequestDOTheaders = js.native
    var HTTP_RESPONSE_HEADERS: httpDOTresponseDOTheaders = js.native
    var HTTP_ROUTE: httpDOTroute = js.native
    var HTTP_STATUS_CODE: httpDOTstatus_code = js.native
    var HTTP_URL: httpDOTurl = js.native
    var MANUAL_DROP: manualDOTdrop = js.native
    var MANUAL_KEEP: manualDOTkeep = js.native
    var RESOURCE_NAME: resourceDOTname = js.native
    var SAMPLING_PRIORITY: samplingDOTpriority = js.native
    var SERVICE_NAME: serviceDOTname = js.native
    var SPAN_KIND: spanDOTkind = js.native
    var SPAN_TYPE: spanDOTtype = js.native
  }
  
  @js.native
  object types extends js.Object {
    var HTTP: http = js.native
    var WEB: web = js.native
  }
  
}

