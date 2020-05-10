package typingsSlinky.mirrorx.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.mirrorx.mirrorxStrings.RouteComponentProps with TopLevel[js.Any] */] extends js.Object {
  var history: History[LocationState] = js.native
  var location: Location[LocationState] = js.native
  var `match`: typingsSlinky.reactRouter.mod.`match`[Params] = js.native
  var staticContext: js.UndefOr[js.Any] = js.native
}

object RouteComponentProps {
  @scala.inline
  def apply[Params](history: History[LocationState], location: Location[LocationState], `match`: `match`[Params]): RouteComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params]]
  }
  @scala.inline
  implicit class RouteComponentPropsOps[Self[params] <: RouteComponentProps[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withHistory(value: History[LocationState]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location[LocationState]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: `match`[Params]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticContext(value: js.Any): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticContext: Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticContext")(js.undefined)
        ret
    }
  }
  
}

