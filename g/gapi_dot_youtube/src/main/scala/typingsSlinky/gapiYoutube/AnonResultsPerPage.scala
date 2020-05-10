package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResultsPerPage extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: Double = js.native
  /**
    * The total number of results in the result set.
    */
  var totalResults: Double = js.native
}

object AnonResultsPerPage {
  @scala.inline
  def apply(resultsPerPage: Double, totalResults: Double): AnonResultsPerPage = {
    val __obj = js.Dynamic.literal(resultsPerPage = resultsPerPage.asInstanceOf[js.Any], totalResults = totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResultsPerPage]
  }
  @scala.inline
  implicit class AnonResultsPerPageOps[Self <: AnonResultsPerPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

