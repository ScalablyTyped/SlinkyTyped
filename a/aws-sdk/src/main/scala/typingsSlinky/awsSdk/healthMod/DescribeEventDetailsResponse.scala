package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventDetailsResponse extends js.Object {
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsFailedSet] = js.native
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet] = js.native
}

object DescribeEventDetailsResponse {
  @scala.inline
  def apply(): DescribeEventDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventDetailsResponse]
  }
  @scala.inline
  implicit class DescribeEventDetailsResponseOps[Self <: DescribeEventDetailsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedSet(value: DescribeEventDetailsFailedSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulSet(value: DescribeEventDetailsSuccessfulSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulSet")(js.undefined)
        ret
    }
  }
  
}

