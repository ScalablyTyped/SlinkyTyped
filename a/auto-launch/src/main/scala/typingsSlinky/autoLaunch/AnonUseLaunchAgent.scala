package typingsSlinky.autoLaunch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUseLaunchAgent extends js.Object {
  /**
    * By default, AppleScript is used to add a Login Item. If this is `true`, Launch Agent will be used to auto-launch your app. Defaults is `false`.
    */
  var useLaunchAgent: js.UndefOr[Boolean] = js.native
}

object AnonUseLaunchAgent {
  @scala.inline
  def apply(): AnonUseLaunchAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUseLaunchAgent]
  }
  @scala.inline
  implicit class AnonUseLaunchAgentOps[Self <: AnonUseLaunchAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseLaunchAgent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLaunchAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLaunchAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLaunchAgent")(js.undefined)
        ret
    }
  }
  
}

