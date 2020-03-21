package typingsSlinky.apolloServerCore.graphqlOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloCacheControl.mod.CacheControlExtensionOptions
import typingsSlinky.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typingsSlinky.apolloServerCaching.mod.InMemoryLRUCache
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
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
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.ValidationContext
import typingsSlinky.graphqlExtensions.mod.GraphQLExtension
import typingsSlinky.graphqlTools.interfacesMod.GraphQLParseOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServerOptions[TContext, TRootValue] extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.undefined
  var cacheControl: js.UndefOr[CacheControlExtensionOptions] = js.undefined
  var context: js.UndefOr[TContext | js.Function0[scala.Nothing]] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var documentStore: js.UndefOr[InMemoryLRUCache[DocumentNode]] = js.undefined
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.undefined
  var extensions: js.UndefOr[js.Array[js.Function0[GraphQLExtension[_]]]] = js.undefined
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, TContext, StringDictionary[_]]] = js.undefined
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[TContext], 
      GraphQLResponse
    ]
  ] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[PersistedQueryOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin[Record[String, _]]]] = js.undefined
  var reporting: js.UndefOr[Boolean] = js.undefined
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, TRootValue]) | TRootValue] = js.undefined
  var schema: GraphQLSchema
  var tracing: js.UndefOr[Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.undefined
}

object GraphQLServerOptions {
  @scala.inline
  def apply[TContext, TRootValue](
    schema: GraphQLSchema,
    cache: KeyValueCache[String] = null,
    cacheControl: CacheControlExtensionOptions = null,
    context: TContext | js.Function0[scala.Nothing] = null,
    dataSources: () => DataSources[TContext] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    documentStore: InMemoryLRUCache[DocumentNode] = null,
    executor: /* requestContext */ WithRequired[
      GraphQLRequestContext[Record[String, _]], 
      document | operationName | operation | queryHash
    ] => ValueOrPromise[GraphQLExecutionResult] = null,
    extensions: js.Array[js.Function0[GraphQLExtension[_]]] = null,
    fieldResolver: (_, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any = null,
    formatError: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]] = null,
    formatResponse: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[TContext]) => GraphQLResponse = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions = null,
    plugins: js.Array[ApolloServerPlugin[Record[String, _]]] = null,
    reporting: js.UndefOr[Boolean] = js.undefined,
    rootValue: (js.Function1[/* parsedQuery */ DocumentNode, TRootValue]) | TRootValue = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    validationRules: js.Array[js.Function1[/* context */ ValidationContext, _]] = null
  ): GraphQLServerOptions[TContext, TRootValue] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(js.Any.fromFunction0(dataSources))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (documentStore != null) __obj.updateDynamic("documentStore")(documentStore.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(js.Any.fromFunction1(executor))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4(fieldResolver))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(js.Any.fromFunction2(formatResponse))
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(reporting)) __obj.updateDynamic("reporting")(reporting.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServerOptions[TContext, TRootValue]]
  }
}

