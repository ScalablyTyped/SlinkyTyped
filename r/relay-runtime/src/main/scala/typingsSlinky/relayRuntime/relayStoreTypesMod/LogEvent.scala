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
import org.scalablytyped.runtime.StObject
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
trait LogEvent extends StObject
object LogEvent {
  
  @scala.inline
  def Readonlynameentrypointroo(name: entrypointDotrootDotconsume, profilerContext: js.Any, rootModuleID: String): typingsSlinky.relayRuntime.anon.Readonlynameentrypointroo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynameentrypointroo]
  }
  
  @scala.inline
  def Readonlynameexecutecomple(name: executeDotcomplete, transactionID: Double): typingsSlinky.relayRuntime.anon.Readonlynameexecutecomple = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynameexecutecomple]
  }
  
  @scala.inline
  def Readonlynameexecuteerrort(error: js.Error, name: executeDoterror, transactionID: Double): typingsSlinky.relayRuntime.anon.Readonlynameexecuteerrort = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynameexecuteerrort]
  }
  
  @scala.inline
  def Readonlynameexecuteinfotr(info: js.Any, name: executeDotinfo, transactionID: Double): typingsSlinky.relayRuntime.anon.Readonlynameexecuteinfotr = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynameexecuteinfotr]
  }
  
  @scala.inline
  def Readonlynameexecutenexttr(name: executeDotnext, response: GraphQLResponse, transactionID: Double): typingsSlinky.relayRuntime.anon.Readonlynameexecutenexttr = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynameexecutenexttr]
  }
  
  @scala.inline
  def Readonlynameexecutestartt(name: executeDotstart, params: RequestParameters, transactionID: Double, variables: Variables): typingsSlinky.relayRuntime.anon.Readonlynameexecutestartt = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynameexecutestartt]
  }
  
  @scala.inline
  def Readonlynameexecuteunsubs(name: executeDotunsubscribe, transactionID: Double): typingsSlinky.relayRuntime.anon.Readonlynameexecuteunsubs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynameexecuteunsubs]
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
  ): typingsSlinky.relayRuntime.anon.Readonlynamequeryresource = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynamequeryresource]
  }
  
  @scala.inline
  def ReadonlynamequeryresourceName(name: queryresourceDotretain, profilerContext: js.Any, resourceID: Double): typingsSlinky.relayRuntime.anon.ReadonlynamequeryresourceName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.ReadonlynamequeryresourceName]
  }
  
  @scala.inline
  def Readonlynamestoregcrefere(name: storeDotgc, references: Set[DataID]): typingsSlinky.relayRuntime.anon.Readonlynamestoregcrefere = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynamestoregcrefere]
  }
  
  @scala.inline
  def Readonlynamestorenotifyco(
    invalidatedRecordIDs: Set[DataID],
    name: storeDotnotifyDotcomplete,
    updatedRecordIDs: UpdatedRecords
  ): typingsSlinky.relayRuntime.anon.Readonlynamestorenotifyco = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynamestorenotifyco]
  }
  
  @scala.inline
  def Readonlynamestorenotifyst(name: storeDotnotifyDotstart): typingsSlinky.relayRuntime.anon.Readonlynamestorenotifyst = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynamestorenotifyst]
  }
  
  @scala.inline
  def Readonlynamestorepublishs(name: storeDotpublish, optimistic: Boolean, source: RecordSource): typingsSlinky.relayRuntime.anon.Readonlynamestorepublishs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynamestorepublishs]
  }
  
  @scala.inline
  def Readonlynamestorerestore(name: storeDotrestore): typingsSlinky.relayRuntime.anon.Readonlynamestorerestore = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynamestorerestore]
  }
  
  @scala.inline
  def Readonlynamestoresnapshot(name: storeDotsnapshot): typingsSlinky.relayRuntime.anon.Readonlynamestoresnapshot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Readonlynamestoresnapshot]
  }
}
