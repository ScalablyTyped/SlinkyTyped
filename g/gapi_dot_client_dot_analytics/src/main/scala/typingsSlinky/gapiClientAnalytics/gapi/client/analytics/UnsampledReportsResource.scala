package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonProfileId
import typingsSlinky.gapiClientAnalytics.AnonStartindex
import typingsSlinky.gapiClientAnalytics.AnonUnsampledReportId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsampledReportsResource extends js.Object {
  /** Deletes an unsampled report. */
  def delete(request: AnonUnsampledReportId): Request_[Unit] = js.native
  /** Returns a single unsampled report. */
  def get(request: AnonUnsampledReportId): Request_[UnsampledReport] = js.native
  /** Create a new unsampled report. */
  def insert(request: AnonProfileId): Request_[UnsampledReport] = js.native
  /** Lists unsampled reports to which the user has access. */
  def list(request: AnonStartindex): Request_[UnsampledReports] = js.native
}

object UnsampledReportsResource {
  @scala.inline
  def apply(
    delete: AnonUnsampledReportId => Request_[Unit],
    get: AnonUnsampledReportId => Request_[UnsampledReport],
    insert: AnonProfileId => Request_[UnsampledReport],
    list: AnonStartindex => Request_[UnsampledReports]
  ): UnsampledReportsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UnsampledReportsResource]
  }
  @scala.inline
  implicit class UnsampledReportsResourceOps[Self <: UnsampledReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonUnsampledReportId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonUnsampledReportId => Request_[UnsampledReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonProfileId => Request_[UnsampledReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonStartindex => Request_[UnsampledReports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

