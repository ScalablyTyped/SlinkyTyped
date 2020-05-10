package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateInstancesResult extends js.Object {
  /**
    * Information about the terminated instances.
    */
  var TerminatingInstances: js.UndefOr[InstanceStateChangeList] = js.native
}

object TerminateInstancesResult {
  @scala.inline
  def apply(): TerminateInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateInstancesResult]
  }
  @scala.inline
  implicit class TerminateInstancesResultOps[Self <: TerminateInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerminatingInstances(value: InstanceStateChangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminatingInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminatingInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminatingInstances")(js.undefined)
        ret
    }
  }
  
}

