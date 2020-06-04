package typingsSlinky.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.RouteComponentProps with TopLevel[js.Any] */, C /* <: StaticContext */, S] extends js.Object {
  var history: History[S]
  var location: Location[S]
  var `match`: typingsSlinky.reactRouter.mod.`match`[Params]
  var staticContext: js.UndefOr[C] = js.undefined
}

object RouteComponentProps {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typingsSlinky.reactRouter.reactRouterStrings.RouteComponentProps with org.scalablytyped.runtime.TopLevel[js.Any] */ Params, /* <: typingsSlinky.reactRouter.mod.StaticContext */ C, S](history: History[S], location: Location[S], `match`: `match`[Params]): RouteComponentProps[Params, C, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params, C, S]]
  }
  @scala.inline
  implicit class RouteComponentPropsOps[Self <: RouteComponentProps[_, _, _], /* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typingsSlinky.reactRouter.reactRouterStrings.RouteComponentProps with org.scalablytyped.runtime.TopLevel[js.Any] */ Params, /* <: typingsSlinky.reactRouter.mod.StaticContext */ C, S] (val x: Self with (RouteComponentProps[Params, C, S])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHistory(value: History[S]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location[S]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: `match`[Params]): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticContext(value: C): Self = this.set("staticContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticContext: Self = this.set("staticContext", js.undefined)
  }
  
}

