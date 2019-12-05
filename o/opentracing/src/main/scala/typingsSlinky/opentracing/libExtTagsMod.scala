package typingsSlinky.opentracing

import typingsSlinky.opentracing.opentracingStrings.client
import typingsSlinky.opentracing.opentracingStrings.component
import typingsSlinky.opentracing.opentracingStrings.consumer
import typingsSlinky.opentracing.opentracingStrings.dbDOTinstance
import typingsSlinky.opentracing.opentracingStrings.dbDOTstatement
import typingsSlinky.opentracing.opentracingStrings.dbDOTtype
import typingsSlinky.opentracing.opentracingStrings.dbDOTuser
import typingsSlinky.opentracing.opentracingStrings.error
import typingsSlinky.opentracing.opentracingStrings.httpDOTmethod
import typingsSlinky.opentracing.opentracingStrings.httpDOTstatus_code
import typingsSlinky.opentracing.opentracingStrings.httpDOTurl
import typingsSlinky.opentracing.opentracingStrings.message_busDOTdestination
import typingsSlinky.opentracing.opentracingStrings.peerDOTaddress
import typingsSlinky.opentracing.opentracingStrings.peerDOThostname
import typingsSlinky.opentracing.opentracingStrings.peerDOTipv4
import typingsSlinky.opentracing.opentracingStrings.peerDOTipv6
import typingsSlinky.opentracing.opentracingStrings.peerDOTport
import typingsSlinky.opentracing.opentracingStrings.peerDOTservice
import typingsSlinky.opentracing.opentracingStrings.producer
import typingsSlinky.opentracing.opentracingStrings.samplingDOTpriority
import typingsSlinky.opentracing.opentracingStrings.server
import typingsSlinky.opentracing.opentracingStrings.spanDOTkind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/ext/tags", JSImport.Namespace)
@js.native
object libExtTagsMod extends js.Object {
  val COMPONENT: component = js.native
  val DB_INSTANCE: dbDOTinstance = js.native
  val DB_STATEMENT: dbDOTstatement = js.native
  val DB_TYPE: dbDOTtype = js.native
  val DB_USER: dbDOTuser = js.native
  val ERROR: error = js.native
  val HTTP_METHOD: httpDOTmethod = js.native
  val HTTP_STATUS_CODE: httpDOTstatus_code = js.native
  val HTTP_URL: httpDOTurl = js.native
  val MESSAGE_BUS_DESTINATION: message_busDOTdestination = js.native
  val PEER_ADDRESS: peerDOTaddress = js.native
  val PEER_HOSTNAME: peerDOThostname = js.native
  val PEER_HOST_IPV4: peerDOTipv4 = js.native
  val PEER_HOST_IPV6: peerDOTipv6 = js.native
  val PEER_PORT: peerDOTport = js.native
  val PEER_SERVICE: peerDOTservice = js.native
  val SAMPLING_PRIORITY: samplingDOTpriority = js.native
  val SPAN_KIND: spanDOTkind = js.native
  val SPAN_KIND_MESSAGING_CONSUMER: consumer = js.native
  val SPAN_KIND_MESSAGING_PRODUCER: producer = js.native
  val SPAN_KIND_RPC_CLIENT: client = js.native
  val SPAN_KIND_RPC_SERVER: server = js.native
}

