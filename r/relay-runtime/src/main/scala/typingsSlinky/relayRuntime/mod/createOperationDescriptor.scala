package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime", "createOperationDescriptor")
@js.native
object createOperationDescriptor extends js.Object {
  
  def apply(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  def apply(
    request: ConcreteRequest,
    variables: Variables,
    cacheConfig: js.UndefOr[scala.Nothing],
    dataID: DataID
  ): OperationDescriptor = js.native
  def apply(request: ConcreteRequest, variables: Variables, cacheConfig: Null, dataID: DataID): OperationDescriptor = js.native
  def apply(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): OperationDescriptor = js.native
  def apply(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig, dataID: DataID): OperationDescriptor = js.native
}
