package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernOperationDescriptorMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(
    request: ConcreteRequest,
    variables: Variables,
    cacheConfig: js.UndefOr[scala.Nothing],
    dataID: DataID
  ): OperationDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: Null, dataID: DataID): OperationDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): OperationDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig, dataID: DataID): OperationDescriptor = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createRequestDescriptor")
  @js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createRequestDescriptor")
  @js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): RequestDescriptor = js.native
}
