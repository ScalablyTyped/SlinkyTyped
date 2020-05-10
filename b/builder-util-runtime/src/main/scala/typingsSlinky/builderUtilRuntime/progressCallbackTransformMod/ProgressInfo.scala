package typingsSlinky.builderUtilRuntime.progressCallbackTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressInfo extends js.Object {
  var bytesPerSecond: Double = js.native
  var delta: Double = js.native
  var percent: Double = js.native
  var total: Double = js.native
  var transferred: Double = js.native
}

object ProgressInfo {
  @scala.inline
  def apply(bytesPerSecond: Double, delta: Double, percent: Double, total: Double, transferred: Double): ProgressInfo = {
    val __obj = js.Dynamic.literal(bytesPerSecond = bytesPerSecond.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressInfo]
  }
  @scala.inline
  implicit class ProgressInfoOps[Self <: ProgressInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferred(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferred")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

