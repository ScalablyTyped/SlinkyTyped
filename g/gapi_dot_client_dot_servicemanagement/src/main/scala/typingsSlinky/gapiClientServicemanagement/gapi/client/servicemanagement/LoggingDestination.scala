package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingDestination extends js.Object {
  /**
    * Names of the logs to be sent to this destination. Each name must
    * be defined in the Service.logs section. If the log name is
    * not a domain scoped name, it will be automatically prefixed with
    * the service name followed by "/".
    */
  var logs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The monitored resource type. The type must be defined in the
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}

object LoggingDestination {
  @scala.inline
  def apply(): LoggingDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingDestination]
  }
  @scala.inline
  implicit class LoggingDestinationOps[Self <: LoggingDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoredResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoredResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResource")(js.undefined)
        ret
    }
  }
  
}

