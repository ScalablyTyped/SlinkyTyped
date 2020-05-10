package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[Input[String]] = js.native
}

object SpotInstanceRequestCreditSpecification {
  @scala.inline
  def apply(): SpotInstanceRequestCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceRequestCreditSpecification]
  }
  @scala.inline
  implicit class SpotInstanceRequestCreditSpecificationOps[Self <: SpotInstanceRequestCreditSpecification] (val x: Self) extends AnyVal {
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

