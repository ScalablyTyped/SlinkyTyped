package typingsSlinky.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.jointjsStrings.anchor
import typingsSlinky.jointjs.jointjsStrings.bbox
import typingsSlinky.jointjs.jointjsStrings.boundary
import typingsSlinky.jointjs.jointjsStrings.rectangle
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.Point
import typingsSlinky.jointjs.mod.g.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionPoints {
  
  @JSImport("jointjs", "connectionPoints")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "connectionPoints.anchor")
  @js.native
  def anchor: GenericConnectionPoint[typingsSlinky.jointjs.jointjsStrings.anchor] = js.native
  @scala.inline
  def anchor_=(x: GenericConnectionPoint[anchor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchor")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectionPoints.bbox")
  @js.native
  def bbox: GenericConnectionPoint[typingsSlinky.jointjs.jointjsStrings.bbox] = js.native
  @scala.inline
  def bbox_=(x: GenericConnectionPoint[bbox]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bbox")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectionPoints.boundary")
  @js.native
  def boundary: GenericConnectionPoint[typingsSlinky.jointjs.jointjsStrings.boundary] = js.native
  @scala.inline
  def boundary_=(x: GenericConnectionPoint[boundary]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectionPoints.rectangle")
  @js.native
  def rectangle: GenericConnectionPoint[typingsSlinky.jointjs.jointjsStrings.rectangle] = js.native
  @scala.inline
  def rectangle_=(x: GenericConnectionPoint[rectangle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(x.asInstanceOf[js.Any])
  
  @js.native
  trait AlignConnectionPointArguments extends DefaultConnectionPointArguments {
    
    var align: js.UndefOr[ConnectionPointAlignment | Null] = js.native
    
    var alignOffset: js.UndefOr[Double] = js.native
  }
  object AlignConnectionPointArguments {
    
    @scala.inline
    def apply(): AlignConnectionPointArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignConnectionPointArguments]
    }
    
    @scala.inline
    implicit class AlignConnectionPointArgumentsMutableBuilder[Self <: AlignConnectionPointArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: ConnectionPointAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignNull: Self = StObject.set(x, "align", null)
      
      @scala.inline
      def setAlignOffset(value: Double): Self = StObject.set(x, "alignOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignOffsetUndefined: Self = StObject.set(x, "alignOffset", js.undefined)
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
  
  @js.native
  trait BoundaryConnectionPointArguments extends StrokeConnectionPointArguments {
    
    var extrapolate: js.UndefOr[Boolean] = js.native
    
    var insideout: js.UndefOr[Boolean] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var selector: js.UndefOr[(js.Array[String | Double]) | String] = js.native
    
    var sticky: js.UndefOr[Boolean] = js.native
  }
  object BoundaryConnectionPointArguments {
    
    @scala.inline
    def apply(): BoundaryConnectionPointArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoundaryConnectionPointArguments]
    }
    
    @scala.inline
    implicit class BoundaryConnectionPointArgumentsMutableBuilder[Self <: BoundaryConnectionPointArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtrapolate(value: Boolean): Self = StObject.set(x, "extrapolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrapolateUndefined: Self = StObject.set(x, "extrapolate", js.undefined)
      
      @scala.inline
      def setInsideout(value: Boolean): Self = StObject.set(x, "insideout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsideoutUndefined: Self = StObject.set(x, "insideout", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setSelector(value: (js.Array[String | Double]) | String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSelectorVarargs(value: (String | Double)*): Self = StObject.set(x, "selector", js.Array(value :_*))
      
      @scala.inline
      def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    }
  }
  
  type ConnectionPoint = GenericConnectionPoint[ConnectionPointType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.top
    - typingsSlinky.jointjs.jointjsStrings.bottom
    - typingsSlinky.jointjs.jointjsStrings.left
    - typingsSlinky.jointjs.jointjsStrings.right
  */
  trait ConnectionPointAlignment extends StObject
  object ConnectionPointAlignment {
    
    @scala.inline
    def bottom: typingsSlinky.jointjs.jointjsStrings.bottom = "bottom".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.jointjs.jointjsStrings.left = "left".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.left]
    
    @scala.inline
    def right: typingsSlinky.jointjs.jointjsStrings.right = "right".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.right]
    
    @scala.inline
    def top: typingsSlinky.jointjs.jointjsStrings.top = "top".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.top]
  }
  
  /* Inlined jointjs.jointjs.connectionPoints.GenericConnectionPointArguments<jointjs.jointjs.connectionPoints.ConnectionPointType> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.sticky
    - typingsSlinky.jointjs.jointjsStrings.offset
    - typingsSlinky.jointjs.jointjsStrings.extrapolate
    - typingsSlinky.jointjs.jointjsStrings.insideout
    - typingsSlinky.jointjs.jointjsStrings.stroke
    - typingsSlinky.jointjs.jointjsStrings.precision
    - typingsSlinky.jointjs.jointjsStrings.selector
  */
  trait ConnectionPointArguments extends StObject
  object ConnectionPointArguments {
    
    @scala.inline
    def extrapolate: typingsSlinky.jointjs.jointjsStrings.extrapolate = "extrapolate".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.extrapolate]
    
    @scala.inline
    def insideout: typingsSlinky.jointjs.jointjsStrings.insideout = "insideout".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.insideout]
    
    @scala.inline
    def offset: typingsSlinky.jointjs.jointjsStrings.offset = "offset".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.offset]
    
    @scala.inline
    def precision: typingsSlinky.jointjs.jointjsStrings.precision = "precision".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.precision]
    
    @scala.inline
    def selector: typingsSlinky.jointjs.jointjsStrings.selector = "selector".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.selector]
    
    @scala.inline
    def sticky: typingsSlinky.jointjs.jointjsStrings.sticky = "sticky".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.sticky]
    
    @scala.inline
    def stroke: typingsSlinky.jointjs.jointjsStrings.stroke = "stroke".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.stroke]
  }
  
  @js.native
  trait ConnectionPointArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var anchor: DefaultConnectionPointArguments = js.native
    
    var bbox: StrokeConnectionPointArguments = js.native
    
    var boundary: BoundaryConnectionPointArguments = js.native
    
    var rectangle: StrokeConnectionPointArguments = js.native
  }
  object ConnectionPointArgumentsMap {
    
    @scala.inline
    def apply(
      anchor: DefaultConnectionPointArguments,
      bbox: StrokeConnectionPointArguments,
      boundary: BoundaryConnectionPointArguments,
      rectangle: StrokeConnectionPointArguments
    ): ConnectionPointArgumentsMap = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPointArgumentsMap]
    }
    
    @scala.inline
    implicit class ConnectionPointArgumentsMapMutableBuilder[Self <: ConnectionPointArgumentsMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: DefaultConnectionPointArguments): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBbox(value: StrokeConnectionPointArguments): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundary(value: BoundaryConnectionPointArguments): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangle(value: StrokeConnectionPointArguments): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionPointJSON = GenericConnectionPointJSON[ConnectionPointType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.anchor
    - typingsSlinky.jointjs.jointjsStrings.bbox
    - typingsSlinky.jointjs.jointjsStrings.rectangle
    - typingsSlinky.jointjs.jointjsStrings.boundary
  */
  trait ConnectionPointType extends StObject
  
  @js.native
  trait DefaultConnectionPointArguments extends StObject {
    
    var offset: js.UndefOr[Double | Point] = js.native
  }
  object DefaultConnectionPointArguments {
    
    @scala.inline
    def apply(): DefaultConnectionPointArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultConnectionPointArguments]
    }
    
    @scala.inline
    implicit class DefaultConnectionPointArgumentsMutableBuilder[Self <: DefaultConnectionPointArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double | Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  type GenericConnectionPoint[K /* <: ConnectionPointType */] = js.Function4[
    /* endPathSegmentLine */ Line, 
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any, 
    typingsSlinky.jointjs.mod.g.Point
  ]
  
  type GenericConnectionPointArguments[K /* <: ConnectionPointType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
  
  @js.native
  trait GenericConnectionPointJSON[K /* <: ConnectionPointType */] extends StObject {
    
    var args: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
      ] = js.native
    
    var name: K = js.native
  }
  object GenericConnectionPointJSON {
    
    @scala.inline
    def apply[K /* <: ConnectionPointType */](name: K): GenericConnectionPointJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericConnectionPointJSON[K]]
    }
    
    @scala.inline
    implicit class GenericConnectionPointJSONMutableBuilder[Self <: GenericConnectionPointJSON[_], K /* <: ConnectionPointType */] (val x: Self with GenericConnectionPointJSON[K]) extends AnyVal {
      
      @scala.inline
      def setArgs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrokeConnectionPointArguments extends DefaultConnectionPointArguments {
    
    var stroke: js.UndefOr[Boolean] = js.native
  }
  object StrokeConnectionPointArguments {
    
    @scala.inline
    def apply(): StrokeConnectionPointArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrokeConnectionPointArguments]
    }
    
    @scala.inline
    implicit class StrokeConnectionPointArgumentsMutableBuilder[Self <: StrokeConnectionPointArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
