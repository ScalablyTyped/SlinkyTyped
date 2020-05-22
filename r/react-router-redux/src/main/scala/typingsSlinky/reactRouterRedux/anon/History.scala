package typingsSlinky.reactRouterRedux.anon

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  var history: typingsSlinky.history.mod.History[LocationState]
  var location: Location[LocationState]
  var `match`: IsExact
}

object History {
  @scala.inline
  def apply(
    history: typingsSlinky.history.mod.History[LocationState],
    location: Location[LocationState],
    `match`: IsExact
  ): History = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
}

