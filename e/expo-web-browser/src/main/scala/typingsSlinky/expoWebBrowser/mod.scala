package typingsSlinky.expoWebBrowser

import typingsSlinky.expoWebBrowser.webBrowserTypesMod.AuthSessionResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.BrowserResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.CoolDownResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.CustomTabsBrowsersResults
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.MayInitWithUrlResult
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.OpenBrowserOptions
import typingsSlinky.expoWebBrowser.webBrowserTypesMod.WarmUpResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-web-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def coolDownAsync(): js.Promise[CoolDownResult] = js.native
  def coolDownAsync(browserPackage: String): js.Promise[CoolDownResult] = js.native
  def dismissAuthSession(): Unit = js.native
  def dismissBrowser(): Unit = js.native
  def getCustomTabsSupportingBrowsersAsync(): js.Promise[CustomTabsBrowsersResults] = js.native
  def mayInitWithUrlAsync(url: String): js.Promise[MayInitWithUrlResult] = js.native
  def mayInitWithUrlAsync(url: String, browserPackage: String): js.Promise[MayInitWithUrlResult] = js.native
  def openAuthSessionAsync(url: String, redirectUrl: String): js.Promise[AuthSessionResult] = js.native
  def openBrowserAsync(url: String): js.Promise[BrowserResult] = js.native
  def openBrowserAsync(url: String, browserParams: OpenBrowserOptions): js.Promise[BrowserResult] = js.native
  def warmUpAsync(): js.Promise[WarmUpResult] = js.native
  def warmUpAsync(browserPackage: String): js.Promise[WarmUpResult] = js.native
}

