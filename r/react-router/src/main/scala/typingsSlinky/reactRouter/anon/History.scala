package typingsSlinky.reactRouter.anon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait History[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.History with TopLevel[js.Any] */] extends js.Object {
  
  var history: typingsSlinky.history.mod.History[LocationState] = js.native
  
  var route: Location[Params] = js.native
}
object History {
  
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.History with TopLevel[js.Any] */](history: typingsSlinky.history.mod.History[LocationState], route: Location[Params]): History[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[History[Params]]
  }
  
  @scala.inline
  implicit class HistoryOps[Self <: History[_], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.History with TopLevel[js.Any] */] (val x: Self with History[Params]) extends AnyVal {
    
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
    def setHistory(value: typingsSlinky.history.mod.History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: Location[Params]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
}
