package typingsSlinky.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTSubscriptionData[TSubscriptionData] extends js.Object {
  var data: TSubscriptionData = js.native
}

object DataTSubscriptionData {
  @scala.inline
  def apply[TSubscriptionData](data: TSubscriptionData): DataTSubscriptionData[TSubscriptionData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTSubscriptionData[TSubscriptionData]]
  }
  @scala.inline
  implicit class DataTSubscriptionDataOps[Self[tsubscriptiondata] <: DataTSubscriptionData[tsubscriptiondata], TSubscriptionData] (val x: Self[TSubscriptionData]) extends AnyVal {
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

