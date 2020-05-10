package typingsSlinky.reactNativeGoby.mod

import typingsSlinky.reactNativeGoby.mod.Goby.DeploymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusReport extends js.Object {
  /**
    * Details of the package that was deployed (or attempted to).
    */
  @JSName("package")
  var _package: js.UndefOr[Package] = js.native
  /**
    * The version of the app that was deployed (for a native app upgrade).
    */
  var appVersion: js.UndefOr[String] = js.native
  /**
    * Deployment key used when deploying the previous package.
    */
  var previousDeploymentKey: js.UndefOr[String] = js.native
  /**
    * The label (v#) of the package that was upgraded from.
    */
  var previousLabelOrAppVersion: js.UndefOr[String] = js.native
  /**
    * Whether the deployment succeeded or failed.
    */
  var status: DeploymentStatus = js.native
}

object StatusReport {
  @scala.inline
  def apply(status: DeploymentStatus): StatusReport = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReport]
  }
  @scala.inline
  implicit class StatusReportOps[Self <: StatusReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: DeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_package(value: Package): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousDeploymentKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousDeploymentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousDeploymentKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousDeploymentKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousLabelOrAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLabelOrAppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousLabelOrAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousLabelOrAppVersion")(js.undefined)
        ret
    }
  }
  
}

