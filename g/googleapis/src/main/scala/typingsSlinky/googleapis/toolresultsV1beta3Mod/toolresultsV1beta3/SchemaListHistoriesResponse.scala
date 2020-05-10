package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for HistoryService.List
  */
@js.native
trait SchemaListHistoriesResponse extends js.Object {
  /**
    * Histories.
    */
  var histories: js.UndefOr[js.Array[SchemaHistory]] = js.native
  /**
    * A continuation token to resume the query at the next item.  Will only be
    * set if there are more histories to fetch.  Tokens are valid for up to one
    * hour from the time of the first list request. For instance, if you make a
    * list request at 1PM and use the token from this first request 10 minutes
    * later, the token from this second response will only be valid for 50
    * minutes.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListHistoriesResponse {
  @scala.inline
  def apply(): SchemaListHistoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHistoriesResponse]
  }
  @scala.inline
  implicit class SchemaListHistoriesResponseOps[Self <: SchemaListHistoriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistories(value: js.Array[SchemaHistory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histories")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

