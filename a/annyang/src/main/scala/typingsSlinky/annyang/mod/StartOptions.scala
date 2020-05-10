package typingsSlinky.annyang.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOptions extends js.Object {
  /**
    * Should annyang restart itself if it is closed indirectly, because of silence or window conflicts?
    */
  var autoRestart: js.UndefOr[Boolean] = js.native
  /**
    * Allow forcing continuous mode on or off. Annyang is pretty smart about this, so only set this if you know what you're doing.
    */
  var continuous: js.UndefOr[Boolean] = js.native
}

object StartOptions {
  @scala.inline
  def apply(): StartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOptions]
  }
  @scala.inline
  implicit class StartOptionsOps[Self <: StartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRestart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRestart")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(js.undefined)
        ret
    }
  }
  
}

