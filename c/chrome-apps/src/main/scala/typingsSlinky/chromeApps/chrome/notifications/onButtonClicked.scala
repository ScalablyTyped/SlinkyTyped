package typingsSlinky.chromeApps.chrome.notifications

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The user pressed a button in the notification. */
@JSGlobal("chrome.notifications.onButtonClicked")
@js.native
object onButtonClicked
  extends TopLevel[Event[js.Function2[/* deviceId */ String, /* level */ integer, Unit]]]

