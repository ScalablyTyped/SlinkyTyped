package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOmNavigator extends StObject {
  
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
  implicit class IOmNavigatorMutableBuilder[Self <: IOmNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppCodeName(value: String): Self = StObject.set(x, "appCodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppMinorVersion(value: String): Self = StObject.set(x, "appMinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserLanguage(value: String): Self = StObject.set(x, "browserLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSpeed(value: Double): Self = StObject.set(x, "connectionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieEnabled(value: Boolean): Self = StObject.set(x, "cookieEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuClass(value: String): Self = StObject.set(x, "cpuClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaEnabled(value: () => Boolean): Self = StObject.set(x, "javaEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotIOmNavigator_typekey(value: IOmNavigator): Self = StObject.set(x, "MSHTML.IOmNavigator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypes(value: CMimeTypes): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLine(value: Boolean): Self = StObject.set(x, "onLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsProfile(value: COpsProfile): Self = StObject.set(x, "opsProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: IHTMLPluginsCollection): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguage(value: String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaintEnabled(value: () => Boolean): Self = StObject.set(x, "taintEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLanguage(value: String): Self = StObject.set(x, "userLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfile(value: COpsProfile): Self = StObject.set(x, "userProfile", value.asInstanceOf[js.Any])
  }
}
