package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRdsDbInstancesRequest extends js.Object {
  /**
    * An array containing the ARNs of the instances to be described.
    */
  var RdsDbInstanceArns: js.UndefOr[Strings] = js.native
  /**
    * The ID of the stack with which the instances are registered. The operation returns descriptions of all registered Amazon RDS instances.
    */
  var StackId: String = js.native
}

object DescribeRdsDbInstancesRequest {
  @scala.inline
  def apply(StackId: String): DescribeRdsDbInstancesRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRdsDbInstancesRequest]
  }
  @scala.inline
  implicit class DescribeRdsDbInstancesRequestOps[Self <: DescribeRdsDbInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdsDbInstanceArns(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsDbInstanceArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdsDbInstanceArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsDbInstanceArns")(js.undefined)
        ret
    }
  }
  
}

