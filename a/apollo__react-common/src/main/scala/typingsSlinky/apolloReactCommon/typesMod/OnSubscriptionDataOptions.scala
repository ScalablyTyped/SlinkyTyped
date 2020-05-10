package typingsSlinky.apolloReactCommon.typesMod

import typingsSlinky.apolloClient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSubscriptionDataOptions[TData] extends js.Object {
  var client: default[js.Object] = js.native
  var subscriptionData: SubscriptionResult[TData] = js.native
}

object OnSubscriptionDataOptions {
  @scala.inline
  def apply[TData](client: default[js.Object], subscriptionData: SubscriptionResult[TData]): OnSubscriptionDataOptions[TData] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], subscriptionData = subscriptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSubscriptionDataOptions[TData]]
  }
  @scala.inline
  implicit class OnSubscriptionDataOptionsOps[Self[tdata] <: OnSubscriptionDataOptions[tdata], TData] (val x: Self[TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TData] with Other]
    @scala.inline
    def withClient(value: default[js.Object]): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionData(value: SubscriptionResult[TData]): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

