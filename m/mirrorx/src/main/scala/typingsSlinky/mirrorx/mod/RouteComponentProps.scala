package typingsSlinky.mirrorx.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.mirrorx.mirrorxStrings.RouteComponentProps with TopLevel[js.Any] */](history: History[LocationState], location: Location[LocationState], `match`: `match`[Params]): RouteComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params]]
  }
  
  @scala.inline
  implicit class RouteComponentPropsOps[Self <: RouteComponentProps[_], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.mirrorx.mirrorxStrings.RouteComponentProps with TopLevel[js.Any] */] (val x: Self with RouteComponentProps[Params]) extends AnyVal {
    
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
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: `match`[Params]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticContext(value: js.Any): Self = this.set("staticContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticContext: Self = this.set("staticContext", js.undefined)
  }
}
