package typingsSlinky.apolloReactComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchPolicy
import typingsSlinky.apolloReactCommon.typesMod.BaseSubscriptionOptions
import typingsSlinky.apolloReactCommon.typesMod.OnSubscriptionDataOptions
import typingsSlinky.apolloReactCommon.typesMod.SubscriptionResult
import typingsSlinky.apolloReactComponents.typesMod.SubscriptionComponentOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Subscription {
  
  @JSImport("@apollo/react-components", "Subscription")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TData, TVariables] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: /* result */ SubscriptionResult[TData] => ReactElement | Null): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenNull: this.type = set("children", null)
    
    @scala.inline
    def client(value: default[js.Object]): this.type = set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fetchPolicy(value: FetchPolicy): this.type = set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSubscriptionComplete(value: () => Unit): this.type = set("onSubscriptionComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSubscriptionData(value: /* options */ OnSubscriptionDataOptions[TData] => _): this.type = set("onSubscriptionData", js.Any.fromFunction1(value))
    
    @scala.inline
    def shouldResubscribeFunction1(value: /* options */ BaseSubscriptionOptions[TData, TVariables] => Boolean): this.type = set("shouldResubscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def shouldResubscribe(value: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean])): this.type = set("shouldResubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skip(value: Boolean): this.type = set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variables(value: TVariables): this.type = set("variables", value.asInstanceOf[js.Any])
  }
  
  def withProps[TData, TVariables](p: SubscriptionComponentOptions[TData, TVariables]): Builder[TData, TVariables] = new Builder[TData, TVariables](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[TData, TVariables](subscription: DocumentNode): Builder[TData, TVariables] = {
    val __props = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
    new Builder[TData, TVariables](js.Array(this.component, __props.asInstanceOf[SubscriptionComponentOptions[TData, TVariables]]))
  }
}
