package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsConfiguration extends js.Object {
  /**
    * Whether CloudWatch Logs is enabled for a layer.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of configuration options for CloudWatch Logs.
    */
  var LogStreams: js.UndefOr[CloudWatchLogsLogStreams] = js.native
}

object CloudWatchLogsConfiguration {
  @scala.inline
  def apply(): CloudWatchLogsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsConfiguration]
  }
  @scala.inline
  implicit class CloudWatchLogsConfigurationOps[Self <: CloudWatchLogsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreams(value: CloudWatchLogsLogStreams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogStreams")(js.undefined)
        ret
    }
  }
  
}

