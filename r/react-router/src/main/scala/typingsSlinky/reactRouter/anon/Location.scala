package typingsSlinky.reactRouter.anon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.Location with TopLevel[js.Any] */] extends js.Object {
  var location: typingsSlinky.history.mod.Location[LocationState]
  var `match`: typingsSlinky.reactRouter.mod.`match`[Params]
}

object Location {
  @scala.inline
  def apply[Params](location: typingsSlinky.history.mod.Location[LocationState], `match`: `match`[Params]): Location[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location[Params]]
  }
}

