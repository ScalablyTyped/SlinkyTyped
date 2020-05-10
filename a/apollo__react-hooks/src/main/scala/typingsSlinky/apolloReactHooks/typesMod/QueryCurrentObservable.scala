package typingsSlinky.apolloReactHooks.typesMod

import typingsSlinky.apolloClient.mod.ObservableQuery
import typingsSlinky.zenObservable.mod._Global_.ZenObservable.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryCurrentObservable[TData, TVariables] extends js.Object {
  var query: js.UndefOr[(ObservableQuery[TData, TVariables]) | Null] = js.native
  var subscription: js.UndefOr[Subscription] = js.native
}

object QueryCurrentObservable {
  @scala.inline
  def apply[TData, TVariables](): QueryCurrentObservable[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCurrentObservable[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryCurrentObservableOps[Self[tdata, tvariables] <: QueryCurrentObservable[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withQuery(value: ObservableQuery[TData, TVariables]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryNull: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(null)
        ret
    }
    @scala.inline
    def withSubscription(value: Subscription): Self[TData, TVariables] = {
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

