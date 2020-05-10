package typingsSlinky.clientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientJS extends js.Object {
  /** @return A string containing the available resolution. */
  def getAvailableResolution(): String = js.native
  // Browser methods
  /** @return A string containing the browser name */
  def getBrowser(): String = js.native
  /** @return A string containing the major browser version. */
  def getBrowserMajorVersion(): String = js.native
  /** @return A string containing the browser version. */
  def getBrowserVersion(): String = js.native
  // CPU methods
  /** @return A string containing the CPU architecture. */
  def getCPU(): String = js.native
  /** @return A string containing canvas image information */
  def getCanvasPrint(): String = js.native
  /** @return A string containing the color depth. */
  def getColorDepth(): String = js.native
  /** @return A string containing the current resolution. */
  def getCurrentResolution(): String = js.native
  /**
    * @param datapoints Any number of datapoints that are (or can be coerced to
    *                   be) strings.
    * @return A 32-bit integer representing the cumulative fingerprint.
    */
  def getCustomFingerprint(datapoints: (String | Double)*): Double = js.native
  // Device methods
  /** @return A string containing the device. */
  def getDevice(): String = js.native
  /** @return A string containing the device type. */
  def getDeviceType(): String = js.native
  /** @return A string containing the device vendor. */
  def getDeviceVendor(): String = js.native
  /** @return A string containing the device horizontal DPI. */
  def getDeviceXDPI(): String = js.native
  /** @return A string containing the device vertical DPI. */
  def getDeviceYDPI(): String = js.native
  // Engine methods
  /** @return A string containing the browser engine. */
  def getEngine(): String = js.native
  /** @return A string containing the browser engine version. */
  def getEngineVersion(): String = js.native
  // Fingerprint methods
  /** @return A 32-bit integer representing the browser's fingerprint. */
  def getFingerprint(): Double = js.native
  /** @return A string containing the Flash Version. */
  def getFlashVersion(): String = js.native
  /** A string containing a comma-separated list of installed fonts. */
  def getFonts(): String = js.native
  /** @return A string containing the Java Version. */
  def getJavaVersion(): String = js.native
  // Language methods
  /** A lowercase string containing the user language. */
  def getLanguage(): String = js.native
  /** A string containing a list of installed MIME types. */
  def getMimeTypes(): String = js.native
  // OS methods
  /** @return A string containing the OS. */
  def getOS(): String = js.native
  /** @return A string containing the OS version. */
  def getOSVersion(): String = js.native
  // Plugin methods
  /** @return A string containing a list of installed plugins. */
  def getPlugins(): String = js.native
  // Screen methods
  /** @return A string containing screen information. */
  def getScreenPrint(): String = js.native
  /** @return A string containing the Silverlight Version. */
  def getSilverlightVersion(): String = js.native
  /** @return A string containing this software version number. */
  def getSoftwareVersion(): String = js.native
  /** A lowercase string containing the system language. */
  def getSystemLanguage(): String = js.native
  // Time methods
  /** A lowercase string containing the time zone. */
  def getTimeZone(): String = js.native
  // User agent methods
  /** @return A string containing unparsed user agent. */
  def getUserAgent(): String = js.native
  /** @return A lowercase string containing the user agent. */
  def getUserAgentLowerCase(): String = js.native
  // Canvas methods
  /** Check if the canvas element is available. */
  def isCanvas(): Boolean = js.native
  /** Check if the browser is Chrome. */
  def isChrome(): Boolean = js.native
  /** Check if cookies are avaliable. */
  def isCookie(): Boolean = js.native
  /** Check if the browser is Firefox. */
  def isFirefox(): Boolean = js.native
  /** Check if Flash is installed. */
  def isFlash(): Boolean = js.native
  // Font methods
  /** Check if `font` is installed. */
  def isFont(font: String): Boolean = js.native
  /** Check if the browser is IE. */
  def isIE(): Boolean = js.native
  /** Check if the browser is on an Apple iPad. */
  def isIpad(): Boolean = js.native
  /** Check if the browser is on an Apple iPhone. */
  def isIphone(): Boolean = js.native
  /** Check if the browser is on an Apple iPod. */
  def isIpod(): Boolean = js.native
  /** Check if Java is installed. */
  def isJava(): Boolean = js.native
  /** Check if the OS is Linux. */
  def isLinux(): Boolean = js.native
  // Storage methods
  /** Check if local storage is avaliable. */
  def isLocalStorage(): Boolean = js.native
  /** Check if the OS is Mac. */
  def isMac(): Boolean = js.native
  // MIME type methods
  /** Check if MIME types are installed. */
  def isMimeTypes(): Boolean = js.native
  // Mobile methods
  /** Check if the browser is on a mobile device. */
  def isMobile(): Boolean = js.native
  /** Check if the browser is on an Android mobile device. */
  def isMobileAndroid(): Boolean = js.native
  /** Check if the browser is on a Blackberry mobile device. */
  def isMobileBlackBerry(): Boolean = js.native
  // iOS methods
  /** Check if the browser is on an Apple iOS device. */
  def isMobileIOS(): Boolean = js.native
  /** Check if the browser is on a major mobile device. */
  def isMobileMajor(): Boolean = js.native
  /** Check if the browser is on an Opera mobile device. */
  def isMobileOpera(): Boolean = js.native
  /** Check if the browser is mobile Safari. */
  def isMobileSafari(): Boolean = js.native
  /** Check if the browser is on a Windows mobile device. */
  def isMobileWindows(): Boolean = js.native
  /** Check if the browser is Opera. */
  def isOpera(): Boolean = js.native
  /** Check if the browser is Safari. */
  def isSafari(): Boolean = js.native
  /** Check if session storage is avaliable. */
  def isSessionStorage(): Boolean = js.native
  /** Check if Silverlight is installed. */
  def isSilverlight(): Boolean = js.native
  /** Check if the OS is Solaris. */
  def isSolaris(): Boolean = js.native
  /** Check if the OS is Ubuntu. */
  def isUbuntu(): Boolean = js.native
  /** Check if the OS is Windows. */
  def isWindows(): Boolean = js.native
}

