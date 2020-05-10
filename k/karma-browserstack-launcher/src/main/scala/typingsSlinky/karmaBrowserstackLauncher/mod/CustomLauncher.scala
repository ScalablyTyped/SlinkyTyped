package typingsSlinky.karmaBrowserstackLauncher.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLauncher
  extends /**
  * you can also pass through any additional options supported by browserstack. (EG. url, resolution, etc.)
  * See {@link browserstack.com/automate/capabilities} for a full list of supported options.
  */
/* option */ StringDictionary[js.Any] {
  /** name of the browser */
  var browser: js.UndefOr[String | Null] = js.native
  /** version of the browser */
  var browser_version: js.UndefOr[String | Null] = js.native
  /** the BS worker build name (optional, defaults to global) */
  var build: js.UndefOr[String] = js.native
  /** name of the device */
  var device: js.UndefOr[String | Null] = js.native
  /** the BS worker name (optional, defaults to global) */
  var name: js.UndefOr[String] = js.native
  /** which platform */
  var os: js.UndefOr[String | Null] = js.native
  /** version of the platform */
  var os_version: js.UndefOr[String | Null] = js.native
  /** the BS worker project name (optional, defaults to global) */
  var project: js.UndefOr[String] = js.native
  /** allows the session to run on a real mobile device instead of an emulator / simulator */
  var realMobile: js.UndefOr[Boolean] = js.native
  /** allows the session to run on a real mobile device instead of an emulator / simulator */
  var real_mobile: js.UndefOr[Boolean] = js.native
}

object CustomLauncher {
  @scala.inline
  def apply(): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLauncher]
  }
  @scala.inline
  implicit class CustomLauncherOps[Self <: CustomLauncher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: String): Self = {
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
    def withBrowserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(null)
        ret
    }
    @scala.inline
    def withBrowser_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_version")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser_versionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_version")(null)
        ret
    }
    @scala.inline
    def withBuild(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(js.undefined)
        ret
    }
    @scala.inline
    def withOsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(null)
        ret
    }
    @scala.inline
    def withOs_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_version")(js.undefined)
        ret
    }
    @scala.inline
    def withOs_versionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_version")(null)
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withRealMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withReal_mobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real_mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReal_mobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real_mobile")(js.undefined)
        ret
    }
  }
  
}

