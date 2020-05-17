package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLNavigator extends js.Object {
  @JSName("MSHTML.HTMLNavigator_typekey")
  var MSHTMLDotHTMLNavigator_typekey: HTMLNavigator = js.native
  val appCodeName: String = js.native
  val appMinorVersion: String = js.native
  val appName: String = js.native
  val appVersion: String = js.native
  val browserLanguage: String = js.native
  val connectionSpeed: Double = js.native
  val constructor: js.Any = js.native
  val cookieEnabled: Boolean = js.native
  val cpuClass: String = js.native
  val geolocation: IWebGeolocation = js.native
  val mimeTypes: CMimeTypes = js.native
  val msDoNotTrack: String = js.native
  val onLine: Boolean = js.native
  val opsProfile: COpsProfile = js.native
  val platform: String = js.native
  val plugins: IHTMLPluginsCollection = js.native
  val systemLanguage: String = js.native
  val userAgent: String = js.native
  val userLanguage: String = js.native
  val userProfile: COpsProfile = js.native
  def javaEnabled(): Boolean = js.native
  def taintEnabled(): Boolean = js.native
}

object HTMLNavigator {
  @scala.inline
  def apply(
    MSHTMLDotHTMLNavigator_typekey: HTMLNavigator,
    appCodeName: String,
    appMinorVersion: String,
    appName: String,
    appVersion: String,
    browserLanguage: String,
    connectionSpeed: Double,
    constructor: js.Any,
    cookieEnabled: Boolean,
    cpuClass: String,
    geolocation: IWebGeolocation,
    javaEnabled: () => Boolean,
    mimeTypes: CMimeTypes,
    msDoNotTrack: String,
    onLine: Boolean,
    opsProfile: COpsProfile,
    platform: String,
    plugins: IHTMLPluginsCollection,
    systemLanguage: String,
    taintEnabled: () => Boolean,
    userAgent: String,
    userLanguage: String,
    userProfile: COpsProfile
  ): HTMLNavigator = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appMinorVersion = appMinorVersion.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], browserLanguage = browserLanguage.asInstanceOf[js.Any], connectionSpeed = connectionSpeed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], cookieEnabled = cookieEnabled.asInstanceOf[js.Any], cpuClass = cpuClass.asInstanceOf[js.Any], geolocation = geolocation.asInstanceOf[js.Any], javaEnabled = js.Any.fromFunction0(javaEnabled), mimeTypes = mimeTypes.asInstanceOf[js.Any], msDoNotTrack = msDoNotTrack.asInstanceOf[js.Any], onLine = onLine.asInstanceOf[js.Any], opsProfile = opsProfile.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], taintEnabled = js.Any.fromFunction0(taintEnabled), userAgent = userAgent.asInstanceOf[js.Any], userLanguage = userLanguage.asInstanceOf[js.Any], userProfile = userProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLNavigator_typekey")(MSHTMLDotHTMLNavigator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLNavigator]
  }
  @scala.inline
  implicit class HTMLNavigatorOps[Self <: HTMLNavigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLNavigator_typekey(value: HTMLNavigator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLNavigator_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppCodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppMinorVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMinorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookieEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpuClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeolocation(value: IWebGeolocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geolocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJavaEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMimeTypes(value: CMimeTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsDoNotTrack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msDoNotTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpsProfile(value: COpsProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opsProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: IHTMLPluginsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaintEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taintEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserProfile(value: COpsProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

