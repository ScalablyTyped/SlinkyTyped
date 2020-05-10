package typingsSlinky.apolloServerCore.requestPipelineMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloCacheControl.mod.CacheControlExtensionOptions
import typingsSlinky.apolloServerCaching.mod.InMemoryLRUCache
import typingsSlinky.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.apolloServerTypes.apolloServerTypesStrings.document
import typingsSlinky.apolloServerTypes.apolloServerTypesStrings.operation
import typingsSlinky.apolloServerTypes.apolloServerTypesStrings.operationName
import typingsSlinky.apolloServerTypes.apolloServerTypesStrings.queryHash
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutionResult
import typingsSlinky.apolloServerTypes.mod.GraphQLExecutor
import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.GraphQLResponse
import typingsSlinky.apolloServerTypes.mod.ValidationRule
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.apolloServerTypes.mod.WithRequired
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlExtensions.mod.GraphQLExtension
import typingsSlinky.graphqlTools.interfacesMod.GraphQLParseOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequestPipelineConfig[TContext] extends js.Object {
  var cacheControl: js.UndefOr[CacheControlExtensionOptions] = js.native
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
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin[Record[String, _]]]] = js.native
  var rootValue: js.UndefOr[(js.Function1[/* document */ DocumentNode, _]) | js.Any] = js.native
  var schema: GraphQLSchema = js.native
  var tracing: js.UndefOr[Boolean] = js.native
  var validationRules: js.UndefOr[js.Array[ValidationRule]] = js.native
}

object GraphQLRequestPipelineConfig {
  @scala.inline
  def apply[TContext](schema: GraphQLSchema): GraphQLRequestPipelineConfig[TContext] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestPipelineConfig[TContext]]
  }
  @scala.inline
  implicit class GraphQLRequestPipelineConfigOps[Self[tcontext] <: GraphQLRequestPipelineConfig[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withSchema(value: GraphQLSchema): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheControl(value: CacheControlExtensionOptions): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSources(value: () => DataSources[TContext]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDataSources: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentStore(value: InMemoryLRUCache[DocumentNode]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentStore: Self[TContext] = {
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
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExecutor: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[js.Function0[GraphQLExtension[_]]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldResolver(value: (_, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFieldResolver: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatError(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatError: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatResponse(
      value: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[TContext]) => GraphQLResponse
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatResponse: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withParseOptions(value: GraphQLParseOptions): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseOptions: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueries(value: PersistedQueryOptions): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueries: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[ApolloServerPlugin[Record[String, _]]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRootValueFunction1(value: /* document */ DocumentNode => _): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRootValue(value: (js.Function1[/* document */ DocumentNode, _]) | js.Any): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootValue: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTracing(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracing: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracing")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Array[ValidationRule]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
  }
  
}

