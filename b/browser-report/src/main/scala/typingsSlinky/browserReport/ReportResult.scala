package typingsSlinky.browserReport

import typingsSlinky.browserReport.anon.City
import typingsSlinky.browserReport.anon.Colors
import typingsSlinky.browserReport.anon.Layout
import typingsSlinky.browserReport.anon.Name
import typingsSlinky.browserReport.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportResult extends StObject {
  
  var browser: Name = js.native
  
  var cookies: Boolean = js.native
  
  var country: City = js.native
  
  var flash: Version = js.native
  
  var ip: String = js.native
  
  @JSName("java")
  var java_ : Version = js.native
  
  var lang: js.Array[String] = js.native
  
  var os: Name = js.native
  
  var screen: Colors = js.native
  
  var scripts: Boolean = js.native
  
  var timestamp: String = js.native
  
  var userAgent: String = js.native
  
  var viewport: Layout = js.native
  
  var websockets: Boolean = js.native
}
object ReportResult {
  
  @scala.inline
  def apply(
    browser: Name,
    cookies: Boolean,
    country: City,
    flash: Version,
    ip: String,
    java_ : Version,
    lang: js.Array[String],
    os: Name,
    screen: Colors,
    scripts: Boolean,
    timestamp: String,
    userAgent: String,
    viewport: Layout,
    websockets: Boolean
  ): ReportResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], websockets = websockets.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportResult]
  }
  
  @scala.inline
  implicit class ReportResultMutableBuilder[Self <: ReportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser(value: Name): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: City): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash(value: Version): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJava_(value: Version): Self = StObject.set(x, "java", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: js.Array[String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangVarargs(value: String*): Self = StObject.set(x, "lang", js.Array(value :_*))
    
    @scala.inline
    def setOs(value: Name): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: Colors): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: Layout): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsockets(value: Boolean): Self = StObject.set(x, "websockets", value.asInstanceOf[js.Any])
  }
}
