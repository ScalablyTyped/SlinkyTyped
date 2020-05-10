package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.audio_
import typingsSlinky.chromeApps.chromeAppsStrings.screen_
import typingsSlinky.chromeApps.chromeAppsStrings.tab_
import typingsSlinky.chromeApps.chromeAppsStrings.window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAUDIO extends js.Object {
  var AUDIO: audio_ = js.native
  var SCREEN: screen_ = js.native
  var TAB: tab_ = js.native
  var WINDOW: window_ = js.native
}

object AnonAUDIO {
  @scala.inline
  def apply(AUDIO: audio_, SCREEN: screen_, TAB: tab_, WINDOW: window_): AnonAUDIO = {
    val __obj = js.Dynamic.literal(AUDIO = AUDIO.asInstanceOf[js.Any], SCREEN = SCREEN.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], WINDOW = WINDOW.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAUDIO]
  }
  @scala.inline
  implicit class AnonAUDIOOps[Self <: AnonAUDIO] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUDIO(value: audio_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUDIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCREEN(value: screen_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCREEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAB(value: tab_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWINDOW(value: window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WINDOW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

