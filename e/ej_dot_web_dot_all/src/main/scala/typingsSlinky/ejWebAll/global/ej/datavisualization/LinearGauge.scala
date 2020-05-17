package typingsSlinky.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import typingsSlinky.ejWebAll.ej.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.LinearGauge")
@js.native
class LinearGauge protected ()
  extends typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
}

/* static members */
@JSGlobal("ej.datavisualization.LinearGauge")
@js.native
object LinearGauge extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge = js.native
  @js.native
  object Direction extends js.Object {
    /* 0 */ val Clockwise: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.Direction.Clockwise with Double = js.native
    /* 1 */ val CounterClockwise: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.Direction.CounterClockwise with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.Direction with Double] = js.native
  }
  
  @js.native
  object ExportingMode extends js.Object {
    /* 1 */ val ClientSide: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode.ClientSide with Double = js.native
    /* 0 */ val ServerSide: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode.ServerSide with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ExportingMode with Double
      ] = js.native
  }
  
  @js.native
  object ExportingType extends js.Object {
    /* 1 */ val JPG: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ExportingType.JPG with Double = js.native
    /* 0 */ val PNG: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ExportingType.PNG with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ExportingType with Double
      ] = js.native
  }
  
  @js.native
  object FontStyle extends js.Object {
    /* 0 */ val Bold: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Bold with Double = js.native
    /* 1 */ val Italic: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Italic with Double = js.native
    /* 2 */ val Regular: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Regular with Double = js.native
    /* 3 */ val Strikeout: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Strikeout with Double = js.native
    /* 4 */ val Underline: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.FontStyle.Underline with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.FontStyle with Double] = js.native
  }
  
  @js.native
  object IndicatorTypes extends js.Object {
    /* 1 */ val Circle: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Circle with Double = js.native
    /* 0 */ val Rectangle: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Rectangle with Double = js.native
    /* 2 */ val RoundedRectangle: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.RoundedRectangle with Double = js.native
    /* 3 */ val Text: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes.Text with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.IndicatorTypes with Double
      ] = js.native
  }
  
  @js.native
  object MarkerType extends js.Object {
    /* 5 */ val Circle: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Circle with Double = js.native
    /* 3 */ val Diamond: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Diamond with Double = js.native
    /* 2 */ val Ellipse: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Ellipse with Double = js.native
    /* 4 */ val Pentagon: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Pentagon with Double = js.native
    /* 8 */ val Pointer: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Pointer with Double = js.native
    /* 0 */ val Rectangle: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Rectangle with Double = js.native
    /* 11 */ val RoundedRectangle: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.RoundedRectangle with Double = js.native
    /* 7 */ val Slider: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Slider with Double = js.native
    /* 6 */ val Star: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Star with Double = js.native
    /* 10 */ val Trapezoid: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Trapezoid with Double = js.native
    /* 1 */ val Triangle: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Triangle with Double = js.native
    /* 9 */ val Wedge: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType.Wedge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.MarkerType with Double] = js.native
  }
  
  @js.native
  object OuterCustomLabelPosition extends js.Object {
    /* 3 */ val Bottom: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Bottom with Double = js.native
    /* 0 */ val Left: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Left with Double = js.native
    /* 1 */ val Right: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Right with Double = js.native
    /* 2 */ val Top: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition with Double
      ] = js.native
  }
  
  @js.native
  object PointerPlacement extends js.Object {
    /* 2 */ val Center: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Center with Double = js.native
    /* 1 */ val Far: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Far with Double = js.native
    /* 0 */ val Near: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement.Near with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.PointerPlacement with Double
      ] = js.native
  }
  
  @js.native
  object ScaleType extends js.Object {
    /* 0 */ val Major: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ScaleType.Major with Double = js.native
    /* 1 */ val Minor: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ScaleType.Minor with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.ScaleType with Double] = js.native
  }
  
  @js.native
  object Themes extends js.Object {
    /* 1 */ val FlatDark: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.Themes.FlatDark with Double = js.native
    /* 0 */ val FlatLight: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.Themes.FlatLight with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.Themes with Double] = js.native
  }
  
  @js.native
  object TicksType extends js.Object {
    /* 0 */ val Majorinterval: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.TicksType.Majorinterval with Double = js.native
    /* 1 */ val Minorinterval: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.TicksType.Minorinterval with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.TicksType with Double] = js.native
  }
  
  @js.native
  object UnitTextPlacement extends js.Object {
    /* 0 */ val Back: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement.Back with Double = js.native
    /* 1 */ val From: typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement.From with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge.UnitTextPlacement with Double
      ] = js.native
  }
  
}

