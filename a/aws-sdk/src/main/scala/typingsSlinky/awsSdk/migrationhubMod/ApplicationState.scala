package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationState extends js.Object {
  /**
    * The configurationId from the Application Discovery Service that uniquely identifies an application.
    */
  var ApplicationId: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ApplicationId] = js.native
  /**
    * The current status of an application.
    */
  var ApplicationStatus: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ApplicationStatus] = js.native
  /**
    * The timestamp when the application status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
}

object ApplicationState {
  @scala.inline
  def apply(): ApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationState]
  }
  @scala.inline
  implicit class ApplicationStateOps[Self <: ApplicationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: ApplicationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationStatus(value: ApplicationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
        ret
    }
  }
  
}

