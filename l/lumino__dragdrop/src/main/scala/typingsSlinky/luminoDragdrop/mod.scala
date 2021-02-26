package typingsSlinky.luminoDragdrop

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.luminoCoreutils.mod.MimeData
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoDragdrop.mod.Drag.IOptions
import typingsSlinky.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/dragdrop", "Drag")
  @js.native
  class Drag protected () extends IDisposable {
    /**
      * Construct a new drag object.
      *
      * @param options - The options for initializing the drag.
      */
    def this(options: IOptions) = this()
    
    /**
      * Add the document event listeners for the drag object.
      */
    var _addListeners: js.Any = js.native
    
    /**
      * Attach the drag image element at the specified location.
      *
      * This is a no-op if there is no drag image element.
      */
    var _attachDragImage: js.Any = js.native
    
    var _currentElement: js.Any = js.native
    
    var _currentTarget: js.Any = js.native
    
    /**
      * Detach the drag image element from the DOM.
      *
      * This is a no-op if there is no drag image element.
      */
    var _detachDragImage: js.Any = js.native
    
    var _disposed: js.Any = js.native
    
    var _dropAction: js.Any = js.native
    
    /**
      * Handle the `'keydown'` event for the drag object.
      */
    var _evtKeyDown: js.Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the drag object.
      */
    var _evtMouseMove: js.Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the drag object.
      */
    var _evtMouseUp: js.Any = js.native
    
    /**
      * Finalize the drag operation and resolve the drag promise.
      */
    var _finalize: js.Any = js.native
    
    /**
      * The scroll loop handler function.
      */
    var _onScrollFrame: js.Any = js.native
    
    var _override: js.Any = js.native
    
    var _promise: js.Any = js.native
    
    /**
      * Remove the document event listeners for the drag object.
      */
    var _removeListeners: js.Any = js.native
    
    var _resolve: js.Any = js.native
    
    var _scrollTarget: js.Any = js.native
    
    /**
      * Set the internal drop action state and update the drag cursor.
      */
    var _setDropAction: js.Any = js.native
    
    /**
      * Update the current target node using the given mouse event.
      */
    var _updateCurrentTarget: js.Any = js.native
    
    /**
      * Update the drag scroll element under the mouse.
      */
    var _updateDragScroll: js.Any = js.native
    
    /**
      * The drag image element for the drag object.
      */
    val dragImage: HTMLElement | Null = js.native
    
    /**
      * Handle the DOM events for the drag operation.
      *
      * @param event - The DOM event sent to the drag object.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the document. It should not be
      * called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The mime data for the drag object.
      */
    val mimeData: MimeData = js.native
    
    /**
      * Move the drag image element to the specified location.
      *
      * This is a no-op if there is no drag image element.
      */
    /* protected */ def moveDragImage(clientX: Double, clientY: Double): Unit = js.native
    
    /**
      * The proposed drop action for the drag object.
      */
    val proposedAction: DropAction = js.native
    
    /**
      * Get the drag source for the drag object.
      */
    val source: js.Any = js.native
    
    /**
      * Start the drag operation at the specified client position.
      *
      * @param clientX - The client X position for the drag start.
      *
      * @param clientY - The client Y position for the drag start.
      *
      * @returns A promise which resolves to the result of the drag.
      *
      * #### Notes
      * If the drag has already been started, the promise created by the
      * first call to `start` is returned.
      *
      * If the drag operation has ended, or if the drag object has been
      * disposed, the returned promise will resolve to `'none'`.
      *
      * The drag object will be automatically disposed when drag operation
      * completes. This means `Drag` objects are for single-use only.
      *
      * This method assumes the left mouse button is already held down.
      */
    def start(clientX: Double, clientY: Double): js.Promise[DropAction] = js.native
    
    /**
      * The supported drop actions for the drag object.
      */
    val supportedActions: SupportedActions = js.native
  }
  object Drag {
    
    /**
      * Override the cursor icon for the entire document.
      *
      * @param cursor - The string representing the cursor style.
      *
      * @returns A disposable which will clear the override when disposed.
      *
      * #### Notes
      * The most recent call to `overrideCursor` takes precedence.
      * Disposing an old override has no effect on the current override.
      *
      * This utility function is used by the `Drag` class to override the
      * mouse cursor during a drag-drop operation, but it can also be used
      * by other classes to fix the cursor icon during normal mouse drags.
      *
      * #### Example
      * ```typescript
      * import { Drag } from '@lumino/dragdrop';
      *
      * // Force the cursor to be 'wait' for the entire document.
      * let override = Drag.overrideCursor('wait');
      *
      * // Clear the override by disposing the return value.
      * override.dispose();
      * ```
      */
    @JSImport("@lumino/dragdrop", "Drag.overrideCursor")
    @js.native
    def overrideCursor(cursor: String): IDisposable = js.native
    
    /**
      * An options object for initializing a `Drag` object.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * An optional drag image which follows the mouse cursor.
        *
        * #### Notes
        * The drag image can be any DOM element. It is not limited to
        * image or canvas elements as with the native drag-drop APIs.
        *
        * If provided, this will be positioned at the mouse cursor on each
        * mouse move event. A CSS transform can be used to offset the node
        * from its specified position.
        *
        * The drag image will automatically have the `lm-mod-drag-image`
        * class name added.
        *
        * The default value is `null`.
        */
      var dragImage: js.UndefOr[HTMLElement] = js.native
      
      /**
        * The populated mime data for the drag operation.
        */
      var mimeData: MimeData = js.native
      
      /**
        * The optional proposed drop action for the drag operation.
        *
        * #### Notes
        * This can be provided as a hint to the drop targets as to which
        * drop action is preferred.
        *
        * The default value is `'copy'`.
        */
      var proposedAction: js.UndefOr[DropAction] = js.native
      
      /**
        * An optional object which indicates the source of the drag.
        *
        * #### Notes
        * For advanced applications, the drag initiator may wish to expose
        * a source object to the drop targets. That object can be specified
        * here and will be carried along with the drag events.
        *
        * The default value is `null`.
        */
      var source: js.UndefOr[js.Any] = js.native
      
      /**
        * The drop actions supported by the drag initiator.
        *
        * #### Notes
        * A drop target must indicate that it intends to perform one of the
        * supported actions in order to receive a drop event. However, it is
        * not required to *actually* perform that action when handling the
        * drop event. Therefore, the initiator must be prepared to handle
        * any drop action performed by a drop target.
        *
        * The default value is `'all'`.
        */
      var supportedActions: js.UndefOr[SupportedActions] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(mimeData: MimeData): IOptions = {
        val __obj = js.Dynamic.literal(mimeData = mimeData.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDragImage(value: HTMLElement): Self = StObject.set(x, "dragImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDragImageUndefined: Self = StObject.set(x, "dragImage", js.undefined)
        
        @scala.inline
        def setMimeData(value: MimeData): Self = StObject.set(x, "mimeData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProposedAction(value: DropAction): Self = StObject.set(x, "proposedAction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProposedActionUndefined: Self = StObject.set(x, "proposedAction", js.undefined)
        
        @scala.inline
        def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setSupportedActions(value: SupportedActions): Self = StObject.set(x, "supportedActions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSupportedActionsUndefined: Self = StObject.set(x, "supportedActions", js.undefined)
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.none
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.copy
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.link
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.move
  */
  trait DropAction extends StObject
  object DropAction {
    
    @scala.inline
    def copy: typingsSlinky.luminoDragdrop.luminoDragdropStrings.copy = "copy".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.copy]
    
    @scala.inline
    def link: typingsSlinky.luminoDragdrop.luminoDragdropStrings.link = "link".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.link]
    
    @scala.inline
    def move: typingsSlinky.luminoDragdrop.luminoDragdropStrings.move = "move".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.move]
    
    @scala.inline
    def none: typingsSlinky.luminoDragdrop.luminoDragdropStrings.none = "none".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.none]
  }
  
  @js.native
  trait IDragEvent extends MouseEvent {
    
    /**
      * The drop action supported or taken by the drop target.
      *
      * #### Notes
      * At the start of each event, this value will be `'none'`. During a
      * `'lm-dragover'` event, the drop target must set this value to one
      * of the supported actions, or the drop event will not occur.
      *
      * When handling the drop event, the drop target should set this
      * to the action which was *actually* taken. This value will be
      * reported back to the drag initiator.
      */
    var dropAction: DropAction = js.native
    
    /**
      * The mime data associated with the event.
      *
      * #### Notes
      * This is mime data provided by the drag initiator. Drop targets
      * should use this data to determine if they can handle the drop.
      */
    val mimeData: MimeData = js.native
    
    /**
      * The drop action proposed by the drag initiator.
      *
      * #### Notes
      * This is the action which is *preferred* by the drag initiator. The
      * drop target is not required to perform this action, but should if
      * it all possible.
      */
    val proposedAction: DropAction = js.native
    
    /**
      * The source object of the drag, as provided by the drag initiator.
      *
      * #### Notes
      * For advanced applications, the drag initiator may wish to expose
      * a source object to the drop targets. That will be provided here
      * if given by the drag initiator, otherwise it will be `null`.
      */
    val source: js.Any = js.native
    
    /**
      * The drop actions supported by the drag initiator.
      *
      * #### Notes
      * If the `dropAction` is not set to one of the supported actions
      * during the `'lm-dragover'` event, the drop event will not occur.
      */
    val supportedActions: SupportedActions = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.`copy-link`
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.`copy-move`
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.`link-move`
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.all
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.none
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.copy
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.link
    - typingsSlinky.luminoDragdrop.luminoDragdropStrings.move
  */
  trait SupportedActions extends StObject
  object SupportedActions {
    
    @scala.inline
    def all: typingsSlinky.luminoDragdrop.luminoDragdropStrings.all = "all".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.all]
    
    @scala.inline
    def copy: typingsSlinky.luminoDragdrop.luminoDragdropStrings.copy = "copy".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.copy]
    
    @scala.inline
    def `copy-link`: typingsSlinky.luminoDragdrop.luminoDragdropStrings.`copy-link` = "copy-link".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.`copy-link`]
    
    @scala.inline
    def `copy-move`: typingsSlinky.luminoDragdrop.luminoDragdropStrings.`copy-move` = "copy-move".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.`copy-move`]
    
    @scala.inline
    def link: typingsSlinky.luminoDragdrop.luminoDragdropStrings.link = "link".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.link]
    
    @scala.inline
    def `link-move`: typingsSlinky.luminoDragdrop.luminoDragdropStrings.`link-move` = "link-move".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.`link-move`]
    
    @scala.inline
    def move: typingsSlinky.luminoDragdrop.luminoDragdropStrings.move = "move".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.move]
    
    @scala.inline
    def none: typingsSlinky.luminoDragdrop.luminoDragdropStrings.none = "none".asInstanceOf[typingsSlinky.luminoDragdrop.luminoDragdropStrings.none]
  }
}
