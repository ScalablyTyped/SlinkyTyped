package typingsSlinky.plottable

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plottable.interactionMod.Interaction
import typingsSlinky.plottable.interfacesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragInteractionMod {
  
  @JSImport("plottable/build/src/interactions/dragInteraction", "Drag")
  @js.native
  class Drag () extends Interaction {
    def this(mouseButton: Double) = this()
    
    var _constrainedToComponent: js.Any = js.native
    
    /* private */ def _doDrag(point: js.Any, event: js.Any): js.Any = js.native
    
    var _dragCallbacks: js.Any = js.native
    
    var _dragEndCallbacks: js.Any = js.native
    
    var _dragOrigin: js.Any = js.native
    
    var _dragStartCallbacks: js.Any = js.native
    
    var _dragging: js.Any = js.native
    
    /* private */ def _endDrag(point: js.Any, event: js.Any): js.Any = js.native
    
    var _mouseButton: js.Any = js.native
    
    var _mouseDispatcher: js.Any = js.native
    
    var _mouseDownCallback: js.Any = js.native
    
    /**
      * Only emit events when the mouseFilter is true for the source mouse
      * events. Use this to define custom filters (e.g. only right click,
      * require shift to be held down, etc.)
      */
    var _mouseFilter: js.Any = js.native
    
    var _mouseMoveCallback: js.Any = js.native
    
    var _mouseUpCallback: js.Any = js.native
    
    /* private */ def _startDrag(point: js.Any, event: js.Any): js.Any = js.native
    
    var _touchDispatcher: js.Any = js.native
    
    var _touchEndCallback: js.Any = js.native
    
    var _touchMoveCallback: js.Any = js.native
    
    var _touchStartCallback: js.Any = js.native
    
    /* private */ def _translateAndConstrain(p: js.Any): js.Any = js.native
    
    /**
      * Gets whether the Drag Interaction constrains Points passed to its
      * callbacks to lie inside its Component.
      *
      * If true, when the user drags outside of the Component, the closest Point
      * inside the Component will be passed to the callback instead of the actual
      * cursor position.
      *
      * @return {boolean}
      */
    def constrainedToComponent(): Boolean = js.native
    /**
      * Sets whether the Drag Interaction constrains Points passed to its
      * callbacks to lie inside its Component.
      *
      * If true, when the user drags outside of the Component, the closest Point
      * inside the Component will be passed to the callback instead of the actual
      * cursor position.
      *
      * @param {boolean}
      * @return {Interactions.Drag} The calling Drag Interaction.
      */
    def constrainedToComponent(constrainedToComponent: Boolean): this.type = js.native
    
    /**
      * Gets the current Mouse Filter. Plottable implements a default Mouse Filter
      * to only Drag on a primary (left) click.
      * @returns {MouseFilter}
      */
    def mouseFilter(): MouseFilter = js.native
    /**
      * Set the current Mouse Filter. DragInteraction will only emit events when
      * the mouseFilter evaluates to true for the source mouse events. Use this
      * to define custom filters (e.g. only right click, requires shift to be
      * held down, etc.)
      *
      * @param {MouseFilter} filter
      * @returns {this}
      */
    def mouseFilter(filter: MouseFilter): this.type = js.native
    
    /**
      * Removes a callback that would be called during dragging.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def offDrag(callback: DragCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when dragging ends.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def offDragEnd(callback: DragCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when dragging starts.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def offDragStart(callback: DragCallback): this.type = js.native
    
    /**
      * Adds a callback to be called during dragging.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def onDrag(callback: DragCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when dragging ends.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def onDragEnd(callback: DragCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when dragging starts.
      *
      * @param {DragCallback} callback
      * @returns {Drag} The calling Drag Interaction.
      */
    def onDragStart(callback: DragCallback): this.type = js.native
  }
  /* static members */
  object Drag {
    
    @JSImport("plottable/build/src/interactions/dragInteraction", "Drag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/interactions/dragInteraction", "Drag._DEFAULT_MOUSE_FILTER")
    @js.native
    def _DEFAULT_MOUSE_FILTER: js.Any = js.native
    @scala.inline
    def _DEFAULT_MOUSE_FILTER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_MOUSE_FILTER")(x.asInstanceOf[js.Any])
  }
  
  type DragCallback = js.Function2[/* start */ Point, /* end */ Point, Unit]
  
  type MouseFilter = js.Function1[/* e */ MouseEvent, Boolean]
}
