package typingsSlinky.expoWebBrowser

import typingsSlinky.expoWebBrowser.anon.Message
import typingsSlinky.expoWebBrowser.anon.SkipRedirectCheck
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserAuthSessionResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserOpenOptions
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoWebBrowserWebMod {
  
  object default {
    
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.dismissAuthSession")
    @js.native
    def dismissAuthSession(): Unit = js.native
    
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.maybeCompleteAuthSession")
    @js.native
    def maybeCompleteAuthSession(hasSkipRedirectCheck: SkipRedirectCheck): Message = js.native
    
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.name")
    @js.native
    val name: String = js.native
    
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.openAuthSessionAsync")
    @js.native
    def openAuthSessionAsync(url: String): js.Promise[WebBrowserAuthSessionResult] = js.native
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.openAuthSessionAsync")
    @js.native
    def openAuthSessionAsync(url: String, redirectUrl: js.UndefOr[scala.Nothing], openOptions: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.openAuthSessionAsync")
    @js.native
    def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = js.native
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.openAuthSessionAsync")
    @js.native
    def openAuthSessionAsync(url: String, redirectUrl: String, openOptions: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
    
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.openBrowserAsync")
    @js.native
    def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = js.native
    @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "default.openBrowserAsync")
    @js.native
    def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = js.native
  }
  
  @JSImport("expo-web-browser/build/ExpoWebBrowser.web", "featureObjectToString")
  @js.native
  def featureObjectToString(features: Record[String, _]): String = js.native
}
