package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNodegroupsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListNodegroups request. When the results of a ListNodegroups request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * A list of all of the node groups associated with the specified cluster.
    */
  var nodegroups: js.UndefOr[StringList] = js.native
}

object ListNodegroupsResponse {
  @scala.inline
  def apply(): ListNodegroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodegroupsResponse]
  }
  @scala.inline
  implicit class ListNodegroupsResponseOps[Self <: ListNodegroupsResponse] (val x: Self) extends AnyVal {
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
    def withNodegroups(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodegroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroups")(js.undefined)
        ret
    }
  }
  
}

