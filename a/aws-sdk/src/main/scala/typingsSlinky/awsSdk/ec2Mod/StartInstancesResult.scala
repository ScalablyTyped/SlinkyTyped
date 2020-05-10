package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartInstancesResult extends js.Object {
  /**
    * Information about the started instances.
    */
  var StartingInstances: js.UndefOr[InstanceStateChangeList] = js.native
}

object StartInstancesResult {
  @scala.inline
  def apply(): StartInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstancesResult]
  }
  @scala.inline
  implicit class StartInstancesResultOps[Self <: StartInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartingInstances(value: InstanceStateChangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingInstances")(js.undefined)
        ret
    }
  }
  
}

