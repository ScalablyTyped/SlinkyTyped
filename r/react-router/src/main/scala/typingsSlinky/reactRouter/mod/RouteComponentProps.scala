package typingsSlinky.reactRouter.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.RouteComponentProps with js.Any */, C /* <: StaticContext */, S] extends js.Object {
  var history: History[S]
  var location: Location[S]
  var `match`: typingsSlinky.reactRouter.mod.`match`[Params]
  var staticContext: js.UndefOr[C] = js.undefined
}

object RouteComponentProps {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.RouteComponentProps with js.Any */, C /* <: StaticContext */, S](history: History[S], location: Location[S], `match`: `match`[Params], staticContext: C = null): RouteComponentProps[Params, C, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params, C, S]]
  }
}

