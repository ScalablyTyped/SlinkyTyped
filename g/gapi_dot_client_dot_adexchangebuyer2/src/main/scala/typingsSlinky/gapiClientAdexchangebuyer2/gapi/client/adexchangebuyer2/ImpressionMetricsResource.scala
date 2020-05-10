package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImpressionMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of impressions. */
  def list(request: AnonFilterSetId): Request_[ListImpressionMetricsResponse] = js.native
}

object ImpressionMetricsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => Request_[ListImpressionMetricsResponse]): ImpressionMetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ImpressionMetricsResource]
  }
  @scala.inline
  implicit class ImpressionMetricsResourceOps[Self <: ImpressionMetricsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonFilterSetId => Request_[ListImpressionMetricsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

