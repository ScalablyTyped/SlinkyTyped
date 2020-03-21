package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.AnonCONNECTED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.Connected
import typingsSlinky.chromeApps.chromeAppsStrings.Connecting
import typingsSlinky.chromeApps.chromeAppsStrings.Disconnected
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinkInfo extends js.Object {
  /** Id of the sink. It is guaranteed to be unique during the browser session. */
  var id: integer
  /** Human readable name of the sink. */
  var name: String
  /**
    * State of the sink.
    * @see SinkState
    */
  var state: ToStringLiteral[AnonCONNECTED, String, Exclude[String, Connected | Connecting | Disconnected]]
}

object SinkInfo {
  @scala.inline
  def apply(
    id: integer,
    name: String,
    state: ToStringLiteral[AnonCONNECTED, String, Exclude[String, Connected | Connecting | Disconnected]]
  ): SinkInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SinkInfo]
  }
}

