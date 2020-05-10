package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscribersForNotificationResponse extends js.Object {
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of subscribers that are associated with a notification.
    */
  var Subscribers: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.Subscribers] = js.native
}

object DescribeSubscribersForNotificationResponse {
  @scala.inline
  def apply(): DescribeSubscribersForNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscribersForNotificationResponse]
  }
  @scala.inline
  implicit class DescribeSubscribersForNotificationResponseOps[Self <: DescribeSubscribersForNotificationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: GenericString): Self = {
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
    def withSubscribers(value: Subscribers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscribers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscribers")(js.undefined)
        ret
    }
  }
  
}

