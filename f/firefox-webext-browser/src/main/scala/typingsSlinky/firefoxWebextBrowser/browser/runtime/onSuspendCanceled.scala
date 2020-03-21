package typingsSlinky.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sent after onSuspend to indicate that the app won't be unloaded after all.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.runtime.onSuspendCanceled")
@js.native
object onSuspendCanceled
  extends TopLevel[js.UndefOr[WebExtEvent[js.Function0[Unit]]]]

