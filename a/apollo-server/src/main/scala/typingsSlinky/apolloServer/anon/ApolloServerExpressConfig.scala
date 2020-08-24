package typingsSlinky.apolloServer.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloCacheControl.mod.CacheControlExtensionOptions
import typingsSlinky.apolloEngineReporting.agentMod.EngineReportingOptions
import typingsSlinky.apolloServer.apolloServerBooleans.`false`
import typingsSlinky.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typingsSlinky.apolloServerCore.anon.PartialSubscriptionServer
import typingsSlinky.apolloServerCore.anon.TypeofSchemaDirectiveVisi
import typingsSlinky.apolloServerCore.graphqlOptionsMod.DataSources
import typingsSlinky.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typingsSlinky.apolloServerCore.playgroundMod.PlaygroundConfig
import typingsSlinky.apolloServerCore.typesMod.Context
import typingsSlinky.apolloServerCore.typesMod.ContextFunction
import typingsSlinky.apolloServerCore.typesMod.FileUploadOptions
import typingsSlinky.apolloServerCore.typesMod.GraphQLService
import typingsSlinky.apolloServerCore.typesMod.PluginDefinition
import typingsSlinky.apolloServerExpress.apolloServerMod.ExpressContext
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutor
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import typingsSlinky.apolloServerTypes.mod.Logger
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.apollographqlApolloTools.buildServiceDefinitionMod.GraphQLSchemaModule
import typingsSlinky.cors.mod.CorsOptions
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.ValidationContext
import typingsSlinky.graphqlExtensions.mod.GraphQLExtension
import typingsSlinky.graphqlToolsMock.typesMod.IMocks
import typingsSlinky.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-express.apollo-server-express.ApolloServerExpressConfig & {  cors :apollo-server-express.apollo-server-express.CorsOptions | boolean | undefined,   onHealthCheck :(req : express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>): std.Promise<any> | undefined} */
@js.native
trait ApolloServerExpressConfig extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.native
  var cacheControl: js.UndefOr[CacheControlExtensionOptions | Boolean] = js.native
  var context: js.UndefOr[(ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]] = js.native
  var cors: js.UndefOr[CorsOptions | Boolean] = js.native
  var dataSources: js.UndefOr[js.Function0[DataSources[Context[js.Object]]]] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var engine: js.UndefOr[Boolean | EngineReportingOptions[Context[js.Object]]] = js.native
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.native
  var experimental_approximateDocumentStoreMiB: js.UndefOr[Double] = js.native
  var extensions: js.UndefOr[js.Array[js.Function0[GraphQLExtension[_]]]] = js.native
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, Context[js.Object], StringDictionary[_]]] = js.native
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.native
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[Context[js.Object]], 
      GraphQLResponse
    ]
  ] = js.native
  var gateway: js.UndefOr[GraphQLService] = js.native
  var introspection: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var mockEntireSchema: js.UndefOr[Boolean] = js.native
  var mocks: js.UndefOr[Boolean | IMocks] = js.native
  var modules: js.UndefOr[js.Array[GraphQLSchemaModule]] = js.native
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Promise[_]]] = js.native
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.native
  var persistedQueries: js.UndefOr[PersistedQueryOptions | `false`] = js.native
  var playground: js.UndefOr[PlaygroundConfig] = js.native
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.native
  var resolvers: js.UndefOr[
    (IResolvers[_, _, Record[String, _], _]) | (js.Array[IResolvers[_, _, Record[String, _], _]])
  ] = js.native
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
  var schemaDirectives: js.UndefOr[Record[String, TypeofSchemaDirectiveVisi]] = js.native
  var subscriptions: js.UndefOr[PartialSubscriptionServer | String | `false`] = js.native
  var tracing: js.UndefOr[Boolean] = js.native
  var typeDefs: js.UndefOr[DocumentNode | (js.Array[DocumentNode | String]) | String] = js.native
  var uploads: js.UndefOr[Boolean | FileUploadOptions] = js.native
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.native
}

