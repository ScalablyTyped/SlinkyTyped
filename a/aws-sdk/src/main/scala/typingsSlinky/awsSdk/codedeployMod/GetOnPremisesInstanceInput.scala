package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOnPremisesInstanceInput extends js.Object {
  /**
    *  The name of the on-premises instance about which to get information. 
    */
  var instanceName: InstanceName = js.native
}

object GetOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName): GetOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOnPremisesInstanceInput]
  }
  @scala.inline
  implicit class GetOnPremisesInstanceInputOps[Self <: GetOnPremisesInstanceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceName(value: InstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

