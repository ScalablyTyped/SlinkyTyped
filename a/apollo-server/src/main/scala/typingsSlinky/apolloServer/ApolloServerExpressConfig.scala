package typingsSlinky.apolloServer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloCacheControl.mod.CacheControlExtensionOptions
import typingsSlinky.apolloEngineReporting.agentMod.EngineReportingOptions
import typingsSlinky.apolloServer.apolloServerBooleans.`false`
import typingsSlinky.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typingsSlinky.apolloServerCore.PartialSubscriptionServer
import typingsSlinky.apolloServerCore.TypeofSchemaDirectiveVisi
import typingsSlinky.apolloServerCore.graphqlOptionsMod.DataSources
import typingsSlinky.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typingsSlinky.apolloServerCore.playgroundMod.PlaygroundConfig
import typingsSlinky.apolloServerCore.typesMod.Context
import typingsSlinky.apolloServerCore.typesMod.ContextFunction
import typingsSlinky.apolloServerCore.typesMod.FileUploadOptions
import typingsSlinky.apolloServerCore.typesMod.GraphQLService
import typingsSlinky.apolloServerCore.typesMod.PluginDefinition
import typingsSlinky.apolloServerExpress.apolloServerMod.ExpressContext
import typingsSlinky.apolloServerTypes.apolloServerTypesStrings.document
import typingsSlinky.apolloServerTypes.apolloServerTypesStrings.operation
import typingsSlinky.apolloServerTypes.apolloServerTypesStrings.operationName
import typingsSlinky.apolloServerTypes.apolloServerTypesStrings.queryHash
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutor
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.apolloServerTypes.mod.WithRequired
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
import typingsSlinky.graphqlTools.interfacesMod.GraphQLParseOptions
import typingsSlinky.graphqlTools.interfacesMod.IMocks
import typingsSlinky.graphqlTools.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-express.apollo-server-express.ApolloServerExpressConfig & {  cors ? :apollo-server-express.apollo-server-express.CorsOptions | boolean, onHealthCheck ? (req : express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>): std.Promise<any>} */
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
  var mockEntireSchema: js.UndefOr[Boolean] = js.native
  var mocks: js.UndefOr[Boolean | IMocks] = js.native
  var modules: js.UndefOr[js.Array[GraphQLSchemaModule]] = js.native
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Promise[_]]] = js.native
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.native
  var persistedQueries: js.UndefOr[PersistedQueryOptions | `false`] = js.native
  var playground: js.UndefOr[PlaygroundConfig] = js.native
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.native
  var resolvers: js.UndefOr[(IResolvers[_, _]) | (js.Array[IResolvers[_, _]])] = js.native
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
    def withCache(value: KeyValueCache[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheControl(value: CacheControlExtensionOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withContextFunction1(value: ExpressContext => ValueOrPromise[Context[Context[js.Object]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: (ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: CorsOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSources(value: () => DataSources[Context[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDataSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: Boolean | EngineReportingOptions[Context[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutor(
      value: /* requestContext */ WithRequired[
          GraphQLRequestContext[Record[String, _]], 
          document | operationName | operation | queryHash
        ] => ValueOrPromise[GraphQLExecutionResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExecutor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimental_approximateDocumentStoreMiB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental_approximateDocumentStoreMiB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimental_approximateDocumentStoreMiB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental_approximateDocumentStoreMiB")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[js.Function0[GraphQLExtension[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldResolver(value: (_, StringDictionary[_], Context[js.Object], /* info */ GraphQLResolveInfo) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFieldResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatError(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatResponse(
      value: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[Context[js.Object]]) => GraphQLResponse
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withGateway(value: GraphQLService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(js.undefined)
        ret
    }
    @scala.inline
    def withIntrospection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("introspection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntrospection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("introspection")(js.undefined)
        ret
    }
    @scala.inline
    def withMockEntireSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockEntireSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockEntireSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockEntireSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withMocks(value: Boolean | IMocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[GraphQLSchemaModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHealthCheck(value: /* req */ Request_[ParamsDictionary, _, _, Query] => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHealthCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHealthCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withParseOptions(value: GraphQLParseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueries(value: PersistedQueryOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayground(value: PlaygroundConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playground")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvers(value: (IResolvers[_, _]) | (js.Array[IResolvers[_, _]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withRootValueFunction1(value: /* parsedQuery */ DocumentNode => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRootValue(value: (js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaDirectives(value: Record[String, TypeofSchemaDirectiveVisi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDirectives")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions(value: PartialSubscriptionServer | String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTracing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracing")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeDefs(value: DocumentNode | (js.Array[DocumentNode | String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withUploads(value: Boolean | FileUploadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Array[js.Function1[/* context */ ValidationContext, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
  }
  
}

