package typingsSlinky.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionData[TSubscriptionData, TSubscriptionVariables] extends js.Object {
  var subscriptionData: DataTSubscriptionData[TSubscriptionData] = js.native
  var variables: js.UndefOr[TSubscriptionVariables] = js.native
}

object SubscriptionData {
  @scala.inline
  def apply[TSubscriptionData, TSubscriptionVariables](subscriptionData: DataTSubscriptionData[TSubscriptionData]): SubscriptionData[TSubscriptionData, TSubscriptionVariables] = {
    val __obj = js.Dynamic.literal(subscriptionData = subscriptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionData[TSubscriptionData, TSubscriptionVariables]]
  }
  @scala.inline
  implicit class SubscriptionDataOps[Self[tsubscriptiondata, tsubscriptionvariables] <: SubscriptionData[tsubscriptiondata, tsubscriptionvariables], TSubscriptionData, TSubscriptionVariables] (val x: Self[TSubscriptionData, TSubscriptionVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSubscriptionData, TSubscriptionVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSubscriptionData, TSubscriptionVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSubscriptionData, TSubscriptionVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSubscriptionData, TSubscriptionVariables]) with Other]
    @scala.inline
    def withSubscriptionData(value: DataTSubscriptionData[TSubscriptionData]): Self[TSubscriptionData, TSubscriptionVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: TSubscriptionVariables): Self[TSubscriptionData, TSubscriptionVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TSubscriptionData, TSubscriptionVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

