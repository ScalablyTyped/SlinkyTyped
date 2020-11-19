package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/util/getRequestIdentifier", JSImport.Namespace)
@js.native
object getRequestIdentifierMod extends js.Object {
  
  def default(parameters: RequestParameters, variables: Variables): RequestIdentifier = js.native
  
  type RequestIdentifier = String
}
