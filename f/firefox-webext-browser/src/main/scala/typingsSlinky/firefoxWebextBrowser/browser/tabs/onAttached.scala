package typingsSlinky.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.AnonNewPosition
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is attached to a window, for example because it was moved between windows. */
@JSGlobal("browser.tabs.onAttached")
@js.native
object onAttached
  extends TopLevel[
      WebExtEvent[js.Function2[/* tabId */ Double, /* attachInfo */ AnonNewPosition, Unit]]
    ]

