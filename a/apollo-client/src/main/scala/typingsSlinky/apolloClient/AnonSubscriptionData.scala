package typingsSlinky.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables] extends js.Object {
  var subscriptionData: AnonDataTSubscriptionData[TSubscriptionData] = js.native
  var variables: js.UndefOr[TSubscriptionVariables] = js.native
}

object AnonSubscriptionData {
  @scala.inline
  def apply[TSubscriptionData, TSubscriptionVariables](subscriptionData: AnonDataTSubscriptionData[TSubscriptionData]): AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables] = {
    val __obj = js.Dynamic.literal(subscriptionData = subscriptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables]]
  }
  @scala.inline
  implicit class AnonSubscriptionDataOps[Self[tsubscriptiondata, tsubscriptionvariables] <: AnonSubscriptionData[tsubscriptiondata, tsubscriptionvariables], TSubscriptionData, TSubscriptionVariables] (val x: Self[TSubscriptionData, TSubscriptionVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSubscriptionData, TSubscriptionVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSubscriptionData, TSubscriptionVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSubscriptionData, TSubscriptionVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSubscriptionData, TSubscriptionVariables]) with Other]
    @scala.inline
    def withSubscriptionData(value: AnonDataTSubscriptionData[TSubscriptionData]): Self[TSubscriptionData, TSubscriptionVariables] = {
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

