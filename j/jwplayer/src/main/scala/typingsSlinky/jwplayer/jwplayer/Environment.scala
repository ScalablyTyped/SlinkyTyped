package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  var Browser: typingsSlinky.jwplayer.jwplayer.Browser = js.native
  var Features: typingsSlinky.jwplayer.jwplayer.Features = js.native
  var OS: typingsSlinky.jwplayer.jwplayer.OS = js.native
}

object Environment {
  @scala.inline
  def apply(Browser: Browser, Features: Features, OS: OS): Environment = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Features = Features.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: Browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: Features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOS(value: OS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

