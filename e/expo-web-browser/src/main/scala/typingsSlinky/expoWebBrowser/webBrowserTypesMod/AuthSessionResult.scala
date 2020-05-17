package typingsSlinky.expoWebBrowser.webBrowserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expoWebBrowser.webBrowserTypesMod.RedirectResult
  - typingsSlinky.expoWebBrowser.webBrowserTypesMod.BrowserResult
*/
trait AuthSessionResult extends js.Object

object AuthSessionResult {
  @scala.inline
  implicit def apply(value: BrowserResult): AuthSessionResult = value.asInstanceOf[AuthSessionResult]
  @scala.inline
  implicit def apply(value: RedirectResult): AuthSessionResult = value.asInstanceOf[AuthSessionResult]
}

