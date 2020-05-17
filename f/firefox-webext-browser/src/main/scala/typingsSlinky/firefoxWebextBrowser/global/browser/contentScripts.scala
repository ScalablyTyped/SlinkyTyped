package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScript
import typingsSlinky.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Not allowed in: Content scripts, Devtools pages */
@JSGlobal("browser.contentScripts")
@js.native
object contentScripts extends js.Object {
  /* contentScripts functions */
  /** Register a content script programmatically */
  def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript] = js.native
}

