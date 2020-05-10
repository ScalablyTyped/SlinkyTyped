package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2ResourceUtilization extends js.Object {
  /**
    *  Maximum observed or expected CPU utilization of the instance.
    */
  var MaxCpuUtilizationPercentage: js.UndefOr[GenericString] = js.native
  /**
    *  Maximum observed or expected memory utilization of the instance.
    */
  var MaxMemoryUtilizationPercentage: js.UndefOr[GenericString] = js.native
  /**
    *  Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
    */
  var MaxStorageUtilizationPercentage: js.UndefOr[GenericString] = js.native
}

object EC2ResourceUtilization {
  @scala.inline
  def apply(): EC2ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2ResourceUtilization]
  }
  @scala.inline
  implicit class EC2ResourceUtilizationOps[Self <: EC2ResourceUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCpuUtilizationPercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCpuUtilizationPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCpuUtilizationPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCpuUtilizationPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMemoryUtilizationPercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxMemoryUtilizationPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMemoryUtilizationPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxMemoryUtilizationPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStorageUtilizationPercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxStorageUtilizationPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStorageUtilizationPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxStorageUtilizationPercentage")(js.undefined)
        ret
    }
  }
  
}

