package typingsSlinky.leafletDraw.mod

import typingsSlinky.leafletDraw.anon.Cancel
import typingsSlinky.leafletDraw.anon.Circle
import typingsSlinky.leafletDraw.anon.Error
import typingsSlinky.leafletDraw.anon.Radius
import typingsSlinky.leafletDraw.anon.TooltipCont
import typingsSlinky.leafletDraw.anon.TooltipEnd
import typingsSlinky.leafletDraw.anon.TooltipText
import typingsSlinky.leafletDraw.anon.TooltipTextString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localization {
  
  @js.native
  trait Action extends StObject {
    
    var text: String = js.native
    
    var title: String = js.native
  }
  object Action {
    
    @scala.inline
    def apply(text: String, title: String): Action = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Draw extends StObject {
    
    var handlers: DrawHandlers = js.native
    
    var toolbar: typingsSlinky.leafletDraw.mod.Localization.DrawToolbar = js.native
  }
  object Draw {
    
    @scala.inline
    def apply(handlers: DrawHandlers, toolbar: typingsSlinky.leafletDraw.mod.Localization.DrawToolbar): typingsSlinky.leafletDraw.mod.Localization.Draw = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.leafletDraw.mod.Localization.Draw]
    }
    
    @scala.inline
    implicit class DrawMutableBuilder[Self <: typingsSlinky.leafletDraw.mod.Localization.Draw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: DrawHandlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbar(value: typingsSlinky.leafletDraw.mod.Localization.DrawToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DrawHandlers extends StObject {
    
    var circle: Radius = js.native
    
    var circlemarker: typingsSlinky.leafletDraw.anon.Tooltip = js.native
    
    var marker: typingsSlinky.leafletDraw.anon.Tooltip = js.native
    
    var polygon: TooltipCont = js.native
    
    var polyline: Error = js.native
    
    var rectangle: typingsSlinky.leafletDraw.anon.Tooltip = js.native
    
    var simpleshape: TooltipEnd = js.native
  }
  object DrawHandlers {
    
    @scala.inline
    def apply(
      circle: Radius,
      circlemarker: typingsSlinky.leafletDraw.anon.Tooltip,
      marker: typingsSlinky.leafletDraw.anon.Tooltip,
      polygon: TooltipCont,
      polyline: Error,
      rectangle: typingsSlinky.leafletDraw.anon.Tooltip,
      simpleshape: TooltipEnd
    ): DrawHandlers = {
      val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], simpleshape = simpleshape.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawHandlers]
    }
    
    @scala.inline
    implicit class DrawHandlersMutableBuilder[Self <: DrawHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: Radius): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCirclemarker(value: typingsSlinky.leafletDraw.anon.Tooltip): Self = StObject.set(x, "circlemarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker(value: typingsSlinky.leafletDraw.anon.Tooltip): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygon(value: TooltipCont): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolyline(value: Error): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangle(value: typingsSlinky.leafletDraw.anon.Tooltip): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleshape(value: TooltipEnd): Self = StObject.set(x, "simpleshape", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DrawLocal extends StObject {
    
    var draw: typingsSlinky.leafletDraw.mod.Localization.Draw = js.native
    
    var edit: typingsSlinky.leafletDraw.mod.Localization.Edit = js.native
  }
  object DrawLocal {
    
    @scala.inline
    def apply(
      draw: typingsSlinky.leafletDraw.mod.Localization.Draw,
      edit: typingsSlinky.leafletDraw.mod.Localization.Edit
    ): DrawLocal = {
      val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawLocal]
    }
    
    @scala.inline
    implicit class DrawLocalMutableBuilder[Self <: DrawLocal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraw(value: typingsSlinky.leafletDraw.mod.Localization.Draw): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdit(value: typingsSlinky.leafletDraw.mod.Localization.Edit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DrawToolbar extends StObject {
    
    var actions: Action = js.native
    
    var buttons: Circle = js.native
    
    var finish: Action = js.native
    
    var undo: Action = js.native
  }
  object DrawToolbar {
    
    @scala.inline
    def apply(actions: Action, buttons: Circle, finish: Action, undo: Action): typingsSlinky.leafletDraw.mod.Localization.DrawToolbar = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.leafletDraw.mod.Localization.DrawToolbar]
    }
    
    @scala.inline
    implicit class DrawToolbarMutableBuilder[Self <: typingsSlinky.leafletDraw.mod.Localization.DrawToolbar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: Action): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtons(value: Circle): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinish(value: Action): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndo(value: Action): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Edit extends StObject {
    
    var handlers: EditHandlers = js.native
    
    var toolbar: typingsSlinky.leafletDraw.mod.Localization.EditToolbar = js.native
  }
  object Edit {
    
    @scala.inline
    def apply(handlers: EditHandlers, toolbar: typingsSlinky.leafletDraw.mod.Localization.EditToolbar): typingsSlinky.leafletDraw.mod.Localization.Edit = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.leafletDraw.mod.Localization.Edit]
    }
    
    @scala.inline
    implicit class EditMutableBuilder[Self <: typingsSlinky.leafletDraw.mod.Localization.Edit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: EditHandlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbar(value: typingsSlinky.leafletDraw.mod.Localization.EditToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditHandlers extends StObject {
    
    var edit: TooltipText = js.native
    
    var remove: TooltipTextString = js.native
  }
  object EditHandlers {
    
    @scala.inline
    def apply(edit: TooltipText, remove: TooltipTextString): EditHandlers = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditHandlers]
    }
    
    @scala.inline
    implicit class EditHandlersMutableBuilder[Self <: EditHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdit(value: TooltipText): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: TooltipTextString): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditToolbar extends StObject {
    
    var actions: Cancel = js.native
    
    var buttons: typingsSlinky.leafletDraw.anon.Edit = js.native
  }
  object EditToolbar {
    
    @scala.inline
    def apply(actions: Cancel, buttons: typingsSlinky.leafletDraw.anon.Edit): typingsSlinky.leafletDraw.mod.Localization.EditToolbar = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.leafletDraw.mod.Localization.EditToolbar]
    }
    
    @scala.inline
    implicit class EditToolbarMutableBuilder[Self <: typingsSlinky.leafletDraw.mod.Localization.EditToolbar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: Cancel): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtons(value: typingsSlinky.leafletDraw.anon.Edit): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tooltip extends StObject {
    
    var cont: js.UndefOr[String] = js.native
    
    var end: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[String] = js.native
  }
  object Tooltip {
    
    @scala.inline
    def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCont(value: String): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContUndefined: Self = StObject.set(x, "cont", js.undefined)
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
