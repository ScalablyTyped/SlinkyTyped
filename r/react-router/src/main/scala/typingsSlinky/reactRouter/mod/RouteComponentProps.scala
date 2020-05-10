package typingsSlinky.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.RouteComponentProps with TopLevel[js.Any] */, C /* <: StaticContext */, S] extends js.Object {
  var history: History[S] = js.native
  var location: Location[S] = js.native
  var `match`: typingsSlinky.reactRouter.mod.`match`[Params] = js.native
  var staticContext: js.UndefOr[C] = js.native
}

object RouteComponentProps {
  @scala.inline
  def apply[Params, C, S](history: History[S], location: Location[S], `match`: `match`[Params]): RouteComponentProps[Params, C, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params, C, S]]
  }
  @scala.inline
  implicit class RouteComponentPropsOps[Self[params, c, s] <: RouteComponentProps[params, c, s], Params, C, S] (val x: Self[Params, C, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params, C, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params, C, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Params, C, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Params, C, S]) with Other]
    @scala.inline
    def withHistory(value: History[S]): Self[Params, C, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location[S]): Self[Params, C, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: `match`[Params]): Self[Params, C, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticContext(value: C): Self[Params, C, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticContext: Self[Params, C, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticContext")(js.undefined)
        ret
    }
  }
  
}

