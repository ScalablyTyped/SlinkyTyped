package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignedLicense extends js.Object {
  // A collection of the unique identifiers for plans that have been disabled.
  var disabledPlans: js.UndefOr[js.Array[String]] = js.native
  // The unique identifier for the SKU.
  var skuId: js.UndefOr[String] = js.native
}

object AssignedLicense {
  @scala.inline
  def apply(): AssignedLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedLicense]
  }
  @scala.inline
  implicit class AssignedLicenseOps[Self <: AssignedLicense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledPlans(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledPlans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledPlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledPlans")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(js.undefined)
        ret
    }
  }
  
}

