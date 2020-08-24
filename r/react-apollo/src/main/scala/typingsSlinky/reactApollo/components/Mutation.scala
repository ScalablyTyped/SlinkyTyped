package typingsSlinky.reactApollo.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.apolloCache.dataProxyMod.DataProxy
import typingsSlinky.apolloClient.mod.ApolloError
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloClient.typesMod.PureQueryOptions
import typingsSlinky.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.apolloReactCommon.typesMod.Context
import typingsSlinky.apolloReactCommon.typesMod.MutationFunction
import typingsSlinky.apolloReactCommon.typesMod.MutationResult
import typingsSlinky.apolloReactCommon.typesMod.RefetchQueriesFunction
import typingsSlinky.apolloReactComponents.typesMod.MutationComponentOptions
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mutation {
  @JSImport("react-apollo", "Mutation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TData, TVariables] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def awaitRefetchQueries(value: Boolean): this.type = set("awaitRefetchQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def client(value: default[js.Object]): this.type = set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def context(value: Context): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def errorPolicy(value: ErrorPolicy): this.type = set("errorPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def fetchPolicy(value: WatchQueryFetchPolicy): this.type = set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def ignoreResults(value: Boolean): this.type = set("ignoreResults", value.asInstanceOf[js.Any])
    @scala.inline
    def notifyOnNetworkStatusChange(value: Boolean): this.type = set("notifyOnNetworkStatusChange", value.asInstanceOf[js.Any])
    @scala.inline
    def onCompleted(value: TData => Unit): this.type = set("onCompleted", js.Any.fromFunction1(value))
    @scala.inline
    def onError(value: /* error */ ApolloError => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def optimisticResponseFunction1(value: TVariables => TData): this.type = set("optimisticResponse", js.Any.fromFunction1(value))
    @scala.inline
    def optimisticResponse(value: TData | (js.Function1[TVariables, TData])): this.type = set("optimisticResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def refetchQueriesVarargs(value: (String | PureQueryOptions)*): this.type = set("refetchQueries", js.Array(value :_*))
    @scala.inline
    def refetchQueriesFunction1(value: /* repeated */ js.Any => js.Array[String | PureQueryOptions]): this.type = set("refetchQueries", js.Any.fromFunction1(value))
    @scala.inline
    def refetchQueries(value: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction): this.type = set("refetchQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def update(
      value: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[TData, Record[String, js.Any], Record[String, js.Any]]) => Unit
    ): this.type = set("update", js.Any.fromFunction2(value))
    @scala.inline
    def variables(value: TVariables): this.type = set("variables", value.asInstanceOf[js.Any])
  }
  
  def withProps[TData, TVariables](p: MutationComponentOptions[TData, TVariables]): Builder[TData, TVariables] = new Builder[TData, TVariables](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[TData, TVariables](
    children: (MutationFunction[TData, TVariables], MutationResult[TData]) => ReactElement | Null,
    mutation: DocumentNode
  ): Builder[TData, TVariables] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), mutation = mutation.asInstanceOf[js.Any])
    new Builder[TData, TVariables](js.Array(this.component, __props.asInstanceOf[MutationComponentOptions[TData, TVariables]]))
  }
}

