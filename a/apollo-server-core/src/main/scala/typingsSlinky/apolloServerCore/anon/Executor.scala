package typingsSlinky.apolloServerCore.anon

import typingsSlinky.apolloServerCore.pluginTestHarnessMod.IPluginTestHarnessExecutionDidStart
import typingsSlinky.apolloServerCore.pluginTestHarnessMod.IPluginTestHarnessGraphqlRequest
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import typingsSlinky.apolloServerTypes.mod.Logger
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.graphql.typeMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executor[TContext] extends js.Object {
  
  var context: js.UndefOr[TContext] = js.native
  
  def executor(requestContext: IPluginTestHarnessExecutionDidStart[TContext]): ValueOrPromise[GraphQLResponse] = js.native
  
  var graphqlRequest: IPluginTestHarnessGraphqlRequest = js.native
  
  var logger: js.UndefOr[Logger] = js.native
  
  var overallCachePolicy: js.UndefOr[RequiredCacheHint] = js.native
  
  var pluginInstance: ApolloServerPlugin[TContext] = js.native
  
  var schema: js.UndefOr[GraphQLSchema] = js.native
}
object Executor {
  
  @scala.inline
  def apply[TContext](
    executor: IPluginTestHarnessExecutionDidStart[TContext] => ValueOrPromise[GraphQLResponse],
    graphqlRequest: IPluginTestHarnessGraphqlRequest,
    pluginInstance: ApolloServerPlugin[TContext]
  ): Executor[TContext] = {
    val __obj = js.Dynamic.literal(executor = js.Any.fromFunction1(executor), graphqlRequest = graphqlRequest.asInstanceOf[js.Any], pluginInstance = pluginInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executor[TContext]]
  }
  
  @scala.inline
  implicit class ExecutorOps[Self <: Executor[_], TContext] (val x: Self with Executor[TContext]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecutor(value: IPluginTestHarnessExecutionDidStart[TContext] => ValueOrPromise[GraphQLResponse]): Self = this.set("executor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGraphqlRequest(value: IPluginTestHarnessGraphqlRequest): Self = this.set("graphqlRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginInstance(value: ApolloServerPlugin[TContext]): Self = this.set("pluginInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setOverallCachePolicy(value: RequiredCacheHint): Self = this.set("overallCachePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverallCachePolicy: Self = this.set("overallCachePolicy", js.undefined)
    
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
