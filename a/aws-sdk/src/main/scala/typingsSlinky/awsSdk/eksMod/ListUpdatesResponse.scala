package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUpdatesResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListUpdates request. When the results of a ListUpdates request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * A list of all the updates for the specified cluster and Region.
    */
  var updateIds: js.UndefOr[StringList] = js.native
}

object ListUpdatesResponse {
  @scala.inline
  def apply(): ListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUpdatesResponse]
  }
  @scala.inline
  implicit class ListUpdatesResponseOps[Self <: ListUpdatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIds")(js.undefined)
        ret
    }
  }
  
}

