package typingsSlinky.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteChildrenProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.RouteChildrenProps with TopLevel[js.Any] */, S] extends js.Object {
  var history: History[LocationState] = js.native
  var location: Location[S] = js.native
  var `match`: typingsSlinky.reactRouter.mod.`match`[Params] | Null = js.native
}

object RouteChildrenProps {
  @scala.inline
  def apply[Params, S](history: History[LocationState], location: Location[S]): RouteChildrenProps[Params, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteChildrenProps[Params, S]]
  }
  @scala.inline
  implicit class RouteChildrenPropsOps[Self[params, s] <: RouteChildrenProps[params, s], Params, S] (val x: Self[Params, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Params, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Params, S]) with Other]
    @scala.inline
    def withHistory(value: History[LocationState]): Self[Params, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location[S]): Self[Params, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: `match`[Params]): Self[Params, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchNull: Self[Params, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(null)
        ret
    }
  }
  
}

