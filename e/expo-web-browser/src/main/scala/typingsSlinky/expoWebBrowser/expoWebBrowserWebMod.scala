package typingsSlinky.expoWebBrowser

import typingsSlinky.expoWebBrowser.anon.Message
import typingsSlinky.expoWebBrowser.anon.SkipRedirectCheck
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserAuthSessionResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserOpenOptions
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-web-browser/build/ExpoWebBrowser.web", JSImport.Namespace)
@js.native
object expoWebBrowserWebMod extends js.Object {
  
  def featureObjectToString(features: Record[String, _]): String = js.native
  
  @js.native
  object default extends js.Object {
    
    def dismissAuthSession(): Unit = js.native
    
    def maybeCompleteAuthSession(hasSkipRedirectCheck: SkipRedirectCheck): Message = js.native
    
    val name: String = js.native
    
    def openAuthSessionAsync(url: String): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openAuthSessionAsync(url: String, redirectUrl: js.UndefOr[scala.Nothing], openOptions: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = js.native
    def openAuthSessionAsync(url: String, redirectUrl: String, openOptions: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
    
    def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = js.native
    def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = js.native
  }
}
