package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaseOptions extends AccessConditionsOptions {
  var leaseDuration: js.UndefOr[String] = js.native
  var proposedLeaseId: js.UndefOr[String] = js.native
}

object LeaseOptions {
  @scala.inline
  def apply(): LeaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseOptions]
  }
  @scala.inline
  implicit class LeaseOptionsOps[Self <: LeaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeaseDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaseDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaseDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withProposedLeaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposedLeaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposedLeaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposedLeaseId")(js.undefined)
        ret
    }
  }
  
}

