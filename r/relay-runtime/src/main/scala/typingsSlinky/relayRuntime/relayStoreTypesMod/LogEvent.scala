package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters
import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayRuntimeStrings.entrypointDotrootDotconsume
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotcomplete
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDoterror
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotinfo
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotnext
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotstart
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotunsubscribe
import typingsSlinky.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import typingsSlinky.relayRuntime.relayRuntimeStrings.queryresourceDotretain
import typingsSlinky.relayRuntime.relayRuntimeStrings.storeDotgc
import typingsSlinky.relayRuntime.relayRuntimeStrings.storeDotnotifyDotcomplete
import typingsSlinky.relayRuntime.relayRuntimeStrings.storeDotnotifyDotstart
import typingsSlinky.relayRuntime.relayRuntimeStrings.storeDotpublish
import typingsSlinky.relayRuntime.relayRuntimeStrings.storeDotrestore
import typingsSlinky.relayRuntime.relayRuntimeStrings.storeDotsnapshot
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.anon.Readonlynamequeryresource
  - typingsSlinky.relayRuntime.anon.ReadonlynamequeryresourceName
  - typingsSlinky.relayRuntime.anon.Readonlynameexecuteinfotr
  - typingsSlinky.relayRuntime.anon.Readonlynameexecutestartt
  - typingsSlinky.relayRuntime.anon.Readonlynameexecutenexttr
  - typingsSlinky.relayRuntime.anon.Readonlynameexecuteerrort
  - typingsSlinky.relayRuntime.anon.Readonlynameexecutecomple
  - typingsSlinky.relayRuntime.anon.Readonlynameexecuteunsubs
  - typingsSlinky.relayRuntime.anon.Readonlynamestorepublishs
  - typingsSlinky.relayRuntime.anon.Readonlynamestoresnapshot
  - typingsSlinky.relayRuntime.anon.Readonlynamestorerestore
  - typingsSlinky.relayRuntime.anon.Readonlynamestoregcrefere
  - typingsSlinky.relayRuntime.anon.Readonlynamestorenotifyst
  - typingsSlinky.relayRuntime.anon.Readonlynamestorenotifyco
  - typingsSlinky.relayRuntime.anon.Readonlynameentrypointroo
*/
trait LogEvent extends js.Object
object LogEvent {
  
  @scala.inline
  def Readonlynameexecuteunsubs(name: executeDotunsubscribe, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameentrypointroo(name: entrypointDotrootDotconsume, profilerContext: js.Any, rootModuleID: String): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestorenotifyco(
    invalidatedRecordIDs: Set[DataID],
    name: storeDotnotifyDotcomplete,
    updatedRecordIDs: UpdatedRecords
  ): LogEvent = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecutenexttr(name: executeDotnext, response: GraphQLResponse, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamequeryresource(
    fetchPolicy: FetchPolicy,
    name: queryresourceDotfetch,
    operation: OperationDescriptor,
    profilerContext: js.Any,
    queryAvailability: OperationAvailability,
    renderPolicy: RenderPolicy,
    resourceID: Double,
    shouldFetch: Boolean
  ): LogEvent = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecuteinfotr(info: js.Any, name: executeDotinfo, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def ReadonlynamequeryresourceName(name: queryresourceDotretain, profilerContext: js.Any, resourceID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestorepublishs(name: storeDotpublish, optimistic: Boolean, source: RecordSource): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestoregcrefere(name: storeDotgc, references: Set[DataID]): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestorerestore(name: storeDotrestore): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestorenotifyst(name: storeDotnotifyDotstart): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecuteerrort(error: js.Error, name: executeDoterror, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestoresnapshot(name: storeDotsnapshot): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecutestartt(name: executeDotstart, params: RequestParameters, transactionID: Double, variables: Variables): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecutecomple(name: executeDotcomplete, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
}
