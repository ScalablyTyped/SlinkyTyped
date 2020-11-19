package typingsSlinky.agGrid

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.agGrid.anon.Column
import typingsSlinky.agGrid.anon.EPopup
import typingsSlinky.agGrid.anon.EventSource
import typingsSlinky.agGrid.anon.KeepWithinBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/widgets/popupService", JSImport.Namespace)
@js.native
object popupServiceMod extends js.Object {
  
  @js.native
  class PopupService () extends js.Object {
    
    var activePopupElements: js.Any = js.native
    
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean, closedCallback: js.UndefOr[scala.Nothing], click: MouseEvent): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean, closedCallback: js.UndefOr[scala.Nothing], click: Touch): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean, closedCallback: js.Function0[Unit]): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean, closedCallback: js.Function0[Unit], click: MouseEvent): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    def addAsModalPopup(eChild: js.Any, closeOnEsc: Boolean, closedCallback: js.Function0[Unit], click: Touch): js.Function1[/* event */ js.UndefOr[js.Any], Unit] = js.native
    
    /* private */ def callPostProcessPopup(
      ePopup: js.Any,
      eventSource: js.Any,
      mouseEvent: js.Any,
      `type`: js.Any,
      column: js.Any,
      rowNode: js.Any
    ): js.Any = js.native
    
    var environment: js.Any = js.native
    
    /* private */ def getPopupParent(): js.Any = js.native
    
    var gridCore: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def isEventFromCurrentPopup(mouseEvent: js.Any, touchEvent: js.Any, eChild: js.Any): js.Any = js.native
    
    /* private */ def isEventSameChainAsOriginalEvent(originalClick: js.Any, mouseEvent: js.Any, touchEvent: js.Any): js.Any = js.native
    
    /* private */ def keepXWithinBounds(params: js.Any, x: js.Any): js.Any = js.native
    
    /* private */ def keepYWithinBounds(params: js.Any, y: js.Any): js.Any = js.native
    
    /* private */ def positionPopup(params: js.Any): js.Any = js.native
    
    def positionPopupForMenu(params: EPopup): Unit = js.native
    
    def positionPopupOverComponent(params: KeepWithinBounds): Unit = js.native
    
    def positionPopupUnderComponent(params: EventSource): Unit = js.native
    
    def positionPopupUnderMouseEvent(params: Column): Unit = js.native
  }
}
