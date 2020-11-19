package typingsSlinky.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import typingsSlinky.ejWebAll.ej.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.CircularGauge")
@js.native
class CircularGauge protected ()
  extends typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}
/* static members */
@JSGlobal("ej.datavisualization.CircularGauge")
@js.native
object CircularGauge extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge = js.native
  
  @js.native
  object CustomLabelPositionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.CustomLabelPositionType with Double
      ] = js.native
    
    /* 0 */ val Inner: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.CustomLabelPositionType.Inner with Double = js.native
    
    /* 1 */ val Outer: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.CustomLabelPositionType.Outer with Double = js.native
  }
  
  @js.native
  object Direction extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.Direction with Double] = js.native
    
    /* 0 */ val Clockwise: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.Direction.Clockwise with Double = js.native
    
    /* 1 */ val CounterClockwise: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.Direction.CounterClockwise with Double = js.native
  }
  
  @js.native
  object ExportingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.ExportingMode with Double
      ] = js.native
    
    /* 1 */ val ClientSide: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.ExportingMode.ClientSide with Double = js.native
    
    /* 0 */ val ServerSide: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.ExportingMode.ServerSide with Double = js.native
  }
  
  @js.native
  object ExportingType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.ExportingType with Double
      ] = js.native
    
    /* 1 */ val JPG: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.ExportingType.JPG with Double = js.native
    
    /* 0 */ val PNG: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.ExportingType.PNG with Double = js.native
  }
  
  @js.native
  object FrameType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.FrameType with Double] = js.native
    
    /* 0 */ val FullCircle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.FrameType.FullCircle with Double = js.native
    
    /* 1 */ val HalfCircle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.FrameType.HalfCircle with Double = js.native
  }
  
  @js.native
  object IndicatorTypes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes with Double
      ] = js.native
    
    /* 1 */ val Circle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Circle with Double = js.native
    
    /* 13 */ val Cross: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Cross with Double = js.native
    
    /* 6 */ val Diamond: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Diamond with Double = js.native
    
    /* 15 */ val Downarrow: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Downarrow with Double = js.native
    
    /* 11 */ val HorizontalLine: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.HorizontalLine with Double = js.native
    
    /* 4 */ val Image: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Image with Double = js.native
    
    /* 18 */ val InvertedTriangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.InvertedTriangle with Double = js.native
    
    /* 16 */ val Leftarrow: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Leftarrow with Double = js.native
    
    /* 8 */ val Pentagon: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Pentagon with Double = js.native
    
    /* 0 */ val Rectangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Rectangle with Double = js.native
    
    /* 17 */ val Rightarrow: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Rightarrow with Double = js.native
    
    /* 3 */ val RoundedRectangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.RoundedRectangle with Double = js.native
    
    /* 10 */ val Star: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Star with Double = js.native
    
    /* 2 */ val Text: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Text with Double = js.native
    
    /* 7 */ val Trapezoid: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Trapezoid with Double = js.native
    
    /* 5 */ val Triangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Triangle with Double = js.native
    
    /* 14 */ val Uparrow: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Uparrow with Double = js.native
    
    /* 12 */ val Verticalline: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Verticalline with Double = js.native
    
    /* 9 */ val Wedge: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.IndicatorTypes.Wedge with Double = js.native
  }
  
  @js.native
  object LabelType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LabelType with Double] = js.native
    
    /* 0 */ val Major: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LabelType.Major with Double = js.native
    
    /* 1 */ val Minor: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LabelType.Minor with Double = js.native
  }
  
  @js.native
  object LegendAlignment extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendAlignment with Double
      ] = js.native
    
    /* 0 */ val Center: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendAlignment.Center with Double = js.native
    
    /* 2 */ val Far: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendAlignment.Far with Double = js.native
    
    /* 1 */ val Near: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendAlignment.Near with Double = js.native
  }
  
  @js.native
  object LegendPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendPosition with Double
      ] = js.native
    
    /* 3 */ val Bottom: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendPosition.Bottom with Double = js.native
    
    /* 0 */ val Left: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendPosition.Left with Double = js.native
    
    /* 1 */ val Right: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendPosition.Right with Double = js.native
    
    /* 2 */ val Top: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendPosition.Top with Double = js.native
  }
  
  @js.native
  object LegendShape extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape with Double
      ] = js.native
    
    /* 1 */ val Circle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Circle with Double = js.native
    
    /* 4 */ val Diamond: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Diamond with Double = js.native
    
    /* 3 */ val Ellipse: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Ellipse with Double = js.native
    
    /* 8 */ val Line: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Line with Double = js.native
    
    /* 5 */ val Pentagon: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Pentagon with Double = js.native
    
    /* 0 */ val Rectangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Rectangle with Double = js.native
    
    /* 6 */ val Slider: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Slider with Double = js.native
    
    /* 7 */ val Trapezoid: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Trapezoid with Double = js.native
    
    /* 2 */ val Triangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.LegendShape.Triangle with Double = js.native
  }
  
  @js.native
  object MarkerType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType with Double] = js.native
    
    /* 1 */ val Circle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Circle with Double = js.native
    
    /* 4 */ val Diamond: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Diamond with Double = js.native
    
    /* 3 */ val Ellipse: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Ellipse with Double = js.native
    
    /* 11 */ val Image: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Image with Double = js.native
    
    /* 5 */ val Pentagon: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Pentagon with Double = js.native
    
    /* 7 */ val Pointer: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Pointer with Double = js.native
    
    /* 0 */ val Rectangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Rectangle with Double = js.native
    
    /* 10 */ val RoundedRectangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.RoundedRectangle with Double = js.native
    
    /* 6 */ val Slider: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Slider with Double = js.native
    
    /* 9 */ val Trapezoid: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Trapezoid with Double = js.native
    
    /* 2 */ val Triangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Triangle with Double = js.native
    
    /* 8 */ val Wedge: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.MarkerType.Wedge with Double = js.native
  }
  
  @js.native
  object NeedleType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.NeedleType with Double] = js.native
    
    /* 2 */ val Arrow: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.NeedleType.Arrow with Double = js.native
    
    /* 3 */ val Image: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.NeedleType.Image with Double = js.native
    
    /* 1 */ val Rectangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.NeedleType.Rectangle with Double = js.native
    
    /* 4 */ val Trapezoid: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.NeedleType.Trapezoid with Double = js.native
    
    /* 0 */ val Triangle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.NeedleType.Triangle with Double = js.native
  }
  
  @js.native
  object OuterCustomLabelPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition with Double
      ] = js.native
    
    /* 1 */ val Bottom: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Bottom with Double = js.native
    
    /* 3 */ val Left: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Left with Double = js.native
    
    /* 2 */ val Right: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Right with Double = js.native
    
    /* 0 */ val Top: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Top with Double = js.native
  }
  
  @js.native
  object Placement extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.Placement with Double] = js.native
    
    /* 1 */ val Far: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.Placement.Far with Double = js.native
    
    /* 0 */ val Near: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.Placement.Near with Double = js.native
  }
  
  @js.native
  object PointerType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.PointerType with Double
      ] = js.native
    
    /* 1 */ val Marker: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.PointerType.Marker with Double = js.native
    
    /* 0 */ val Needle: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.PointerType.Needle with Double = js.native
  }
  
  @js.native
  object RangeZOrderPlacement extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.RangeZOrderPlacement with Double
      ] = js.native
    
    /* 1 */ val Front: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.RangeZOrderPlacement.Front with Double = js.native
    
    /* 0 */ val Rear: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.RangeZOrderPlacement.Rear with Double = js.native
  }
  
  @js.native
  object UnitTextPlacement extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.UnitTextPlacement with Double
      ] = js.native
    
    /* 0 */ val Back: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.UnitTextPlacement.Back with Double = js.native
    
    /* 1 */ val Front: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.UnitTextPlacement.Front with Double = js.native
  }
  
  @js.native
  object gaugePosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition with Double
      ] = js.native
    
    /* 8 */ val BottomCenter: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.BottomCenter with Double = js.native
    
    /* 6 */ val BottomLeft: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.BottomLeft with Double = js.native
    
    /* 7 */ val BottomRight: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.BottomRight with Double = js.native
    
    /* 5 */ val Center: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.Center with Double = js.native
    
    /* 3 */ val MiddleLeft: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.MiddleLeft with Double = js.native
    
    /* 4 */ val MiddleRight: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.MiddleRight with Double = js.native
    
    /* 2 */ val TopCenter: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.TopCenter with Double = js.native
    
    /* 0 */ val TopLeft: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.TopLeft with Double = js.native
    
    /* 1 */ val TopRight: typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge.gaugePosition.TopRight with Double = js.native
  }
}
