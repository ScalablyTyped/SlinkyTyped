package typingsSlinky.apolloServerCore.requestPipelineMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServerCaching.mod.InMemoryLRUCache
import typingsSlinky.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.apolloServerTypes.mod.BaseContext
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutor
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import typingsSlinky.apolloServerTypes.mod.ValidationRule
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlExtensions.mod.GraphQLExtension
import typingsSlinky.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLRequestPipelineConfig[TContext] extends js.Object {
  
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.native
  
  var documentStore: js.UndefOr[InMemoryLRUCache[DocumentNode]] = js.native
  
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.native
  
  var extensions: js.UndefOr[js.Array[js.Function0[GraphQLExtension[_]]]] = js.native
  
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, TContext, StringDictionary[_]]] = js.native
  
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.native
  
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[TContext], 
      GraphQLResponse
    ]
  ] = js.native
  
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.native
  
  var persistedQueries: js.UndefOr[PersistedQueryOptions] = js.native
  
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin[BaseContext]]] = js.native
  
  var rootValue: js.UndefOr[(js.Function1[/* document */ DocumentNode, _]) | js.Any] = js.native
  
  var schema: GraphQLSchema = js.native
  
  var validationRules: js.UndefOr[js.Array[ValidationRule]] = js.native
}
object GraphQLRequestPipelineConfig {
  
  @scala.inline
  def apply[TContext](schema: GraphQLSchema): GraphQLRequestPipelineConfig[TContext] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestPipelineConfig[TContext]]
  }
  
  @scala.inline
  implicit class GraphQLRequestPipelineConfigOps[Self <: GraphQLRequestPipelineConfig[_], TContext] (val x: Self with GraphQLRequestPipelineConfig[TContext]) extends AnyVal {
    
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
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSources(value: () => DataSources[TContext]): Self = this.set("dataSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDataSources: Self = this.set("dataSources", js.undefined)
    
    @scala.inline
    def setDocumentStore(value: InMemoryLRUCache[DocumentNode]): Self = this.set("documentStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentStore: Self = this.set("documentStore", js.undefined)
    
    @scala.inline
    def setExecutor(
      value: /* requestContext */ GraphQLRequestContextExecutionDidStart[Record[String, _]] => ValueOrPromise[GraphQLExecutionResult]
    ): Self = this.set("executor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExecutor: Self = this.set("executor", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: js.Function0[GraphQLExtension[js.Any]]*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[js.Function0[GraphQLExtension[_]]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFieldResolver(value: (_, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("fieldResolver", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFieldResolver: Self = this.set("fieldResolver", js.undefined)
    
    @scala.inline
    def setFormatError(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self = this.set("formatError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatError: Self = this.set("formatError", js.undefined)
    
    @scala.inline
    def setFormatResponse(
      value: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[TContext]) => GraphQLResponse
    ): Self = this.set("formatResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatResponse: Self = this.set("formatResponse", js.undefined)
    
    @scala.inline
    def setParseOptions(value: GraphQLParseOptions): Self = this.set("parseOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseOptions: Self = this.set("parseOptions", js.undefined)
    
    @scala.inline
    def setPersistedQueries(value: PersistedQueryOptions): Self = this.set("persistedQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistedQueries: Self = this.set("persistedQueries", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: ApolloServerPlugin[BaseContext]*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[ApolloServerPlugin[BaseContext]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRootValueFunction1(value: /* document */ DocumentNode => _): Self = this.set("rootValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRootValue(value: (js.Function1[/* document */ DocumentNode, _]) | js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    
    @scala.inline
    def setValidationRulesVarargs(value: ValidationRule*): Self = this.set("validationRules", js.Array(value :_*))
    
    @scala.inline
    def setValidationRules(value: js.Array[ValidationRule]): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
  }
}
