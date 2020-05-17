package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.android_
import typingsSlinky.chromeApps.chromeAppsStrings.cros_
import typingsSlinky.chromeApps.chromeAppsStrings.linux_
import typingsSlinky.chromeApps.chromeAppsStrings.mac_
import typingsSlinky.chromeApps.chromeAppsStrings.openbsd_
import typingsSlinky.chromeApps.chromeAppsStrings.win_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANDROID extends js.Object {
  var ANDROID: android_ = js.native
  var CROS: cros_ = js.native
  var LINUX: linux_ = js.native
  var MAC: mac_ = js.native
  var OPENBSD: openbsd_ = js.native
  var WIN: win_ = js.native
}

object ANDROID {
  @scala.inline
  def apply(ANDROID: android_, CROS: cros_, LINUX: linux_, MAC: mac_, OPENBSD: openbsd_, WIN: win_): ANDROID = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], CROS = CROS.asInstanceOf[js.Any], LINUX = LINUX.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], OPENBSD = OPENBSD.asInstanceOf[js.Any], WIN = WIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANDROID]
  }
  @scala.inline
  implicit class ANDROIDOps[Self <: ANDROID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANDROID(value: android_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANDROID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCROS(value: cros_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CROS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLINUX(value: linux_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAC(value: mac_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPENBSD(value: openbsd_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPENBSD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWIN(value: win_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WIN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

