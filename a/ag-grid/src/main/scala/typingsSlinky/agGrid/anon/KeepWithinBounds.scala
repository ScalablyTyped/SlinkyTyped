package typingsSlinky.agGrid.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepWithinBounds extends StObject {
  
  var column: typingsSlinky.agGrid.columnMod.Column = js.native
  
  var ePopup: HTMLElement = js.native
  
  var eventSource: HTMLElement = js.native
  
  var keepWithinBounds: js.UndefOr[Boolean] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var nudgeX: js.UndefOr[Double] = js.native
  
  var nudgeY: js.UndefOr[Double] = js.native
  
  var rowNode: RowNode = js.native
  
  var `type`: String = js.native
}
object KeepWithinBounds {
  
  @scala.inline
  def apply(
    column: typingsSlinky.agGrid.columnMod.Column,
    ePopup: HTMLElement,
    eventSource: HTMLElement,
    rowNode: RowNode,
    `type`: String
  ): KeepWithinBounds = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepWithinBounds]
  }
  
  @scala.inline
  implicit class KeepWithinBoundsMutableBuilder[Self <: KeepWithinBounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: typingsSlinky.agGrid.columnMod.Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEPopup(value: HTMLElement): Self = StObject.set(x, "ePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSource(value: HTMLElement): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepWithinBounds(value: Boolean): Self = StObject.set(x, "keepWithinBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepWithinBoundsUndefined: Self = StObject.set(x, "keepWithinBounds", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setNudgeX(value: Double): Self = StObject.set(x, "nudgeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNudgeXUndefined: Self = StObject.set(x, "nudgeX", js.undefined)
    
    @scala.inline
    def setNudgeY(value: Double): Self = StObject.set(x, "nudgeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNudgeYUndefined: Self = StObject.set(x, "nudgeY", js.undefined)
    
    @scala.inline
    def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
