package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkOptionsVisit[NodeType /* <: CssNode */] extends StObject {
  
  var enter: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.native
  
  var leave: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any = js.native
}
object WalkOptionsVisit {
  
  @scala.inline
  def apply[NodeType /* <: CssNode */](
    visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
  ): WalkOptionsVisit[NodeType] = {
    val __obj = js.Dynamic.literal(visit = visit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkOptionsVisit[NodeType]]
  }
  
  @scala.inline
  implicit class WalkOptionsVisitMutableBuilder[Self <: WalkOptionsVisit[_], NodeType /* <: CssNode */] (val x: Self with WalkOptionsVisit[NodeType]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: EnterOrLeaveFn[NodeType]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setLeave(value: EnterOrLeaveFn[NodeType]): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setVisit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
    ): Self = StObject.set(x, "visit", value.asInstanceOf[js.Any])
  }
}
