package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInfo extends js.Object {
  var resultsPerPage: js.UndefOr[Double] = js.native
  var totalResults: js.UndefOr[Double] = js.native
}

object PageInfo {
  @scala.inline
  def apply(): PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInfo]
  }
  @scala.inline
  implicit class PageInfoOps[Self <: PageInfo] (val x: Self) extends AnyVal {
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
    def withoutResultsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(js.undefined)
        ret
    }
  }
  
}

