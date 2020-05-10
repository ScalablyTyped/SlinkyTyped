package typingsSlinky.cliSpinners.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spinner extends js.Object {
  var frames: js.Array[String] = js.native
  var interval: Double = js.native
}

object Spinner {
  @scala.inline
  def apply(frames: js.Array[String], interval: Double): Spinner = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spinner]
  }
  @scala.inline
  implicit class SpinnerOps[Self <: Spinner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

