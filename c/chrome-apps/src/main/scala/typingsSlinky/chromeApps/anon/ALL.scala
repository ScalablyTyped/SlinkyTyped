package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.all__
import typingsSlinky.chromeApps.chromeAppsStrings.audio_
import typingsSlinky.chromeApps.chromeAppsStrings.browser_action_
import typingsSlinky.chromeApps.chromeAppsStrings.editable_
import typingsSlinky.chromeApps.chromeAppsStrings.frame_
import typingsSlinky.chromeApps.chromeAppsStrings.image_
import typingsSlinky.chromeApps.chromeAppsStrings.launcher_
import typingsSlinky.chromeApps.chromeAppsStrings.link_
import typingsSlinky.chromeApps.chromeAppsStrings.page_
import typingsSlinky.chromeApps.chromeAppsStrings.page_action_
import typingsSlinky.chromeApps.chromeAppsStrings.selection_
import typingsSlinky.chromeApps.chromeAppsStrings.video_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALL extends js.Object {
  var ALL: all__ = js.native
  var AUDIO: audio_ = js.native
  var BROWSER_ACTION: browser_action_ = js.native
  var EDITABLE: editable_ = js.native
  var FRAME: frame_ = js.native
  var IMAGE: image_ = js.native
  var LAUNCHER: launcher_ = js.native
  var LINK: link_ = js.native
  var PAGE: page_ = js.native
  var PAGE_ACTION: page_action_ = js.native
  var SELECTION: selection_ = js.native
  var VIDEO: video_ = js.native
}

object ALL {
  @scala.inline
  def apply(
    ALL: all__,
    AUDIO: audio_,
    BROWSER_ACTION: browser_action_,
    EDITABLE: editable_,
    FRAME: frame_,
    IMAGE: image_,
    LAUNCHER: launcher_,
    LINK: link_,
    PAGE: page_,
    PAGE_ACTION: page_action_,
    SELECTION: selection_,
    VIDEO: video_
  ): ALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], AUDIO = AUDIO.asInstanceOf[js.Any], BROWSER_ACTION = BROWSER_ACTION.asInstanceOf[js.Any], EDITABLE = EDITABLE.asInstanceOf[js.Any], FRAME = FRAME.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LAUNCHER = LAUNCHER.asInstanceOf[js.Any], LINK = LINK.asInstanceOf[js.Any], PAGE = PAGE.asInstanceOf[js.Any], PAGE_ACTION = PAGE_ACTION.asInstanceOf[js.Any], SELECTION = SELECTION.asInstanceOf[js.Any], VIDEO = VIDEO.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALL]
  }
  @scala.inline
  implicit class ALLOps[Self <: ALL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALL(value: all__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAUDIO(value: audio_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUDIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBROWSER_ACTION(value: browser_action_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BROWSER_ACTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEDITABLE(value: editable_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EDITABLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRAME(value: frame_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIMAGE(value: image_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLAUNCHER(value: launcher_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LAUNCHER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLINK(value: link_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE(value: page_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE_ACTION(value: page_action_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE_ACTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELECTION(value: selection_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVIDEO(value: video_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VIDEO")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

