package typingsSlinky.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.AnonTabIds
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the highlighted or selected tabs in a window changes.
  * @deprecated Please use `tabs.onHighlighted`.
  */
@JSGlobal("browser.tabs.onHighlightChanged")
@js.native
object onHighlightChanged
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function1[/* selectInfo */ AnonTabIds, Unit]]]]

