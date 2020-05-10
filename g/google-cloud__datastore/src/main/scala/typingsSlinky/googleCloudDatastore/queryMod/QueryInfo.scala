package typingsSlinky.googleCloudDatastore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInfo extends js.Object {
  var endCursor: js.UndefOr[String] = js.native
  val moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults = js.native
}

object QueryInfo {
  @scala.inline
  def apply(moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults): QueryInfo = {
    val __obj = js.Dynamic.literal(moreResults = moreResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
  @scala.inline
  implicit class QueryInfoOps[Self <: QueryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoreResults(value: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(js.undefined)
        ret
    }
  }
  
}

