package typingsSlinky.reactRouter.anon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.History with TopLevel[js.Any] */] extends js.Object {
  var history: typingsSlinky.history.mod.History[LocationState] = js.native
  var route: Location[Params] = js.native
}

object History {
  @scala.inline
  def apply[Params](history: typingsSlinky.history.mod.History[LocationState], route: Location[Params]): History[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[History[Params]]
  }
  @scala.inline
  implicit class HistoryOps[Self[params] <: History[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withHistory(value: typingsSlinky.history.mod.History[LocationState]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoute(value: Location[Params]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

