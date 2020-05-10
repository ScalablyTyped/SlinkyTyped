package typingsSlinky.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentsRequest extends js.Object {
  /**
    * The IDs of individual environments to get information about.
    */
  var environmentIds: BoundedEnvironmentIdList = js.native
}

object DescribeEnvironmentsRequest {
  @scala.inline
  def apply(environmentIds: BoundedEnvironmentIdList): DescribeEnvironmentsRequest = {
    val __obj = js.Dynamic.literal(environmentIds = environmentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentsRequest]
  }
  @scala.inline
  implicit class DescribeEnvironmentsRequestOps[Self <: DescribeEnvironmentsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentIds(value: BoundedEnvironmentIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

