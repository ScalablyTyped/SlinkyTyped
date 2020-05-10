package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationConstraint extends js.Object {
  /**
    * The client requests the service to include in the response a meeting location for the meeting. If this is true and all
    * the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the
    * resources are busy, findMeetingTimes would still look for meeting times without locations.
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  // Constraint information for one or more locations that the client requests for the meeting.
  var locations: js.UndefOr[js.Array[LocationConstraintItem]] = js.native
  // The client requests the service to suggest one or more meeting locations.
  var suggestLocation: js.UndefOr[Boolean] = js.native
}

object LocationConstraint {
  @scala.inline
  def apply(): LocationConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraint]
  }
  @scala.inline
  implicit class LocationConstraintOps[Self <: LocationConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[LocationConstraintItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestLocation")(js.undefined)
        ret
    }
  }
  
}

