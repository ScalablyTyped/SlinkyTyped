package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Paging details for lists of resources, including total number of items
  * available and number of resources returned in a single page.
  */
@js.native
trait SchemaPageInfo extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: js.UndefOr[Double] = js.native
  /**
    * The total number of results in the result set.
    */
  var totalResults: js.UndefOr[Double] = js.native
}

object SchemaPageInfo {
  @scala.inline
  def apply(): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageInfo]
  }
  @scala.inline
  implicit class SchemaPageInfoOps[Self <: SchemaPageInfo] (val x: Self) extends AnyVal {
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

