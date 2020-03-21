package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.authentication_required
import typingsSlinky.chromeApps.chromeAppsStrings.disabled_
import typingsSlinky.chromeApps.chromeAppsStrings.initializing
import typingsSlinky.chromeApps.chromeAppsStrings.running
import typingsSlinky.chromeApps.chromeAppsStrings.temporary_unavailable
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  var description: String
  var state: ToStringLiteral[
    AnonAUTHENTICATIONREQUIRED, 
    String, 
    Exclude[
      String, 
      temporary_unavailable | authentication_required | disabled_ | initializing | running
    ]
  ]
}

object AnonState {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      AnonAUTHENTICATIONREQUIRED, 
      String, 
      Exclude[
        String, 
        temporary_unavailable | authentication_required | disabled_ | initializing | running
      ]
    ]
  ): AnonState = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonState]
  }
}

