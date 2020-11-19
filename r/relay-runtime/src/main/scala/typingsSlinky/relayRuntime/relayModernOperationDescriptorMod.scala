package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", JSImport.Namespace)
@js.native
object relayModernOperationDescriptorMod extends js.Object {
  
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
}
