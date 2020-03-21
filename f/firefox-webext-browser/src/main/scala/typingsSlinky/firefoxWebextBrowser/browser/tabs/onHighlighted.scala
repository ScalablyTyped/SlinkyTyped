package typingsSlinky.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.AnonTabIds
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the highlighted or selected tabs in a window changes. */
@JSGlobal("browser.tabs.onHighlighted")
@js.native
object onHighlighted
  extends TopLevel[WebExtEvent[js.Function1[/* highlightInfo */ AnonTabIds, Unit]]]

