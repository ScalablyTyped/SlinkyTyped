package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.chromeAppsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationNonInteractive extends _AutomationOptions {
  var desktop: js.UndefOr[`false`] = js.native
  var interact: `false` = js.native
  /** Patterns for matching, use chrome url pattern */
  var matches: js.UndefOr[js.Array[String | UrlMatches]] = js.native
}

object AutomationNonInteractive {
  @scala.inline
  def apply(interact: `false`): AutomationNonInteractive = {
    val __obj = js.Dynamic.literal(interact = interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationNonInteractive]
  }
  @scala.inline
  implicit class AutomationNonInteractiveOps[Self <: AutomationNonInteractive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteract(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesktop(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[String | UrlMatches]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
  }
  
}

