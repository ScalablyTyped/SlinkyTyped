package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceUtilization extends js.Object {
  /**
    * Utilization of current Amazon EC2 Instance 
    */
  var EC2ResourceUtilization: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.EC2ResourceUtilization] = js.native
}

object ResourceUtilization {
  @scala.inline
  def apply(): ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilization]
  }
  @scala.inline
  implicit class ResourceUtilizationOps[Self <: ResourceUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEC2ResourceUtilization(value: EC2ResourceUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2ResourceUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2ResourceUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2ResourceUtilization")(js.undefined)
        ret
    }
  }
  
}

