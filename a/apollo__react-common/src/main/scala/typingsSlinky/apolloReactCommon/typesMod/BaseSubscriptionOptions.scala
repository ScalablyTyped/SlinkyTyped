package typingsSlinky.apolloReactCommon.typesMod

import typingsSlinky.apolloClient.mod.default
import typingsSlinky.apolloClient.watchQueryOptionsMod.FetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSubscriptionOptions[TData, TVariables] extends js.Object {
  var client: js.UndefOr[default[js.Object]] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var onSubscriptionComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onSubscriptionData: js.UndefOr[js.Function1[/* options */ OnSubscriptionDataOptions[TData], _]] = js.native
  var shouldResubscribe: js.UndefOr[
    Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean])
  ] = js.native
  var skip: js.UndefOr[Boolean] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object BaseSubscriptionOptions {
  @scala.inline
  def apply[TData, TVariables](): BaseSubscriptionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSubscriptionOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class BaseSubscriptionOptionsOps[Self[tdata, tvariables] <: BaseSubscriptionOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withClient(value: default[js.Object]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchPolicy(value: FetchPolicy): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubscriptionComplete(value: () => Unit): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscriptionComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSubscriptionComplete: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscriptionComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubscriptionData(value: /* options */ OnSubscriptionDataOptions[TData] => _): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscriptionData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubscriptionData: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscriptionData")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldResubscribeFunction1(value: /* options */ BaseSubscriptionOptions[TData, TVariables] => Boolean): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldResubscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldResubscribe(value: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean])): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldResubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldResubscribe: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldResubscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Boolean): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: TVariables): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

