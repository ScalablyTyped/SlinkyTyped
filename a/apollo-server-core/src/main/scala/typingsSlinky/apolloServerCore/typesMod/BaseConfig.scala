package typingsSlinky.apolloServerCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typingsSlinky.apolloServerCore.graphqlOptionsMod.DataSources
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
import typingsSlinky.graphql.mod.ValidationContext
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-core.apollo-server-core/dist/graphqlOptions.GraphQLServerOptions<apollo-server-core.apollo-server-core/dist/types.Context<object>, any>, 'formatError' | 'debug' | 'rootValue' | 'validationRules' | 'executor' | 'formatResponse' | 'fieldResolver' | 'tracing' | 'dataSources' | 'cache'> */
@js.native
trait BaseConfig extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.native
  var dataSources: js.UndefOr[js.Function0[DataSources[Context[js.Object]]]] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.native
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, Context[js.Object], StringDictionary[_]]] = js.native
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.native
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[Context[js.Object]], 
      GraphQLResponse
    ]
  ] = js.native
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any] = js.native
  var tracing: js.UndefOr[Boolean] = js.native
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.native
}

object BaseConfig {
  @scala.inline
  def apply(): BaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfig]
  }
  @scala.inline
  implicit class BaseConfigOps[Self <: BaseConfig] (val x: Self) extends AnyVal {
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

