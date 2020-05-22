package typingsSlinky.reactRouter.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var history: History[LocationState]
}

object RouterProps {
  @scala.inline
  def apply(history: History[LocationState]): RouterProps = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterProps]
  }
}

