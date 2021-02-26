package typingsSlinky.detectBrowser

import typingsSlinky.detectBrowser.detectBrowserBooleans.`true`
import typingsSlinky.detectBrowser.detectBrowserStrings.`bot-device`
import typingsSlinky.detectBrowser.detectBrowserStrings.`react-native`
import typingsSlinky.detectBrowser.detectBrowserStrings.browser
import typingsSlinky.detectBrowser.detectBrowserStrings.ios_
import typingsSlinky.detectBrowser.detectBrowserStrings.node
import typingsSlinky.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-browser", "BotInfo")
  @js.native
  class BotInfo ()
    extends DetectedInfo[
          typingsSlinky.detectBrowser.detectBrowserStrings.bot, 
          typingsSlinky.detectBrowser.detectBrowserStrings.bot, 
          Null, 
          Null
        ] {
    
    val bot: `true` = js.native
    
    @JSName("type")
    val type_BotInfo: /* "bot" */ String = js.native
  }
  
  @JSImport("detect-browser", "BrowserInfo")
  @js.native
  class BrowserInfo protected () extends DetectedInfo[browser, Browser, OperatingSystem | Null, String] {
    def this(name: Browser, version: String) = this()
    def this(name: Browser, version: String, os: OperatingSystem) = this()
    
    @JSName("type")
    val type_BrowserInfo: /* "browser" */ String = js.native
  }
  
  @JSImport("detect-browser", "NodeInfo")
  @js.native
  class NodeInfo protected () extends DetectedInfo[node, node, Platform, String] {
    def this(version: String) = this()
    
    @JSName("type")
    val type_NodeInfo: /* "node" */ String = js.native
  }
  
  @JSImport("detect-browser", "ReactNativeInfo")
  @js.native
  class ReactNativeInfo () extends DetectedInfo[`react-native`, `react-native`, Null, Null] {
    
    @JSName("type")
    val type_ReactNativeInfo: /* "react-native" */ String = js.native
  }
  
  @JSImport("detect-browser", "SearchBotDeviceInfo")
  @js.native
  class SearchBotDeviceInfo protected () extends DetectedInfo[`bot-device`, Browser, OperatingSystem | Null, String] {
    def this(name: Browser, version: String, os: Null, bot: String) = this()
    def this(name: Browser, version: String, os: OperatingSystem, bot: String) = this()
    
    val bot: String = js.native
    
    @JSName("type")
    val type_SearchBotDeviceInfo: /* "bot-device" */ String = js.native
  }
  
  @JSImport("detect-browser", "browserName")
  @js.native
  def browserName(ua: String): Browser | Null = js.native
  
  @JSImport("detect-browser", "detect")
  @js.native
  def detect(): BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null = js.native
  @JSImport("detect-browser", "detect")
  @js.native
  def detect(userAgent: String): BrowserInfo | SearchBotDeviceInfo | BotInfo | NodeInfo | ReactNativeInfo | Null = js.native
  
  @JSImport("detect-browser", "detectOS")
  @js.native
  def detectOS(ua: String): OperatingSystem | Null = js.native
  
  @JSImport("detect-browser", "getNodeVersion")
  @js.native
  def getNodeVersion(): NodeInfo | Null = js.native
  
  @JSImport("detect-browser", "parseUserAgent")
  @js.native
  def parseUserAgent(ua: String): BrowserInfo | SearchBotDeviceInfo | BotInfo | Null = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.detectBrowser.detectBrowserStrings.aol
    - typingsSlinky.detectBrowser.detectBrowserStrings.edge
    - typingsSlinky.detectBrowser.detectBrowserStrings.`edge-ios`
    - typingsSlinky.detectBrowser.detectBrowserStrings.yandexbrowser
    - typingsSlinky.detectBrowser.detectBrowserStrings.kakaotalk
    - typingsSlinky.detectBrowser.detectBrowserStrings.samsung
    - typingsSlinky.detectBrowser.detectBrowserStrings.silk
    - typingsSlinky.detectBrowser.detectBrowserStrings.miui
    - typingsSlinky.detectBrowser.detectBrowserStrings.beaker
    - typingsSlinky.detectBrowser.detectBrowserStrings.`edge-chromium`
    - typingsSlinky.detectBrowser.detectBrowserStrings.chrome
    - typingsSlinky.detectBrowser.detectBrowserStrings.`chromium-webview`
    - typingsSlinky.detectBrowser.detectBrowserStrings.phantomjs
    - typingsSlinky.detectBrowser.detectBrowserStrings.crios
    - typingsSlinky.detectBrowser.detectBrowserStrings.firefox
    - typingsSlinky.detectBrowser.detectBrowserStrings.fxios
    - typingsSlinky.detectBrowser.detectBrowserStrings.`opera-mini`
    - typingsSlinky.detectBrowser.detectBrowserStrings.opera
    - typingsSlinky.detectBrowser.detectBrowserStrings.ie
    - typingsSlinky.detectBrowser.detectBrowserStrings.bb10
    - typingsSlinky.detectBrowser.detectBrowserStrings.android
    - typingsSlinky.detectBrowser.detectBrowserStrings.ios_
    - typingsSlinky.detectBrowser.detectBrowserStrings.safari
    - typingsSlinky.detectBrowser.detectBrowserStrings.facebook
    - typingsSlinky.detectBrowser.detectBrowserStrings.instagram
    - typingsSlinky.detectBrowser.detectBrowserStrings.`ios-webview`
    - typingsSlinky.detectBrowser.detectBrowserStrings.searchbot
  */
  trait Browser extends StObject
  object Browser {
    
    @scala.inline
    def android: typingsSlinky.detectBrowser.detectBrowserStrings.android = "android".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.android]
    
    @scala.inline
    def aol: typingsSlinky.detectBrowser.detectBrowserStrings.aol = "aol".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.aol]
    
    @scala.inline
    def bb10: typingsSlinky.detectBrowser.detectBrowserStrings.bb10 = "bb10".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.bb10]
    
    @scala.inline
    def beaker: typingsSlinky.detectBrowser.detectBrowserStrings.beaker = "beaker".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.beaker]
    
    @scala.inline
    def chrome: typingsSlinky.detectBrowser.detectBrowserStrings.chrome = "chrome".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.chrome]
    
    @scala.inline
    def `chromium-webview`: typingsSlinky.detectBrowser.detectBrowserStrings.`chromium-webview` = "chromium-webview".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`chromium-webview`]
    
    @scala.inline
    def crios: typingsSlinky.detectBrowser.detectBrowserStrings.crios = "crios".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.crios]
    
    @scala.inline
    def edge: typingsSlinky.detectBrowser.detectBrowserStrings.edge = "edge".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.edge]
    
    @scala.inline
    def `edge-chromium`: typingsSlinky.detectBrowser.detectBrowserStrings.`edge-chromium` = "edge-chromium".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`edge-chromium`]
    
    @scala.inline
    def `edge-ios`: typingsSlinky.detectBrowser.detectBrowserStrings.`edge-ios` = "edge-ios".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`edge-ios`]
    
    @scala.inline
    def facebook: typingsSlinky.detectBrowser.detectBrowserStrings.facebook = "facebook".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.facebook]
    
    @scala.inline
    def firefox: typingsSlinky.detectBrowser.detectBrowserStrings.firefox = "firefox".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.firefox]
    
    @scala.inline
    def fxios: typingsSlinky.detectBrowser.detectBrowserStrings.fxios = "fxios".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.fxios]
    
    @scala.inline
    def ie: typingsSlinky.detectBrowser.detectBrowserStrings.ie = "ie".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.ie]
    
    @scala.inline
    def instagram: typingsSlinky.detectBrowser.detectBrowserStrings.instagram = "instagram".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.instagram]
    
    @scala.inline
    def ios: ios_ = "ios".asInstanceOf[ios_]
    
    @scala.inline
    def `ios-webview`: typingsSlinky.detectBrowser.detectBrowserStrings.`ios-webview` = "ios-webview".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`ios-webview`]
    
    @scala.inline
    def kakaotalk: typingsSlinky.detectBrowser.detectBrowserStrings.kakaotalk = "kakaotalk".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.kakaotalk]
    
    @scala.inline
    def miui: typingsSlinky.detectBrowser.detectBrowserStrings.miui = "miui".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.miui]
    
    @scala.inline
    def opera: typingsSlinky.detectBrowser.detectBrowserStrings.opera = "opera".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.opera]
    
    @scala.inline
    def `opera-mini`: typingsSlinky.detectBrowser.detectBrowserStrings.`opera-mini` = "opera-mini".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`opera-mini`]
    
    @scala.inline
    def phantomjs: typingsSlinky.detectBrowser.detectBrowserStrings.phantomjs = "phantomjs".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.phantomjs]
    
    @scala.inline
    def safari: typingsSlinky.detectBrowser.detectBrowserStrings.safari = "safari".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.safari]
    
    @scala.inline
    def samsung: typingsSlinky.detectBrowser.detectBrowserStrings.samsung = "samsung".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.samsung]
    
    @scala.inline
    def searchbot: typingsSlinky.detectBrowser.detectBrowserStrings.searchbot = "searchbot".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.searchbot]
    
    @scala.inline
    def silk: typingsSlinky.detectBrowser.detectBrowserStrings.silk = "silk".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.silk]
    
    @scala.inline
    def yandexbrowser: typingsSlinky.detectBrowser.detectBrowserStrings.yandexbrowser = "yandexbrowser".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.yandexbrowser]
  }
  
  @js.native
  trait DetectedInfo[T /* <: DetectedInfoType */, N /* <: String */, O, V] extends StObject {
    
    val name: N = js.native
    
    val os: O = js.native
    
    val `type`: T = js.native
    
    val version: V = js.native
  }
  object DetectedInfo {
    
    @scala.inline
    def apply[T /* <: DetectedInfoType */, N /* <: String */, O, V](name: N, os: O, `type`: T, version: V): DetectedInfo[T, N, O, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedInfo[T, N, O, V]]
    }
    
    @scala.inline
    implicit class DetectedInfoMutableBuilder[Self <: DetectedInfo[_, _, _, _], T /* <: DetectedInfoType */, N /* <: String */, O, V] (val x: Self with (DetectedInfo[T, N, O, V])) extends AnyVal {
      
      @scala.inline
      def setName(value: N): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: O): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: V): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.detectBrowser.detectBrowserStrings.browser
    - typingsSlinky.detectBrowser.detectBrowserStrings.node
    - typingsSlinky.detectBrowser.detectBrowserStrings.`bot-device`
    - typingsSlinky.detectBrowser.detectBrowserStrings.bot
    - typingsSlinky.detectBrowser.detectBrowserStrings.`react-native`
  */
  trait DetectedInfoType extends StObject
  object DetectedInfoType {
    
    @scala.inline
    def bot: typingsSlinky.detectBrowser.detectBrowserStrings.bot = "bot".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.bot]
    
    @scala.inline
    def `bot-device`: typingsSlinky.detectBrowser.detectBrowserStrings.`bot-device` = "bot-device".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`bot-device`]
    
    @scala.inline
    def browser: typingsSlinky.detectBrowser.detectBrowserStrings.browser = "browser".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.browser]
    
    @scala.inline
    def node: typingsSlinky.detectBrowser.detectBrowserStrings.node = "node".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.node]
    
    @scala.inline
    def `react-native`: typingsSlinky.detectBrowser.detectBrowserStrings.`react-native` = "react-native".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`react-native`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.detectBrowser.detectBrowserStrings.iOS
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Android OS`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`BlackBerry OS`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Mobile`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Amazon OS`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 3Dot11`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 95`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 98`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 2000`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows XP`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Server 2003`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Vista`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 7`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 8`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 8Dot1`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 10`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Windows ME`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Open BSD`
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Sun OS`
    - typingsSlinky.detectBrowser.detectBrowserStrings.Linux
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Mac OS`
    - typingsSlinky.detectBrowser.detectBrowserStrings.QNX
    - typingsSlinky.detectBrowser.detectBrowserStrings.BeOS
    - typingsSlinky.detectBrowser.detectBrowserStrings.OSSlash2
    - typingsSlinky.detectBrowser.detectBrowserStrings.`Chrome OS`
  */
  trait OperatingSystem extends StObject
  object OperatingSystem {
    
    @scala.inline
    def `Amazon OS`: typingsSlinky.detectBrowser.detectBrowserStrings.`Amazon OS` = ("Amazon OS").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Amazon OS`]
    
    @scala.inline
    def `Android OS`: typingsSlinky.detectBrowser.detectBrowserStrings.`Android OS` = ("Android OS").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Android OS`]
    
    @scala.inline
    def BeOS: typingsSlinky.detectBrowser.detectBrowserStrings.BeOS = "BeOS".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.BeOS]
    
    @scala.inline
    def `BlackBerry OS`: typingsSlinky.detectBrowser.detectBrowserStrings.`BlackBerry OS` = ("BlackBerry OS").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`BlackBerry OS`]
    
    @scala.inline
    def `Chrome OS`: typingsSlinky.detectBrowser.detectBrowserStrings.`Chrome OS` = ("Chrome OS").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Chrome OS`]
    
    @scala.inline
    def Linux: typingsSlinky.detectBrowser.detectBrowserStrings.Linux = "Linux".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.Linux]
    
    @scala.inline
    def `Mac OS`: typingsSlinky.detectBrowser.detectBrowserStrings.`Mac OS` = ("Mac OS").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Mac OS`]
    
    @scala.inline
    def OSSlash2: typingsSlinky.detectBrowser.detectBrowserStrings.OSSlash2 = "OS/2".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.OSSlash2]
    
    @scala.inline
    def `Open BSD`: typingsSlinky.detectBrowser.detectBrowserStrings.`Open BSD` = ("Open BSD").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Open BSD`]
    
    @scala.inline
    def QNX: typingsSlinky.detectBrowser.detectBrowserStrings.QNX = "QNX".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.QNX]
    
    @scala.inline
    def `Sun OS`: typingsSlinky.detectBrowser.detectBrowserStrings.`Sun OS` = ("Sun OS").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Sun OS`]
    
    @scala.inline
    def `Windows 10`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 10` = ("Windows 10").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 10`]
    
    @scala.inline
    def `Windows 2000`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 2000` = ("Windows 2000").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 2000`]
    
    @scala.inline
    def `Windows 3Dot11`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 3Dot11` = ("Windows 3.11").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 3Dot11`]
    
    @scala.inline
    def `Windows 7`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 7` = ("Windows 7").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 7`]
    
    @scala.inline
    def `Windows 8`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 8` = ("Windows 8").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 8`]
    
    @scala.inline
    def `Windows 8Dot1`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 8Dot1` = ("Windows 8.1").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 8Dot1`]
    
    @scala.inline
    def `Windows 95`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 95` = ("Windows 95").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 95`]
    
    @scala.inline
    def `Windows 98`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 98` = ("Windows 98").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows 98`]
    
    @scala.inline
    def `Windows ME`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows ME` = ("Windows ME").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows ME`]
    
    @scala.inline
    def `Windows Mobile`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Mobile` = ("Windows Mobile").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Mobile`]
    
    @scala.inline
    def `Windows Server 2003`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Server 2003` = ("Windows Server 2003").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Server 2003`]
    
    @scala.inline
    def `Windows Vista`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Vista` = ("Windows Vista").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows Vista`]
    
    @scala.inline
    def `Windows XP`: typingsSlinky.detectBrowser.detectBrowserStrings.`Windows XP` = ("Windows XP").asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.`Windows XP`]
    
    @scala.inline
    def iOS: typingsSlinky.detectBrowser.detectBrowserStrings.iOS = "iOS".asInstanceOf[typingsSlinky.detectBrowser.detectBrowserStrings.iOS]
  }
}
