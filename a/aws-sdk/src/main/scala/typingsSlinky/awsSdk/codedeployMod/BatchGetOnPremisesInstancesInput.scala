package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetOnPremisesInstancesInput extends js.Object {
  /**
    * The names of the on-premises instances about which to get information. The maximum number of instance names you can specify is 25.
    */
  var instanceNames: InstanceNameList = js.native
}

object BatchGetOnPremisesInstancesInput {
  @scala.inline
  def apply(instanceNames: InstanceNameList): BatchGetOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetOnPremisesInstancesInput]
  }
  @scala.inline
  implicit class BatchGetOnPremisesInstancesInputOps[Self <: BatchGetOnPremisesInstancesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceNames(value: InstanceNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

