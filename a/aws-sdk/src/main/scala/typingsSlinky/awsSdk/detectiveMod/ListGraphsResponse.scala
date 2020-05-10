package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGraphsResponse extends js.Object {
  /**
    * A list of behavior graphs that the account is a master for.
    */
  var GraphList: js.UndefOr[typingsSlinky.awsSdk.detectiveMod.GraphList] = js.native
  /**
    * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request the next page of behavior graphs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListGraphsResponse {
  @scala.inline
  def apply(): ListGraphsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphsResponse]
  }
  @scala.inline
  implicit class ListGraphsResponseOps[Self <: ListGraphsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphList(value: GraphList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

