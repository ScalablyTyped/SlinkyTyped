package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOnPremisesInstanceOutput extends js.Object {
  /**
    *  Information about the on-premises instance. 
    */
  var instanceInfo: js.UndefOr[InstanceInfo] = js.native
}

object GetOnPremisesInstanceOutput {
  @scala.inline
  def apply(): GetOnPremisesInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOnPremisesInstanceOutput]
  }
  @scala.inline
  implicit class GetOnPremisesInstanceOutputOps[Self <: GetOnPremisesInstanceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceInfo(value: InstanceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInfo")(js.undefined)
        ret
    }
  }
  
}

