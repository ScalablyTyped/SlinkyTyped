package typingsSlinky.apolloTracing.mod

import typingsSlinky.apolloTracing.AnonResolvers
import typingsSlinky.apolloTracing.apolloTracingNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingFormat extends js.Object {
  var duration: Double = js.native
  var endTime: String = js.native
  var execution: AnonResolvers = js.native
  var startTime: String = js.native
  var version: `1` = js.native
}

object TracingFormat {
  @scala.inline
  def apply(duration: Double, endTime: String, execution: AnonResolvers, startTime: String, version: `1`): TracingFormat = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingFormat]
  }
  @scala.inline
  implicit class TracingFormatOps[Self <: TracingFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution(value: AnonResolvers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

