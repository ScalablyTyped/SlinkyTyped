package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttacksRequest extends js.Object {
  /**
    * The end of the time period for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by WAF is Unix time in seconds. However any valid timestamp format is allowed. 
    */
  var EndTime: js.UndefOr[TimeRange] = js.native
  /**
    * The maximum number of AttackSummary objects to be returned. If this is left blank, the first 20 results will be returned. This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the number of AttackSummary objects returned could be less than MaxResults, even if there are still more AttackSummary objects yet to return. If there are more AttackSummary objects to return, AWS WAF will always also return a NextToken.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.shieldMod.MaxResults] = js.native
  /**
    * The ListAttacksRequest.NextMarker value from a previous call to ListAttacksRequest. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked. If this is left blank, all applicable resources for this account will be included.
    */
  var ResourceArns: js.UndefOr[ResourceArnFilterList] = js.native
  /**
    * The start of the time period for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by WAF is Unix time in seconds. However any valid timestamp format is allowed. 
    */
  var StartTime: js.UndefOr[TimeRange] = js.native
}

object ListAttacksRequest {
  @scala.inline
  def apply(): ListAttacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttacksRequest]
  }
  @scala.inline
  implicit class ListAttacksRequestOps[Self <: ListAttacksRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: TimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
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
    def withNextToken(value: Token): Self = {
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
    def withResourceArns(value: ResourceArnFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArns")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: TimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
  }
  
}

