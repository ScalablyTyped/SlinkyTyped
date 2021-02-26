package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotstart
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.start',   transactionID :number,   params :relay-runtime.relay-runtime/lib/util/RelayConcreteNode.RequestParameters,   variables :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.Variables}> */
@js.native
trait Readonlynameexecutestartt extends LogEvent {
  
  val name: executeDotstart = js.native
  
  val params: RequestParameters = js.native
  
  val transactionID: Double = js.native
  
  val variables: Variables = js.native
}
object Readonlynameexecutestartt {
  
  @scala.inline
  def apply(name: executeDotstart, params: RequestParameters, transactionID: Double, variables: Variables): Readonlynameexecutestartt = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecutestartt]
  }
  
  @scala.inline
  implicit class ReadonlynameexecutestarttMutableBuilder[Self <: Readonlynameexecutestartt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: executeDotstart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: Double): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
