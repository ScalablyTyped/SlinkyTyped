package typingsSlinky.apolloReactHooks.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.apolloReactCommon.typesMod.BaseSubscriptionOptions
import typingsSlinky.apolloReactCommon.typesMod.SubscriptionResult
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionOptions[TData, TVariables] extends BaseSubscriptionOptions[TData, TVariables] {
  
  var children: js.UndefOr[
    Null | (js.Function1[/* result */ SubscriptionResult[TData], ReactElement | Null])
  ] = js.native
  
  var subscription: DocumentNode = js.native
}
object SubscriptionOptions {
  
  @scala.inline
  def apply[TData, TVariables](subscription: DocumentNode): SubscriptionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions[TData, TVariables]]
  }
  
  @scala.inline
  implicit class SubscriptionOptionsOps[Self <: SubscriptionOptions[_, _], TData, TVariables] (val x: Self with (SubscriptionOptions[TData, TVariables])) extends AnyVal {
    
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
    def setSubscription(value: DocumentNode): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: /* result */ SubscriptionResult[TData] => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
}
