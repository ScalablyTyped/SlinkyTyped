package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldersResource extends js.Object {
  var exclusions: ExclusionsResource = js.native
  var logs: LogsResource = js.native
  var sinks: SinksResource = js.native
}

object FoldersResource {
  @scala.inline
  def apply(exclusions: ExclusionsResource, logs: LogsResource, sinks: SinksResource): FoldersResource = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldersResource]
  }
  @scala.inline
  implicit class FoldersResourceOps[Self <: FoldersResource] (val x: Self) extends AnyVal {
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
    def withSinks(value: SinksResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

