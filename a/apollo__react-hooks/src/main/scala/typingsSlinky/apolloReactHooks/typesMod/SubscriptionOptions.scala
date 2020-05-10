package typingsSlinky.apolloReactHooks.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.apolloReactCommon.typesMod.BaseSubscriptionOptions
import typingsSlinky.apolloReactCommon.typesMod.SubscriptionResult
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class SubscriptionOptionsOps[Self[tdata, tvariables] <: SubscriptionOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withSubscription(value: DocumentNode): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: /* result */ SubscriptionResult[TData] => ReactElement | Null): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
  }
  
}

