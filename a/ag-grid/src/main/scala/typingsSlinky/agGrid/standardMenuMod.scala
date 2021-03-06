package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.iMenuFactoryMod.IMenuFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standardMenuMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/standardMenu", "StandardMenuFactory")
  @js.native
  class StandardMenuFactory () extends IMenuFactory {
    
    var eventService: js.Any = js.native
    
    var filterManager: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var hidePopup: js.Any = js.native
    
    var popupService: js.Any = js.native
    
    def showPopup(column: Column, positionCallback: js.Function1[/* eMenu */ HTMLElement, Unit]): Unit = js.native
  }
}
