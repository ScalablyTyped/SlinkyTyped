package typingsSlinky.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the operating system of the device running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.os` from within any Scene.
  */
@js.native
trait OS extends js.Object {
  /**
    * Is running on android?
    */
  var android: Boolean = js.native
  /**
    * Is running on chromeOS?
    */
  var chromeOS: Boolean = js.native
  /**
    * Is the game running under Apache Cordova?
    */
  var cordova: Boolean = js.native
  /**
    * Is the game running under the Intel Crosswalk XDK?
    */
  var crosswalk: Boolean = js.native
  /**
    * Is running on a desktop?
    */
  var desktop: Boolean = js.native
  /**
    * Is the game running under Ejecta?
    */
  var ejecta: Boolean = js.native
  /**
    * Is the game running under GitHub Electron?
    */
  var electron: Boolean = js.native
  /**
    * Is running on iOS?
    */
  var iOS: Boolean = js.native
  /**
    * If running in iOS this will contain the major version number.
    */
  var iOSVersion: Double = js.native
  /**
    * Is running on iPad?
    */
  var iPad: Boolean = js.native
  /**
    * Is running on iPhone?
    */
  var iPhone: Boolean = js.native
  /**
    * Is running on an Amazon Kindle?
    */
  var kindle: Boolean = js.native
  /**
    * Is running on linux?
    */
  var linux: Boolean = js.native
  /**
    * Is running on macOS?
    */
  var macOS: Boolean = js.native
  /**
    * Is the game running under Node.js?
    */
  var node: Boolean = js.native
  /**
    * Is the game running under Node-Webkit?
    */
  var nodeWebkit: Boolean = js.native
  /**
    * PixelRatio of the host device?
    */
  var pixelRatio: Double = js.native
  /**
    * Set to true if running as a WebApp, i.e. within a WebView
    */
  var webApp: Boolean = js.native
  /**
    * Is running on windows?
    */
  var windows: Boolean = js.native
  /**
    * Is running on a Windows Phone?
    */
  var windowsPhone: Boolean = js.native
}

object OS {
  @scala.inline
  def apply(
    android: Boolean,
    chromeOS: Boolean,
    cordova: Boolean,
    crosswalk: Boolean,
    desktop: Boolean,
    ejecta: Boolean,
    electron: Boolean,
    iOS: Boolean,
    iOSVersion: Double,
    iPad: Boolean,
    iPhone: Boolean,
    kindle: Boolean,
    linux: Boolean,
    macOS: Boolean,
    node: Boolean,
    nodeWebkit: Boolean,
    pixelRatio: Double,
    webApp: Boolean,
    windows: Boolean,
    windowsPhone: Boolean
  ): OS = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], chromeOS = chromeOS.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any], crosswalk = crosswalk.asInstanceOf[js.Any], desktop = desktop.asInstanceOf[js.Any], ejecta = ejecta.asInstanceOf[js.Any], electron = electron.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], iOSVersion = iOSVersion.asInstanceOf[js.Any], iPad = iPad.asInstanceOf[js.Any], iPhone = iPhone.asInstanceOf[js.Any], kindle = kindle.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], macOS = macOS.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeWebkit = nodeWebkit.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], webApp = webApp.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any], windowsPhone = windowsPhone.asInstanceOf[js.Any])
    __obj.asInstanceOf[OS]
  }
  @scala.inline
  implicit class OSOps[Self <: OS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChromeOS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCordova(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordova")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrosswalk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosswalk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesktop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEjecta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ejecta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElectron(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIOS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIOSVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKindle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kindle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinux(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacOS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWebkit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowsPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsPhone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

