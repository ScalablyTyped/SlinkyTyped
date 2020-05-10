package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentInstanceOutput extends js.Object {
  /**
    *  Information about the instance. 
    */
  var instanceSummary: js.UndefOr[InstanceSummary] = js.native
}

object GetDeploymentInstanceOutput {
  @scala.inline
  def apply(): GetDeploymentInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentInstanceOutput]
  }
  @scala.inline
  implicit class GetDeploymentInstanceOutputOps[Self <: GetDeploymentInstanceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceSummary(value: InstanceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSummary")(js.undefined)
        ret
    }
  }
  
}

