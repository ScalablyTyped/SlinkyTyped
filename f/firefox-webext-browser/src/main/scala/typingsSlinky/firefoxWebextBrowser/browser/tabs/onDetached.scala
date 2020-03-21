package typingsSlinky.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.AnonOldPosition
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is detached from a window, for example because it is being moved between windows. */
@JSGlobal("browser.tabs.onDetached")
@js.native
object onDetached
  extends TopLevel[
      WebExtEvent[js.Function2[/* tabId */ Double, /* detachInfo */ AnonOldPosition, Unit]]
    ]

