package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayObservableMod.RelayObservable
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  var operation: OperationDescriptor = js.native
  
  var source: RelayObservable[GraphQLResponse] = js.native
}
object Source {
  
  @scala.inline
  def apply(operation: OperationDescriptor, source: RelayObservable[GraphQLResponse]): Source = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: RelayObservable[GraphQLResponse]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
