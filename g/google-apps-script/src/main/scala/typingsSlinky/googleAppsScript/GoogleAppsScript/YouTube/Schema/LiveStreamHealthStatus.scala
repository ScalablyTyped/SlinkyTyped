package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStreamHealthStatus extends js.Object {
  var configurationIssues: js.UndefOr[js.Array[LiveStreamConfigurationIssue]] = js.native
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object LiveStreamHealthStatus {
  @scala.inline
  def apply(): LiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamHealthStatus]
  }
  @scala.inline
  implicit class LiveStreamHealthStatusOps[Self <: LiveStreamHealthStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationIssues(value: js.Array[LiveStreamConfigurationIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTimeSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

