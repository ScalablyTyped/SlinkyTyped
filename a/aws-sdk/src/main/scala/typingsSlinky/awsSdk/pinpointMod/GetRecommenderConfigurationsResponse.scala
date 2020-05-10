package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommenderConfigurationsResponse extends js.Object {
  var ListRecommenderConfigurationsResponse: typingsSlinky.awsSdk.pinpointMod.ListRecommenderConfigurationsResponse = js.native
}

object GetRecommenderConfigurationsResponse {
  @scala.inline
  def apply(ListRecommenderConfigurationsResponse: ListRecommenderConfigurationsResponse): GetRecommenderConfigurationsResponse = {
    val __obj = js.Dynamic.literal(ListRecommenderConfigurationsResponse = ListRecommenderConfigurationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommenderConfigurationsResponse]
  }
  @scala.inline
  implicit class GetRecommenderConfigurationsResponseOps[Self <: GetRecommenderConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListRecommenderConfigurationsResponse(value: ListRecommenderConfigurationsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListRecommenderConfigurationsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

