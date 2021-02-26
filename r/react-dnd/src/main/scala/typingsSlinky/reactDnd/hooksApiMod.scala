package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.Identifier
import typingsSlinky.dndCore.interfacesMod.SourceType
import typingsSlinky.dndCore.interfacesMod.TargetType
import typingsSlinky.reactDnd.monitorsMod.DragSourceMonitor
import typingsSlinky.reactDnd.monitorsMod.DropTargetMonitor
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import typingsSlinky.reactDnd.optionsMod.DragSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksApiMod {
  
  @js.native
  trait DragObjectWithType extends StObject {
    
    var `type`: SourceType = js.native
  }
  object DragObjectWithType {
    
    @scala.inline
    def apply(`type`: SourceType): DragObjectWithType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragObjectWithType]
    }
    
    @scala.inline
    implicit class DragObjectWithTypeMutableBuilder[Self <: DragObjectWithType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DragSourceHookSpec[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps] extends StObject {
    
    /**
      * When the dragging starts, beginDrag is called. If an object is returned from this function it will overide the default dragItem
      */
    var begin: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, js.UndefOr[DragObject | Unit]]] = js.native
    
    /**
      * Optional.
      * Use it to specify whether the dragging is currently allowed. If you want to always allow it, just omit this method.
      * Specifying it is handy if you'd like to disable dragging based on some predicate over props. Note: You may not call
      * monitor.canDrag() inside this method.
      */
    var canDrag: js.UndefOr[Boolean | (js.Function1[/* monitor */ DragSourceMonitor, Boolean])] = js.native
    
    /**
      * A function to collect rendering properties
      */
    var collect: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, CollectedProps]] = js.native
    
    /**
      * Optional.
      * When the dragging stops, endDrag is called. For every beginDrag call, a corresponding endDrag call is guaranteed.
      * You may call monitor.didDrop() to check whether or not the drop was handled by a compatible drop target. If it was handled,
      * and the drop target specified a drop result by returning a plain object from its drop() method, it will be available as
      * monitor.getDropResult(). This method is a good place to fire a Flux action. Note: If the component is unmounted while dragging,
      * component parameter is set to be null.
      */
    var end: js.UndefOr[
        js.Function2[/* draggedItem */ js.UndefOr[DragObject], /* monitor */ DragSourceMonitor, Unit]
      ] = js.native
    
    /**
      * Optional.
      * By default, only the drag source that initiated the drag operation is considered to be dragging. You can
      * override this behavior by defining a custom isDragging method. It might return something like props.id === monitor.getItem().id.
      * Do this if the original component may be unmounted during the dragging and later “resurrected” with a different parent.
      * For example, when moving a card across the lists in a Kanban board, you want it to retain the dragged appearance—even though
      * technically, the component gets unmounted and a different one gets mounted every time you move it to another list.
      *
      * Note: You may not call monitor.isDragging() inside this method.
      */
    var isDragging: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, Boolean]] = js.native
    
    /**
      * A plain javascript item describing the data being dragged.
      * This is the only information available to the drop targets about the drag
      * source so it's important to pick the minimal data they need to know.
      *
      * You may be tempted to put a reference to the component or complex object here,
      * but you shouldx try very hard to avoid doing this because it couples the
      * drag sources and drop targets. It's a good idea to use something like
      * { id: props.id }
      *
      */
    var item: DragObject = js.native
    
    /**
      * The drag source options
      */
    var options: js.UndefOr[DragSourceOptions] = js.native
    
    /**
      * DragPreview options
      */
    var previewOptions: js.UndefOr[DragPreviewOptions] = js.native
  }
  object DragSourceHookSpec {
    
    @scala.inline
    def apply[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](item: DragObject): DragSourceHookSpec[DragObject, DropResult, CollectedProps] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragSourceHookSpec[DragObject, DropResult, CollectedProps]]
    }
    
    @scala.inline
    implicit class DragSourceHookSpecMutableBuilder[Self <: DragSourceHookSpec[_, _, _], DragObject /* <: DragObjectWithType */, DropResult, CollectedProps] (val x: Self with (DragSourceHookSpec[DragObject, DropResult, CollectedProps])) extends AnyVal {
      
      @scala.inline
      def setBegin(value: /* monitor */ DragSourceMonitor => js.UndefOr[DragObject | Unit]): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      @scala.inline
      def setCanDrag(value: Boolean | (js.Function1[/* monitor */ DragSourceMonitor, Boolean])): Self = StObject.set(x, "canDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanDragFunction1(value: /* monitor */ DragSourceMonitor => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
      
      @scala.inline
      def setCollect(value: /* monitor */ DragSourceMonitor => CollectedProps): Self = StObject.set(x, "collect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
      
      @scala.inline
      def setEnd(value: (/* draggedItem */ js.UndefOr[DragObject], /* monitor */ DragSourceMonitor) => Unit): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setIsDragging(value: /* monitor */ DragSourceMonitor => Boolean): Self = StObject.set(x, "isDragging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDraggingUndefined: Self = StObject.set(x, "isDragging", js.undefined)
      
      @scala.inline
      def setItem(value: DragObject): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: DragSourceOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPreviewOptions(value: DragPreviewOptions): Self = StObject.set(x, "previewOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOptionsUndefined: Self = StObject.set(x, "previewOptions", js.undefined)
    }
  }
  
  @js.native
  trait DropTargetHookSpec[DragObject, DropResult, CollectedProps] extends StObject {
    
    /**
      * The kinds of dragItems this dropTarget accepts
      */
    var accept: TargetType = js.native
    
    /**
      * Optional. Use it to specify whether the drop target is able to accept the item. If you want to always allow it, just
      * omit this method. Specifying it is handy if you'd like to disable dropping based on some predicate over props or
      * monitor.getItem(). Note: You may not call monitor.canDrop() inside this method.
      */
    var canDrop: js.UndefOr[js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor, Boolean]] = js.native
    
    /**
      * A function to collect rendering properties
      */
    var collect: js.UndefOr[js.Function1[/* monitor */ DropTargetMonitor, CollectedProps]] = js.native
    
    /**
      * Optional.
      * Called when a compatible item is dropped on the target. You may either return undefined, or a plain object.
      * If you return an object, it is going to become the drop result and will be available to the drag source in its
      * endDrag method as monitor.getDropResult(). This is useful in case you want to perform different actions
      * depending on which target received the drop. If you have nested drop targets, you can test whether a nested
      * target has already handled drop by checking monitor.didDrop() and monitor.getDropResult(). Both this method and
      * the source's endDrag method are good places to fire Flux actions. This method will not be called if canDrop()
      * is defined and returns false.
      */
    var drop: js.UndefOr[
        js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor, js.UndefOr[DropResult]]
      ] = js.native
    
    /**
      * Optional.
      * Called when an item is hovered over the component. You can check monitor.isOver({ shallow: true }) to test whether
      * the hover happens over just the current target, or over a nested one. Unlike drop(), this method will be called even
      * if canDrop() is defined and returns false. You can check monitor.canDrop() to test whether this is the case.
      */
    var hover: js.UndefOr[js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor, Unit]] = js.native
    
    /**
      * The drop target optinos
      */
    var options: js.UndefOr[js.Any] = js.native
  }
  object DropTargetHookSpec {
    
    @scala.inline
    def apply[DragObject, DropResult, CollectedProps](accept: TargetType): DropTargetHookSpec[DragObject, DropResult, CollectedProps] = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropTargetHookSpec[DragObject, DropResult, CollectedProps]]
    }
    
    @scala.inline
    implicit class DropTargetHookSpecMutableBuilder[Self <: DropTargetHookSpec[_, _, _], DragObject, DropResult, CollectedProps] (val x: Self with (DropTargetHookSpec[DragObject, DropResult, CollectedProps])) extends AnyVal {
      
      @scala.inline
      def setAccept(value: TargetType): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptVarargs(value: Identifier*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      @scala.inline
      def setCanDrop(value: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => Boolean): Self = StObject.set(x, "canDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
      
      @scala.inline
      def setCollect(value: /* monitor */ DropTargetMonitor => CollectedProps): Self = StObject.set(x, "collect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
      
      @scala.inline
      def setDrop(value: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => js.UndefOr[DropResult]): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setHover(value: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
