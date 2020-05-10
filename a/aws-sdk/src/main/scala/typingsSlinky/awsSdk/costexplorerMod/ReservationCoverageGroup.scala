package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationCoverageGroup extends js.Object {
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * How much instance usage this group of reservations covered.
    */
  var Coverage: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Coverage] = js.native
}

object ReservationCoverageGroup {
  @scala.inline
  def apply(): ReservationCoverageGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationCoverageGroup]
  }
  @scala.inline
  implicit class ReservationCoverageGroupOps[Self <: ReservationCoverageGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverage(value: Coverage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coverage")(js.undefined)
        ret
    }
  }
  
}

