package typingsSlinky.chromeDashApps.chrome.audio

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeDashApps.chrome.events.Event
import typingsSlinky.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when sound level changes for an active audio device. */
@JSGlobal("chrome.audio.onLevelChanged")
@js.native
object onLevelChanged
  extends TopLevel[Event[js.Function2[/* deviceId */ String, /* level */ integer, Unit]]]

