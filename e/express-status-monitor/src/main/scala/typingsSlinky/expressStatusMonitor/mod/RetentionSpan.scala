package typingsSlinky.expressStatusMonitor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionSpan extends js.Object {
  var interval: Double = js.native
  var retention: Double = js.native
}

object RetentionSpan {
  @scala.inline
  def apply(interval: Double, retention: Double): RetentionSpan = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], retention = retention.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionSpan]
  }
  @scala.inline
  implicit class RetentionSpanOps[Self <: RetentionSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetention(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retention")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

