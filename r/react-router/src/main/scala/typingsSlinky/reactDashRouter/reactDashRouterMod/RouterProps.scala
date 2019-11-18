package typingsSlinky.reactDashRouter.reactDashRouterMod

import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.LocationState
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

