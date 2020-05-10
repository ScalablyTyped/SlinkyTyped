package typingsSlinky.materialDrawer.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialDrawer.materialDrawerStrings.MDCDrawerColonclosed
import typingsSlinky.materialDrawer.materialDrawerStrings.MDCDrawerColonopened
import typingsSlinky.materialDrawer.materialDrawerStrings.`Dotmdc-drawer-app-content`
import typingsSlinky.materialDrawer.materialDrawerStrings.`Dotmdc-drawer-scrim`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var APP_CONTENT_SELECTOR: `Dotmdc-drawer-app-content` = js.native
  var CLOSE_EVENT: MDCDrawerColonclosed = js.native
  var OPEN_EVENT: MDCDrawerColonopened = js.native
  var SCRIM_SELECTOR: `Dotmdc-drawer-scrim` = js.native
}

object strings {
  @scala.inline
  def apply(
    APP_CONTENT_SELECTOR: `Dotmdc-drawer-app-content`,
    CLOSE_EVENT: MDCDrawerColonclosed,
    OPEN_EVENT: MDCDrawerColonopened,
    SCRIM_SELECTOR: `Dotmdc-drawer-scrim`
  ): strings = {
    val __obj = js.Dynamic.literal(APP_CONTENT_SELECTOR = APP_CONTENT_SELECTOR.asInstanceOf[js.Any], CLOSE_EVENT = CLOSE_EVENT.asInstanceOf[js.Any], OPEN_EVENT = OPEN_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPP_CONTENT_SELECTOR(value: `Dotmdc-drawer-app-content`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APP_CONTENT_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLOSE_EVENT(value: MDCDrawerColonclosed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_EVENT(value: MDCDrawerColonopened): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCRIM_SELECTOR(value: `Dotmdc-drawer-scrim`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCRIM_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

