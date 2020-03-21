package typingsSlinky.opentracing

import typingsSlinky.opentracing.opentracingStrings.client
import typingsSlinky.opentracing.opentracingStrings.component
import typingsSlinky.opentracing.opentracingStrings.consumer
import typingsSlinky.opentracing.opentracingStrings.dbDotinstance
import typingsSlinky.opentracing.opentracingStrings.dbDotstatement
import typingsSlinky.opentracing.opentracingStrings.dbDottype
import typingsSlinky.opentracing.opentracingStrings.dbDotuser
import typingsSlinky.opentracing.opentracingStrings.error
import typingsSlinky.opentracing.opentracingStrings.httpDotmethod
import typingsSlinky.opentracing.opentracingStrings.httpDotstatus_code
import typingsSlinky.opentracing.opentracingStrings.httpDoturl
import typingsSlinky.opentracing.opentracingStrings.message_busDotdestination
import typingsSlinky.opentracing.opentracingStrings.peerDotaddress
import typingsSlinky.opentracing.opentracingStrings.peerDothostname
import typingsSlinky.opentracing.opentracingStrings.peerDotipv4
import typingsSlinky.opentracing.opentracingStrings.peerDotipv6
import typingsSlinky.opentracing.opentracingStrings.peerDotport
import typingsSlinky.opentracing.opentracingStrings.peerDotservice
import typingsSlinky.opentracing.opentracingStrings.producer
import typingsSlinky.opentracing.opentracingStrings.samplingDotpriority
import typingsSlinky.opentracing.opentracingStrings.server
import typingsSlinky.opentracing.opentracingStrings.spanDotkind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/ext/tags", JSImport.Namespace)
@js.native
object tagsMod extends js.Object {
  val COMPONENT: component = js.native
  val DB_INSTANCE: dbDotinstance = js.native
  val DB_STATEMENT: dbDotstatement = js.native
  val DB_TYPE: dbDottype = js.native
  val DB_USER: dbDotuser = js.native
  val ERROR: error = js.native
  val HTTP_METHOD: httpDotmethod = js.native
  val HTTP_STATUS_CODE: httpDotstatus_code = js.native
  val HTTP_URL: httpDoturl = js.native
  val MESSAGE_BUS_DESTINATION: message_busDotdestination = js.native
  val PEER_ADDRESS: peerDotaddress = js.native
  val PEER_HOSTNAME: peerDothostname = js.native
  val PEER_HOST_IPV4: peerDotipv4 = js.native
  val PEER_HOST_IPV6: peerDotipv6 = js.native
  val PEER_PORT: peerDotport = js.native
  val PEER_SERVICE: peerDotservice = js.native
  val SAMPLING_PRIORITY: samplingDotpriority = js.native
  val SPAN_KIND: spanDotkind = js.native
  val SPAN_KIND_MESSAGING_CONSUMER: consumer = js.native
  val SPAN_KIND_MESSAGING_PRODUCER: producer = js.native
  val SPAN_KIND_RPC_CLIENT: client = js.native
  val SPAN_KIND_RPC_SERVER: server = js.native
}

