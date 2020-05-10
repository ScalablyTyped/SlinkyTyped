package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2Specification extends js.Object {
  /**
    * Whether you want a recommendation for standard or convertible reservations.
    */
  var OfferingClass: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.OfferingClass] = js.native
}

object EC2Specification {
  @scala.inline
  def apply(): EC2Specification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2Specification]
  }
  @scala.inline
  implicit class EC2SpecificationOps[Self <: EC2Specification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOfferingClass(value: OfferingClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingClass")(js.undefined)
        ret
    }
  }
  
}

