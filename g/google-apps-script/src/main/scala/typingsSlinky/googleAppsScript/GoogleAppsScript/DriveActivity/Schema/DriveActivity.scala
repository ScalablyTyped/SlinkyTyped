package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveActivity extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.native
  var actors: js.UndefOr[js.Array[Actor]] = js.native
  var primaryActionDetail: js.UndefOr[ActionDetail] = js.native
  var targets: js.UndefOr[js.Array[Target]] = js.native
  var timeRange: js.UndefOr[TimeRange] = js.native
  var timestamp: js.UndefOr[String] = js.native
}

object DriveActivity {
  @scala.inline
  def apply(): DriveActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveActivity]
  }
  @scala.inline
  implicit class DriveActivityOps[Self <: DriveActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[Action]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withActors(value: js.Array[Actor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actors")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryActionDetail(value: ActionDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryActionDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryActionDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryActionDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[Target]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRange(value: TimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

