package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayObservableMod.RelayObservable
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchQueryInternalMod {
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", "fetchQuery")
  @js.native
  def fetchQuery(environment: Environment, operation: OperationDescriptor): RelayObservable[GraphQLResponse] = js.native
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", "fetchQueryDeduped")
  @js.native
  def fetchQueryDeduped(
    environment: Environment,
    request: RequestDescriptor,
    fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
  ): RelayObservable[GraphQLResponse] = js.native
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", "getObservableForActiveRequest")
  @js.native
  def getObservableForActiveRequest(environment: Environment, request: RequestDescriptor): RelayObservable[Unit] | Null = js.native
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", "getPromiseForActiveRequest")
  @js.native
  def getPromiseForActiveRequest(environment: Environment, request: RequestDescriptor): js.Promise[Unit] | Null = js.native
}
