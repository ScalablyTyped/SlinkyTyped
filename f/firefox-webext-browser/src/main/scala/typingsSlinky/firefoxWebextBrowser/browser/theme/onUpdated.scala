package typingsSlinky.firefoxWebextBrowser.browser.theme

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* theme events */
/**
  * Fired when a new theme has been applied
  * @param updateInfo Details of the theme update
  */
@JSGlobal("browser.theme.onUpdated")
@js.native
object onUpdated
  extends TopLevel[WebExtEvent[js.Function1[/* updateInfo */ ThemeUpdateInfo, Unit]]]

