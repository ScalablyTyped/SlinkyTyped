package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceCreditSpecification extends js.Object {
  var cpuCredits: String = js.native
}

object GetInstanceCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String): GetInstanceCreditSpecification = {
    val __obj = js.Dynamic.literal(cpuCredits = cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceCreditSpecification]
  }
  @scala.inline
  implicit class GetInstanceCreditSpecificationOps[Self <: GetInstanceCreditSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuCredits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCredits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

