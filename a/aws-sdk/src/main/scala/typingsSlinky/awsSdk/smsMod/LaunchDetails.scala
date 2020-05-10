package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchDetails extends js.Object {
  /**
    * Latest time this application was launched successfully.
    */
  var latestLaunchTime: js.UndefOr[js.Date] = js.native
  /**
    * Identifier of the latest stack launched for this application.
    */
  var stackId: js.UndefOr[StackId] = js.native
  /**
    * Name of the latest stack launched for this application.
    */
  var stackName: js.UndefOr[StackName] = js.native
}

object LaunchDetails {
  @scala.inline
  def apply(): LaunchDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchDetails]
  }
  @scala.inline
  implicit class LaunchDetailsOps[Self <: LaunchDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatestLaunchTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestLaunchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestLaunchTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestLaunchTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackName")(js.undefined)
        ret
    }
  }
  
}

