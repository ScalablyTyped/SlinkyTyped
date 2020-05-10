package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancesResult extends js.Object {
  /**
    * An array of Instance objects that describe the instances.
    */
  var Instances: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Instances] = js.native
}

object DescribeInstancesResult {
  @scala.inline
  def apply(): DescribeInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesResult]
  }
  @scala.inline
  implicit class DescribeInstancesResultOps[Self <: DescribeInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: Instances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
  }
  
}