object ApolloServerExpressConfig {
  @scala.inline
  def apply(): ApolloServerExpressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloServerExpressConfig]
  }
  @scala.inline
  implicit class ApolloServerExpressConfigOps[Self <: ApolloServerExpressConfig] (val x: Self) extends AnyVal {
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
    def setCache(value: KeyValueCache[String]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCacheControl(value: CacheControlExtensionOptions | Boolean): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    @scala.inline
    def setContextFunction1(value: ExpressContext => ValueOrPromise[Context[Context[js.Object]]]): Self = this.set("context", js.Any.fromFunction1(value))
    @scala.inline
    def setContext(value: (ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setCors(value: CorsOptions | Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setDataSources(value: () => DataSources[Context[js.Object]]): Self = this.set("dataSources", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDataSources: Self = this.set("dataSources", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEngine(value: Boolean | EngineReportingOptions[Context[js.Object]]): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setExecutor(
      value: /* requestContext */ GraphQLRequestContextExecutionDidStart[Record[String, _]] => ValueOrPromise[GraphQLExecutionResult]
    ): Self = this.set("executor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExecutor: Self = this.set("executor", js.undefined)
    @scala.inline
    def setExperimental_approximateDocumentStoreMiB(value: Double): Self = this.set("experimental_approximateDocumentStoreMiB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental_approximateDocumentStoreMiB: Self = this.set("experimental_approximateDocumentStoreMiB", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: js.Function0[GraphQLExtension[js.Any]]*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[js.Function0[GraphQLExtension[_]]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFieldResolver(value: (_, StringDictionary[_], Context[js.Object], /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("fieldResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFieldResolver: Self = this.set("fieldResolver", js.undefined)
    @scala.inline
    def setFormatError(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self = this.set("formatError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatError: Self = this.set("formatError", js.undefined)
    @scala.inline
    def setFormatResponse(
      value: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[Context[js.Object]]) => GraphQLResponse
    ): Self = this.set("formatResponse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatResponse: Self = this.set("formatResponse", js.undefined)
    @scala.inline
    def setGateway(value: GraphQLService): Self = this.set("gateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateway: Self = this.set("gateway", js.undefined)
    @scala.inline
    def setIntrospection(value: Boolean): Self = this.set("introspection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntrospection: Self = this.set("introspection", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMockEntireSchema(value: Boolean): Self = this.set("mockEntireSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMockEntireSchema: Self = this.set("mockEntireSchema", js.undefined)
    @scala.inline
    def setMocks(value: Boolean | IMocks): Self = this.set("mocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMocks: Self = this.set("mocks", js.undefined)
    @scala.inline
    def setModulesVarargs(value: GraphQLSchemaModule*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[GraphQLSchemaModule]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setOnHealthCheck(value: /* req */ Request_[ParamsDictionary, _, _, Query] => js.Promise[_]): Self = this.set("onHealthCheck", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHealthCheck: Self = this.set("onHealthCheck", js.undefined)
    @scala.inline
    def setParseOptions(value: GraphQLParseOptions): Self = this.set("parseOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseOptions: Self = this.set("parseOptions", js.undefined)
    @scala.inline
    def setPersistedQueries(value: PersistedQueryOptions | `false`): Self = this.set("persistedQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueries: Self = this.set("persistedQueries", js.undefined)
    @scala.inline
    def setPlayground(value: PlaygroundConfig): Self = this.set("playground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayground: Self = this.set("playground", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: PluginDefinition*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[PluginDefinition]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setResolversVarargs(value: (IResolvers[js.Any, js.Any, Record[String, js.Any], js.Any])*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(
      value: (IResolvers[_, _, Record[String, _], _]) | (js.Array[IResolvers[_, _, Record[String, _], _]])
    ): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
    @scala.inline
    def setRootValueFunction1(value: /* parsedQuery */ DocumentNode => _): Self = this.set("rootValue", js.Any.fromFunction1(value))
    @scala.inline
    def setRootValue(value: (js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSchemaDirectives(value: Record[String, TypeofSchemaDirectiveVisi]): Self = this.set("schemaDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaDirectives: Self = this.set("schemaDirectives", js.undefined)
    @scala.inline
    def setSubscriptions(value: PartialSubscriptionServer | String | `false`): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
    @scala.inline
    def setTracing(value: Boolean): Self = this.set("tracing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracing: Self = this.set("tracing", js.undefined)
    @scala.inline
    def setTypeDefsVarargs(value: (DocumentNode | String)*): Self = this.set("typeDefs", js.Array(value :_*))
    @scala.inline
    def setTypeDefs(value: DocumentNode | (js.Array[DocumentNode | String]) | String): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeDefs: Self = this.set("typeDefs", js.undefined)
    @scala.inline
    def setUploads(value: Boolean | FileUploadOptions): Self = this.set("uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploads: Self = this.set("uploads", js.undefined)
    @scala.inline
    def setValidationRulesVarargs(value: (js.Function1[/* context */ ValidationContext, js.Any])*): Self = this.set("validationRules", js.Array(value :_*))
    @scala.inline
    def setValidationRules(value: js.Array[js.Function1[/* context */ ValidationContext, _]]): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
  }
  
}

