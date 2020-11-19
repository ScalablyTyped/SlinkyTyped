package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphqlToolsDelegate.typesMod.DelegationBinding
import typingsSlinky.graphqlToolsDelegate.typesMod.DelegationContext
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/Transformer", JSImport.Namespace)
@js.native
object transformerMod extends js.Object {
  
  @js.native
  class Transformer protected () extends js.Object {
    def this(context: DelegationContext) = this()
    def this(context: DelegationContext, binding: DelegationBinding) = this()
    
    var addTransform: js.Any = js.native
    
    var delegationContext: js.Any = js.native
    
    def transformRequest(originalRequest: Request): Request = js.native
    
    def transformResult(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
    
    var transformations: js.Any = js.native
  }
}
