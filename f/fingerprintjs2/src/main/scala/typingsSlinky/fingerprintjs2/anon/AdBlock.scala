package typingsSlinky.fingerprintjs2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdBlock extends js.Object {
  var adBlock: js.UndefOr[Boolean] = js.native
  var addBehavior: js.UndefOr[Boolean] = js.native
  var audio: js.UndefOr[Boolean] = js.native
  var availableScreenResolution: js.UndefOr[Boolean] = js.native
  var canvas: js.UndefOr[Boolean] = js.native
  var colorDepth: js.UndefOr[Boolean] = js.native
  var cpuClass: js.UndefOr[Boolean] = js.native
  var deviceMemory: js.UndefOr[Boolean] = js.native
  /**
    * DNT depends on incognito mode for some browsers (Chrome) and it's impossible to detect incognito mode
    */
  var doNotTrack: js.UndefOr[Boolean] = js.native
  /**
    * Unreliable on Windows, see https://github.com/Valve/fingerprintjs2/issues/375
    */
  var enumerateDevices: js.UndefOr[Boolean] = js.native
  var fonts: js.UndefOr[Boolean] = js.native
  var fontsFlash: js.UndefOr[Boolean] = js.native
  var hardwareConcurrency: js.UndefOr[Boolean] = js.native
  var hasLiedBrowser: js.UndefOr[Boolean] = js.native
  var hasLiedLanguages: js.UndefOr[Boolean] = js.native
  var hasLiedOs: js.UndefOr[Boolean] = js.native
  var hasLiedResolution: js.UndefOr[Boolean] = js.native
  var indexedDb: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[Boolean] = js.native
  var localStorage: js.UndefOr[Boolean] = js.native
  var openDatabase: js.UndefOr[Boolean] = js.native
  /**
    * devicePixelRatio depends on browser zoom, and it's impossible to detect browser zoom
    */
  var pixelRatio: js.UndefOr[Boolean] = js.native
  var platform: js.UndefOr[Boolean] = js.native
  var plugins: js.UndefOr[Boolean] = js.native
  var screenResolution: js.UndefOr[Boolean] = js.native
  var sessionStorage: js.UndefOr[Boolean] = js.native
  var timezone: js.UndefOr[Boolean] = js.native
  var timezoneOffset: js.UndefOr[Boolean] = js.native
  var touchSupport: js.UndefOr[Boolean] = js.native
  var userAgent: js.UndefOr[Boolean] = js.native
  var webgl: js.UndefOr[Boolean] = js.native
  var webglVendorAndRenderer: js.UndefOr[Boolean] = js.native
}

object AdBlock {
  @scala.inline
  def apply(): AdBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdBlock]
  }
  @scala.inline
  implicit class AdBlockOps[Self <: AdBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withAddBehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableScreenResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableScreenResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableScreenResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableScreenResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(js.undefined)
        ret
    }
    @scala.inline
    def withColorDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceMemory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotTrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withEnumerateDevices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerateDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumerateDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerateDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
    @scala.inline
    def withFontsFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsFlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontsFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsFlash")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareConcurrency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLiedBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLiedBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLiedBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLiedBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLiedLanguages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLiedLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLiedLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLiedLanguages")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLiedOs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLiedOs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLiedOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLiedOs")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLiedResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLiedResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLiedResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLiedResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexedDb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedDb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexedDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedDb")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenDatabase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDatabase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDatabase")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezoneOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezoneOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withWebgl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webgl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebgl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webgl")(js.undefined)
        ret
    }
    @scala.inline
    def withWebglVendorAndRenderer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglVendorAndRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebglVendorAndRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglVendorAndRenderer")(js.undefined)
        ret
    }
  }
  
}

