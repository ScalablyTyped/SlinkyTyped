package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactCommon.typesMod.SubscriptionResult
import typingsSlinky.apolloReactHooks.anon.Data
import typingsSlinky.apolloReactHooks.anon.Options
import typingsSlinky.apolloReactHooks.operationDataMod.OperationData
import typingsSlinky.apolloReactHooks.typesMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hooks/lib/data/SubscriptionData", JSImport.Namespace)
@js.native
object subscriptionDataMod extends js.Object {
  
  @js.native
  class SubscriptionData[TData, TVariables] protected () extends OperationData[SubscriptionOptions[TData, TVariables]] {
    def this(hasOptionsContextSetResult: Options[TData, TVariables]) = this()
    
    def afterExecute(): Unit = js.native
    
    var completeSubscription: js.Any = js.native
    
    var currentObservable: js.Any = js.native
    
    var endSubscription: js.Any = js.native
    
    def execute(result: SubscriptionResult[TData]): Data[TVariables, TData] = js.native
    
    var getLoadingResult: js.Any = js.native
    
    var initialize: js.Any = js.native
    
    var setResult: js.Any = js.native
    
    var startSubscription: js.Any = js.native
    
    var updateCurrentData: js.Any = js.native
    
    var updateError: js.Any = js.native
    
    var updateResult: js.Any = js.native
  }
}
