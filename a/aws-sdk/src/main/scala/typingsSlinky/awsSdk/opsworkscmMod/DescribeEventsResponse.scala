package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsResponse extends js.Object {
  /**
    * NextToken is a string that is returned in some command responses. It indicates that not all entries have been returned, and that you must run at least one more request to get remaining items. To get remaining results, call DescribeEvents again, and assign the token from the previous results as the value of the nextToken parameter. If there are no more results, the response object's nextToken parameter value is null. Setting a nextToken value that was not returned in your previous results causes an InvalidNextTokenException to occur. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Contains the response to a DescribeEvents request. 
    */
  var ServerEvents: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.ServerEvents] = js.native
}

object DescribeEventsResponse {
  @scala.inline
  def apply(): DescribeEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsResponse]
  }
  @scala.inline
  implicit class DescribeEventsResponseOps[Self <: DescribeEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    @scala.inline
    def withServerEvents(value: ServerEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerEvents")(js.undefined)
        ret
    }
  }
  
}

