package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRdsDbInstancesResult extends js.Object {
  /**
    * An a array of RdsDbInstance objects that describe the instances.
    */
  var RdsDbInstances: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.RdsDbInstances] = js.native
}

object DescribeRdsDbInstancesResult {
  @scala.inline
  def apply(): DescribeRdsDbInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRdsDbInstancesResult]
  }
  @scala.inline
  implicit class DescribeRdsDbInstancesResultOps[Self <: DescribeRdsDbInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRdsDbInstances(value: RdsDbInstances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsDbInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdsDbInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsDbInstances")(js.undefined)
        ret
    }
  }
  
}

