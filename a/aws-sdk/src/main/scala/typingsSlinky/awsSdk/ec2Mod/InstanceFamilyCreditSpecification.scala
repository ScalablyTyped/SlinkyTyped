package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFamilyCreditSpecification extends js.Object {
  /**
    * The default credit option for CPU usage of the instance family. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.native
  /**
    * The instance family.
    */
  var InstanceFamily: js.UndefOr[UnlimitedSupportedInstanceFamily] = js.native
}

object InstanceFamilyCreditSpecification {
  @scala.inline
  def apply(): InstanceFamilyCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFamilyCreditSpecification]
  }
  @scala.inline
  implicit class InstanceFamilyCreditSpecificationOps[Self <: InstanceFamilyCreditSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuCredits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuCredits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuCredits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuCredits")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceFamily(value: UnlimitedSupportedInstanceFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(js.undefined)
        ret
    }
  }
  
}

