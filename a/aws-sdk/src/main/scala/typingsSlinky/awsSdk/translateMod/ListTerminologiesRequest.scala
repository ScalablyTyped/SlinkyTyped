package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTerminologiesRequest extends js.Object {
  /**
    * The maximum number of custom terminologies returned per list request.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  /**
    * If the result of the request to ListTerminologies was truncated, include the NextToken to fetch the next group of custom terminologies. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.translateMod.NextToken] = js.native
}

object ListTerminologiesRequest {
  @scala.inline
  def apply(): ListTerminologiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTerminologiesRequest]
  }
  @scala.inline
  implicit class ListTerminologiesRequestOps[Self <: ListTerminologiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResultsInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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

