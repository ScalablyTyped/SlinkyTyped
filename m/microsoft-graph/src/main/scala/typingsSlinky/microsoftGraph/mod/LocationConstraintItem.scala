package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationConstraintItem extends Location {
  /**
    * If set to true and the specified resource is busy, findMeetingTimes looks for another resource that is free. If set to
    * false and the specified resource is busy, findMeetingTimes returns the resource best ranked in the user's cache without
    * checking if it's free. Default is true.
    */
  var resolveAvailability: js.UndefOr[Boolean] = js.native
}

object LocationConstraintItem {
  @scala.inline
  def apply(): LocationConstraintItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraintItem]
  }
  @scala.inline
  implicit class LocationConstraintItemOps[Self <: LocationConstraintItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveAvailability(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAvailability")(js.undefined)
        ret
    }
  }
  
}

