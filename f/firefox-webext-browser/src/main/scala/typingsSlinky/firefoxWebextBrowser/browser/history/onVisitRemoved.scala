package typingsSlinky.firefoxWebextBrowser.browser.history

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.AnonAllHistory
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
  * purged from history.
  */
@JSGlobal("browser.history.onVisitRemoved")
@js.native
object onVisitRemoved
  extends TopLevel[WebExtEvent[js.Function1[/* removed */ AnonAllHistory, Unit]]]

