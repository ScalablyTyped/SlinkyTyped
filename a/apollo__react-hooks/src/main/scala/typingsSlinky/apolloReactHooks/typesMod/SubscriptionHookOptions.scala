package typingsSlinky.apolloReactHooks.typesMod

import typingsSlinky.apolloReactCommon.typesMod.BaseSubscriptionOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionHookOptions[TData, TVariables] extends BaseSubscriptionOptions[TData, TVariables] {
  var subscription: js.UndefOr[DocumentNode] = js.native
}

object SubscriptionHookOptions {
  @scala.inline
  def apply[TData, TVariables](): SubscriptionHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionHookOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class SubscriptionHookOptionsOps[Self[tdata, tvariables] <: SubscriptionHookOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
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
    def withoutSubscription: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

