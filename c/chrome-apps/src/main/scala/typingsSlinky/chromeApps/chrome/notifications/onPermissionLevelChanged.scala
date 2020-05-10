package typingsSlinky.chromeApps.chrome.notifications

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user changes the permission level.
  * @since Chrome 32.
  */
@JSGlobal("chrome.notifications.onPermissionLevelChanged")
@js.native
object onPermissionLevelChanged
  extends TopLevel[Event[js.Function1[/* id */ String, Unit]]]

