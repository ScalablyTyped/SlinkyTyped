package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceSoftwareOptions extends js.Object {
  /**
    * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we automatically update your service software.
    */
  var AutomatedUpdateDate: js.UndefOr[js.Date] = js.native
  /**
    * True if you are able to cancel your service software version update. False if you are not able to cancel your service software version. 
    */
  var Cancellable: js.UndefOr[Boolean] = js.native
  /**
    * The current service software version that is present on the domain.
    */
  var CurrentVersion: js.UndefOr[String] = js.native
  /**
    * The description of the UpdateStatus.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The new service software version if one is available.
    */
  var NewVersion: js.UndefOr[String] = js.native
  /**
    * True if you are able to update you service software version. False if you are not able to update your service software version. 
    */
  var UpdateAvailable: js.UndefOr[Boolean] = js.native
  /**
    * The status of your service software update. This field can take the following values: ELIGIBLE, PENDING_UPDATE, IN_PROGRESS, COMPLETED, and NOT_ELIGIBLE.
    */
  var UpdateStatus: js.UndefOr[DeploymentStatus] = js.native
}

object ServiceSoftwareOptions {
  @scala.inline
  def apply(): ServiceSoftwareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSoftwareOptions]
  }
  @scala.inline
  implicit class ServiceSoftwareOptionsOps[Self <: ServiceSoftwareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatedUpdateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomatedUpdateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomatedUpdateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomatedUpdateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCancellable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancellable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancellable")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withNewVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateStatus(value: DeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateStatus")(js.undefined)
        ret
    }
  }
  
}

