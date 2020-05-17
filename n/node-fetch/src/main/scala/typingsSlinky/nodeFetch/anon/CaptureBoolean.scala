package typingsSlinky.nodeFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureBoolean extends js.Object {
  var capture: js.UndefOr[Boolean] = js.native
}

object CaptureBoolean {
  @scala.inline
  def apply(): CaptureBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureBoolean]
  }
  @scala.inline
  implicit class CaptureBooleanOps[Self <: CaptureBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
  }
  
}

