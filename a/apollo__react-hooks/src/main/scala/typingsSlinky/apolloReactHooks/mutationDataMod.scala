package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactCommon.typesMod.MutationResult
import typingsSlinky.apolloReactHooks.anon.Context
import typingsSlinky.apolloReactHooks.operationDataMod.OperationData
import typingsSlinky.apolloReactHooks.typesMod.MutationTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hooks/lib/data/MutationData", JSImport.Namespace)
@js.native
object mutationDataMod extends js.Object {
  
  @js.native
  class MutationData[TData, TVariables] protected ()
    extends OperationData[js.Any] {
    def this(hasOptionsContextResultSetResult: Context[TData, TVariables]) = this()
    
    def afterExecute(): js.Function0[Unit] = js.native
    
    def execute(result: MutationResult[TData]): MutationTuple[TData, TVariables] = js.native
    
    var generateNewMutationId: js.Any = js.native
    
    var isMostRecentMutation: js.Any = js.native
    
    var mostRecentMutationId: js.Any = js.native
    
    var mutate: js.Any = js.native
    
    var onMutationCompleted: js.Any = js.native
    
    var onMutationError: js.Any = js.native
    
    var onMutationStart: js.Any = js.native
    
    var previousResult: js.Any = js.native
    
    var result: js.Any = js.native
    
    var runMutation: js.Any = js.native
    
    var setResult: js.Any = js.native
    
    var updateResult: js.Any = js.native
  }
}
