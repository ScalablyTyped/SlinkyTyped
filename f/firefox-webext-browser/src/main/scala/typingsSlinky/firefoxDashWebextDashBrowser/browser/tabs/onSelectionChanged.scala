package typingsSlinky.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxDashWebextDashBrowser.Anon_WindowIdNumber
import typingsSlinky.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the selected tab in a window changes.
  * @param tabId The ID of the tab that has become active.
  * @deprecated Please use `tabs.onActivated`.
  */
@JSGlobal("browser.tabs.onSelectionChanged")
@js.native
object onSelectionChanged
  extends TopLevel[
      js.UndefOr[
        WebExtEvent[js.Function2[/* tabId */ Double, /* selectInfo */ Anon_WindowIdNumber, Unit]]
      ]
    ]

