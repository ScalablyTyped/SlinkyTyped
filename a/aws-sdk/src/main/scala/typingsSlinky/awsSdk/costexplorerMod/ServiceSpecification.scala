package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceSpecification extends js.Object {
  /**
    * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
    */
  var EC2Specification: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.EC2Specification] = js.native
}

object ServiceSpecification {
  @scala.inline
  def apply(): ServiceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpecification]
  }
  @scala.inline
  implicit class ServiceSpecificationOps[Self <: ServiceSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEC2Specification(value: EC2Specification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2Specification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2Specification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2Specification")(js.undefined)
        ret
    }
  }
  
}

