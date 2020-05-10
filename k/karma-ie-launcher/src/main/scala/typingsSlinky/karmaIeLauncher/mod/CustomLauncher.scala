package typingsSlinky.karmaIeLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLauncher extends js.Object {
  /** run IE in emulation mode */
  var `x-ua-compatible`: js.UndefOr[String] = js.native
}

object CustomLauncher {
  @scala.inline
  def apply(): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLauncher]
  }
  @scala.inline
  implicit class CustomLauncherOps[Self <: CustomLauncher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-ua-compatible`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-ua-compatible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-ua-compatible`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-ua-compatible")(js.undefined)
        ret
    }
  }
  
}

