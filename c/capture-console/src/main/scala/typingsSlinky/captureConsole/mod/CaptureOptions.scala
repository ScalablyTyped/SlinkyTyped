package typingsSlinky.captureConsole.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureOptions extends js.Object {
  /**
    * Option to silence the output going to the console
    */
  var quiet: js.UndefOr[Boolean] = js.native
}

object CaptureOptions {
  @scala.inline
  def apply(): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureOptions]
  }
  @scala.inline
  implicit class CaptureOptionsOps[Self <: CaptureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
  }
  
}

