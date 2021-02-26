package typingsSlinky.jointjs.mod

import typingsSlinky.jointjs.mod.dia.Event
import typingsSlinky.jointjs.mod.dia.LinkView
import typingsSlinky.jointjs.mod.dia.MarkupJSON
import typingsSlinky.jointjs.mod.dia.Sides
import typingsSlinky.jointjs.mod.dia.ToolView
import typingsSlinky.jointjs.mod.elementTools.Boundary.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementTools {
  
  @JSImport("jointjs", "elementTools.Boundary")
  @js.native
  class Boundary () extends ToolView {
    def this(opt: Options) = this()
  }
  object Boundary {
    
    @js.native
    trait Options
      extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
      
      var padding: js.UndefOr[Double | Sides] = js.native
      
      var rotate: js.UndefOr[Boolean] = js.native
      
      var useModelGeometry: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPadding(value: Double | Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        @scala.inline
        def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
        
        @scala.inline
        def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "elementTools.Button")
  @js.native
  class Button () extends ToolView {
    def this(opt: typingsSlinky.jointjs.mod.elementTools.Button.Options) = this()
    
    /* protected */ def onPointerDown(evt: Event): Unit = js.native
  }
  object Button {
    
    type ActionCallback = js.Function2[/* evt */ Event, /* view */ LinkView, Unit]
    
    @js.native
    trait Options
      extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
      
      var action: js.UndefOr[ActionCallback] = js.native
      
      var markup: js.UndefOr[MarkupJSON] = js.native
      
      var offset: js.UndefOr[Double] = js.native
      
      var rotate: js.UndefOr[Boolean] = js.native
      
      var useModelGeometry: js.UndefOr[Boolean] = js.native
      
      var x: js.UndefOr[Double | String] = js.native
      
      var y: js.UndefOr[Double | String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.jointjs.mod.elementTools.Button.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.jointjs.mod.elementTools.Button.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.jointjs.mod.elementTools.Button.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: (/* evt */ Event, /* view */ LinkView) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
        
        @scala.inline
        def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        @scala.inline
        def setMarkup(value: MarkupJSON): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
        
        @scala.inline
        def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
        
        @scala.inline
        def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        @scala.inline
        def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "elementTools.Remove")
  @js.native
  class Remove () extends Button {
    def this(opt: typingsSlinky.jointjs.mod.elementTools.Button.Options) = this()
  }
}
