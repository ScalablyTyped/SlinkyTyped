package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalyticsreporting.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /** Returns the Analytics data. */
  def batchGet(request: Accesstoken): Request[GetReportsResponse] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(batchGet: Accesstoken => Request[GetReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchGet(value: Accesstoken => Request[GetReportsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchGet")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

