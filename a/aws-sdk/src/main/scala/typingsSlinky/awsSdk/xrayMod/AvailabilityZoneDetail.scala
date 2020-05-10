package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZoneDetail extends js.Object {
  /**
    * The name of a corresponding availability zone.
    */
  var Name: js.UndefOr[String] = js.native
}

object AvailabilityZoneDetail {
  @scala.inline
  def apply(): AvailabilityZoneDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZoneDetail]
  }
  @scala.inline
  implicit class AvailabilityZoneDetailOps[Self <: AvailabilityZoneDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

