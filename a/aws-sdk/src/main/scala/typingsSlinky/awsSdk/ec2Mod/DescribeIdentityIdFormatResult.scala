package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityIdFormatResult extends js.Object {
  /**
    * Information about the ID format for the resources.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
}

object DescribeIdentityIdFormatResult {
  @scala.inline
  def apply(): DescribeIdentityIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityIdFormatResult]
  }
  @scala.inline
  implicit class DescribeIdentityIdFormatResultOps[Self <: DescribeIdentityIdFormatResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatuses(value: IdFormatList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statuses")(js.undefined)
        ret
    }
  }
  
}

