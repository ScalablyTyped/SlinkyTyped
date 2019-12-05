package typingsSlinky.firefoxDashWebextDashBrowser.browser.tabs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxDashWebextDashBrowser.Anon_IsWindowClosing
import typingsSlinky.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a tab is closed. */
@JSGlobal("browser.tabs.onRemoved")
@js.native
object onRemoved
  extends TopLevel[
      WebExtEvent[js.Function2[/* tabId */ Double, /* removeInfo */ Anon_IsWindowClosing, Unit]]
    ]

