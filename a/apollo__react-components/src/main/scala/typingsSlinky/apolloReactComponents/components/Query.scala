package typingsSlinky.apolloReactComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.apolloClient.mod.ApolloError
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typingsSlinky.apolloReactCommon.typesMod.Context
import typingsSlinky.apolloReactComponents.typesMod.QueryComponentOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Query {
  @JSImport("@apollo/react-components", "Query")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TData, TVariables] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def client(value: default[_]): this.type = set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def context(value: Context): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def errorPolicy(value: ErrorPolicy): this.type = set("errorPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def fetchPolicy(value: WatchQueryFetchPolicy): this.type = set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def notifyOnNetworkStatusChange(value: Boolean): this.type = set("notifyOnNetworkStatusChange", value.asInstanceOf[js.Any])
    @scala.inline
    def onCompleted(value: TData => Unit): this.type = set("onCompleted", js.Any.fromFunction1(value))
    @scala.inline
    def onError(value: /* error */ ApolloError => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def partialRefetch(value: Boolean): this.type = set("partialRefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def pollInterval(value: Double): this.type = set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def returnPartialData(value: Boolean): this.type = set("returnPartialData", value.asInstanceOf[js.Any])
    @scala.inline
    def skip(value: Boolean): this.type = set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def ssr(value: Boolean): this.type = set("ssr", value.asInstanceOf[js.Any])
    @scala.inline
    def variables(value: TVariables): this.type = set("variables", value.asInstanceOf[js.Any])
  }
  
  def withProps[TData, TVariables](p: QueryComponentOptions[TData, TVariables]): Builder[TData, TVariables] = new Builder[TData, TVariables](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[TData, TVariables](query: DocumentNode): Builder[TData, TVariables] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Builder[TData, TVariables](js.Array(this.component, __props.asInstanceOf[QueryComponentOptions[TData, TVariables]]))
  }
}

