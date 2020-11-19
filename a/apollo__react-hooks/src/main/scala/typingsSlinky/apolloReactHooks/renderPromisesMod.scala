package typingsSlinky.apolloReactHooks

import slinky.core.facade.ReactElement
import typingsSlinky.apolloClient.mod.ObservableQuery
import typingsSlinky.apolloReactHooks.queryDataMod.QueryData
import typingsSlinky.apolloReactHooks.typesMod.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/react-hooks/lib/ssr/RenderPromises", JSImport.Namespace)
@js.native
object renderPromisesMod extends js.Object {
  
  @js.native
  class RenderPromises () extends js.Object {
    
    def addQueryPromise[TData, TVariables](queryInstance: QueryData[TData, TVariables], finish: js.Function0[ReactElement]): ReactElement = js.native
    
    def consumeAndAwaitPromises(): js.Promise[js.Array[_]] = js.native
    
    def getSSRObservable[TData, TVariables](props: QueryOptions[TData, TVariables]): (ObservableQuery[_, _]) | Null = js.native
    
    def hasPromises(): Boolean = js.native
    
    var lookupQueryInfo: js.Any = js.native
    
    var queryInfoTrie: js.Any = js.native
    
    var queryPromises: js.Any = js.native
    
    def registerSSRObservable[TData, TVariables](observable: ObservableQuery[_, TVariables], props: QueryOptions[TData, TVariables]): Unit = js.native
  }
}
