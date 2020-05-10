package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var exclusions: ExclusionsResource = js.native
  var logs: LogsResource = js.native
  var metrics: MetricsResource = js.native
  var sinks: SinksResource = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(exclusions: ExclusionsResource, logs: LogsResource, metrics: MetricsResource, sinks: SinksResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusions(value: ExclusionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogs(value: LogsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: MetricsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSinks(value: SinksResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

