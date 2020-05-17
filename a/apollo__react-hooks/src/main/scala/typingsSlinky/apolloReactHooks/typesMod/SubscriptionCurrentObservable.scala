package typingsSlinky.apolloReactHooks.typesMod

import typingsSlinky.zenObservable.mod.global.ZenObservable.Subscription
import typingsSlinky.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionCurrentObservable extends js.Object {
  var query: js.UndefOr[Observable[_]] = js.native
  var subscription: js.UndefOr[Subscription] = js.native
}

object SubscriptionCurrentObservable {
  @scala.inline
  def apply(): SubscriptionCurrentObservable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionCurrentObservable]
  }
  @scala.inline
  implicit class SubscriptionCurrentObservableOps[Self <: SubscriptionCurrentObservable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: Observable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription(value: Subscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

