package typingsSlinky.relayDashRuntime

import typingsSlinky.relayDashRuntime.libUtilGetRequestIdentifierMod.RequestIdentifier
import typingsSlinky.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/util/getRequestIdentifier", JSImport.Namespace)
@js.native
object libUtilGetRequestIdentifierMod extends js.Object {
  def getRequestIdentifier(parameters: RequestParameters, variables: Variables): RequestIdentifier = js.native
  type RequestIdentifier = String
}

