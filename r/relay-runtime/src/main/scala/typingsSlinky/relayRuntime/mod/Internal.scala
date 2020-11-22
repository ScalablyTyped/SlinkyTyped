package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayObservableMod.RelayObservable
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Internal extends js.Object {
  
  def fetchQuery(
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    operation: OperationDescriptor
  ): RelayObservable[GraphQLResponse] = js.native
  
  def fetchQueryDeduped(
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    request: RequestDescriptor,
    fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
  ): RelayObservable[GraphQLResponse] = js.native
  @JSName("fetchQueryDeduped")
  var fetchQueryDeduped_Original: js.Function3[
    /* environment */ typingsSlinky.relayRuntime.relayStoreTypesMod.Environment, 
    /* request */ RequestDescriptor, 
    /* fetchFn */ js.Function0[RelayObservable[GraphQLResponse]], 
    RelayObservable[GraphQLResponse]
  ] = js.native
  
  @JSName("fetchQuery")
  var fetchQuery_Original: js.Function2[
    /* environment */ typingsSlinky.relayRuntime.relayStoreTypesMod.Environment, 
    /* operation */ OperationDescriptor, 
    RelayObservable[GraphQLResponse]
  ] = js.native
  
  def getObservableForActiveRequest(environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment, request: RequestDescriptor): RelayObservable[Unit] | Null = js.native
  @JSName("getObservableForActiveRequest")
  var getObservableForActiveRequest_Original: js.Function2[
    /* environment */ typingsSlinky.relayRuntime.relayStoreTypesMod.Environment, 
    /* request */ RequestDescriptor, 
    RelayObservable[Unit] | Null
  ] = js.native
  
  def getPromiseForActiveRequest(environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment, request: RequestDescriptor): js.Promise[Unit] | Null = js.native
  @JSName("getPromiseForActiveRequest")
  var getPromiseForActiveRequest_Original: js.Function2[
    /* environment */ typingsSlinky.relayRuntime.relayStoreTypesMod.Environment, 
    /* request */ RequestDescriptor, 
    js.Promise[Unit] | Null
  ] = js.native
}
