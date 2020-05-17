package typingsSlinky.phonegapPluginPush.PhonegapPluginPush

import typingsSlinky.phonegapPluginPush.anon.Alert
import typingsSlinky.phonegapPluginPush.anon.ApplicationServerKey
import typingsSlinky.phonegapPluginPush.anon.ClearBadge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * platform specific initialization options.
	 */
@js.native
trait InitOptions extends js.Object {
  /**
  		 * Android specific initialization options.
  		 */
  var android: js.UndefOr[ClearBadge] = js.native
  /**
  		 * Browser specific initialization options.
  		 */
  var browser: js.UndefOr[ApplicationServerKey] = js.native
  /**
  		 * iOS specific initialization options.
  		 */
  var ios: js.UndefOr[Alert] = js.native
  /**
  		 * Windows specific initialization options.
  		 */
  var windows: js.UndefOr[js.Object] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: ClearBadge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser(value: ApplicationServerKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
    @scala.inline
    def withIos(value: Alert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
    @scala.inline
    def withWindows(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(js.undefined)
        ret
    }
  }
  
}

