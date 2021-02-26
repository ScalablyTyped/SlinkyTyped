package typingsSlinky.jointjs.mod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.mod.anchors.AnchorJSON
import typingsSlinky.jointjs.mod.attributes.NativeSVGAttributes
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.Event
import typingsSlinky.jointjs.mod.dia.LinkView
import typingsSlinky.jointjs.mod.dia.MarkupJSON
import typingsSlinky.jointjs.mod.dia.Point
import typingsSlinky.jointjs.mod.dia.Sides
import typingsSlinky.jointjs.mod.dia.ToolView
import typingsSlinky.jointjs.mod.linkTools.Anchor.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkTools {
  
  @JSImport("jointjs", "linkTools.Anchor")
  @js.native
  abstract class Anchor () extends ToolView {
    def this(opt: Options) = this()
    
    var `type`: String = js.native
  }
  object Anchor {
    
    @js.native
    trait Options
      extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
      
      var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.native
      
      var areaPadding: js.UndefOr[Double] = js.native
      
      var customAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.native
      
      var defaultAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.native
      
      var redundancyRemoval: js.UndefOr[Boolean] = js.native
      
      var resetAnchor: js.UndefOr[Boolean | AnchorJSON] = js.native
      
      var restrictArea: js.UndefOr[Boolean] = js.native
      
      var snap: js.UndefOr[AnchorCallback[Point]] = js.native
      
      var snapRadius: js.UndefOr[Double] = js.native
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
        def setAnchor(
          value: (/* coords */ typingsSlinky.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => AnchorJSON
        ): Self = StObject.set(x, "anchor", js.Any.fromFunction6(value))
        
        @scala.inline
        def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
        
        @scala.inline
        def setAreaPadding(value: Double): Self = StObject.set(x, "areaPadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAreaPaddingUndefined: Self = StObject.set(x, "areaPadding", js.undefined)
        
        @scala.inline
        def setCustomAnchorAttributes(value: NativeSVGAttributes): Self = StObject.set(x, "customAnchorAttributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomAnchorAttributesUndefined: Self = StObject.set(x, "customAnchorAttributes", js.undefined)
        
        @scala.inline
        def setDefaultAnchorAttributes(value: NativeSVGAttributes): Self = StObject.set(x, "defaultAnchorAttributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultAnchorAttributesUndefined: Self = StObject.set(x, "defaultAnchorAttributes", js.undefined)
        
        @scala.inline
        def setRedundancyRemoval(value: Boolean): Self = StObject.set(x, "redundancyRemoval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRedundancyRemovalUndefined: Self = StObject.set(x, "redundancyRemoval", js.undefined)
        
        @scala.inline
        def setResetAnchor(value: Boolean | AnchorJSON): Self = StObject.set(x, "resetAnchor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResetAnchorUndefined: Self = StObject.set(x, "resetAnchor", js.undefined)
        
        @scala.inline
        def setRestrictArea(value: Boolean): Self = StObject.set(x, "restrictArea", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRestrictAreaUndefined: Self = StObject.set(x, "restrictArea", js.undefined)
        
        @scala.inline
        def setSnap(
          value: (/* coords */ typingsSlinky.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => Point
        ): Self = StObject.set(x, "snap", js.Any.fromFunction6(value))
        
        @scala.inline
        def setSnapRadius(value: Double): Self = StObject.set(x, "snapRadius", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapRadiusUndefined: Self = StObject.set(x, "snapRadius", js.undefined)
        
        @scala.inline
        def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "linkTools.Arrowhead")
  @js.native
  abstract class Arrowhead () extends ToolView {
    def this(opt: typingsSlinky.jointjs.mod.dia.ToolView.Options) = this()
    
    var arrowheadType: String = js.native
    
    /* protected */ def onPointerDown(evt: Event): Unit = js.native
    
    /* protected */ def onPointerMove(evt: Event): Unit = js.native
    
    /* protected */ def onPointerUp(evt: Event): Unit = js.native
    
    var ratio: Double = js.native
  }
  
  @JSImport("jointjs", "linkTools.Boundary")
  @js.native
  class Boundary () extends ToolView {
    def this(opt: typingsSlinky.jointjs.mod.linkTools.Boundary.Options) = this()
  }
  object Boundary {
    
    @js.native
    trait Options
      extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
      
      var padding: js.UndefOr[Double | Sides] = js.native
      
      var useModelGeometry: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.jointjs.mod.linkTools.Boundary.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.jointjs.mod.linkTools.Boundary.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.jointjs.mod.linkTools.Boundary.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPadding(value: Double | Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        @scala.inline
        def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "linkTools.Button")
  @js.native
  class Button () extends ToolView {
    def this(opt: typingsSlinky.jointjs.mod.linkTools.Button.Options) = this()
    
    /* protected */ def onPointerDown(evt: Event): Unit = js.native
  }
  object Button {
    
    type ActionCallback = js.Function2[/* evt */ Event, /* view */ LinkView, Unit]
    
    @js.native
    trait Options
      extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
      
      var action: js.UndefOr[ActionCallback] = js.native
      
      var distance: js.UndefOr[Double | String] = js.native
      
      var markup: js.UndefOr[MarkupJSON] = js.native
      
      var offset: js.UndefOr[Double] = js.native
      
      var rotate: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.jointjs.mod.linkTools.Button.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.jointjs.mod.linkTools.Button.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.jointjs.mod.linkTools.Button.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: (/* evt */ Event, /* view */ LinkView) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
        
        @scala.inline
        def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        @scala.inline
        def setDistance(value: Double | String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
        
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
      }
    }
  }
  
  @JSImport("jointjs", "linkTools.Remove")
  @js.native
  class Remove () extends Button {
    def this(opt: typingsSlinky.jointjs.mod.linkTools.Button.Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.Segments")
  @js.native
  class Segments () extends ToolView {
    def this(opt: typingsSlinky.jointjs.mod.linkTools.Segments.Options) = this()
  }
  object Segments {
    
    @js.native
    trait Options
      extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
      
      var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.native
      
      var handleClass: js.UndefOr[js.Any] = js.native
      
      var redundancyRemoval: js.UndefOr[Boolean] = js.native
      
      var segmentLengthThreshold: js.UndefOr[Double] = js.native
      
      var snapHandle: js.UndefOr[Boolean] = js.native
      
      var snapRadius: js.UndefOr[Double] = js.native
      
      var stopPropagation: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.jointjs.mod.linkTools.Segments.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.jointjs.mod.linkTools.Segments.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.jointjs.mod.linkTools.Segments.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnchor(
          value: (/* coords */ typingsSlinky.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => AnchorJSON
        ): Self = StObject.set(x, "anchor", js.Any.fromFunction6(value))
        
        @scala.inline
        def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
        
        @scala.inline
        def setHandleClass(value: js.Any): Self = StObject.set(x, "handleClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleClassUndefined: Self = StObject.set(x, "handleClass", js.undefined)
        
        @scala.inline
        def setRedundancyRemoval(value: Boolean): Self = StObject.set(x, "redundancyRemoval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRedundancyRemovalUndefined: Self = StObject.set(x, "redundancyRemoval", js.undefined)
        
        @scala.inline
        def setSegmentLengthThreshold(value: Double): Self = StObject.set(x, "segmentLengthThreshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmentLengthThresholdUndefined: Self = StObject.set(x, "segmentLengthThreshold", js.undefined)
        
        @scala.inline
        def setSnapHandle(value: Boolean): Self = StObject.set(x, "snapHandle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapHandleUndefined: Self = StObject.set(x, "snapHandle", js.undefined)
        
        @scala.inline
        def setSnapRadius(value: Double): Self = StObject.set(x, "snapRadius", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapRadiusUndefined: Self = StObject.set(x, "snapRadius", js.undefined)
        
        @scala.inline
        def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "linkTools.SourceAnchor")
  @js.native
  class SourceAnchor () extends Anchor {
    def this(opt: Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.SourceArrowhead")
  @js.native
  class SourceArrowhead () extends Arrowhead {
    def this(opt: typingsSlinky.jointjs.mod.dia.ToolView.Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.TargetAnchor")
  @js.native
  class TargetAnchor () extends Anchor {
    def this(opt: Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.TargetArrowhead")
  @js.native
  class TargetArrowhead () extends Arrowhead {
    def this(opt: typingsSlinky.jointjs.mod.dia.ToolView.Options) = this()
  }
  
  @JSImport("jointjs", "linkTools.Vertices")
  @js.native
  class Vertices () extends ToolView {
    def this(opt: typingsSlinky.jointjs.mod.linkTools.Vertices.Options) = this()
  }
  object Vertices {
    
    @js.native
    trait Options
      extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
      
      var handleClass: js.UndefOr[js.Any] = js.native
      
      var redundancyRemoval: js.UndefOr[Boolean] = js.native
      
      var snapRadius: js.UndefOr[Double] = js.native
      
      var stopPropagation: js.UndefOr[Boolean] = js.native
      
      var vertexAdding: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): typingsSlinky.jointjs.mod.linkTools.Vertices.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.jointjs.mod.linkTools.Vertices.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typingsSlinky.jointjs.mod.linkTools.Vertices.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHandleClass(value: js.Any): Self = StObject.set(x, "handleClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleClassUndefined: Self = StObject.set(x, "handleClass", js.undefined)
        
        @scala.inline
        def setRedundancyRemoval(value: Boolean): Self = StObject.set(x, "redundancyRemoval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRedundancyRemovalUndefined: Self = StObject.set(x, "redundancyRemoval", js.undefined)
        
        @scala.inline
        def setSnapRadius(value: Double): Self = StObject.set(x, "snapRadius", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapRadiusUndefined: Self = StObject.set(x, "snapRadius", js.undefined)
        
        @scala.inline
        def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
        
        @scala.inline
        def setVertexAdding(value: Boolean): Self = StObject.set(x, "vertexAdding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertexAddingUndefined: Self = StObject.set(x, "vertexAdding", js.undefined)
      }
    }
  }
  
  type AnchorCallback[T] = js.Function6[
    /* coords */ typingsSlinky.jointjs.mod.g.Point, 
    /* view */ CellView, 
    /* magnet */ SVGElement, 
    /* type */ String, 
    /* linkView */ LinkView, 
    /* toolView */ ToolView, 
    T
  ]
}
