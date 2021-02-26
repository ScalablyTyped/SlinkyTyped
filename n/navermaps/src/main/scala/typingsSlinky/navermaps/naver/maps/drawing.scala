package typingsSlinky.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @js.native
  sealed trait DrawingEvent extends StObject
  @JSGlobal("naver.maps.drawing.DrawingEvent")
  @js.native
  object DrawingEvent extends StObject {
    
    @js.native
    sealed trait ADD extends DrawingEvent
    
    @js.native
    sealed trait Added extends DrawingEvent
    
    @js.native
    sealed trait REMOVE extends DrawingEvent
    
    @js.native
    sealed trait Removed extends DrawingEvent
    
    @js.native
    sealed trait SELECT extends DrawingEvent
    
    @js.native
    sealed trait Selected extends DrawingEvent
  }
  
  @js.native
  sealed trait DrawingMode extends StObject
  @JSGlobal("naver.maps.drawing.DrawingMode")
  @js.native
  object DrawingMode extends StObject {
    
    @js.native
    sealed trait ARROWLINE extends DrawingMode
    
    @js.native
    sealed trait ELLIPSE extends DrawingMode
    
    @js.native
    sealed trait HAND extends DrawingMode
    
    @js.native
    sealed trait MARKER extends DrawingMode
    
    @js.native
    sealed trait POLYGON extends DrawingMode
    
    @js.native
    sealed trait POLYLINE extends DrawingMode
    
    @js.native
    sealed trait RECTANGLE extends DrawingMode
  }
  
  @js.native
  sealed trait DrawingStyle extends StObject
  @JSGlobal("naver.maps.drawing.DrawingStyle")
  @js.native
  object DrawingStyle extends StObject {
    
    @js.native
    sealed trait HORIZONTAL extends DrawingStyle
    
    @js.native
    sealed trait HORIZONTAL_2 extends DrawingStyle
    
    @js.native
    sealed trait VERTICAL extends DrawingStyle
    
    @js.native
    sealed trait VERTICAL_2 extends DrawingStyle
  }
  
  @js.native
  trait ControlPointOptions_ extends StObject {
    
    var anchorPointOptions: CircleOptions = js.native
    
    var midPointOptions: CircleOptions = js.native
  }
  object ControlPointOptions_ {
    
    @scala.inline
    def apply(anchorPointOptions: CircleOptions, midPointOptions: CircleOptions): ControlPointOptions_ = {
      val __obj = js.Dynamic.literal(anchorPointOptions = anchorPointOptions.asInstanceOf[js.Any], midPointOptions = midPointOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPointOptions_]
    }
    
    @scala.inline
    implicit class ControlPointOptions_MutableBuilder[Self <: ControlPointOptions_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorPointOptions(value: CircleOptions): Self = StObject.set(x, "anchorPointOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMidPointOptions(value: CircleOptions): Self = StObject.set(x, "midPointOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DrawingControlOptions_ extends StObject {
    
    var position: js.UndefOr[Position] = js.native
    
    var style: js.UndefOr[DrawingStyle] = js.native
  }
  object DrawingControlOptions_ {
    
    @scala.inline
    def apply(): DrawingControlOptions_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingControlOptions_]
    }
    
    @scala.inline
    implicit class DrawingControlOptions_MutableBuilder[Self <: DrawingControlOptions_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: DrawingStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DrawingManager extends KVO {
    
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode): Unit = js.native
    def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode, id: String): Unit = js.native
    
    def addListener(eventName: DrawingEvent, listener: js.Function1[/* overlay */ DrawingOverlay, Unit]): MapEventListener = js.native
    
    def destroy(): Unit = js.native
    
    def getDrawing(id: String): DrawingOverlay = js.native
    
    def getDrawings(): js.Any = js.native
    
    def getMap(): Map | Null = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    def toGeoJson(): js.Any = js.native
  }
  
  @js.native
  trait DrawingOptions extends StObject {
    
    var arrowlineOptions: js.UndefOr[PolylineOptions] = js.native
    
    var controlPointOptions: js.UndefOr[typingsSlinky.navermaps.naver.maps.drawing.controlPointOptions] = js.native
    
    var drawingControl: js.UndefOr[js.Array[DrawingMode]] = js.native
    
    var drawingControlOptions: js.UndefOr[typingsSlinky.navermaps.naver.maps.drawing.drawingControlOptions] = js.native
    
    var drawingMode: js.UndefOr[DrawingMode] = js.native
    
    var ellipseOptions: js.UndefOr[EllipseOptions] = js.native
    
    var map: js.UndefOr[Map] = js.native
    
    var markerOptions: js.UndefOr[MarkerOptions] = js.native
    
    var polygonOptions: js.UndefOr[PolygonOptions] = js.native
    
    var polylineOptions: js.UndefOr[PolylineOptions] = js.native
    
    var rectangleOptions: js.UndefOr[RectangleOptions] = js.native
  }
  object DrawingOptions {
    
    @scala.inline
    def apply(): DrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingOptions]
    }
    
    @scala.inline
    implicit class DrawingOptionsMutableBuilder[Self <: DrawingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowlineOptions(value: PolylineOptions): Self = StObject.set(x, "arrowlineOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowlineOptionsUndefined: Self = StObject.set(x, "arrowlineOptions", js.undefined)
      
      @scala.inline
      def setControlPointOptions(value: controlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
      
      @scala.inline
      def setDrawingControl(value: js.Array[DrawingMode]): Self = StObject.set(x, "drawingControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawingControlOptions(value: drawingControlOptions): Self = StObject.set(x, "drawingControlOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawingControlOptionsUndefined: Self = StObject.set(x, "drawingControlOptions", js.undefined)
      
      @scala.inline
      def setDrawingControlUndefined: Self = StObject.set(x, "drawingControl", js.undefined)
      
      @scala.inline
      def setDrawingControlVarargs(value: DrawingMode*): Self = StObject.set(x, "drawingControl", js.Array(value :_*))
      
      @scala.inline
      def setDrawingMode(value: DrawingMode): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawingModeUndefined: Self = StObject.set(x, "drawingMode", js.undefined)
      
      @scala.inline
      def setEllipseOptions(value: EllipseOptions): Self = StObject.set(x, "ellipseOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipseOptionsUndefined: Self = StObject.set(x, "ellipseOptions", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
      
      @scala.inline
      def setPolygonOptions(value: PolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
      
      @scala.inline
      def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
      
      @scala.inline
      def setRectangleOptions(value: RectangleOptions): Self = StObject.set(x, "rectangleOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangleOptionsUndefined: Self = StObject.set(x, "rectangleOptions", js.undefined)
    }
  }
  
  @js.native
  trait DrawingOverlay extends StObject {
    
    var id: String = js.native
    
    var name: String = js.native
    
    def setEditable(editable: Boolean): Unit = js.native
    def setEditable(editable: Boolean, controlPointOptions: controlPointOptions): Unit = js.native
  }
  
  type controlPointOptions = ControlPointOptions_
  
  type drawingControlOptions = DrawingControlOptions_
}
