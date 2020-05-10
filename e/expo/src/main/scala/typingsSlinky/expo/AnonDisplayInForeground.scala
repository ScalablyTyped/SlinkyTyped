package typingsSlinky.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayInForeground extends js.Object {
  var _displayInForeground: js.UndefOr[Boolean] = js.native
  var sound: js.UndefOr[Boolean] = js.native
}

object AnonDisplayInForeground {
  @scala.inline
  def apply(): AnonDisplayInForeground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDisplayInForeground]
  }
  @scala.inline
  implicit class AnonDisplayInForegroundOps[Self <: AnonDisplayInForeground] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_displayInForeground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_displayInForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_displayInForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_displayInForeground")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
  }
  
}

