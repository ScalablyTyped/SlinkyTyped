package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloClient.typesMod.ApolloQueryResult
import typingsSlinky.apolloReactCommon.typesMod.QueryResult
import typingsSlinky.apolloReactHooks.anon.Lazy
import typingsSlinky.apolloReactHooks.anon.OnNewData
import typingsSlinky.apolloReactHooks.operationDataMod.OperationData
import typingsSlinky.apolloReactHooks.typesMod.QueryTuple
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hooks/lib/data/QueryData", JSImport.Namespace)
@js.native
object queryDataMod extends js.Object {
  
  @js.native
  class QueryData[TData, TVariables] protected ()
    extends OperationData[js.Any] {
    def this(hasOptionsContextOnNewData: OnNewData[TData, TVariables]) = this()
    
    def afterExecute(): js.Function0[Unit] = js.native
    def afterExecute(hasLazy: Lazy): js.Function0[Unit] = js.native
    
    var currentObservable: js.Any = js.native
    
    def execute(): QueryResult[TData, TVariables] = js.native
    
    def executeLazy(): QueryTuple[TData, TVariables] = js.native
    
    def fetchData(): js.Promise[ApolloQueryResult[_]] | Boolean = js.native
    
    var getExecuteResult: js.Any = js.native
    
    var getExecuteSsrResult: js.Any = js.native
    
    var getQueryResult: js.Any = js.native
    
    var handleErrorOrCompleted: js.Any = js.native
    
    var initializeObservableQuery: js.Any = js.native
    
    var lazyOptions: js.Any = js.native
    
    var obsFetchMore: js.Any = js.native
    
    var obsRefetch: js.Any = js.native
    
    var obsStartPolling: js.Any = js.native
    
    var obsStopPolling: js.Any = js.native
    
    var obsSubscribeToMore: js.Any = js.native
    
    var obsUpdateQuery: js.Any = js.native
    
    var observableQueryFields: js.Any = js.native
    
    def onNewData(): Unit = js.native
    
    var prepareObservableQueryOptions: js.Any = js.native
    
    var previousData: js.Any = js.native
    
    var removeQuerySubscription: js.Any = js.native
    
    var resubscribeToQuery: js.Any = js.native
    
    var runLazy: js.Any = js.native
    
    var runLazyQuery: js.Any = js.native
    
    def ssrInitiated(): js.UndefOr[Record[_, _]] = js.native
    
    var startQuerySubscription: js.Any = js.native
    
    var updateObservableQuery: js.Any = js.native
  }
}
