package typingsSlinky.gapiYoutubeanalytics.gapi.client.youtubeAnalytics

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutubeanalytics.AnonDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait reports extends js.Object {
  /**
    * Retrieve your YouTube Analytics reports.
    */
  def query(`object`: AnonDimensions): HttpRequest[_] = js.native
}

object reports {
  @scala.inline
  def apply(query: AnonDimensions => HttpRequest[_]): reports = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[reports]
  }
  @scala.inline
  implicit class reportsOps[Self <: reports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: AnonDimensions => HttpRequest[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

