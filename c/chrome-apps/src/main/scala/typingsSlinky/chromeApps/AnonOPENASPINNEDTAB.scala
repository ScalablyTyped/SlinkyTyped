package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
import typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
import typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
import typingsSlinky.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOPENASPINNEDTAB extends js.Object {
  var OPEN_AS_PINNED_TAB: typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB = js.native
  var OPEN_AS_REGULAR_TAB: typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB = js.native
  var OPEN_AS_WINDOW: typingsSlinky.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW = js.native
  var OPEN_FULL_SCREEN: typingsSlinky.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN = js.native
}

object AnonOPENASPINNEDTAB {
  @scala.inline
  def apply(
    OPEN_AS_PINNED_TAB: OPEN_AS_PINNED_TAB,
    OPEN_AS_REGULAR_TAB: OPEN_AS_REGULAR_TAB,
    OPEN_AS_WINDOW: OPEN_AS_WINDOW,
    OPEN_FULL_SCREEN: OPEN_FULL_SCREEN
  ): AnonOPENASPINNEDTAB = {
    val __obj = js.Dynamic.literal(OPEN_AS_PINNED_TAB = OPEN_AS_PINNED_TAB.asInstanceOf[js.Any], OPEN_AS_REGULAR_TAB = OPEN_AS_REGULAR_TAB.asInstanceOf[js.Any], OPEN_AS_WINDOW = OPEN_AS_WINDOW.asInstanceOf[js.Any], OPEN_FULL_SCREEN = OPEN_FULL_SCREEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOPENASPINNEDTAB]
  }
  @scala.inline
  implicit class AnonOPENASPINNEDTABOps[Self <: AnonOPENASPINNEDTAB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOPEN_AS_PINNED_TAB(value: OPEN_AS_PINNED_TAB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_PINNED_TAB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_AS_REGULAR_TAB(value: OPEN_AS_REGULAR_TAB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_REGULAR_TAB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_AS_WINDOW(value: OPEN_AS_WINDOW): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_WINDOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_FULL_SCREEN(value: OPEN_FULL_SCREEN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_FULL_SCREEN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