object ClientJS {
  @scala.inline
  def apply(
    getAvailableResolution: () => String,
    getBrowser: () => String,
    getBrowserMajorVersion: () => String,
    getBrowserVersion: () => String,
    getCPU: () => String,
    getCanvasPrint: () => String,
    getColorDepth: () => String,
    getCurrentResolution: () => String,
    getCustomFingerprint: /* repeated */ String | Double => Double,
    getDevice: () => String,
    getDeviceType: () => String,
    getDeviceVendor: () => String,
    getDeviceXDPI: () => String,
    getDeviceYDPI: () => String,
    getEngine: () => String,
    getEngineVersion: () => String,
    getFingerprint: () => Double,
    getFlashVersion: () => String,
    getFonts: () => String,
    getJavaVersion: () => String,
    getLanguage: () => String,
    getMimeTypes: () => String,
    getOS: () => String,
    getOSVersion: () => String,
    getPlugins: () => String,
    getScreenPrint: () => String,
    getSilverlightVersion: () => String,
    getSoftwareVersion: () => String,
    getSystemLanguage: () => String,
    getTimeZone: () => String,
    getUserAgent: () => String,
    getUserAgentLowerCase: () => String,
    isCanvas: () => Boolean,
    isChrome: () => Boolean,
    isCookie: () => Boolean,
    isFirefox: () => Boolean,
    isFlash: () => Boolean,
    isFont: String => Boolean,
    isIE: () => Boolean,
    isIpad: () => Boolean,
    isIphone: () => Boolean,
    isIpod: () => Boolean,
    isJava: () => Boolean,
    isLinux: () => Boolean,
    isLocalStorage: () => Boolean,
    isMac: () => Boolean,
    isMimeTypes: () => Boolean,
    isMobile: () => Boolean,
    isMobileAndroid: () => Boolean,
    isMobileBlackBerry: () => Boolean,
    isMobileIOS: () => Boolean,
    isMobileMajor: () => Boolean,
    isMobileOpera: () => Boolean,
    isMobileSafari: () => Boolean,
    isMobileWindows: () => Boolean,
    isOpera: () => Boolean,
    isSafari: () => Boolean,
    isSessionStorage: () => Boolean,
    isSilverlight: () => Boolean,
    isSolaris: () => Boolean,
    isUbuntu: () => Boolean,
    isWindows: () => Boolean
  ): ClientJS = {
    val __obj = js.Dynamic.literal(getAvailableResolution = js.Any.fromFunction0(getAvailableResolution), getBrowser = js.Any.fromFunction0(getBrowser), getBrowserMajorVersion = js.Any.fromFunction0(getBrowserMajorVersion), getBrowserVersion = js.Any.fromFunction0(getBrowserVersion), getCPU = js.Any.fromFunction0(getCPU), getCanvasPrint = js.Any.fromFunction0(getCanvasPrint), getColorDepth = js.Any.fromFunction0(getColorDepth), getCurrentResolution = js.Any.fromFunction0(getCurrentResolution), getCustomFingerprint = js.Any.fromFunction1(getCustomFingerprint), getDevice = js.Any.fromFunction0(getDevice), getDeviceType = js.Any.fromFunction0(getDeviceType), getDeviceVendor = js.Any.fromFunction0(getDeviceVendor), getDeviceXDPI = js.Any.fromFunction0(getDeviceXDPI), getDeviceYDPI = js.Any.fromFunction0(getDeviceYDPI), getEngine = js.Any.fromFunction0(getEngine), getEngineVersion = js.Any.fromFunction0(getEngineVersion), getFingerprint = js.Any.fromFunction0(getFingerprint), getFlashVersion = js.Any.fromFunction0(getFlashVersion), getFonts = js.Any.fromFunction0(getFonts), getJavaVersion = js.Any.fromFunction0(getJavaVersion), getLanguage = js.Any.fromFunction0(getLanguage), getMimeTypes = js.Any.fromFunction0(getMimeTypes), getOS = js.Any.fromFunction0(getOS), getOSVersion = js.Any.fromFunction0(getOSVersion), getPlugins = js.Any.fromFunction0(getPlugins), getScreenPrint = js.Any.fromFunction0(getScreenPrint), getSilverlightVersion = js.Any.fromFunction0(getSilverlightVersion), getSoftwareVersion = js.Any.fromFunction0(getSoftwareVersion), getSystemLanguage = js.Any.fromFunction0(getSystemLanguage), getTimeZone = js.Any.fromFunction0(getTimeZone), getUserAgent = js.Any.fromFunction0(getUserAgent), getUserAgentLowerCase = js.Any.fromFunction0(getUserAgentLowerCase), isCanvas = js.Any.fromFunction0(isCanvas), isChrome = js.Any.fromFunction0(isChrome), isCookie = js.Any.fromFunction0(isCookie), isFirefox = js.Any.fromFunction0(isFirefox), isFlash = js.Any.fromFunction0(isFlash), isFont = js.Any.fromFunction1(isFont), isIE = js.Any.fromFunction0(isIE), isIpad = js.Any.fromFunction0(isIpad), isIphone = js.Any.fromFunction0(isIphone), isIpod = js.Any.fromFunction0(isIpod), isJava = js.Any.fromFunction0(isJava), isLinux = js.Any.fromFunction0(isLinux), isLocalStorage = js.Any.fromFunction0(isLocalStorage), isMac = js.Any.fromFunction0(isMac), isMimeTypes = js.Any.fromFunction0(isMimeTypes), isMobile = js.Any.fromFunction0(isMobile), isMobileAndroid = js.Any.fromFunction0(isMobileAndroid), isMobileBlackBerry = js.Any.fromFunction0(isMobileBlackBerry), isMobileIOS = js.Any.fromFunction0(isMobileIOS), isMobileMajor = js.Any.fromFunction0(isMobileMajor), isMobileOpera = js.Any.fromFunction0(isMobileOpera), isMobileSafari = js.Any.fromFunction0(isMobileSafari), isMobileWindows = js.Any.fromFunction0(isMobileWindows), isOpera = js.Any.fromFunction0(isOpera), isSafari = js.Any.fromFunction0(isSafari), isSessionStorage = js.Any.fromFunction0(isSessionStorage), isSilverlight = js.Any.fromFunction0(isSilverlight), isSolaris = js.Any.fromFunction0(isSolaris), isUbuntu = js.Any.fromFunction0(isUbuntu), isWindows = js.Any.fromFunction0(isWindows))
    __obj.asInstanceOf[ClientJS]
  }
  @scala.inline
  implicit class ClientJSOps[Self <: ClientJS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAvailableResolution(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableResolution")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBrowser(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBrowser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBrowserMajorVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBrowserMajorVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBrowserVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBrowserVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCPU(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCPU")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCanvasPrint(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCanvasPrint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColorDepth(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorDepth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentResolution(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentResolution")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCustomFingerprint(value: /* repeated */ String | Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomFingerprint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDevice(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDeviceType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDeviceVendor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceVendor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDeviceXDPI(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceXDPI")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDeviceYDPI(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceYDPI")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEngine(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEngine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEngineVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEngineVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFingerprint(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFingerprint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFlashVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFlashVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFonts(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFonts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetJavaVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJavaVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLanguage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMimeTypes(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMimeTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOS(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOSVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOSVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlugins(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlugins")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScreenPrint(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreenPrint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSilverlightVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSilverlightVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSoftwareVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSoftwareVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSystemLanguage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSystemLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeZone(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserAgent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserAgent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserAgentLowerCase(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserAgentLowerCase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCanvas(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanvas")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsChrome(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChrome")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCookie(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCookie")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFirefox(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirefox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFlash(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlash")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFont(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFont")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsIE(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIE")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIpad(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIpad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIphone(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIphone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIpod(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIpod")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsJava(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJava")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLinux(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinux")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLocalStorage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocalStorage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMac(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMac")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMimeTypes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMimeTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobileAndroid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileAndroid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobileBlackBerry(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileBlackBerry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobileIOS(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileIOS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobileMajor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileMajor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobileOpera(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileOpera")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobileSafari(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileSafari")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobileWindows(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobileWindows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpera(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpera")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSafari(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSessionStorage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSessionStorage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSilverlight(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSilverlight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSolaris(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSolaris")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUbuntu(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUbuntu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWindows(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindows")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

