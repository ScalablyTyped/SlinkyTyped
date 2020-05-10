package typingsSlinky.apolloClient.watchQueryOptionsMod

import typingsSlinky.apolloClient.AnonSubscriptionData
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData] extends js.Object {
  var document: DocumentNode = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var updateQuery: js.UndefOr[UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData]] = js.native
  var variables: js.UndefOr[TSubscriptionVariables] = js.native
}

object SubscribeToMoreOptions {
  @scala.inline
  def apply[TData, TSubscriptionVariables, TSubscriptionData](document: DocumentNode): SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData]]
  }
  @scala.inline
  implicit class SubscribeToMoreOptionsOps[Self[tdata, tsubscriptionvariables, tsubscriptiondata] <: SubscribeToMoreOptions[tdata, tsubscriptionvariables, tsubscriptiondata], TData, TSubscriptionVariables, TSubscriptionData] (val x: Self[TData, TSubscriptionVariables, TSubscriptionData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TSubscriptionVariables, TSubscriptionData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TSubscriptionVariables, TSubscriptionData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TSubscriptionVariables, TSubscriptionData]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TSubscriptionVariables, TSubscriptionData]) with Other]
    @scala.inline
    def withDocument(value: DocumentNode): Self[TData, TSubscriptionVariables, TSubscriptionData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self[TData, TSubscriptionVariables, TSubscriptionData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[TData, TSubscriptionVariables, TSubscriptionData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateQuery(
      value: (TData, /* options */ AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables]) => TData
    ): Self[TData, TSubscriptionVariables, TSubscriptionData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateQuery: Self[TData, TSubscriptionVariables, TSubscriptionData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: TSubscriptionVariables): Self[TData, TSubscriptionVariables, TSubscriptionData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TData, TSubscriptionVariables, TSubscriptionData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

