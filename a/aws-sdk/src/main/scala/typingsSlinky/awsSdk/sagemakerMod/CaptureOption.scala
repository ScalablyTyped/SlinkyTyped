package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureOption extends js.Object {
  /**
    * 
    */
  var CaptureMode: typingsSlinky.awsSdk.sagemakerMod.CaptureMode = js.native
}

object CaptureOption {
  @scala.inline
  def apply(CaptureMode: CaptureMode): CaptureOption = {
    val __obj = js.Dynamic.literal(CaptureMode = CaptureMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOption]
  }
  @scala.inline
  implicit class CaptureOptionOps[Self <: CaptureOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureMode(value: CaptureMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

