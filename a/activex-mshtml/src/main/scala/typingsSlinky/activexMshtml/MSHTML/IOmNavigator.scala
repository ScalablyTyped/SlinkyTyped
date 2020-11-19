package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOmNavigator extends js.Object {
  
  @JSName("MSHTML.IOmNavigator_typekey")
  var MSHTMLDotIOmNavigator_typekey: IOmNavigator = js.native
  
  val appCodeName: String = js.native
  
  val appMinorVersion: String = js.native
  
  val appName: String = js.native
  
  val appVersion: String = js.native
  
  val browserLanguage: String = js.native
  
  val connectionSpeed: Double = js.native
  
  val cookieEnabled: Boolean = js.native
  
  val cpuClass: String = js.native
  
  def javaEnabled(): Boolean = js.native
  
  val mimeTypes: CMimeTypes = js.native
  
  val onLine: Boolean = js.native
  
  val opsProfile: COpsProfile = js.native
  
  val platform: String = js.native
  
  val plugins: IHTMLPluginsCollection = js.native
  
  val systemLanguage: String = js.native
  
  def taintEnabled(): Boolean = js.native
  
  val userAgent: String = js.native
  
  val userLanguage: String = js.native
  
  val userProfile: COpsProfile = js.native
}
object IOmNavigator {
  
  @scala.inline
  def apply(
    MSHTMLDotIOmNavigator_typekey: IOmNavigator,
    appCodeName: String,
    appMinorVersion: String,
    appName: String,
    appVersion: String,
    browserLanguage: String,
    connectionSpeed: Double,
    cookieEnabled: Boolean,
    cpuClass: String,
    javaEnabled: () => Boolean,
    mimeTypes: CMimeTypes,
    onLine: Boolean,
    opsProfile: COpsProfile,
    platform: String,
    plugins: IHTMLPluginsCollection,
    systemLanguage: String,
    taintEnabled: () => Boolean,
    userAgent: String,
    userLanguage: String,
    userProfile: COpsProfile
  ): IOmNavigator = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appMinorVersion = appMinorVersion.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], browserLanguage = browserLanguage.asInstanceOf[js.Any], connectionSpeed = connectionSpeed.asInstanceOf[js.Any], cookieEnabled = cookieEnabled.asInstanceOf[js.Any], cpuClass = cpuClass.asInstanceOf[js.Any], javaEnabled = js.Any.fromFunction0(javaEnabled), mimeTypes = mimeTypes.asInstanceOf[js.Any], onLine = onLine.asInstanceOf[js.Any], opsProfile = opsProfile.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], taintEnabled = js.Any.fromFunction0(taintEnabled), userAgent = userAgent.asInstanceOf[js.Any], userLanguage = userLanguage.asInstanceOf[js.Any], userProfile = userProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IOmNavigator_typekey")(MSHTMLDotIOmNavigator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOmNavigator]
  }
  
  @scala.inline
  implicit class IOmNavigatorOps[Self <: IOmNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotIOmNavigator_typekey(value: IOmNavigator): Self = this.set("MSHTML.IOmNavigator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppCodeName(value: String): Self = this.set("appCodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppMinorVersion(value: String): Self = this.set("appMinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserLanguage(value: String): Self = this.set("browserLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSpeed(value: Double): Self = this.set("connectionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieEnabled(value: Boolean): Self = this.set("cookieEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuClass(value: String): Self = this.set("cpuClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaEnabled(value: () => Boolean): Self = this.set("javaEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMimeTypes(value: CMimeTypes): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLine(value: Boolean): Self = this.set("onLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsProfile(value: COpsProfile): Self = this.set("opsProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: IHTMLPluginsCollection): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguage(value: String): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaintEnabled(value: () => Boolean): Self = this.set("taintEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLanguage(value: String): Self = this.set("userLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfile(value: COpsProfile): Self = this.set("userProfile", value.asInstanceOf[js.Any])
  }
}
