package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogSubscriptionsResult extends js.Object {
  /**
    * A list of active LogSubscription objects for calling the AWS account.
    */
  var LogSubscriptions: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.LogSubscriptions] = js.native
  /**
    * The token for the next set of items to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
}

object ListLogSubscriptionsResult {
  @scala.inline
  def apply(): ListLogSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogSubscriptionsResult]
  }
  @scala.inline
  implicit class ListLogSubscriptionsResultOps[Self <: ListLogSubscriptionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogSubscriptions(value: LogSubscriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogSubscriptions")(js.undefined)
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

