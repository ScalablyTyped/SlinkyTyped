package typingsSlinky.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutubeanalytics.anon.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /** Retrieve your YouTube Analytics reports. */
  def query(request: Currency): Request[ResultTable] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(query: Currency => Request[ResultTable]): ReportsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: Currency => Request[ResultTable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

