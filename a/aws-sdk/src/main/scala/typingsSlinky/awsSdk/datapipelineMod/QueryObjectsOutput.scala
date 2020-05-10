package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryObjectsOutput extends js.Object {
  /**
    * Indicates whether there are more results that can be obtained by a subsequent call.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The identifiers that match the query selectors.
    */
  var ids: js.UndefOr[idList] = js.native
  /**
    * The starting point for the next page of results. To view the next page of results, call QueryObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
}

object QueryObjectsOutput {
  @scala.inline
  def apply(): QueryObjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryObjectsOutput]
  }
  @scala.inline
  implicit class QueryObjectsOutputOps[Self <: QueryObjectsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMoreResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: idList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
  }
  
}

