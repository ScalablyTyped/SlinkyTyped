package typingsSlinky.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an update for the browser is available, but isn't installed immediately because a browser restart is
  * required.
  * @deprecated Please use `runtime.onRestartRequired`.
  */
@JSGlobal("browser.runtime.onBrowserUpdateAvailable")
@js.native
object onBrowserUpdateAvailable
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function0[Unit]]]]

