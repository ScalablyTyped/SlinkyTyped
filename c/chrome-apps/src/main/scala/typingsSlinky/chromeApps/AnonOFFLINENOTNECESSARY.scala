package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typingsSlinky.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typingsSlinky.chromeApps.chromeAppsStrings.SHARE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOFFLINENOTNECESSARY extends js.Object {
  var OFFLINE_NOT_NECESSARY: typingsSlinky.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY = js.native
  var SAVE_FOR_OFFLINE: typingsSlinky.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE = js.native
  var SHARE: typingsSlinky.chromeApps.chromeAppsStrings.SHARE = js.native
}

object AnonOFFLINENOTNECESSARY {
  @scala.inline
  def apply(OFFLINE_NOT_NECESSARY: OFFLINE_NOT_NECESSARY, SAVE_FOR_OFFLINE: SAVE_FOR_OFFLINE, SHARE: SHARE): AnonOFFLINENOTNECESSARY = {
    val __obj = js.Dynamic.literal(OFFLINE_NOT_NECESSARY = OFFLINE_NOT_NECESSARY.asInstanceOf[js.Any], SAVE_FOR_OFFLINE = SAVE_FOR_OFFLINE.asInstanceOf[js.Any], SHARE = SHARE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOFFLINENOTNECESSARY]
  }
  @scala.inline
  implicit class AnonOFFLINENOTNECESSARYOps[Self <: AnonOFFLINENOTNECESSARY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOFFLINE_NOT_NECESSARY(value: OFFLINE_NOT_NECESSARY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFLINE_NOT_NECESSARY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSAVE_FOR_OFFLINE(value: SAVE_FOR_OFFLINE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAVE_FOR_OFFLINE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHARE(value: SHARE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHARE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

