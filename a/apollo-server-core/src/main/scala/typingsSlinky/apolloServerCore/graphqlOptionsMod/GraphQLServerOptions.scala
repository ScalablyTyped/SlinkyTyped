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

@js.native
trait GraphQLServerOptions[TContext, TRootValue] extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.native
  var cacheControl: js.UndefOr[CacheControlExtensionOptions] = js.native
  var context: js.UndefOr[TContext | js.Function0[scala.Nothing]] = js.native
  var dataSources: js.UndefOr[js.Function0[DataSources[TContext]]] = js.native
  var debug: js.UndefOr[Boolean] = js.native
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
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin[Record[String, _]]]] = js.native
  var reporting: js.UndefOr[Boolean] = js.native
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, TRootValue]) | TRootValue] = js.native
  var schema: GraphQLSchema = js.native
  var tracing: js.UndefOr[Boolean] = js.native
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.native
}

object GraphQLServerOptions {
  @scala.inline
  def apply[TContext, TRootValue](schema: GraphQLSchema): GraphQLServerOptions[TContext, TRootValue] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServerOptions[TContext, TRootValue]]
  }
  @scala.inline
  implicit class GraphQLServerOptionsOps[Self[tcontext, trootvalue] <: GraphQLServerOptions[tcontext, trootvalue], TContext, TRootValue] (val x: Self[TContext, TRootValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TRootValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TRootValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TRootValue]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TRootValue]) with Other]
    @scala.inline
    def withSchema(value: GraphQLSchema): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: KeyValueCache[String]): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheControl(value: CacheControlExtensionOptions): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withContextFunction0(value: () => scala.Nothing): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContext(value: TContext | js.Function0[scala.Nothing]): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSources(value: () => DataSources[TContext]): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDataSources: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentStore(value: InMemoryLRUCache[DocumentNode]): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentStore: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStore")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutor(
      value: /* requestContext */ WithRequired[
          GraphQLRequestContext[Record[String, _]], 
          document | operationName | operation | queryHash
        ] => ValueOrPromise[GraphQLExecutionResult]
    ): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExecutor: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[js.Function0[GraphQLExtension[_]]]): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldResolver(value: (_, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFieldResolver: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatError(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatError: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatResponse(
      value: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[TContext]) => GraphQLResponse
    ): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatResponse: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withParseOptions(value: GraphQLParseOptions): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseOptions: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueries(value: PersistedQueryOptions): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueries: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[ApolloServerPlugin[Record[String, _]]]): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withReporting(value: Boolean): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporting: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporting")(js.undefined)
        ret
    }
    @scala.inline
    def withRootValueFunction1(value: /* parsedQuery */ DocumentNode => TRootValue): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRootValue(value: (js.Function1[/* parsedQuery */ DocumentNode, TRootValue]) | TRootValue): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootValue: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTracing(value: Boolean): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracing: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracing")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Array[js.Function1[/* context */ ValidationContext, _]]): Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self[TContext, TRootValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
  }
  
}

