package typingsSlinky.jqueryNotifybar.JQueryNotifyBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyBarOptionsForAnimationSpeedString extends NotifyBarOptions {
  /**
    * How long this bar will be slided up and down. Possible values are "slow", "default", "normal", "fast".
    */
  @JSName("animationSpeed")
  var animationSpeed_NotifyBarOptionsForAnimationSpeedString: js.UndefOr[String] = js.native
}

object NotifyBarOptionsForAnimationSpeedString {
  @scala.inline
  def apply(): NotifyBarOptionsForAnimationSpeedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedString]
  }
  @scala.inline
  implicit class NotifyBarOptionsForAnimationSpeedStringOps[Self <: NotifyBarOptionsForAnimationSpeedString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationSpeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(js.undefined)
        ret
    }
  }
  
}

