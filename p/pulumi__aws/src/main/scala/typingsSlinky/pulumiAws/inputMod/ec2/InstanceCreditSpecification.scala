package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[Input[String]] = js.native
}

object InstanceCreditSpecification {
  @scala.inline
  def apply(): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
  @scala.inline
  implicit class InstanceCreditSpecificationOps[Self <: InstanceCreditSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuCredits(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCredits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuCredits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCredits")(js.undefined)
        ret
    }
  }
  
}

