package typingsSlinky.nextReactDevOverlay.errorsMod

import typingsSlinky.nextReactDevOverlay.busMod.UnhandledError
import typingsSlinky.nextReactDevOverlay.busMod.UnhandledRejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedErrorEvent extends js.Object {
  var event: UnhandledError | UnhandledRejection
  var id: Double
}

object SupportedErrorEvent {
  @scala.inline
  def apply(event: UnhandledError | UnhandledRejection, id: Double): SupportedErrorEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedErrorEvent]
  }
}

