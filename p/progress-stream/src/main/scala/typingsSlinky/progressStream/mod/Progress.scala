package typingsSlinky.progressStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  var delta: Double = js.native
  var eta: Double = js.native
  var length: Double = js.native
  var percentage: Double = js.native
  var remaining: Double = js.native
  var runtime: Double = js.native
  var speed: Double = js.native
  var transferred: Double = js.native
}

object Progress {
  @scala.inline
  def apply(
    delta: Double,
    eta: Double,
    length: Double,
    percentage: Double,
    remaining: Double,
    runtime: Double,
    speed: Double,
    transferred: Double
  ): Progress = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
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

