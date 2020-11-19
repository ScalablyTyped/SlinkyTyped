package typingsSlinky.expoWebBrowser

import typingsSlinky.expoWebBrowser.anon.Message
import typingsSlinky.expoWebBrowser.anon.SkipRedirectCheck
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.cancel
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.dismiss
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.opened
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserAuthSessionResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserCoolDownResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserCustomTabsResults
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserMayInitWithUrlResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserOpenOptions
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WebBrowserWarmUpResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-web-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def coolDownAsync(): js.Promise[WebBrowserCoolDownResult] = js.native
  def coolDownAsync(browserPackage: String): js.Promise[WebBrowserCoolDownResult] = js.native
  
  def dismissAuthSession(): Unit = js.native
  
  def dismissBrowser(): Unit = js.native
  
  def getCustomTabsSupportingBrowsersAsync(): js.Promise[WebBrowserCustomTabsResults] = js.native
  
  def mayInitWithUrlAsync(url: String): js.Promise[WebBrowserMayInitWithUrlResult] = js.native
  def mayInitWithUrlAsync(url: String, browserPackage: String): js.Promise[WebBrowserMayInitWithUrlResult] = js.native
  
  def maybeCompleteAuthSession(): Message = js.native
  def maybeCompleteAuthSession(options: SkipRedirectCheck): Message = js.native
  
  def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[WebBrowserAuthSessionResult] = js.native
  def openAuthSessionAsync(url: String, redirectUrl: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserAuthSessionResult] = js.native
  
  def openBrowserAsync(url: String): js.Promise[WebBrowserResult] = js.native
  def openBrowserAsync(url: String, browserParams: WebBrowserOpenOptions): js.Promise[WebBrowserResult] = js.native
  
  def warmUpAsync(): js.Promise[WebBrowserWarmUpResult] = js.native
  def warmUpAsync(browserPackage: String): js.Promise[WebBrowserWarmUpResult] = js.native
  
  @js.native
  object WebBrowserResultType extends js.Object {
    
    /**
      * iOS only
      */
    val CANCEL: cancel = js.native
    
    /**
      * iOS only
      */
    val DISMISS: dismiss = js.native
    
    /**
      * Android only
      */
    val OPENED: opened = js.native
  }
}
