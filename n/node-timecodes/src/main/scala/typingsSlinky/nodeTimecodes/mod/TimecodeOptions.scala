package typingsSlinky.nodeTimecodes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimecodeOptions extends js.Object {
  var frameRate: js.UndefOr[Double] = js.native
  var ms: js.UndefOr[Boolean] = js.native
}

object TimecodeOptions {
  @scala.inline
  def apply(): TimecodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimecodeOptions]
  }
  @scala.inline
  implicit class TimecodeOptionsOps[Self <: TimecodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withMs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms")(js.undefined)
        ret
    }
  }
  
}

