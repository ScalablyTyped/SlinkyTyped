package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActivitiesResponse extends js.Object {
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
  /**
    * The list of activities for the specified user and time period.
    */
  var UserActivities: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.UserActivities] = js.native
}

object DescribeActivitiesResponse {
  @scala.inline
  def apply(): DescribeActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivitiesResponse]
  }
  @scala.inline
  implicit class DescribeActivitiesResponseOps[Self <: DescribeActivitiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: MarkerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withUserActivities(value: UserActivities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserActivities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserActivities")(js.undefined)
        ret
    }
  }
  
}

