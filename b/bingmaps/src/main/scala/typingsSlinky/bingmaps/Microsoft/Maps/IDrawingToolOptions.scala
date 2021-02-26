package typingsSlinky.bingmaps.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDrawingToolOptions extends StObject {
  
  /** Set of buttons to show in the drawing bar */
  var drawingBarActions: js.UndefOr[DrawingBarAction] = js.native
}
object IDrawingToolOptions {
  
  @scala.inline
  def apply(): IDrawingToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawingToolOptions]
  }
  
  @scala.inline
  implicit class IDrawingToolOptionsMutableBuilder[Self <: IDrawingToolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawingBarActions(value: DrawingBarAction): Self = StObject.set(x, "drawingBarActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawingBarActionsUndefined: Self = StObject.set(x, "drawingBarActions", js.undefined)
  }
}
