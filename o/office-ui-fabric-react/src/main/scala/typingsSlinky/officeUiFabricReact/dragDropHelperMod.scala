package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragDropHelperMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/dragdrop/DragDropHelper", "DragDropHelper")
  @js.native
  class DragDropHelper protected () extends IDragDropHelper {
    def this(params: IDragDropHelperParams) = this()
    
    var _activeTargets: js.Any = js.native
    
    var _dragData: js.Any = js.native
    
    var _dragEnterCounts: js.Any = js.native
    
    var _events: js.Any = js.native
    
    var _initialized: js.Any = js.native
    
    /**
      * determine whether the child target is a descendant of the parent
      */
    var _isChild: js.Any = js.native
    
    var _isDraggable: js.Any = js.native
    
    var _isDragging: js.Any = js.native
    
    var _isDroppable: js.Any = js.native
    
    var _lastId: js.Any = js.native
    
    /**
      * clear drag data when mouse up outside of the document
      */
    var _onDocumentMouseUp: js.Any = js.native
    
    var _onDragEnd: js.Any = js.native
    
    /**
      * when mouse down on a draggable item, we start to track dragdata.
      */
    var _onMouseDown: js.Any = js.native
    
    /**
      * when mouse leave a target while dragging some items, fire dragleave to the target
      */
    var _onMouseLeave: js.Any = js.native
    
    /**
      * when mouse move over a new drop target while dragging some items,
      * fire dragleave on the old target and fire dragenter to the new target
      * The target will handle style change on dragenter and dragleave events.
      */
    var _onMouseMove: js.Any = js.native
    
    /**
      * clear drag data when mouse up on body
      */
    var _onMouseUp: js.Any = js.native
    
    var _selection: js.Any = js.native
  }
  
  @js.native
  trait IDragDropHelperParams extends StObject {
    
    var minimumPixelsForDrag: js.UndefOr[Double] = js.native
    
    var selection: ISelection[IObjectWithKey] = js.native
  }
  object IDragDropHelperParams {
    
    @scala.inline
    def apply(selection: ISelection[IObjectWithKey]): IDragDropHelperParams = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDragDropHelperParams]
    }
    
    @scala.inline
    implicit class IDragDropHelperParamsMutableBuilder[Self <: IDragDropHelperParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinimumPixelsForDrag(value: Double): Self = StObject.set(x, "minimumPixelsForDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumPixelsForDragUndefined: Self = StObject.set(x, "minimumPixelsForDrag", js.undefined)
      
      @scala.inline
      def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
}
