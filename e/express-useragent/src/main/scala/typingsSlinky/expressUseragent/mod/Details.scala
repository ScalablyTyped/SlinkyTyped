package typingsSlinky.expressUseragent.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Details extends js.Object {
  var browser: String = js.native
  var geoIp: StringDictionary[js.Any] = js.native
  var isAmaya: Boolean = js.native
  var isAndroid: Boolean = js.native
  var isAndroidTablet: Boolean = js.native
  var isBada: Boolean = js.native
  var isBlackberry: Boolean = js.native
  var isBot: Boolean = js.native
  var isCaptive: Boolean = js.native
  var isChrome: Boolean = js.native
  var isChromeOS: Boolean = js.native
  var isCurl: Boolean = js.native
  var isDesktop: Boolean = js.native
  var isEdge: Boolean = js.native
  var isEpiphany: Boolean = js.native
  var isFirefox: Boolean = js.native
  var isFlock: Boolean = js.native
  var isIE: Boolean = js.native
  var isIECompatibilityMode: Boolean = js.native
  var isKindleFire: Boolean = js.native
  var isKonqueror: Boolean = js.native
  var isLinux: Boolean = js.native
  var isLinux64: Boolean = js.native
  var isMac: Boolean = js.native
  var isMobile: Boolean = js.native
  var isOmniWeb: Boolean = js.native
  var isOpera: Boolean = js.native
  var isRaspberry: Boolean = js.native
  var isSafari: Boolean = js.native
  var isSamsung: Boolean = js.native
  var isSeaMonkey: Boolean = js.native
  var isSilk: Boolean = js.native
  var isSmartTV: Boolean = js.native
  var isTablet: Boolean = js.native
  var isWebkit: Boolean = js.native
  var isWinJs: Boolean = js.native
  var isWindows: Boolean = js.native
  var isWindowsPhone: Boolean = js.native
  var isiPad: Boolean = js.native
  var isiPhone: Boolean = js.native
  var isiPod: Boolean = js.native
  var os: String = js.native
  var platform: String = js.native
  var silkAccelerated: Boolean = js.native
  var source: String = js.native
  var version: String = js.native
}

object Details {
  @scala.inline
  def apply(
    browser: String,
    geoIp: StringDictionary[js.Any],
    isAmaya: Boolean,
    isAndroid: Boolean,
    isAndroidTablet: Boolean,
    isBada: Boolean,
    isBlackberry: Boolean,
    isBot: Boolean,
    isCaptive: Boolean,
    isChrome: Boolean,
    isChromeOS: Boolean,
    isCurl: Boolean,
    isDesktop: Boolean,
    isEdge: Boolean,
    isEpiphany: Boolean,
    isFirefox: Boolean,
    isFlock: Boolean,
    isIE: Boolean,
    isIECompatibilityMode: Boolean,
    isKindleFire: Boolean,
    isKonqueror: Boolean,
    isLinux: Boolean,
    isLinux64: Boolean,
    isMac: Boolean,
    isMobile: Boolean,
    isOmniWeb: Boolean,
    isOpera: Boolean,
    isRaspberry: Boolean,
    isSafari: Boolean,
    isSamsung: Boolean,
    isSeaMonkey: Boolean,
    isSilk: Boolean,
    isSmartTV: Boolean,
    isTablet: Boolean,
    isWebkit: Boolean,
    isWinJs: Boolean,
    isWindows: Boolean,
    isWindowsPhone: Boolean,
    isiPad: Boolean,
    isiPhone: Boolean,
    isiPod: Boolean,
    os: String,
    platform: String,
    silkAccelerated: Boolean,
    source: String,
    version: String
  ): Details = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], geoIp = geoIp.asInstanceOf[js.Any], isAmaya = isAmaya.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isAndroidTablet = isAndroidTablet.asInstanceOf[js.Any], isBada = isBada.asInstanceOf[js.Any], isBlackberry = isBlackberry.asInstanceOf[js.Any], isBot = isBot.asInstanceOf[js.Any], isCaptive = isCaptive.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isChromeOS = isChromeOS.asInstanceOf[js.Any], isCurl = isCurl.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isEdge = isEdge.asInstanceOf[js.Any], isEpiphany = isEpiphany.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isFlock = isFlock.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isIECompatibilityMode = isIECompatibilityMode.asInstanceOf[js.Any], isKindleFire = isKindleFire.asInstanceOf[js.Any], isKonqueror = isKonqueror.asInstanceOf[js.Any], isLinux = isLinux.asInstanceOf[js.Any], isLinux64 = isLinux64.asInstanceOf[js.Any], isMac = isMac.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isOmniWeb = isOmniWeb.asInstanceOf[js.Any], isOpera = isOpera.asInstanceOf[js.Any], isRaspberry = isRaspberry.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isSamsung = isSamsung.asInstanceOf[js.Any], isSeaMonkey = isSeaMonkey.asInstanceOf[js.Any], isSilk = isSilk.asInstanceOf[js.Any], isSmartTV = isSmartTV.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any], isWebkit = isWebkit.asInstanceOf[js.Any], isWinJs = isWinJs.asInstanceOf[js.Any], isWindows = isWindows.asInstanceOf[js.Any], isWindowsPhone = isWindowsPhone.asInstanceOf[js.Any], isiPad = isiPad.asInstanceOf[js.Any], isiPhone = isiPhone.asInstanceOf[js.Any], isiPod = isiPod.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], silkAccelerated = silkAccelerated.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
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
    def withGeoIp(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAmaya(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAmaya")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAndroidTablet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAndroidTablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBada(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBada")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlackberry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlackberry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCaptive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaptive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChromeOS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChromeOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCurl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDesktop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDesktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEpiphany(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEpiphany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIECompatibilityMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIECompatibilityMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsKindleFire(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKindleFire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsKonqueror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKonqueror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLinux(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLinux64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinux64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOmniWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOmniWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRaspberry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRaspberry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSamsung(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSamsung")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSeaMonkey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSeaMonkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSilk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSilk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSmartTV(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSmartTV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTablet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebkit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWinJs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWinJs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWindowsPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindowsPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsiPad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isiPad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsiPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isiPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsiPod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isiPod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilkAccelerated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silkAccelerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

