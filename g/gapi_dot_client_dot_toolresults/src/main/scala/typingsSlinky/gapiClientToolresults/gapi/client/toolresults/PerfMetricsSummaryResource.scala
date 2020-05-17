package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientToolresults.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerfMetricsSummaryResource extends js.Object {
  /**
    * Creates a PerfMetricsSummary resource. Returns the existing one if it has already been created.
    *
    * May return any of the following error code(s): - NOT_FOUND - The containing Step does not exist
    */
  def create(request: Fields): Request[PerfMetricsSummary] = js.native
}

object PerfMetricsSummaryResource {
  @scala.inline
  def apply(create: Fields => Request[PerfMetricsSummary]): PerfMetricsSummaryResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[PerfMetricsSummaryResource]
  }
  @scala.inline
  implicit class PerfMetricsSummaryResourceOps[Self <: PerfMetricsSummaryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Fields => Request[PerfMetricsSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

