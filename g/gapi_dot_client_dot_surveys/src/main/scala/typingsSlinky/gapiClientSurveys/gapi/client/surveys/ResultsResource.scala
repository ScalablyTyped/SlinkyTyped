package typingsSlinky.gapiClientSurveys.gapi.client.surveys

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSurveys.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultsResource extends js.Object {
  /**
    * Retrieves any survey results that have been produced so far. Results are formatted as an Excel file. You must add "?alt=media" to the URL as an
    * argument to get results.
    */
  def get(request: AnonKey): Request_[SurveyResults] = js.native
}

object ResultsResource {
  @scala.inline
  def apply(get: AnonKey => Request_[SurveyResults]): ResultsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ResultsResource]
  }
  @scala.inline
  implicit class ResultsResourceOps[Self <: ResultsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonKey => Request_[SurveyResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

