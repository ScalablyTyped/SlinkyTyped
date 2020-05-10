package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditSpecification extends js.Object {
  /**
    * The credit option for CPU usage of a T2 or T3 instance. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.native
}

object CreditSpecification {
  @scala.inline
  def apply(): CreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditSpecification]
  }
  @scala.inline
  implicit class CreditSpecificationOps[Self <: CreditSpecification] (val x: Self) extends AnyVal {
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
  }
  
}

