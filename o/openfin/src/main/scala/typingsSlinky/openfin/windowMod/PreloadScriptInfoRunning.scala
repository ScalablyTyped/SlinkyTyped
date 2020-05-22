package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.openfinStrings.`load-failed`
import typingsSlinky.openfin.openfinStrings.`load-started`
import typingsSlinky.openfin.openfinStrings.`load-succeeded`
import typingsSlinky.openfin.openfinStrings.failed
import typingsSlinky.openfin.openfinStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreloadScriptInfoRunning extends js.Object {
  var state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded
}

object PreloadScriptInfoRunning {
  @scala.inline
  def apply(state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): PreloadScriptInfoRunning = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScriptInfoRunning]
  }
}

