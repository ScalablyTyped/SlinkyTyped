package typingsSlinky.reactRouter.anon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.History with TopLevel[js.Any] */] extends js.Object {
  var history: typingsSlinky.history.mod.History[LocationState]
  var route: Location[Params]
}

object History {
  @scala.inline
  def apply[Params](history: typingsSlinky.history.mod.History[LocationState], route: Location[Params]): History[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[History[Params]]
  }
}

