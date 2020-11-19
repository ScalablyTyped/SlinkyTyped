package typingsSlinky.plottable

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.plottable.interactionMod.Interaction
import typingsSlinky.plottable.interfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/interactions/clickInteraction", JSImport.Namespace)
@js.native
object clickInteractionMod extends js.Object {
  
  @js.native
  class Click () extends Interaction {
    
    var _clickedDown: js.Any = js.native
    
    var _clickedPoint: js.Any = js.native
    
    var _dblClickCallback: js.Any = js.native
    
    var _doubleClicking: js.Any = js.native
    
    /* private */ def _handleClickDown(p: js.Any, event: js.Any): js.Any = js.native
    
    /* private */ def _handleClickUp(p: js.Any, event: js.Any): js.Any = js.native
    
    /* private */ def _handleDblClick(p: js.Any, event: js.Any): js.Any = js.native
    
    var _mouseDispatcher: js.Any = js.native
    
    /**
      * Note: we bind to mousedown, mouseup, touchstart and touchend because browsers
      * have a 300ms delay between touchstart and click to allow for scrolling cancelling etc.
      */
    var _mouseDownCallback: js.Any = js.native
    
    var _mouseUpCallback: js.Any = js.native
    
    var _onClickCallbacks: js.Any = js.native
    
    var _onDoubleClickCallbacks: js.Any = js.native
    
    var _touchCancelCallback: js.Any = js.native
    
    var _touchDispatcher: js.Any = js.native
    
    var _touchEndCallback: js.Any = js.native
    
    var _touchStartCallback: js.Any = js.native
    
    /**
      * Removes a callback that would be called when the Component is clicked.
      *
      * @param {ClickCallback} callback
      * @return {Interactions.Click} The calling Click Interaction.
      */
    def offClick(callback: ClickCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the Component is double-clicked.
      *
      * @param {ClickCallback} callback
      * @return {Interactions.Click} The calling Click Interaction.
      */
    def offDoubleClick(callback: ClickCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the Component is clicked.
      *
      * @param {ClickCallback} callback
      * @return {Interactions.Click} The calling Click Interaction.
      */
    def onClick(callback: ClickCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the Component is double-clicked.
      *
      * @param {ClickCallback} callback
      * @return {Interactions.Click} The calling Click Interaction.
      */
    def onDoubleClick(callback: ClickCallback): this.type = js.native
  }
  /* static members */
  @js.native
  object Click extends js.Object {
    
    /* private */ def _pointsEqual(p1: js.Any, p2: js.Any): js.Any = js.native
  }
  
  type ClickCallback = js.Function2[/* point */ Point, /* event */ MouseEvent | TouchEvent, Unit]
}
