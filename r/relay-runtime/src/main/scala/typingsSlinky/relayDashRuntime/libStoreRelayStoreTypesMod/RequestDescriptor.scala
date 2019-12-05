package typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod

import typingsSlinky.relayDashRuntime.libUtilGetRequestIdentifierMod.RequestIdentifier
import typingsSlinky.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDescriptor extends js.Object {
  val identifier: RequestIdentifier
  val node: ConcreteRequest
  val variables: Variables
}

object RequestDescriptor {
  @scala.inline
  def apply(identifier: RequestIdentifier, node: ConcreteRequest, variables: Variables): RequestDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestDescriptor]
  }
}

