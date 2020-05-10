package typingsSlinky.koaUseragent.useragentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expressUseragent.mod.Details
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgent extends Details {
  val SilkAccelerated: Boolean = js.native
  val _agent: js.Any = js.native
  val isAlamoFire: Boolean = js.native
  val isAuthoritative: Boolean = js.native
  val isFacebook: Boolean = js.native
  val isPhantomJS: Boolean = js.native
}

object UserAgent {
  @scala.inline
  def apply(
    SilkAccelerated: Boolean,
    _agent: js.Any,
    browser: String,
    geoIp: StringDictionary[js.Any],
    isAlamoFire: Boolean,
    isAmaya: Boolean,
    isAndroid: Boolean,
    isAndroidTablet: Boolean,
    isAuthoritative: Boolean,
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
    isFacebook: Boolean,
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
    isPhantomJS: Boolean,
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
  ): UserAgent = {
    val __obj = js.Dynamic.literal(SilkAccelerated = SilkAccelerated.asInstanceOf[js.Any], _agent = _agent.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], geoIp = geoIp.asInstanceOf[js.Any], isAlamoFire = isAlamoFire.asInstanceOf[js.Any], isAmaya = isAmaya.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isAndroidTablet = isAndroidTablet.asInstanceOf[js.Any], isAuthoritative = isAuthoritative.asInstanceOf[js.Any], isBada = isBada.asInstanceOf[js.Any], isBlackberry = isBlackberry.asInstanceOf[js.Any], isBot = isBot.asInstanceOf[js.Any], isCaptive = isCaptive.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isChromeOS = isChromeOS.asInstanceOf[js.Any], isCurl = isCurl.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isEdge = isEdge.asInstanceOf[js.Any], isEpiphany = isEpiphany.asInstanceOf[js.Any], isFacebook = isFacebook.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isFlock = isFlock.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isIECompatibilityMode = isIECompatibilityMode.asInstanceOf[js.Any], isKindleFire = isKindleFire.asInstanceOf[js.Any], isKonqueror = isKonqueror.asInstanceOf[js.Any], isLinux = isLinux.asInstanceOf[js.Any], isLinux64 = isLinux64.asInstanceOf[js.Any], isMac = isMac.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isOmniWeb = isOmniWeb.asInstanceOf[js.Any], isOpera = isOpera.asInstanceOf[js.Any], isPhantomJS = isPhantomJS.asInstanceOf[js.Any], isRaspberry = isRaspberry.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isSamsung = isSamsung.asInstanceOf[js.Any], isSeaMonkey = isSeaMonkey.asInstanceOf[js.Any], isSilk = isSilk.asInstanceOf[js.Any], isSmartTV = isSmartTV.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any], isWebkit = isWebkit.asInstanceOf[js.Any], isWinJs = isWinJs.asInstanceOf[js.Any], isWindows = isWindows.asInstanceOf[js.Any], isWindowsPhone = isWindowsPhone.asInstanceOf[js.Any], isiPad = isiPad.asInstanceOf[js.Any], isiPhone = isiPhone.asInstanceOf[js.Any], isiPod = isiPod.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], silkAccelerated = silkAccelerated.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgent]
  }
  @scala.inline
  implicit class UserAgentOps[Self <: UserAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSilkAccelerated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SilkAccelerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_agent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAlamoFire(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlamoFire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAuthoritative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthoritative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFacebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFacebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPhantomJS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPhantomJS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

