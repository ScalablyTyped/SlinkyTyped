package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfig extends js.Object {
  /** Cloud audit options. */
  var cloudAudit: js.UndefOr[LogConfigCloudAuditOptions] = js.native
  /** Counter options. */
  var counter: js.UndefOr[LogConfigCounterOptions] = js.native
  /** Data access options. */
  var dataAccess: js.UndefOr[LogConfigDataAccessOptions] = js.native
}

object LogConfig {
  @scala.inline
  def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  @scala.inline
  implicit class LogConfigOps[Self <: LogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudAudit(value: LogConfigCloudAuditOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudAudit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudAudit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudAudit")(js.undefined)
        ret
    }
    @scala.inline
    def withCounter(value: LogConfigCounterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAccess(value: LogConfigDataAccessOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAccess")(js.undefined)
        ret
    }
  }
  
}

