package typingsSlinky.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataTSubscriptionData[TSubscriptionData] extends js.Object {
  var data: TSubscriptionData = js.native
}

object AnonDataTSubscriptionData {
  @scala.inline
  def apply[TSubscriptionData](data: TSubscriptionData): AnonDataTSubscriptionData[TSubscriptionData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataTSubscriptionData[TSubscriptionData]]
  }
  @scala.inline
  implicit class AnonDataTSubscriptionDataOps[Self[tsubscriptiondata] <: AnonDataTSubscriptionData[tsubscriptiondata], TSubscriptionData] (val x: Self[TSubscriptionData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSubscriptionData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSubscriptionData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSubscriptionData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSubscriptionData] with Other]
    @scala.inline
    def withData(value: TSubscriptionData): Self[TSubscriptionData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

