package typingsSlinky.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndpointType extends js.Object

@JSGlobal("connect.EndpointType")
@js.native
object EndpointType extends js.Object {
  @js.native
  sealed trait AGENT extends EndpointType
  
  @js.native
  sealed trait PHONE_NUMBER extends EndpointType
  
  @js.native
  sealed trait QUEUE extends EndpointType
  
  /* "agent" */ val AGENT: typingsSlinky.amazonDashConnectDashStreams.connect.EndpointType.AGENT with String = js.native
  /* "phone_number" */ val PHONE_NUMBER: typingsSlinky.amazonDashConnectDashStreams.connect.EndpointType.PHONE_NUMBER with String = js.native
  /* "queue" */ val QUEUE: typingsSlinky.amazonDashConnectDashStreams.connect.EndpointType.QUEUE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EndpointType with String] = js.native
}

