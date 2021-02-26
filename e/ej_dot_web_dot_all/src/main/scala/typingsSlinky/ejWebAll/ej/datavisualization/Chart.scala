package typingsSlinky.ejWebAll.ej.datavisualization

import typingsSlinky.ejWebAll.ej.Model
import typingsSlinky.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends Widget_ {
  
  /** Animates the series and/or indicators in Chart. When parameter is not passed to this method, then all the series and indicators present in Chart are animated.
    * @param {any} If an array collection is passed as parameter, series and indicator objects passed in array collection are animated.ExampleIf a series or indicator object is passed
    * to this method, then the specific series or indicator is animated.Example,
    * @returns {void}
    */
  def animate(options: js.Any): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Exports chart as an image or to an excel file. Chart can be exported as an image only when exportCanvasRendering option is set to true.
    * @param {string} Type of the export operation to be performed. Following are the two export types that are supported now,1. 'image'2. 'excel'Example
    * @param {string} URL of the service, where the chart will be exported to excel.Example,
    * @param {boolean} When this parameter is true, all the chart objects initialized to the same document are exported to a single excel file. This is an optional parameter. By
    * default, it is false.Example,
    * @returns {any}
    */
  def export(`type`: String, URL: String, exportMultipleChart: Boolean): js.Any = js.native
  
  @JSName("model")
  var model_Chart: Model = js.native
  
  /** Prints the rendered chart.
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** Redraws the entire chart. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}
object Chart {
  
  @js.native
  sealed trait Alignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.Alignment")
  @js.native
  object Alignment extends StObject {
    
    //string
    @js.native
    sealed trait Center extends Alignment
    
    //string
    @js.native
    sealed trait Far extends Alignment
    
    //string
    @js.native
    sealed trait Near extends Alignment
  }
  
  @js.native
  sealed trait AxisOrientation extends StObject
  @JSGlobal("ej.datavisualization.Chart.AxisOrientation")
  @js.native
  object AxisOrientation extends StObject {
    
    //string
    @js.native
    sealed trait Horizontal extends AxisOrientation
    
    //string
    @js.native
    sealed trait Vertical extends AxisOrientation
  }
  
  @js.native
  sealed trait ColumnFacet extends StObject
  @JSGlobal("ej.datavisualization.Chart.ColumnFacet")
  @js.native
  object ColumnFacet extends StObject {
    
    //string
    @js.native
    sealed trait Cylinder extends ColumnFacet
    
    //string
    @js.native
    sealed trait Rectangle extends ColumnFacet
  }
  
  @js.native
  sealed trait ConnectorLineType extends StObject
  @JSGlobal("ej.datavisualization.Chart.ConnectorLineType")
  @js.native
  object ConnectorLineType extends StObject {
    
    //string
    @js.native
    sealed trait Bezier extends ConnectorLineType
    
    //string
    @js.native
    sealed trait Line extends ConnectorLineType
  }
  
  @js.native
  sealed trait CoordinateUnit extends StObject
  @JSGlobal("ej.datavisualization.Chart.CoordinateUnit")
  @js.native
  object CoordinateUnit extends StObject {
    
    //string
    @js.native
    sealed trait None extends CoordinateUnit
    
    //string
    @js.native
    sealed trait Pixels extends CoordinateUnit
    
    //string
    @js.native
    sealed trait Points extends CoordinateUnit
  }
  
  @js.native
  sealed trait CrosshairMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.CrosshairMode")
  @js.native
  object CrosshairMode extends StObject {
    
    //string
    @js.native
    sealed trait Float extends CrosshairMode
    
    //string
    @js.native
    sealed trait Grouping extends CrosshairMode
  }
  
  @js.native
  sealed trait CrosshairType extends StObject
  @JSGlobal("ej.datavisualization.Chart.CrosshairType")
  @js.native
  object CrosshairType extends StObject {
    
    //string
    @js.native
    sealed trait Crosshair extends CrosshairType
    
    //string
    @js.native
    sealed trait Trackball extends CrosshairType
  }
  
  @js.native
  sealed trait DrawType extends StObject
  @JSGlobal("ej.datavisualization.Chart.DrawType")
  @js.native
  object DrawType extends StObject {
    
    //string
    @js.native
    sealed trait Area extends DrawType
    
    //string
    @js.native
    sealed trait Column extends DrawType
    
    //string
    @js.native
    sealed trait Line extends DrawType
  }
  
  @js.native
  sealed trait EdgeLabelPlacement extends StObject
  @JSGlobal("ej.datavisualization.Chart.EdgeLabelPlacement")
  @js.native
  object EdgeLabelPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Hide extends EdgeLabelPlacement
    
    //string
    @js.native
    sealed trait None extends EdgeLabelPlacement
    
    //string
    @js.native
    sealed trait Shift extends EdgeLabelPlacement
  }
  
  @js.native
  sealed trait EmptyPointMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.EmptyPointMode")
  @js.native
  object EmptyPointMode extends StObject {
    
    //string
    @js.native
    sealed trait Average extends EmptyPointMode
    
    //string
    @js.native
    sealed trait Gap extends EmptyPointMode
    
    //string
    @js.native
    sealed trait Zero extends EmptyPointMode
  }
  
  @js.native
  sealed trait ErrorBarDirection extends StObject
  @JSGlobal("ej.datavisualization.Chart.ErrorBarDirection")
  @js.native
  object ErrorBarDirection extends StObject {
    
    //string
    @js.native
    sealed trait Both extends ErrorBarDirection
    
    //string
    @js.native
    sealed trait Minus extends ErrorBarDirection
    
    //string
    @js.native
    sealed trait Plus extends ErrorBarDirection
  }
  
  @js.native
  sealed trait ErrorBarMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.ErrorBarMode")
  @js.native
  object ErrorBarMode extends StObject {
    
    //string
    @js.native
    sealed trait Both extends ErrorBarMode
    
    //string
    @js.native
    sealed trait Horizontal extends ErrorBarMode
    
    //string
    @js.native
    sealed trait Vertical extends ErrorBarMode
  }
  
  @js.native
  sealed trait ErrorBarType extends StObject
  @JSGlobal("ej.datavisualization.Chart.ErrorBarType")
  @js.native
  object ErrorBarType extends StObject {
    
    //string
    @js.native
    sealed trait FixedValue extends ErrorBarType
    
    //string
    @js.native
    sealed trait Percentage extends ErrorBarType
    
    //string
    @js.native
    sealed trait StandardDeviation extends ErrorBarType
    
    //string
    @js.native
    sealed trait StandardError extends ErrorBarType
  }
  
  @js.native
  sealed trait ExportingMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.ExportingMode")
  @js.native
  object ExportingMode extends StObject {
    
    //string
    @js.native
    sealed trait ClientSide extends ExportingMode
    
    //string
    @js.native
    sealed trait ServerSide extends ExportingMode
  }
  
  @js.native
  sealed trait ExportingOrientation extends StObject
  @JSGlobal("ej.datavisualization.Chart.ExportingOrientation")
  @js.native
  object ExportingOrientation extends StObject {
    
    //string
    @js.native
    sealed trait Landscape extends ExportingOrientation
    
    //string
    @js.native
    sealed trait Portrait extends ExportingOrientation
  }
  
  @js.native
  sealed trait ExportingType extends StObject
  @JSGlobal("ej.datavisualization.Chart.ExportingType")
  @js.native
  object ExportingType extends StObject {
    
    //string
    @js.native
    sealed trait DOCX extends ExportingType
    
    //string
    @js.native
    sealed trait JPG extends ExportingType
    
    //string
    @js.native
    sealed trait PDF extends ExportingType
    
    //string
    @js.native
    sealed trait PNG extends ExportingType
    
    //string
    @js.native
    sealed trait SVG extends ExportingType
    
    //string
    @js.native
    sealed trait XLSX extends ExportingType
  }
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.Chart.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Italic extends FontStyle
    
    //string
    @js.native
    sealed trait Normal extends FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.Chart.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Bold extends FontWeight
    
    //string
    @js.native
    sealed trait Lighter extends FontWeight
    
    //string
    @js.native
    sealed trait Regular extends FontWeight
  }
  
  @js.native
  sealed trait HorizontalAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.HorizontalAlignment")
  @js.native
  object HorizontalAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Left extends HorizontalAlignment
    
    //string
    @js.native
    sealed trait Middle extends HorizontalAlignment
    
    //string
    @js.native
    sealed trait Right extends HorizontalAlignment
  }
  
  @js.native
  sealed trait HorizontalTextAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.HorizontalTextAlignment")
  @js.native
  object HorizontalTextAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center extends HorizontalTextAlignment
    
    //string
    @js.native
    sealed trait Far extends HorizontalTextAlignment
    
    //string
    @js.native
    sealed trait Near extends HorizontalTextAlignment
  }
  
  @js.native
  sealed trait IntervalType extends StObject
  @JSGlobal("ej.datavisualization.Chart.IntervalType")
  @js.native
  object IntervalType extends StObject {
    
    //string
    @js.native
    sealed trait Days extends IntervalType
    
    //string
    @js.native
    sealed trait Hours extends IntervalType
    
    //string
    @js.native
    sealed trait Milliseconds extends IntervalType
    
    //string
    @js.native
    sealed trait Minutes extends IntervalType
    
    //string
    @js.native
    sealed trait Months extends IntervalType
    
    //string
    @js.native
    sealed trait Seconds extends IntervalType
    
    //string
    @js.native
    sealed trait Years extends IntervalType
  }
  
  @js.native
  sealed trait LabelAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.LabelAlignment")
  @js.native
  object LabelAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center extends LabelAlignment
    
    //string
    @js.native
    sealed trait Far extends LabelAlignment
    
    //string
    @js.native
    sealed trait Near extends LabelAlignment
  }
  
  @js.native
  sealed trait LabelIntersectAction extends StObject
  @JSGlobal("ej.datavisualization.Chart.LabelIntersectAction")
  @js.native
  object LabelIntersectAction extends StObject {
    
    //string
    @js.native
    sealed trait Hide extends LabelIntersectAction
    
    //string
    @js.native
    sealed trait MultipleRows extends LabelIntersectAction
    
    //string
    @js.native
    sealed trait None extends LabelIntersectAction
    
    //string
    @js.native
    sealed trait Rotate45 extends LabelIntersectAction
    
    //string
    @js.native
    sealed trait Rotate90 extends LabelIntersectAction
    
    //string
    @js.native
    sealed trait Trim extends LabelIntersectAction
    
    //string
    @js.native
    sealed trait Wrap extends LabelIntersectAction
    
    //string
    @js.native
    sealed trait WrapByword extends LabelIntersectAction
  }
  
  @js.native
  sealed trait LabelPlacement extends StObject
  @JSGlobal("ej.datavisualization.Chart.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    //string
    @js.native
    sealed trait BetweenTicks extends LabelPlacement
    
    //string
    @js.native
    sealed trait OnTicks extends LabelPlacement
  }
  
  @js.native
  sealed trait LabelPosition extends StObject
  @JSGlobal("ej.datavisualization.Chart.LabelPosition")
  @js.native
  object LabelPosition extends StObject {
    
    //string
    @js.native
    sealed trait Inside extends LabelPosition
    
    //string
    @js.native
    sealed trait Outside extends LabelPosition
    
    //string
    @js.native
    sealed trait OutsideExtended extends LabelPosition
  }
  
  @js.native
  sealed trait LineCap extends StObject
  @JSGlobal("ej.datavisualization.Chart.LineCap")
  @js.native
  object LineCap extends StObject {
    
    //string
    @js.native
    sealed trait Butt extends LineCap
    
    //string
    @js.native
    sealed trait Round extends LineCap
    
    //string
    @js.native
    sealed trait Square extends LineCap
  }
  
  @js.native
  sealed trait LineJoin extends StObject
  @JSGlobal("ej.datavisualization.Chart.LineJoin")
  @js.native
  object LineJoin extends StObject {
    
    //string
    @js.native
    sealed trait Bevel extends LineJoin
    
    //string
    @js.native
    sealed trait Miter extends LineJoin
    
    //string
    @js.native
    sealed trait Round extends LineJoin
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSGlobal("ej.datavisualization.Chart.Mode")
  @js.native
  object Mode extends StObject {
    
    //string
    @js.native
    sealed trait Cluster extends Mode
    
    //string
    @js.native
    sealed trait Point extends Mode
    
    //string
    @js.native
    sealed trait Range extends Mode
    
    //string
    @js.native
    sealed trait Series extends Mode
  }
  
  @js.native
  sealed trait MultiLevelLabelsBorderType extends StObject
  @JSGlobal("ej.datavisualization.Chart.MultiLevelLabelsBorderType")
  @js.native
  object MultiLevelLabelsBorderType extends StObject {
    
    //string
    @js.native
    sealed trait Brace extends MultiLevelLabelsBorderType
    
    //string
    @js.native
    sealed trait CurlyBrace extends MultiLevelLabelsBorderType
    
    //string
    @js.native
    sealed trait None extends MultiLevelLabelsBorderType
    
    //string
    @js.native
    sealed trait Rectangle extends MultiLevelLabelsBorderType
    
    //string
    @js.native
    sealed trait WithoutTopAndBottom extends MultiLevelLabelsBorderType
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("ej.datavisualization.Chart.Position")
  @js.native
  object Position extends StObject {
    
    //string
    @js.native
    sealed trait Bottom extends Position
    
    //string
    @js.native
    sealed trait Left extends Position
    
    //string
    @js.native
    sealed trait Right extends Position
    
    //string
    @js.native
    sealed trait Top extends Position
  }
  
  @js.native
  sealed trait PyramidMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.PyramidMode")
  @js.native
  object PyramidMode extends StObject {
    
    //string
    @js.native
    sealed trait Linear extends PyramidMode
    
    //string
    @js.native
    sealed trait Surface extends PyramidMode
  }
  
  @js.native
  sealed trait RadiusMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.RadiusMode")
  @js.native
  object RadiusMode extends StObject {
    
    //string
    @js.native
    sealed trait Auto extends RadiusMode
    
    //string
    @js.native
    sealed trait MinMax extends RadiusMode
  }
  
  @js.native
  sealed trait RangePadding extends StObject
  @JSGlobal("ej.datavisualization.Chart.RangePadding")
  @js.native
  object RangePadding extends StObject {
    
    //string
    @js.native
    sealed trait Additional extends RangePadding
    
    //string
    @js.native
    sealed trait None extends RangePadding
    
    //string
    @js.native
    sealed trait Normal extends RangePadding
    
    //string
    @js.native
    sealed trait Round extends RangePadding
  }
  
  @js.native
  sealed trait RangeType extends StObject
  @JSGlobal("ej.datavisualization.Chart.RangeType")
  @js.native
  object RangeType extends StObject {
    
    //string
    @js.native
    sealed trait X extends RangeType
    
    //string
    @js.native
    sealed trait XY extends RangeType
    
    //string
    @js.native
    sealed trait Y extends RangeType
  }
  
  @js.native
  sealed trait Region extends StObject
  @JSGlobal("ej.datavisualization.Chart.Region")
  @js.native
  object Region extends StObject {
    
    //string
    @js.native
    sealed trait Chart extends Region
    
    //string
    @js.native
    sealed trait Series extends Region
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  @JSGlobal("ej.datavisualization.Chart.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    //string
    @js.native
    sealed trait Multiple extends SelectionType
    
    //string
    @js.native
    sealed trait Single extends SelectionType
  }
  
  @js.native
  sealed trait Shape extends StObject
  @JSGlobal("ej.datavisualization.Chart.Shape")
  @js.native
  object Shape extends StObject {
    
    //string
    @js.native
    sealed trait Circle extends Shape
    
    //string
    @js.native
    sealed trait Cross extends Shape
    
    //string
    @js.native
    sealed trait Diamond extends Shape
    
    //string
    @js.native
    sealed trait DownArrow extends Shape
    
    //string
    @js.native
    sealed trait Ellipse extends Shape
    
    //string
    @js.native
    sealed trait Hexagon extends Shape
    
    //string
    @js.native
    sealed trait HorizLine extends Shape
    
    //string
    @js.native
    sealed trait Image extends Shape
    
    //string
    @js.native
    sealed trait LeftArrow extends Shape
    
    //string
    @js.native
    sealed trait None extends Shape
    
    //string
    @js.native
    sealed trait Pentagon extends Shape
    
    //string
    @js.native
    sealed trait Rectangle extends Shape
    
    //string
    @js.native
    sealed trait RightArrow extends Shape
    
    //string
    @js.native
    sealed trait SeriesType extends Shape
    
    //string
    @js.native
    sealed trait Star extends Shape
    
    //string
    @js.native
    sealed trait Trapezoid extends Shape
    
    //string
    @js.native
    sealed trait Triangle extends Shape
    
    //string
    @js.native
    sealed trait UpArrow extends Shape
    
    //string
    @js.native
    sealed trait VertLine extends Shape
  }
  
  @js.native
  sealed trait SplineType extends StObject
  @JSGlobal("ej.datavisualization.Chart.SplineType")
  @js.native
  object SplineType extends StObject {
    
    //string
    @js.native
    sealed trait Cardinal extends SplineType
    
    //string
    @js.native
    sealed trait Clamped extends SplineType
    
    //string
    @js.native
    sealed trait Monotonic extends SplineType
    
    //string
    @js.native
    sealed trait Natural extends SplineType
  }
  
  @js.native
  sealed trait SplitMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.SplitMode")
  @js.native
  object SplitMode extends StObject {
    
    //string
    @js.native
    sealed trait Indexes extends SplitMode
    
    //string
    @js.native
    sealed trait Percentage extends SplitMode
    
    //string
    @js.native
    sealed trait Position extends SplitMode
    
    //string
    @js.native
    sealed trait Value extends SplitMode
  }
  
  @js.native
  sealed trait TextAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.TextAlignment")
  @js.native
  object TextAlignment extends StObject {
    
    //string
    @js.native
    sealed trait MiddleBottom extends TextAlignment
    
    //string
    @js.native
    sealed trait MiddleCenter extends TextAlignment
    
    //string
    @js.native
    sealed trait MiddleTop extends TextAlignment
  }
  
  @js.native
  sealed trait TextOverflow extends StObject
  @JSGlobal("ej.datavisualization.Chart.TextOverflow")
  @js.native
  object TextOverflow extends StObject {
    
    //string
    @js.native
    sealed trait None extends TextOverflow
    
    //string
    @js.native
    sealed trait Trim extends TextOverflow
    
    //string
    @js.native
    sealed trait Wrap extends TextOverflow
    
    //string
    @js.native
    sealed trait WrapAndTrim extends TextOverflow
  }
  
  @js.native
  sealed trait TextPosition extends StObject
  @JSGlobal("ej.datavisualization.Chart.TextPosition")
  @js.native
  object TextPosition extends StObject {
    
    //string
    @js.native
    sealed trait Bottom extends TextPosition
    
    //string
    @js.native
    sealed trait Middle extends TextPosition
    
    //string
    @js.native
    sealed trait Top extends TextPosition
  }
  
  @js.native
  sealed trait Theme extends StObject
  @JSGlobal("ej.datavisualization.Chart.Theme")
  @js.native
  object Theme extends StObject {
    
    //string
    @js.native
    sealed trait Azure extends Theme
    
    //string
    @js.native
    sealed trait Azuredark extends Theme
    
    //string
    @js.native
    sealed trait FlatDark extends Theme
    
    //string
    @js.native
    sealed trait FlatLight extends Theme
    
    //string
    @js.native
    sealed trait GradientDark extends Theme
    
    //string
    @js.native
    sealed trait GradientLight extends Theme
    
    //string
    @js.native
    sealed trait Lime extends Theme
    
    //string
    @js.native
    sealed trait LimeDark extends Theme
    
    //string
    @js.native
    sealed trait Saffron extends Theme
    
    //string
    @js.native
    sealed trait SaffronDark extends Theme
  }
  
  @js.native
  sealed trait TickLinesPosition extends StObject
  @JSGlobal("ej.datavisualization.Chart.TickLinesPosition")
  @js.native
  object TickLinesPosition extends StObject {
    
    //string
    @js.native
    sealed trait Inside extends TickLinesPosition
    
    //string
    @js.native
    sealed trait Outside extends TickLinesPosition
  }
  
  @js.native
  sealed trait TrendlinesType extends StObject
  @JSGlobal("ej.datavisualization.Chart.TrendlinesType")
  @js.native
  object TrendlinesType extends StObject {
    
    //string
    @js.native
    sealed trait Exponential extends TrendlinesType
    
    //string
    @js.native
    sealed trait Linear extends TrendlinesType
    
    //string
    @js.native
    sealed trait Logarithmic extends TrendlinesType
    
    //string
    @js.native
    sealed trait Polynomial extends TrendlinesType
    
    //string
    @js.native
    sealed trait Power extends TrendlinesType
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSGlobal("ej.datavisualization.Chart.Type")
  @js.native
  object Type extends StObject {
    
    //string
    @js.native
    sealed trait Area extends Type
    
    //string
    @js.native
    sealed trait Bar extends Type
    
    //string
    @js.native
    sealed trait Bubble extends Type
    
    //string
    @js.native
    sealed trait Candle extends Type
    
    //string
    @js.native
    sealed trait Column extends Type
    
    //string
    @js.native
    sealed trait Doughnut extends Type
    
    //string
    @js.native
    sealed trait Funnel extends Type
    
    //string
    @js.native
    sealed trait HiLo extends Type
    
    //string
    @js.native
    sealed trait HiLoOpenClose extends Type
    
    //string
    @js.native
    sealed trait Line extends Type
    
    //string
    @js.native
    sealed trait Pie extends Type
    
    //string
    @js.native
    sealed trait Polar extends Type
    
    //string
    @js.native
    sealed trait Pyramid extends Type
    
    //string
    @js.native
    sealed trait Radar extends Type
    
    //string
    @js.native
    sealed trait RangeArea extends Type
    
    //string
    @js.native
    sealed trait RangeColumn extends Type
    
    //string
    @js.native
    sealed trait Scatter extends Type
    
    //string
    @js.native
    sealed trait Spline extends Type
    
    //string
    @js.native
    sealed trait SplineArea extends Type
    
    //string
    @js.native
    sealed trait StackingArea extends Type
    
    //string
    @js.native
    sealed trait StackingArea100 extends Type
    
    //string
    @js.native
    sealed trait StackingBar extends Type
    
    //string
    @js.native
    sealed trait StackingBar100 extends Type
    
    //string
    @js.native
    sealed trait StackingColumn extends Type
    
    //string
    @js.native
    sealed trait StackingColumn100 extends Type
    
    //string
    @js.native
    sealed trait StackingSplineArea extends Type
    
    //string
    @js.native
    sealed trait StackingSplineArea100 extends Type
    
    //string
    @js.native
    sealed trait StepArea extends Type
    
    //string
    @js.native
    sealed trait StepLine extends Type
  }
  
  @js.native
  sealed trait Unit extends StObject
  @JSGlobal("ej.datavisualization.Chart.Unit")
  @js.native
  object Unit extends StObject {
    
    //string
    @js.native
    sealed trait Percentage
      extends typingsSlinky.ejWebAll.ej.datavisualization.Chart.Unit
    
    //string
    @js.native
    sealed trait Pixel
      extends typingsSlinky.ejWebAll.ej.datavisualization.Chart.Unit
  }
  
  @js.native
  sealed trait ValueType extends StObject
  @JSGlobal("ej.datavisualization.Chart.ValueType")
  @js.native
  object ValueType extends StObject {
    
    //string
    @js.native
    sealed trait Category extends ValueType
    
    //string
    @js.native
    sealed trait DateTime extends ValueType
    
    //string
    @js.native
    sealed trait Double extends ValueType
    
    //string
    @js.native
    sealed trait Logarithmic extends ValueType
  }
  
  @js.native
  sealed trait VerticalAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.VerticalAlignment")
  @js.native
  object VerticalAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Bottom extends VerticalAlignment
    
    //string
    @js.native
    sealed trait Middle extends VerticalAlignment
    
    //string
    @js.native
    sealed trait Top extends VerticalAlignment
  }
  
  @js.native
  sealed trait VerticalTextAlignment extends StObject
  @JSGlobal("ej.datavisualization.Chart.VerticalTextAlignment")
  @js.native
  object VerticalTextAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center extends VerticalTextAlignment
    
    //string
    @js.native
    sealed trait Far extends VerticalTextAlignment
    
    //string
    @js.native
    sealed trait Near extends VerticalTextAlignment
  }
  
  @js.native
  sealed trait ZIndex extends StObject
  @JSGlobal("ej.datavisualization.Chart.ZIndex")
  @js.native
  object ZIndex extends StObject {
    
    //string
    @js.native
    sealed trait Inside extends ZIndex
    
    //string
    @js.native
    sealed trait Over extends ZIndex
  }
  
  @js.native
  sealed trait boxPlotMode extends StObject
  @JSGlobal("ej.datavisualization.Chart.boxPlotMode")
  @js.native
  object boxPlotMode extends StObject {
    
    //string
    @js.native
    sealed trait Exclusive extends boxPlotMode
    
    //string
    @js.native
    sealed trait Inclusive extends boxPlotMode
    
    //string
    @js.native
    sealed trait Normal extends boxPlotMode
  }
  
  @js.native
  trait AfterResizeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** width - Chart width, after resize    height - Chart height, after resize    prevWidth - Chart width, before resize    prevHeight - Chart height, before resize
      * originalWidth- Chart width, when the chart was first rendered    originalHeight - Chart height, when the chart was first rendered
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AfterResizeEventArgs {
    
    @scala.inline
    def apply(): AfterResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterResizeEventArgs]
    }
    
    @scala.inline
    implicit class AfterResizeEventArgsMutableBuilder[Self <: AfterResizeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AnimationCompleteEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** series - Instance of the series that completed has animation.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AnimationCompleteEventArgs {
    
    @scala.inline
    def apply(): AnimationCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationCompleteEventArgs]
    }
    
    @scala.inline
    implicit class AnimationCompleteEventArgsMutableBuilder[Self <: AnimationCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Annotation extends StObject {
    
    /** Angle to rotate the annotation in degrees.
      * @Default {'0'}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Text content or id of a HTML element to be displayed as annotation.
      */
    var content: js.UndefOr[String] = js.native
    
    /** Specifies how annotations have to be placed in Chart.
      * @Default {none. See CoordinateUnit}
      */
    var coordinateUnit: js.UndefOr[CoordinateUnit | String] = js.native
    
    /** Specifies the horizontal alignment of the annotation.
      * @Default {middle. See HorizontalAlignment}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** Options to customize the margin of annotation.
      */
    var margin: js.UndefOr[AnnotationsMargin] = js.native
    
    /** Controls the opacity of the annotation.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies whether annotation has to be placed with respect to chart or series.
      * @Default {chart. See Region}
      */
    var region: js.UndefOr[Region | String] = js.native
    
    /** Specifies the vertical alignment of the annotation.
      * @Default {middle. See VerticalAlignment}
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
    
    /** Controls the visibility of the annotation.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Represents the horizontal offset when coordinateUnit is pixels.when coordinateUnit is points, it represents the x-coordinate of axis bounded with xAxisName property or primary X
      * axis when xAxisName is not provided.This property is not applicable when coordinateUnit is none.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Name of the horizontal axis to be used for positioning the annotation. This property is applicable only when coordinateUnit is points.
      */
    var xAxisName: js.UndefOr[String] = js.native
    
    /** Represents the vertical offset when coordinateUnit is pixels.When coordinateUnit is points, it represents the y-coordinate of axis bounded with yAxisName property or primary Y
      * axis when yAxisName is not provided.This property is not applicable when coordinateUnit is none.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
    
    /** Name of the vertical axis to be used for positioning the annotation.This property is applicable only when coordinateUnit is points.
      */
    var yAxisName: js.UndefOr[String] = js.native
  }
  object Annotation {
    
    @scala.inline
    def apply(): Annotation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Annotation]
    }
    
    @scala.inline
    implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCoordinateUnit(value: CoordinateUnit | String): Self = StObject.set(x, "coordinateUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinateUnitUndefined: Self = StObject.set(x, "coordinateUnit", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setMargin(value: AnnotationsMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRegion(value: Region | String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAxisName(value: String): Self = StObject.set(x, "xAxisName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAxisNameUndefined: Self = StObject.set(x, "xAxisName", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxisName(value: String): Self = StObject.set(x, "yAxisName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxisNameUndefined: Self = StObject.set(x, "yAxisName", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait AnnotationClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the annotation in chart area.     contentData - Information about the annotation, like Coordinate unit, Region, content    pageX-
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AnnotationClickEventArgs {
    
    @scala.inline
    def apply(): AnnotationClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationClickEventArgs]
    }
    
    @scala.inline
    implicit class AnnotationClickEventArgsMutableBuilder[Self <: AnnotationClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AnnotationsMargin extends StObject {
    
    /** Annotation is placed at the specified value above its original position.
      * @Default {0}
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** Annotation is placed at the specified value from left side of its original position.
      * @Default {0}
      */
    var left: js.UndefOr[Double] = js.native
    
    /** Annotation is placed at the specified value from the right side of its original position.
      * @Default {0}
      */
    var right: js.UndefOr[Double] = js.native
    
    /** Annotation is placed at the specified value under its original position.
      * @Default {0}
      */
    var top: js.UndefOr[Double] = js.native
  }
  object AnnotationsMargin {
    
    @scala.inline
    def apply(): AnnotationsMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationsMargin]
    }
    
    @scala.inline
    implicit class AnnotationsMarginMutableBuilder[Self <: AnnotationsMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait AxesAlternateGridBand extends StObject {
    
    /** Options for customizing even grid band.
      */
    var even: js.UndefOr[AxesAlternateGridBandEven] = js.native
    
    /** Options for customizing odd grid band.
      */
    var odd: js.UndefOr[AxesAlternateGridBandOdd] = js.native
  }
  object AxesAlternateGridBand {
    
    @scala.inline
    def apply(): AxesAlternateGridBand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesAlternateGridBand]
    }
    
    @scala.inline
    implicit class AxesAlternateGridBandMutableBuilder[Self <: AxesAlternateGridBand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEven(value: AxesAlternateGridBandEven): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
      
      @scala.inline
      def setOdd(value: AxesAlternateGridBandOdd): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOddUndefined: Self = StObject.set(x, "odd", js.undefined)
    }
  }
  
  @js.native
  trait AxesAlternateGridBandEven extends StObject {
    
    /** Fill color for the even grid bands.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Opacity of the even grid band.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object AxesAlternateGridBandEven {
    
    @scala.inline
    def apply(): AxesAlternateGridBandEven = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesAlternateGridBandEven]
    }
    
    @scala.inline
    implicit class AxesAlternateGridBandEvenMutableBuilder[Self <: AxesAlternateGridBandEven] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait AxesAlternateGridBandOdd extends StObject {
    
    /** Fill color of the odd grid bands
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Opacity of odd grid band
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object AxesAlternateGridBandOdd {
    
    @scala.inline
    def apply(): AxesAlternateGridBandOdd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesAlternateGridBandOdd]
    }
    
    @scala.inline
    implicit class AxesAlternateGridBandOddMutableBuilder[Self <: AxesAlternateGridBandOdd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait AxesAxisLine extends StObject {
    
    /** Color of axis line.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Pattern of dashes and gaps to be applied to the axis line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Padding for axis line. Normally, it is used along with plotOffset to pad the plot area.
      * @Default {null}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Show/hides the axis line.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of axis line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object AxesAxisLine {
    
    @scala.inline
    def apply(): AxesAxisLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesAxisLine]
    }
    
    @scala.inline
    implicit class AxesAxisLineMutableBuilder[Self <: AxesAxisLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AxesCrosshairLabel extends StObject {
    
    /** Show/hides the crosshair label associated with this axis.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object AxesCrosshairLabel {
    
    @scala.inline
    def apply(): AxesCrosshairLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesCrosshairLabel]
    }
    
    @scala.inline
    implicit class AxesCrosshairLabelMutableBuilder[Self <: AxesCrosshairLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait AxesFont extends StObject {
    
    /** Font family of labels.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of labels.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the label.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the axis labels.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the axis labels.
      * @Default {13px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object AxesFont {
    
    @scala.inline
    def apply(): AxesFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesFont]
    }
    
    @scala.inline
    implicit class AxesFontMutableBuilder[Self <: AxesFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait AxesLabelBorder extends StObject {
    
    /** Specifies the color of the label border.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the width of the label border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object AxesLabelBorder {
    
    @scala.inline
    def apply(): AxesLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesLabelBorder]
    }
    
    @scala.inline
    implicit class AxesLabelBorderMutableBuilder[Self <: AxesLabelBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AxesLabelRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** axis - Instance of the corresponding axis.        label - Arguments of axis label value and text.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AxesLabelRenderingEventArgs {
    
    @scala.inline
    def apply(): AxesLabelRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesLabelRenderingEventArgs]
    }
    
    @scala.inline
    implicit class AxesLabelRenderingEventArgsMutableBuilder[Self <: AxesLabelRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AxesLabelsInitializeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** dataAxes - Collection of axes in Chart
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AxesLabelsInitializeEventArgs {
    
    @scala.inline
    def apply(): AxesLabelsInitializeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesLabelsInitializeEventArgs]
    }
    
    @scala.inline
    implicit class AxesLabelsInitializeEventArgsMutableBuilder[Self <: AxesLabelsInitializeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AxesMajorGridLines extends StObject {
    
    /** Color of the major grid line.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Pattern of dashes and gaps used to stroke the major grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Opacity of major grid lines.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Show/hides the major grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the major grid lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object AxesMajorGridLines {
    
    @scala.inline
    def apply(): AxesMajorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMajorGridLines]
    }
    
    @scala.inline
    implicit class AxesMajorGridLinesMutableBuilder[Self <: AxesMajorGridLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AxesMajorTickLines extends StObject {
    
    /** Length of the major tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Show/hides the major tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the major tick lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object AxesMajorTickLines {
    
    @scala.inline
    def apply(): AxesMajorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMajorTickLines]
    }
    
    @scala.inline
    implicit class AxesMajorTickLinesMutableBuilder[Self <: AxesMajorTickLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AxesMinorGridLines extends StObject {
    
    /** Patterns of dashes and gaps used to stroke the minor grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Show/hides the minor grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the minorGridLines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object AxesMinorGridLines {
    
    @scala.inline
    def apply(): AxesMinorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMinorGridLines]
    }
    
    @scala.inline
    implicit class AxesMinorGridLinesMutableBuilder[Self <: AxesMinorGridLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AxesMinorTickLines extends StObject {
    
    /** Length of the minor tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Show/hides the minor tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the minor tick line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object AxesMinorTickLines {
    
    @scala.inline
    def apply(): AxesMinorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMinorTickLines]
    }
    
    @scala.inline
    implicit class AxesMinorTickLinesMutableBuilder[Self <: AxesMinorTickLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AxesMultiLevelLabel extends StObject {
    
    /** Options for customizing the border of the series.
      */
    var border: js.UndefOr[AxesMultiLevelLabelsBorder] = js.native
    
    /** Ending value of the multi level labels.
      * @Default {null}
      */
    var end: js.UndefOr[js.Any] = js.native
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[AxesMultiLevelLabelsFont] = js.native
    
    /** Specifies the level of multi level labels.
      * @Default {0}
      */
    var level: js.UndefOr[Double] = js.native
    
    /** Specifies the maximum width of the text in multi level labels.
      * @Default {null}
      */
    var maximumTextWidth: js.UndefOr[Double] = js.native
    
    /** Starting value of the multi level labels.
      * @Default {null}
      */
    var start: js.UndefOr[js.Any] = js.native
    
    /** Text of the multi level labels.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of the text in multi level labels.
      * @Default {center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies the handling of text over flow in multi level labels.
      * @Default {center. See TextOverflow}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.native
    
    /** Visibility of the multi level labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object AxesMultiLevelLabel {
    
    @scala.inline
    def apply(): AxesMultiLevelLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMultiLevelLabel]
    }
    
    @scala.inline
    implicit class AxesMultiLevelLabelMutableBuilder[Self <: AxesMultiLevelLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: AxesMultiLevelLabelsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFont(value: AxesMultiLevelLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMaximumTextWidth(value: Double): Self = StObject.set(x, "maximumTextWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTextWidthUndefined: Self = StObject.set(x, "maximumTextWidth", js.undefined)
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait AxesMultiLevelLabelsBorder extends StObject {
    
    /** Border color of the multi level labels.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border type of the multi level labels.
      * @Default {rectangle. See Type}
      */
    var `type`: js.UndefOr[MultiLevelLabelsBorderType | String] = js.native
    
    /** Border width of the multi level labels.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object AxesMultiLevelLabelsBorder {
    
    @scala.inline
    def apply(): AxesMultiLevelLabelsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMultiLevelLabelsBorder]
    }
    
    @scala.inline
    implicit class AxesMultiLevelLabelsBorderMutableBuilder[Self <: AxesMultiLevelLabelsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setType(value: MultiLevelLabelsBorderType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AxesMultiLevelLabelsFont extends StObject {
    
    /** Font color of the multi level labels text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the multi level labels text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the multi level labels text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the multi level label text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.native
    
    /** Opacity of the multi level label text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the multi level label text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object AxesMultiLevelLabelsFont {
    
    @scala.inline
    def apply(): AxesMultiLevelLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesMultiLevelLabelsFont]
    }
    
    @scala.inline
    implicit class AxesMultiLevelLabelsFontMutableBuilder[Self <: AxesMultiLevelLabelsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait AxesRange extends StObject {
    
    /** Interval of the axis range.
      * @Default {null}
      */
    var interval: js.UndefOr[Double] = js.native
    
    /** Maximum value of the axis range.
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.native
    
    /** Minimum value of the axis range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.native
  }
  object AxesRange {
    
    @scala.inline
    def apply(): AxesRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesRange]
    }
    
    @scala.inline
    implicit class AxesRangeMutableBuilder[Self <: AxesRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait AxesRangeCalculateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** delta - Difference between minimum and maximum value of axis range.    interval - Interval value of axis range. Grid lines, tick lines and axis labels are drawn based on this
      * interval value.    max - Maximum value of axis range.    min - Minimum value of axis range.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AxesRangeCalculateEventArgs {
    
    @scala.inline
    def apply(): AxesRangeCalculateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesRangeCalculateEventArgs]
    }
    
    @scala.inline
    implicit class AxesRangeCalculateEventArgsMutableBuilder[Self <: AxesRangeCalculateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AxesScrollbarSettings extends StObject {
    
    /** Controls whether scrollbar has to be responsive in the chart.
      * @Default {false}
      */
    var canResize: js.UndefOr[Boolean] = js.native
    
    /** The maximum number of points to be displayed in the scrollbar.
      * @Default {null}
      */
    var pointsLength: js.UndefOr[Double] = js.native
    
    /** Options to customize the range for the scrollbar in the axis.
      */
    var range: js.UndefOr[AxesScrollbarSettingsRange] = js.native
    
    /** Specifies to enable or disable the scrollbar.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object AxesScrollbarSettings {
    
    @scala.inline
    def apply(): AxesScrollbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesScrollbarSettings]
    }
    
    @scala.inline
    implicit class AxesScrollbarSettingsMutableBuilder[Self <: AxesScrollbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanResize(value: Boolean): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
      
      @scala.inline
      def setPointsLength(value: Double): Self = StObject.set(x, "pointsLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsLengthUndefined: Self = StObject.set(x, "pointsLength", js.undefined)
      
      @scala.inline
      def setRange(value: AxesScrollbarSettingsRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait AxesScrollbarSettingsRange extends StObject {
    
    /** Maximum value for the scrollbar range .
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.native
    
    /** Minimum value of the scrollbar range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.native
  }
  object AxesScrollbarSettingsRange {
    
    @scala.inline
    def apply(): AxesScrollbarSettingsRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesScrollbarSettingsRange]
    }
    
    @scala.inline
    implicit class AxesScrollbarSettingsRangeMutableBuilder[Self <: AxesScrollbarSettingsRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait AxesStripLine extends StObject {
    
    /** Border color of the strip line.
      * @Default {gray}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Background color of the strip line.
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.native
    
    /** End value of the strip line.
      * @Default {null}
      */
    var end: js.UndefOr[Double] = js.native
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[AxesStripLineFont] = js.native
    
    /** Start value of the strip line.
      * @Default {null}
      */
    var start: js.UndefOr[Double] = js.native
    
    /** Indicates whether to render the strip line from the minimum/start value of the axis. This property does not work when start property is set.
      * @Default {false}
      */
    var startFromAxis: js.UndefOr[Boolean] = js.native
    
    /** Specifies text to be displayed inside the strip line.
      * @Default {stripLine}
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of the text inside the strip line.
      * @Default {middlecenter. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Show/hides the strip line.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the strip line.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
    
    /** Specifies the order where the strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered under the series and when it is â€œoverâ€, it is
      * rendered above the series.
      * @Default {over. See ZIndex}
      */
    var zIndex: js.UndefOr[ZIndex | String] = js.native
  }
  object AxesStripLine {
    
    @scala.inline
    def apply(): AxesStripLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesStripLine]
    }
    
    @scala.inline
    implicit class AxesStripLineMutableBuilder[Self <: AxesStripLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFont(value: AxesStripLineFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFromAxis(value: Boolean): Self = StObject.set(x, "startFromAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFromAxisUndefined: Self = StObject.set(x, "startFromAxis", js.undefined)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: ZIndex | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait AxesStripLineFont extends StObject {
    
    /** Font color of the strip line text.
      * @Default {black}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the strip line text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the strip line text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the strip line text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.native
    
    /** Opacity of the strip line text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the strip line text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object AxesStripLineFont {
    
    @scala.inline
    def apply(): AxesStripLineFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesStripLineFont]
    }
    
    @scala.inline
    implicit class AxesStripLineFontMutableBuilder[Self <: AxesStripLineFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait AxesTitle extends StObject {
    
    /** Specifies the position of the axis title.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the title font.
      */
    var font: js.UndefOr[AxesTitleFont] = js.native
    
    /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
      * @Default {34}
      */
    var maximumTitleWidth: js.UndefOr[Double] = js.native
    
    /** offset value for axis title.
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Specifies the position of the axis title.
      * @Default {outside. See Position}
      */
    var position: js.UndefOr[LabelPosition | String] = js.native
    
    /** Title for the axis.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Controls the visibility of axis title.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object AxesTitle {
    
    @scala.inline
    def apply(): AxesTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesTitle]
    }
    
    @scala.inline
    implicit class AxesTitleMutableBuilder[Self <: AxesTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: TextAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: AxesTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setMaximumTitleWidth(value: Double): Self = StObject.set(x, "maximumTitleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTitleWidthUndefined: Self = StObject.set(x, "maximumTitleWidth", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: LabelPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait AxesTitleFont extends StObject {
    
    /** Font family of the title text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the title text.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the title text.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the axis title text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the axis title.
      * @Default {16px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object AxesTitleFont {
    
    @scala.inline
    def apply(): AxesTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesTitleFont]
    }
    
    @scala.inline
    implicit class AxesTitleFontMutableBuilder[Self <: AxesTitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait AxesTitleRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** axes - Instance of the axis whose title is being rendered    locationX - X-coordinate of title location    locationY - Y-coordinate of title location    title - Axis title
      * text. You can add custom text to the title.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AxesTitleRenderingEventArgs {
    
    @scala.inline
    def apply(): AxesTitleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesTitleRenderingEventArgs]
    }
    
    @scala.inline
    implicit class AxesTitleRenderingEventArgsMutableBuilder[Self <: AxesTitleRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Axis extends StObject {
    
    /** Specifies the position of the axis labels.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[LabelAlignment | String] = js.native
    
    /** Options for customizing axis alternate grid band.
      */
    var alternateGridBand: js.UndefOr[AxesAlternateGridBand] = js.native
    
    /** Options for customizing the axis line.
      */
    var axisLine: js.UndefOr[AxesAxisLine] = js.native
    
    /** Specifies the index of the column where the axis is associated, when the chart area is divided into multiple plot areas by using columnDefinitions.
      * @Default {null}
      */
    var columnIndex: js.UndefOr[Double] = js.native
    
    /** Specifies the number of columns or plot areas an axis has to span horizontally.
      * @Default {null}
      */
    var columnSpan: js.UndefOr[Double] = js.native
    
    /** Specifies where axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum value of
      * crossing axis, then axis will be placed at the opposite side.
      * @Default {null}
      */
    var crossesAt: js.UndefOr[Double] = js.native
    
    /** Options to customize the crosshair label.
      */
    var crosshairLabel: js.UndefOr[AxesCrosshairLabel] = js.native
    
    /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
      * @Default {null}
      */
    var desiredIntervals: js.UndefOr[Double] = js.native
    
    /** Specifies the position of labels at the edge of the axis.
      * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
      */
    var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | String] = js.native
    
    /** Specifies the interval of the axis according to the zoomed data of the chart.
      * @Default {true}
      */
    var enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the font of the axis Labels.
      */
    var font: js.UndefOr[AxesFont] = js.native
    
    /** Specifies the type of interval in date time axis.
      * @Default {null. See IntervalType}
      */
    var intervalType: js.UndefOr[IntervalType | String] = js.native
    
    /** Category axis can also plot points based on index value of data points. Index based plotting can be enabled by setting â€˜isIndexedâ€™ property to true.
      * @Default {false}
      */
    var isIndexed: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether to inverse the axis.
      * @Default {false}
      */
    var isInversed: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the border of the labels.
      */
    var labelBorder: js.UndefOr[AxesLabelBorder] = js.native
    
    /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
      * @Default {null}
      */
    var labelFormat: js.UndefOr[String] = js.native
    
    /** Specifies the action to take when the axis labels are overlapping with each other.
      * @Default {ej.datavisualization.Chart.LabelIntersectAction.None. See LabelIntersectAction}
      */
    var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.native
    
    /** Specifies the placement of labels.
      * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
    
    /** Specifies the position of the axis labels.
      * @Default {outside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.native
    
    /** Angle in degrees to rotate the axis labels.
      * @Default {null}
      */
    var labelRotation: js.UndefOr[Double] = js.native
    
    /** Logarithmic base value. This is applicable only for logarithmic axis.
      * @Default {10}
      */
    var logBase: js.UndefOr[Double] = js.native
    
    /** Options for customizing major gird lines.
      */
    var majorGridLines: js.UndefOr[AxesMajorGridLines] = js.native
    
    /** Options for customizing the major tick lines.
      */
    var majorTickLines: js.UndefOr[AxesMajorTickLines] = js.native
    
    /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
      * @Default {34}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.native
    
    /** Maximum number of labels to be displayed in every 100 pixels.
      * @Default {3}
      */
    var maximumLabels: js.UndefOr[Double] = js.native
    
    /** Options for customizing the minor grid lines.
      */
    var minorGridLines: js.UndefOr[AxesMinorGridLines] = js.native
    
    /** Options for customizing the minor tick lines.
      */
    var minorTickLines: js.UndefOr[AxesMinorTickLines] = js.native
    
    /** Specifies the number of minor ticks per interval.
      * @Default {null}
      */
    var minorTicksPerInterval: js.UndefOr[Double] = js.native
    
    /** Options for customizing the multi level labels.
      * @Default {[ ]}
      */
    var multiLevelLabels: js.UndefOr[js.Array[AxesMultiLevelLabel]] = js.native
    
    /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Specifies whether to render the axis at the opposite side of its default position.
      * @Default {false}
      */
    var opposedPosition: js.UndefOr[Boolean] = js.native
    
    /** Specifies the orientation of the axis line in the chart.
      * @Default {'horizontal'}
      */
    var orientation: js.UndefOr[AxisOrientation | String] = js.native
    
    /** Specifies the padding for the plot area.
      * @Default {10}
      */
    var plotOffset: js.UndefOr[Double] = js.native
    
    /** Options to customize the range of the axis.
      */
    var range: js.UndefOr[AxesRange] = js.native
    
    /** Specifies the padding for the axis range.
      * @Default {None. See RangePadding}
      */
    var rangePadding: js.UndefOr[RangePadding | String] = js.native
    
    /** Rounds the number to the given number of decimals.
      * @Default {null}
      */
    var roundingPlaces: js.UndefOr[Double] = js.native
    
    /** Options for customizing the axis scrollbar.
      */
    var scrollbarSettings: js.UndefOr[AxesScrollbarSettings] = js.native
    
    /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
      * @Default {true}
      */
    var showNextToAxisLine: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the strip lines.
      * @Default {[ ]}
      */
    var stripLine: js.UndefOr[js.Array[AxesStripLine]] = js.native
    
    /** Specifies the position of the axis tick lines.
      * @Default {outside. See TickLinesPosition}
      */
    var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.native
    
    /** Options for customizing the axis title.
      */
    var title: js.UndefOr[AxesTitle] = js.native
    
    /** Specifies the type of data the axis is handling.
      * @Default {null. See ValueType}
      */
    var valueType: js.UndefOr[ValueType | String] = js.native
    
    /** Show/hides the axis.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Value ranges from 0 to 1.
      * @Default {1}
      */
    var zoomFactor: js.UndefOr[Double] = js.native
    
    /** Position of the zoomed axis. Value ranges from 0 to 1.
      * @Default {0}
      */
    var zoomPosition: js.UndefOr[Double] = js.native
  }
  object Axis {
    
    @scala.inline
    def apply(): Axis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Axis]
    }
    
    @scala.inline
    implicit class AxisMutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: LabelAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setAlternateGridBand(value: AxesAlternateGridBand): Self = StObject.set(x, "alternateGridBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateGridBandUndefined: Self = StObject.set(x, "alternateGridBand", js.undefined)
      
      @scala.inline
      def setAxisLine(value: AxesAxisLine): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      @scala.inline
      def setCrossesAt(value: Double): Self = StObject.set(x, "crossesAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossesAtUndefined: Self = StObject.set(x, "crossesAt", js.undefined)
      
      @scala.inline
      def setCrosshairLabel(value: AxesCrosshairLabel): Self = StObject.set(x, "crosshairLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrosshairLabelUndefined: Self = StObject.set(x, "crosshairLabel", js.undefined)
      
      @scala.inline
      def setDesiredIntervals(value: Double): Self = StObject.set(x, "desiredIntervals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredIntervalsUndefined: Self = StObject.set(x, "desiredIntervals", js.undefined)
      
      @scala.inline
      def setEdgeLabelPlacement(value: EdgeLabelPlacement | String): Self = StObject.set(x, "edgeLabelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeLabelPlacementUndefined: Self = StObject.set(x, "edgeLabelPlacement", js.undefined)
      
      @scala.inline
      def setEnableAutoIntervalOnZooming(value: Boolean): Self = StObject.set(x, "enableAutoIntervalOnZooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAutoIntervalOnZoomingUndefined: Self = StObject.set(x, "enableAutoIntervalOnZooming", js.undefined)
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: AxesFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setIntervalType(value: IntervalType | String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      @scala.inline
      def setIsIndexed(value: Boolean): Self = StObject.set(x, "isIndexed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIndexedUndefined: Self = StObject.set(x, "isIndexed", js.undefined)
      
      @scala.inline
      def setIsInversed(value: Boolean): Self = StObject.set(x, "isInversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInversedUndefined: Self = StObject.set(x, "isInversed", js.undefined)
      
      @scala.inline
      def setLabelBorder(value: AxesLabelBorder): Self = StObject.set(x, "labelBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBorderUndefined: Self = StObject.set(x, "labelBorder", js.undefined)
      
      @scala.inline
      def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      @scala.inline
      def setLabelIntersectAction(value: LabelIntersectAction | String): Self = StObject.set(x, "labelIntersectAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelIntersectActionUndefined: Self = StObject.set(x, "labelIntersectAction", js.undefined)
      
      @scala.inline
      def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelRotationUndefined: Self = StObject.set(x, "labelRotation", js.undefined)
      
      @scala.inline
      def setLogBase(value: Double): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
      
      @scala.inline
      def setMajorGridLines(value: AxesMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
      
      @scala.inline
      def setMajorTickLines(value: AxesMajorTickLines): Self = StObject.set(x, "majorTickLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTickLinesUndefined: Self = StObject.set(x, "majorTickLines", js.undefined)
      
      @scala.inline
      def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      @scala.inline
      def setMaximumLabels(value: Double): Self = StObject.set(x, "maximumLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLabelsUndefined: Self = StObject.set(x, "maximumLabels", js.undefined)
      
      @scala.inline
      def setMinorGridLines(value: AxesMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
      
      @scala.inline
      def setMinorTickLines(value: AxesMinorTickLines): Self = StObject.set(x, "minorTickLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTickLinesUndefined: Self = StObject.set(x, "minorTickLines", js.undefined)
      
      @scala.inline
      def setMinorTicksPerInterval(value: Double): Self = StObject.set(x, "minorTicksPerInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTicksPerIntervalUndefined: Self = StObject.set(x, "minorTicksPerInterval", js.undefined)
      
      @scala.inline
      def setMultiLevelLabels(value: js.Array[AxesMultiLevelLabel]): Self = StObject.set(x, "multiLevelLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiLevelLabelsUndefined: Self = StObject.set(x, "multiLevelLabels", js.undefined)
      
      @scala.inline
      def setMultiLevelLabelsVarargs(value: AxesMultiLevelLabel*): Self = StObject.set(x, "multiLevelLabels", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpposedPosition(value: Boolean): Self = StObject.set(x, "opposedPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpposedPositionUndefined: Self = StObject.set(x, "opposedPosition", js.undefined)
      
      @scala.inline
      def setOrientation(value: AxisOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPlotOffset(value: Double): Self = StObject.set(x, "plotOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlotOffsetUndefined: Self = StObject.set(x, "plotOffset", js.undefined)
      
      @scala.inline
      def setRange(value: AxesRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangePadding(value: RangePadding | String): Self = StObject.set(x, "rangePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangePaddingUndefined: Self = StObject.set(x, "rangePadding", js.undefined)
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRoundingPlaces(value: Double): Self = StObject.set(x, "roundingPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundingPlacesUndefined: Self = StObject.set(x, "roundingPlaces", js.undefined)
      
      @scala.inline
      def setScrollbarSettings(value: AxesScrollbarSettings): Self = StObject.set(x, "scrollbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarSettingsUndefined: Self = StObject.set(x, "scrollbarSettings", js.undefined)
      
      @scala.inline
      def setShowNextToAxisLine(value: Boolean): Self = StObject.set(x, "showNextToAxisLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNextToAxisLineUndefined: Self = StObject.set(x, "showNextToAxisLine", js.undefined)
      
      @scala.inline
      def setStripLine(value: js.Array[AxesStripLine]): Self = StObject.set(x, "stripLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLineUndefined: Self = StObject.set(x, "stripLine", js.undefined)
      
      @scala.inline
      def setStripLineVarargs(value: AxesStripLine*): Self = StObject.set(x, "stripLine", js.Array(value :_*))
      
      @scala.inline
      def setTickLinesPosition(value: TickLinesPosition | String): Self = StObject.set(x, "tickLinesPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickLinesPositionUndefined: Self = StObject.set(x, "tickLinesPosition", js.undefined)
      
      @scala.inline
      def setTitle(value: AxesTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValueType(value: ValueType | String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
      
      @scala.inline
      def setZoomPosition(value: Double): Self = StObject.set(x, "zoomPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomPositionUndefined: Self = StObject.set(x, "zoomPosition", js.undefined)
    }
  }
  
  @js.native
  trait AxisLabelClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the labels in chart area.         index - Index of the label.    axis - Instance of the corresponding axis.    text - Label that is clicked.
      *
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AxisLabelClickEventArgs {
    
    @scala.inline
    def apply(): AxisLabelClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisLabelClickEventArgs]
    }
    
    @scala.inline
    implicit class AxisLabelClickEventArgsMutableBuilder[Self <: AxisLabelClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AxisLabelMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the labels in chart area.         index - Index of the label.    axis - Instance of the corresponding axis.    text - Label that is hovered.
      *
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AxisLabelMouseMoveEventArgs {
    
    @scala.inline
    def apply(): AxisLabelMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisLabelMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit class AxisLabelMouseMoveEventArgsMutableBuilder[Self <: AxisLabelMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeResizeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** currentWidth - Chart width, before resize    currentHeight - Chart height, before resize    newWidth - Chart width, after resize    newHeight - Chart height, after resize
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeResizeEventArgs {
    
    @scala.inline
    def apply(): BeforeResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeResizeEventArgs]
    }
    
    @scala.inline
    implicit class BeforeResizeEventArgsMutableBuilder[Self <: BeforeResizeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Border extends StObject {
    
    /** Border color of the chart.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Opacity of the chart border.
      * @Default {0.3}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Width of the Chart border.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Border {
    
    @scala.inline
    def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ChartArea extends StObject {
    
    /** Background color of the plot area.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.native
    
    /** Options for customizing the border of the plot area.
      */
    var border: js.UndefOr[ChartAreaBorder] = js.native
  }
  object ChartArea {
    
    @scala.inline
    def apply(): ChartArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartArea]
    }
    
    @scala.inline
    implicit class ChartAreaMutableBuilder[Self <: ChartArea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorder(value: ChartAreaBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    }
  }
  
  @js.native
  trait ChartAreaBorder extends StObject {
    
    /** Border color of the plot area.
      * @Default {Gray}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Opacity of the plot area border.
      * @Default {0.3}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Border width of the plot area.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ChartAreaBorder {
    
    @scala.inline
    def apply(): ChartAreaBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartAreaBorder]
    }
    
    @scala.inline
    implicit class ChartAreaBorderMutableBuilder[Self <: ChartAreaBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ChartAreaBoundsCalculateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** areaBoundsHeight - Height of the chart area.    areaBoundsWidth - Width of the chart area.    areaBoundsX - X-coordinate of the chart area.    areaBoundsY - Y-coordinate of the
      * chart area.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ChartAreaBoundsCalculateEventArgs {
    
    @scala.inline
    def apply(): ChartAreaBoundsCalculateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartAreaBoundsCalculateEventArgs]
    }
    
    @scala.inline
    implicit class ChartAreaBoundsCalculateEventArgsMutableBuilder[Self <: ChartAreaBoundsCalculateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ChartClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ChartClickEventArgs {
    
    @scala.inline
    def apply(): ChartClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartClickEventArgs]
    }
    
    @scala.inline
    implicit class ChartClickEventArgsMutableBuilder[Self <: ChartClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ChartDoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ChartDoubleClickEventArgs {
    
    @scala.inline
    def apply(): ChartDoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartDoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class ChartDoubleClickEventArgsMutableBuilder[Self <: ChartDoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ChartMouseLeaveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ChartMouseLeaveEventArgs {
    
    @scala.inline
    def apply(): ChartMouseLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartMouseLeaveEventArgs]
    }
    
    @scala.inline
    implicit class ChartMouseLeaveEventArgsMutableBuilder[Self <: ChartMouseLeaveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ChartMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ChartMouseMoveEventArgs {
    
    @scala.inline
    def apply(): ChartMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit class ChartMouseMoveEventArgsMutableBuilder[Self <: ChartMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ColumnDefinition extends StObject {
    
    /** Width of the column in plotting area. Width is measured in either pixel or percentage based on the value of unit property.
      * @Default {50}
      */
    var columnWidth: js.UndefOr[Double] = js.native
    
    /** Color of the line that indicates the starting point of the column in plotting area.
      * @Default {transparent}
      */
    var lineColor: js.UndefOr[String] = js.native
    
    /** Width of the line that indicates the starting point of the column in plot area.
      * @Default {1}
      */
    var lineWidth: js.UndefOr[Double] = js.native
    
    /** Specifies the unit to measure the width of the column in plotting area.
      * @Default {'pixel'. See Unit}
      */
    var unit: js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.Chart.Unit | String] = js.native
  }
  object ColumnDefinition {
    
    @scala.inline
    def apply(): ColumnDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDefinition]
    }
    
    @scala.inline
    implicit class ColumnDefinitionMutableBuilder[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setUnit(value: typingsSlinky.ejWebAll.ej.datavisualization.Chart.Unit | String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptions extends StObject {
    
    /** Specifies animation duration for series rendering
      * @Default {null}
      */
    var animationDuration: js.UndefOr[String] = js.native
    
    /** Options to customize the border of all the series.
      */
    var border: js.UndefOr[CommonSeriesOptionsBorder] = js.native
    
    /** Quartile calculation has been performed in three different formulas to render the box and whisker series.
      * @Default {exclusive}
      */
    var boxPlotMode: js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.Chart.boxPlotMode | String] = js.native
    
    /** Options for customizing the bubble options of the Bubble series
      */
    var bubbleOptions: js.UndefOr[CommonSeriesOptionsBubbleOptions] = js.native
    
    /** Specifies spline tension value for cardinal spline type. Value ranges from 0 to 1.
      * @Default {0.5}
      */
    var cardinalSplineTension: js.UndefOr[Double] = js.native
    
    /** Name of the property in the datasource that contains close value for the series.
      * @Default {null}
      */
    var close: js.UndefOr[String] = js.native
    
    /** To render the column and bar type series in rectangle/cylinder shape. See
      * @Default {rectangle}
      */
    var columnFacet: js.UndefOr[ColumnFacet | String] = js.native
    
    /** Spacing between columns of different series. Value ranges from 0 to 1
      * @Default {0}
      */
    var columnSpacing: js.UndefOr[Double] = js.native
    
    /** Relative width of the columns in column type series. Value ranges from 0 to 1. Width also depends upon columnSpacing property.
      * @Default {0.7}
      */
    var columnWidth: js.UndefOr[Double] = js.native
    
    /** Options for customizing the waterfall connector line.
      */
    var connectorLine: js.UndefOr[CommonSeriesOptionsConnectorLine] = js.native
    
    /** Options for customizing the corner radius. cornerRadius property also takes the numeric input and applies it for all the four corners of the column.
      */
    var cornerRadius: js.UndefOr[CommonSeriesOptionsCornerRadius] = js.native
    
    /** Pattern of dashes and gaps used to stroke all the line type series.
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Set the dataSource for all series. It can be an array of JSON objects or an instance of ej.DataManager.
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.native
    
    /** Controls the size of the hole in doughnut series. Value ranges from 0 to 1
      * @Default {0.4}
      */
    var doughnutCoefficient: js.UndefOr[Double] = js.native
    
    /** Controls the size of the doughnut series. Value ranges from 0 to 1.
      * @Default {0.8}
      */
    var doughnutSize: js.UndefOr[Double] = js.native
    
    /** Options to customize the drag and drop in series.
      */
    var dragSettings: js.UndefOr[CommonSeriesOptionsDragSettings] = js.native
    
    /** Specifies the type of series to be drawn in radar or polar series.
      * @Default {line. See DrawType}
      */
    var drawType: js.UndefOr[DrawType | String] = js.native
    
    /** Options for customizing the empty point in the series.
      */
    var emptyPointSettings: js.UndefOr[CommonSeriesOptionsEmptyPointSettings] = js.native
    
    /** Enable/disable the animation for all the series.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** To avoid overlapping of data labels smartly.
      * @Default {true}
      */
    var enableSmartLabels: js.UndefOr[Boolean] = js.native
    
    /** Start angle of pie/doughnut series.
      * @Default {null}
      */
    var endAngle: js.UndefOr[Double] = js.native
    
    /** Options to customize the error bar in series.
      */
    var errorBar: js.UndefOr[CommonSeriesOptionsErrorBar] = js.native
    
    /** Explodes the pie/doughnut slices on mouse move.
      * @Default {false}
      */
    var explode: js.UndefOr[Boolean] = js.native
    
    /** Explodes all the slice of pie/doughnut on render.
      * @Default {false}
      */
    var explodeAll: js.UndefOr[Boolean] = js.native
    
    /** Index of the point to be exploded from pie/doughnut/pyramid/funnel.
      * @Default {null}
      */
    var explodeIndex: js.UndefOr[Double] = js.native
    
    /** Specifies the distance of the slice from the center, when it is exploded.
      * @Default {0.4}
      */
    var explodeOffset: js.UndefOr[Double] = js.native
    
    /** Fill color for all the series.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options for customizing the font of all the series.
      */
    var font: js.UndefOr[CommonSeriesOptionsFont] = js.native
    
    /** Sets the height of the funnel in funnel series. Values can be either pixel or percentage.
      * @Default {32.7%}
      */
    var funnelHeight: js.UndefOr[String] = js.native
    
    /** Sets the width of the funnel in funnel series. Values can be either pixel or percentage.
      * @Default {11.6%}
      */
    var funnelWidth: js.UndefOr[String] = js.native
    
    /** Gap between the slices in pyramid and funnel series.
      * @Default {0}
      */
    var gapRatio: js.UndefOr[Double] = js.native
    
    /** Distance between the two pie's in pieOfPie series.
      * @Default {50}
      */
    var gapWidth: js.UndefOr[Double] = js.native
    
    /** Name of the property in the datasource that contains high value for the series.
      * @Default {null}
      */
    var high: js.UndefOr[String] = js.native
    
    /** Options for customizing the appearance of the series or data point while highlighting.
      */
    var highlightSettings: js.UndefOr[CommonSeriesOptionsHighlightSettings] = js.native
    
    /** Specifies whether to join start and end point of a line/area series used in polar/radar chart to form a closed path.
      * @Default {true}
      */
    var isClosed: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether to stack the column series in polar/radar charts.
      * @Default {false}
      */
    var isStacking: js.UndefOr[Boolean] = js.native
    
    /** Renders the chart vertically. This is applicable only for Cartesian type series.
      * @Default {false}
      */
    var isTransposed: js.UndefOr[Boolean] = js.native
    
    /** Position of the data label in pie/doughnut/pyramid/funnel series. OutsideExtended position is not applicable for pyramid/funnel.
      * @Default {inside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.native
    
    /** Specifies the line cap of the series.
      * @Default {butt. See LineCap}
      */
    var lineCap: js.UndefOr[LineCap | String] = js.native
    
    /** Specifies the type of shape to be used where two lines meet.
      * @Default {round. See LineJoin}
      */
    var lineJoin: js.UndefOr[LineJoin | String] = js.native
    
    /** Name of the property in the datasource that contains low value for the series.
      * @Default {null}
      */
    var low: js.UndefOr[String] = js.native
    
    /** Options for displaying and customizing marker for individual point in a series. Marker contains shapes and/or data labels.
      */
    var marker: js.UndefOr[CommonSeriesOptionsMarker] = js.native
    
    /** Opacity of the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Name of the property in the datasource that contains open value for the series.
      * @Default {null}
      */
    var open: js.UndefOr[String] = js.native
    
    /** Options for customizing the outlier of the series.
      */
    var outlierSettings: js.UndefOr[CommonSeriesOptionsOutlierSettings] = js.native
    
    /** Name of a field in data source, where the fill color for all the data points is generated.
      */
    var palette: js.UndefOr[String] = js.native
    
    /** Controls the size of pie series. Value ranges from 0 to 1.
      * @Default {0.8}
      */
    var pieCoefficient: js.UndefOr[Double] = js.native
    
    /** Controls the size of the second pie in pieOfPie series. Value ranges from 0 to 1.
      * @Default {0.6}
      */
    var pieOfPieCoefficient: js.UndefOr[Double] = js.native
    
    /** Name of the property in the datasource that contains fill color for the series.
      * @Default {null}
      */
    var pointColorMappingName: js.UndefOr[String] = js.native
    
    /** Fill color for the positive column of the waterfall.
      * @Default {null}
      */
    var positiveFill: js.UndefOr[String] = js.native
    
    /** Specifies the mode of the pyramid series.
      * @Default {linear. See PyramidMode}
      */
    var pyramidMode: js.UndefOr[PyramidMode | String] = js.native
    
    /** Options for customizing the appearance of the series/data point on selection.
      */
    var selectionSettings: js.UndefOr[CommonSeriesOptionsSelectionSettings] = js.native
    
    /** Render the x mark in the center of the box and whisker series type.x represents the average value of the box and whisker series.
      * @Default {true}
      */
    var showMedian: js.UndefOr[Boolean] = js.native
    
    /** Name of the property in the datasource that contains the size value for the bubble series.
      * @Default {null}
      */
    var size: js.UndefOr[String] = js.native
    
    /** To render the spline series curve in different forms.
      * @Default {natural. See SplineType}
      */
    var splineType: js.UndefOr[SplineType | String] = js.native
    
    /** Specifies the mode for splitting the data points in pieOfPie series.
      * @Default {value. See SplitMode}
      */
    var splitMode: js.UndefOr[SplitMode | String] = js.native
    
    /** Split Value of pieOfPie series.
      * @Default {null}
      */
    var splitValue: js.UndefOr[String] = js.native
    
    /** Group of the stacking collection series.
      */
    var stackingGroup: js.UndefOr[String] = js.native
    
    /** Start angle from where the pie/doughnut series renders. By default it starts from 0.
      * @Default {null}
      */
    var startAngle: js.UndefOr[Double] = js.native
    
    /** Options for customizing the tooltip of chart.
      */
    var tooltip: js.UndefOr[CommonSeriesOptionsTooltip] = js.native
    
    /** Option to add the trendlines to chart.
      */
    var trendlines: js.UndefOr[js.Array[CommonSeriesOptionsTrendline]] = js.native
    
    /** Specifies the type of the series to render in chart.
      * @Default {column. See Type}
      */
    var `type`: js.UndefOr[typingsSlinky.ejWebAll.ej.Type | String] = js.native
    
    /** Enables or disables the visibility of legend item.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.native
    
    /** Specifies the name of the x-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
      * @Default {null}
      */
    var xAxisName: js.UndefOr[String] = js.native
    
    /** Name of the property in the datasource that contains x value for the series.
      * @Default {null}
      */
    var xName: js.UndefOr[String] = js.native
    
    /** Specifies the name of the y-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
      * @Default {null}
      */
    var yAxisName: js.UndefOr[String] = js.native
    
    /** Name of the property in the datasource that contains y value for the series.
      * @Default {null}
      */
    var yName: js.UndefOr[String] = js.native
    
    /** Z-order of the series.
      * @Default {0}
      */
    var zOrder: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptions {
    
    @scala.inline
    def apply(): CommonSeriesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptions]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMutableBuilder[Self <: CommonSeriesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBorder(value: CommonSeriesOptionsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBoxPlotMode(value: boxPlotMode | String): Self = StObject.set(x, "boxPlotMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxPlotModeUndefined: Self = StObject.set(x, "boxPlotMode", js.undefined)
      
      @scala.inline
      def setBubbleOptions(value: CommonSeriesOptionsBubbleOptions): Self = StObject.set(x, "bubbleOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleOptionsUndefined: Self = StObject.set(x, "bubbleOptions", js.undefined)
      
      @scala.inline
      def setCardinalSplineTension(value: Double): Self = StObject.set(x, "cardinalSplineTension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardinalSplineTensionUndefined: Self = StObject.set(x, "cardinalSplineTension", js.undefined)
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setColumnFacet(value: ColumnFacet | String): Self = StObject.set(x, "columnFacet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnFacetUndefined: Self = StObject.set(x, "columnFacet", js.undefined)
      
      @scala.inline
      def setColumnSpacing(value: Double): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpacingUndefined: Self = StObject.set(x, "columnSpacing", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setConnectorLine(value: CommonSeriesOptionsConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      @scala.inline
      def setCornerRadius(value: CommonSeriesOptionsCornerRadius): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDoughnutCoefficient(value: Double): Self = StObject.set(x, "doughnutCoefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoughnutCoefficientUndefined: Self = StObject.set(x, "doughnutCoefficient", js.undefined)
      
      @scala.inline
      def setDoughnutSize(value: Double): Self = StObject.set(x, "doughnutSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoughnutSizeUndefined: Self = StObject.set(x, "doughnutSize", js.undefined)
      
      @scala.inline
      def setDragSettings(value: CommonSeriesOptionsDragSettings): Self = StObject.set(x, "dragSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragSettingsUndefined: Self = StObject.set(x, "dragSettings", js.undefined)
      
      @scala.inline
      def setDrawType(value: DrawType | String): Self = StObject.set(x, "drawType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTypeUndefined: Self = StObject.set(x, "drawType", js.undefined)
      
      @scala.inline
      def setEmptyPointSettings(value: CommonSeriesOptionsEmptyPointSettings): Self = StObject.set(x, "emptyPointSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyPointSettingsUndefined: Self = StObject.set(x, "emptyPointSettings", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableSmartLabels(value: Boolean): Self = StObject.set(x, "enableSmartLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSmartLabelsUndefined: Self = StObject.set(x, "enableSmartLabels", js.undefined)
      
      @scala.inline
      def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setErrorBar(value: CommonSeriesOptionsErrorBar): Self = StObject.set(x, "errorBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorBarUndefined: Self = StObject.set(x, "errorBar", js.undefined)
      
      @scala.inline
      def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplodeAll(value: Boolean): Self = StObject.set(x, "explodeAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplodeAllUndefined: Self = StObject.set(x, "explodeAll", js.undefined)
      
      @scala.inline
      def setExplodeIndex(value: Double): Self = StObject.set(x, "explodeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplodeIndexUndefined: Self = StObject.set(x, "explodeIndex", js.undefined)
      
      @scala.inline
      def setExplodeOffset(value: Double): Self = StObject.set(x, "explodeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplodeOffsetUndefined: Self = StObject.set(x, "explodeOffset", js.undefined)
      
      @scala.inline
      def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: CommonSeriesOptionsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFunnelHeight(value: String): Self = StObject.set(x, "funnelHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunnelHeightUndefined: Self = StObject.set(x, "funnelHeight", js.undefined)
      
      @scala.inline
      def setFunnelWidth(value: String): Self = StObject.set(x, "funnelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunnelWidthUndefined: Self = StObject.set(x, "funnelWidth", js.undefined)
      
      @scala.inline
      def setGapRatio(value: Double): Self = StObject.set(x, "gapRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapRatioUndefined: Self = StObject.set(x, "gapRatio", js.undefined)
      
      @scala.inline
      def setGapWidth(value: Double): Self = StObject.set(x, "gapWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapWidthUndefined: Self = StObject.set(x, "gapWidth", js.undefined)
      
      @scala.inline
      def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHighlightSettings(value: CommonSeriesOptionsHighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      @scala.inline
      def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClosedUndefined: Self = StObject.set(x, "isClosed", js.undefined)
      
      @scala.inline
      def setIsStacking(value: Boolean): Self = StObject.set(x, "isStacking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStackingUndefined: Self = StObject.set(x, "isStacking", js.undefined)
      
      @scala.inline
      def setIsTransposed(value: Boolean): Self = StObject.set(x, "isTransposed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTransposedUndefined: Self = StObject.set(x, "isTransposed", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLineCap(value: LineCap | String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineJoin(value: LineJoin | String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      @scala.inline
      def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setMarker(value: CommonSeriesOptionsMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOutlierSettings(value: CommonSeriesOptionsOutlierSettings): Self = StObject.set(x, "outlierSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlierSettingsUndefined: Self = StObject.set(x, "outlierSettings", js.undefined)
      
      @scala.inline
      def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPieCoefficient(value: Double): Self = StObject.set(x, "pieCoefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPieCoefficientUndefined: Self = StObject.set(x, "pieCoefficient", js.undefined)
      
      @scala.inline
      def setPieOfPieCoefficient(value: Double): Self = StObject.set(x, "pieOfPieCoefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPieOfPieCoefficientUndefined: Self = StObject.set(x, "pieOfPieCoefficient", js.undefined)
      
      @scala.inline
      def setPointColorMappingName(value: String): Self = StObject.set(x, "pointColorMappingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointColorMappingNameUndefined: Self = StObject.set(x, "pointColorMappingName", js.undefined)
      
      @scala.inline
      def setPositiveFill(value: String): Self = StObject.set(x, "positiveFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveFillUndefined: Self = StObject.set(x, "positiveFill", js.undefined)
      
      @scala.inline
      def setPyramidMode(value: PyramidMode | String): Self = StObject.set(x, "pyramidMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPyramidModeUndefined: Self = StObject.set(x, "pyramidMode", js.undefined)
      
      @scala.inline
      def setSelectionSettings(value: CommonSeriesOptionsSelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      @scala.inline
      def setShowMedian(value: Boolean): Self = StObject.set(x, "showMedian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMedianUndefined: Self = StObject.set(x, "showMedian", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplineType(value: SplineType | String): Self = StObject.set(x, "splineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplineTypeUndefined: Self = StObject.set(x, "splineType", js.undefined)
      
      @scala.inline
      def setSplitMode(value: SplitMode | String): Self = StObject.set(x, "splitMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitModeUndefined: Self = StObject.set(x, "splitMode", js.undefined)
      
      @scala.inline
      def setSplitValue(value: String): Self = StObject.set(x, "splitValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitValueUndefined: Self = StObject.set(x, "splitValue", js.undefined)
      
      @scala.inline
      def setStackingGroup(value: String): Self = StObject.set(x, "stackingGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackingGroupUndefined: Self = StObject.set(x, "stackingGroup", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setTooltip(value: CommonSeriesOptionsTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTrendlines(value: js.Array[CommonSeriesOptionsTrendline]): Self = StObject.set(x, "trendlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrendlinesUndefined: Self = StObject.set(x, "trendlines", js.undefined)
      
      @scala.inline
      def setTrendlinesVarargs(value: CommonSeriesOptionsTrendline*): Self = StObject.set(x, "trendlines", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      @scala.inline
      def setXAxisName(value: String): Self = StObject.set(x, "xAxisName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAxisNameUndefined: Self = StObject.set(x, "xAxisName", js.undefined)
      
      @scala.inline
      def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      @scala.inline
      def setYAxisName(value: String): Self = StObject.set(x, "yAxisName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxisNameUndefined: Self = StObject.set(x, "yAxisName", js.undefined)
      
      @scala.inline
      def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
      
      @scala.inline
      def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsBorder extends StObject {
    
    /** Border color of all series.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** DashArray for border of the series.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Border width of all series.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsBorder {
    
    @scala.inline
    def apply(): CommonSeriesOptionsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsBorder]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsBorderMutableBuilder[Self <: CommonSeriesOptionsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsBubbleOptions extends StObject {
    
    /** Used for setting the maximum radius of the bubble
      * @Default {3}
      */
    var maxRadius: js.UndefOr[Double] = js.native
    
    /** Used for the setting the minimum radius of the bubble
      * @Default {1}
      */
    var minRadius: js.UndefOr[Double] = js.native
    
    /** Used for the calculation of the bubble radius based on the mode selected
      * @Default {minMax}
      */
    var radiusMode: js.UndefOr[RadiusMode | String] = js.native
  }
  object CommonSeriesOptionsBubbleOptions {
    
    @scala.inline
    def apply(): CommonSeriesOptionsBubbleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsBubbleOptions]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsBubbleOptionsMutableBuilder[Self <: CommonSeriesOptionsBubbleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxRadius(value: Double): Self = StObject.set(x, "maxRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRadiusUndefined: Self = StObject.set(x, "maxRadius", js.undefined)
      
      @scala.inline
      def setMinRadius(value: Double): Self = StObject.set(x, "minRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRadiusUndefined: Self = StObject.set(x, "minRadius", js.undefined)
      
      @scala.inline
      def setRadiusMode(value: RadiusMode | String): Self = StObject.set(x, "radiusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusModeUndefined: Self = StObject.set(x, "radiusMode", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsConnectorLine extends StObject {
    
    /** Color of the connector line.
      * @Default {#565656}
      */
    var color: js.UndefOr[String] = js.native
    
    /** DashArray of the connector line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** DashArray of the connector line.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Width of the connector line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsConnectorLine {
    
    @scala.inline
    def apply(): CommonSeriesOptionsConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsConnectorLine]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsConnectorLineMutableBuilder[Self <: CommonSeriesOptionsConnectorLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsCornerRadius extends StObject {
    
    /** Specifies the radius for the bottom left corner.
      * @Default {0}
      */
    var bottomLeft: js.UndefOr[Double] = js.native
    
    /** Specifies the radius for the bottom right corner.
      * @Default {0}
      */
    var bottomRight: js.UndefOr[Double] = js.native
    
    /** Specifies the radius for the top left corner.
      * @Default {0}
      */
    var topLeft: js.UndefOr[Double] = js.native
    
    /** Specifies the radius for the top right corner.
      * @Default {0}
      */
    var topRight: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsCornerRadius {
    
    @scala.inline
    def apply(): CommonSeriesOptionsCornerRadius = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsCornerRadius]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsCornerRadiusMutableBuilder[Self <: CommonSeriesOptionsCornerRadius] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      @scala.inline
      def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      @scala.inline
      def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      @scala.inline
      def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsDragSettings extends StObject {
    
    /** drag/drop the series
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Specifies the type of drag settings.
      * @Default {xy}
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CommonSeriesOptionsDragSettings {
    
    @scala.inline
    def apply(): CommonSeriesOptionsDragSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsDragSettings]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsDragSettingsMutableBuilder[Self <: CommonSeriesOptionsDragSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsEmptyPointSettings extends StObject {
    
    /** Specifies the mode of empty point.
      * @Default {gap}
      */
    var displayMode: js.UndefOr[EmptyPointMode | String] = js.native
    
    /** Options for customizing the color and border of the empty point in the series.
      */
    var style: js.UndefOr[CommonSeriesOptionsEmptyPointSettingsStyle] = js.native
    
    /** Controls the visibility of the empty point.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CommonSeriesOptionsEmptyPointSettings {
    
    @scala.inline
    def apply(): CommonSeriesOptionsEmptyPointSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettings]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsEmptyPointSettingsMutableBuilder[Self <: CommonSeriesOptionsEmptyPointSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayMode(value: EmptyPointMode | String): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      @scala.inline
      def setStyle(value: CommonSeriesOptionsEmptyPointSettingsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsEmptyPointSettingsStyle extends StObject {
    
    /** Options for customizing border of the empty point in the series.
      */
    var border: js.UndefOr[CommonSeriesOptionsEmptyPointSettingsStyleBorder] = js.native
    
    /** Color of the empty point.
      */
    var color: js.UndefOr[String] = js.native
  }
  object CommonSeriesOptionsEmptyPointSettingsStyle {
    
    @scala.inline
    def apply(): CommonSeriesOptionsEmptyPointSettingsStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettingsStyle]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsEmptyPointSettingsStyleMutableBuilder[Self <: CommonSeriesOptionsEmptyPointSettingsStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CommonSeriesOptionsEmptyPointSettingsStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsEmptyPointSettingsStyleBorder extends StObject {
    
    /** Border color of the empty point.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the empty point.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsEmptyPointSettingsStyleBorder {
    
    @scala.inline
    def apply(): CommonSeriesOptionsEmptyPointSettingsStyleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsEmptyPointSettingsStyleBorder]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsEmptyPointSettingsStyleBorderMutableBuilder[Self <: CommonSeriesOptionsEmptyPointSettingsStyleBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsErrorBar extends StObject {
    
    /** Options for customizing the error bar cap.
      */
    var cap: js.UndefOr[CommonSeriesOptionsErrorBarCap] = js.native
    
    /** Specifies the direction of error bar.
      * @Default {both}
      */
    var direction: js.UndefOr[ErrorBarDirection | String] = js.native
    
    /** Fill color of the error bar.
      * @Default {#000000}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Value of horizontal  error bar.
      * @Default {1}
      */
    var horizontalErrorValue: js.UndefOr[Double] = js.native
    
    /** Value of negative horizontal error bar.
      * @Default {1}
      */
    var horizontalNegativeErrorValue: js.UndefOr[Double] = js.native
    
    /** Value of positive horizontal error bar.
      * @Default {1}
      */
    var horizontalPositiveErrorValue: js.UndefOr[Double] = js.native
    
    /** Specifies the mode of error bar.
      * @Default {vertical}
      */
    var mode: js.UndefOr[ErrorBarMode | String] = js.native
    
    /** Specifies the type of error bar.
      * @Default {FixedValue}
      */
    var `type`: js.UndefOr[ErrorBarType | String] = js.native
    
    /** Value of vertical error bar.
      * @Default {3}
      */
    var verticalErrorValue: js.UndefOr[Double] = js.native
    
    /** Value of negative vertical error bar.
      * @Default {5}
      */
    var verticalNegativeErrorValue: js.UndefOr[Double] = js.native
    
    /** Value of positive vertical error bar.
      * @Default {5}
      */
    var verticalPositiveErrorValue: js.UndefOr[Double] = js.native
    
    /** Show/hides the error bar
      * @Default {visible}
      */
    var visibility: js.UndefOr[Boolean] = js.native
    
    /** Width of the error bar.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsErrorBar {
    
    @scala.inline
    def apply(): CommonSeriesOptionsErrorBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsErrorBar]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsErrorBarMutableBuilder[Self <: CommonSeriesOptionsErrorBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCap(value: CommonSeriesOptionsErrorBarCap): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
      
      @scala.inline
      def setDirection(value: ErrorBarDirection | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHorizontalErrorValue(value: Double): Self = StObject.set(x, "horizontalErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalErrorValueUndefined: Self = StObject.set(x, "horizontalErrorValue", js.undefined)
      
      @scala.inline
      def setHorizontalNegativeErrorValue(value: Double): Self = StObject.set(x, "horizontalNegativeErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalNegativeErrorValueUndefined: Self = StObject.set(x, "horizontalNegativeErrorValue", js.undefined)
      
      @scala.inline
      def setHorizontalPositiveErrorValue(value: Double): Self = StObject.set(x, "horizontalPositiveErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalPositiveErrorValueUndefined: Self = StObject.set(x, "horizontalPositiveErrorValue", js.undefined)
      
      @scala.inline
      def setMode(value: ErrorBarMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setType(value: ErrorBarType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVerticalErrorValue(value: Double): Self = StObject.set(x, "verticalErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalErrorValueUndefined: Self = StObject.set(x, "verticalErrorValue", js.undefined)
      
      @scala.inline
      def setVerticalNegativeErrorValue(value: Double): Self = StObject.set(x, "verticalNegativeErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalNegativeErrorValueUndefined: Self = StObject.set(x, "verticalNegativeErrorValue", js.undefined)
      
      @scala.inline
      def setVerticalPositiveErrorValue(value: Double): Self = StObject.set(x, "verticalPositiveErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalPositiveErrorValueUndefined: Self = StObject.set(x, "verticalPositiveErrorValue", js.undefined)
      
      @scala.inline
      def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsErrorBarCap extends StObject {
    
    /** Color of the error bar cap.
      * @Default {â€œ#000000â€}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Length of the error bar cap.
      * @Default {1}
      */
    var length: js.UndefOr[Double] = js.native
    
    /** Show/Hides the error bar cap.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the error bar cap.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsErrorBarCap {
    
    @scala.inline
    def apply(): CommonSeriesOptionsErrorBarCap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsErrorBarCap]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsErrorBarCapMutableBuilder[Self <: CommonSeriesOptionsErrorBarCap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsFont extends StObject {
    
    /** Font color of the text in all series.
      * @Default {#707070}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font Family for all the series.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specifies the font Style for all the series.
      * @Default {normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Specifies the font weight for all the series.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity for text in all the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size for text in all the series.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object CommonSeriesOptionsFont {
    
    @scala.inline
    def apply(): CommonSeriesOptionsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsFont]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsFontMutableBuilder[Self <: CommonSeriesOptionsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsHighlightSettings extends StObject {
    
    /** Options for customizing the border of series on highlight.
      */
    var border: js.UndefOr[CommonSeriesOptionsHighlightSettingsBorder] = js.native
    
    /** Color of the series/point on highlight.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Custom pattern for the series on highlight.
      */
    var customPattern: js.UndefOr[String] = js.native
    
    /** Enables/disables the ability to highlight the series or data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether the series or data point has to be highlighted.
      * @Default {series. See Mode}
      */
    var mode: js.UndefOr[Mode | String] = js.native
    
    /** Opacity of the series/point on highlight.
      * @Default {0.6}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the pattern for the series/point on highlight.
      * @Default {none. See Pattern}
      */
    var pattern: js.UndefOr[String] = js.native
  }
  object CommonSeriesOptionsHighlightSettings {
    
    @scala.inline
    def apply(): CommonSeriesOptionsHighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsHighlightSettings]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsHighlightSettingsMutableBuilder[Self <: CommonSeriesOptionsHighlightSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CommonSeriesOptionsHighlightSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCustomPattern(value: String): Self = StObject.set(x, "customPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPatternUndefined: Self = StObject.set(x, "customPattern", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsHighlightSettingsBorder extends StObject {
    
    /** Border color of the series/point on highlight.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the series/point on highlight.
      * @Default {2}
      */
    var width: js.UndefOr[String] = js.native
  }
  object CommonSeriesOptionsHighlightSettingsBorder {
    
    @scala.inline
    def apply(): CommonSeriesOptionsHighlightSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsHighlightSettingsBorder]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsHighlightSettingsBorderMutableBuilder[Self <: CommonSeriesOptionsHighlightSettingsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarker extends StObject {
    
    /** Options for customizing the border of the marker shape.
      */
    var border: js.UndefOr[CommonSeriesOptionsMarkerBorder] = js.native
    
    /** Options for displaying and customizing data labels.
      */
    var dataLabel: js.UndefOr[CommonSeriesOptionsMarkerDataLabel] = js.native
    
    /** Color of the marker shape.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** The URL for the Image to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** Opacity of the marker.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the shape of the marker.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Options for customizing the size of the marker shape.
      */
    var size: js.UndefOr[CommonSeriesOptionsMarkerSize] = js.native
    
    /** Controls the visibility of the marker shape.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CommonSeriesOptionsMarker {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarker]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerMutableBuilder[Self <: CommonSeriesOptionsMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CommonSeriesOptionsMarkerBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDataLabel(value: CommonSeriesOptionsMarkerDataLabel): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: CommonSeriesOptionsMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarkerBorder extends StObject {
    
    /** Border color of the marker shape.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the marker shape.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsMarkerBorder {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarkerBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerBorder]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerBorderMutableBuilder[Self <: CommonSeriesOptionsMarkerBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarkerDataLabel extends StObject {
    
    /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
      * @Default {null}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Options for customizing the border of the data label.
      */
    var border: js.UndefOr[CommonSeriesOptionsMarkerDataLabelBorder] = js.native
    
    /** Options for displaying and customizing the line that connects point and data label.
      */
    var connectorLine: js.UndefOr[CommonSeriesOptionsMarkerDataLabelConnectorLine] = js.native
    
    /** Enables saturation to the data label.
      * @Default {false}
      */
    var enableContrastColor: js.UndefOr[Boolean] = js.native
    
    /** Enable the wrap option to the data label.
      * @Default {false}
      */
    var enableWrap: js.UndefOr[Boolean] = js.native
    
    /** Background color of the data label.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[CommonSeriesOptionsMarkerDataLabelFont] = js.native
    
    /** Horizontal alignment of the data label.
      * @Default {center}
      */
    var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.native
    
    /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
      */
    var margin: js.UndefOr[CommonSeriesOptionsMarkerDataLabelMargin] = js.native
    
    /** Maximum label width of the data label.
      * @Default {null}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.native
    
    /** Options for customizing the datalabel positions
      */
    var offset: js.UndefOr[CommonSeriesOptionsMarkerDataLabelOffset] = js.native
    
    /** Opacity of the data label.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Background shape of the data label.
      * @Default {none. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Displays the partially visible labels inside the chart Area
      * @Default {false}
      */
    var showEdgeLabels: js.UndefOr[Boolean] = js.native
    
    /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      */
    var template: js.UndefOr[String] = js.native
    
    /** Name of a field in data source, where datalabel text is displayed.
      */
    var textMappingName: js.UndefOr[String] = js.native
    
    /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
      * candle and OHLC.
      * @Default {top. See TextPosition}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.native
    
    /** Vertical alignment of the data label.
      * @Default {center}
      */
    var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.native
    
    /** Controls the visibility of the data labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CommonSeriesOptionsMarkerDataLabel {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarkerDataLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabel]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerDataLabelMutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setBorder(value: CommonSeriesOptionsMarkerDataLabelBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setConnectorLine(value: CommonSeriesOptionsMarkerDataLabelConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      @scala.inline
      def setEnableContrastColor(value: Boolean): Self = StObject.set(x, "enableContrastColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableContrastColorUndefined: Self = StObject.set(x, "enableContrastColor", js.undefined)
      
      @scala.inline
      def setEnableWrap(value: Boolean): Self = StObject.set(x, "enableWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWrapUndefined: Self = StObject.set(x, "enableWrap", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: CommonSeriesOptionsMarkerDataLabelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHorizontalTextAlignment(value: HorizontalTextAlignment | String): Self = StObject.set(x, "horizontalTextAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "horizontalTextAlignment", js.undefined)
      
      @scala.inline
      def setMargin(value: CommonSeriesOptionsMarkerDataLabelMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      @scala.inline
      def setOffset(value: CommonSeriesOptionsMarkerDataLabelOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setShowEdgeLabels(value: Boolean): Self = StObject.set(x, "showEdgeLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowEdgeLabelsUndefined: Self = StObject.set(x, "showEdgeLabels", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTextMappingName(value: String): Self = StObject.set(x, "textMappingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMappingNameUndefined: Self = StObject.set(x, "textMappingName", js.undefined)
      
      @scala.inline
      def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      @scala.inline
      def setVerticalTextAlignment(value: VerticalTextAlignment | String): Self = StObject.set(x, "verticalTextAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalTextAlignmentUndefined: Self = StObject.set(x, "verticalTextAlignment", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarkerDataLabelBorder extends StObject {
    
    /** Border color of the data label.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the data label.
      * @Default {0.1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsMarkerDataLabelBorder {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarkerDataLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelBorder]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerDataLabelBorderMutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarkerDataLabelConnectorLine extends StObject {
    
    /** Color of the connector line.
      * @Default {#565656}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Height of the connector line.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
      * @Default {line. See ConnectorLineType}
      */
    var `type`: js.UndefOr[ConnectorLineType | String] = js.native
    
    /** Width of the connector.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsMarkerDataLabelConnectorLine {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarkerDataLabelConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelConnectorLine]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerDataLabelConnectorLineMutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setType(value: ConnectorLineType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarkerDataLabelFont extends StObject {
    
    /** Font color of the data label text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the data label.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the data label.
      * @Default {regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object CommonSeriesOptionsMarkerDataLabelFont {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarkerDataLabelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelFont]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerDataLabelFontMutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarkerDataLabelMargin extends StObject {
    
    /** Bottom margin of the text.
      * @Default {5}
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** Left margin of the text.
      * @Default {5}
      */
    var left: js.UndefOr[Double] = js.native
    
    /** Right margin of the text.
      * @Default {5}
      */
    var right: js.UndefOr[Double] = js.native
    
    /** Top margin of the text.
      * @Default {5}
      */
    var top: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsMarkerDataLabelMargin {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarkerDataLabelMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelMargin]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerDataLabelMarginMutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarkerDataLabelOffset extends StObject {
    
    /** X value or horizontal offset to position the labels in chart.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Y value or vertical offset to position the labels.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsMarkerDataLabelOffset {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarkerDataLabelOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabelOffset]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerDataLabelOffsetMutableBuilder[Self <: CommonSeriesOptionsMarkerDataLabelOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsMarkerSize extends StObject {
    
    /** Height of the marker.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Width of the marker.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsMarkerSize {
    
    @scala.inline
    def apply(): CommonSeriesOptionsMarkerSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsMarkerSize]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsMarkerSizeMutableBuilder[Self <: CommonSeriesOptionsMarkerSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsOutlierSettings extends StObject {
    
    /** Specifies the shape of the outlier.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Options for customizing the size of the outlier shape.
      */
    var size: js.UndefOr[CommonSeriesOptionsOutlierSettingsSize] = js.native
  }
  object CommonSeriesOptionsOutlierSettings {
    
    @scala.inline
    def apply(): CommonSeriesOptionsOutlierSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsOutlierSettings]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsOutlierSettingsMutableBuilder[Self <: CommonSeriesOptionsOutlierSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: CommonSeriesOptionsOutlierSettingsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsOutlierSettingsSize extends StObject {
    
    /** Height of the outlier shape.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Width of the outlier shape.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsOutlierSettingsSize {
    
    @scala.inline
    def apply(): CommonSeriesOptionsOutlierSettingsSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsOutlierSettingsSize]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsOutlierSettingsSizeMutableBuilder[Self <: CommonSeriesOptionsOutlierSettingsSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsSelectionSettings extends StObject {
    
    /** Options for customizing the border of the series on selection.
      */
    var border: js.UndefOr[CommonSeriesOptionsSelectionSettingsBorder] = js.native
    
    /** Color of the series/point on selection.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Custom pattern for the series on selection.
      */
    var customPattern: js.UndefOr[String] = js.native
    
    /** Enables/disables the ability to select a series/data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether the series or data point has to be selected.
      * @Default {series. See Mode}
      */
    var mode: js.UndefOr[Mode | String] = js.native
    
    /** Opacity of the series/point on selection.
      * @Default {0.6}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the pattern for the series/point on selection.
      * @Default {none. See Pattern}
      */
    var pattern: js.UndefOr[String] = js.native
    
    /** Specifies the drawn rectangle type.
      * @Default {xy}
      */
    var rangeType: js.UndefOr[RangeType | String] = js.native
    
    /** Specifies the type of selection.
      * @Default {single}
      */
    var `type`: js.UndefOr[SelectionType | String] = js.native
  }
  object CommonSeriesOptionsSelectionSettings {
    
    @scala.inline
    def apply(): CommonSeriesOptionsSelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsSelectionSettings]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsSelectionSettingsMutableBuilder[Self <: CommonSeriesOptionsSelectionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CommonSeriesOptionsSelectionSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCustomPattern(value: String): Self = StObject.set(x, "customPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPatternUndefined: Self = StObject.set(x, "customPattern", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setRangeType(value: RangeType | String): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
      
      @scala.inline
      def setType(value: SelectionType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsSelectionSettingsBorder extends StObject {
    
    /** Border color of the series/point on selection.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the series/point on selection.
      * @Default {2}
      */
    var width: js.UndefOr[String] = js.native
  }
  object CommonSeriesOptionsSelectionSettingsBorder {
    
    @scala.inline
    def apply(): CommonSeriesOptionsSelectionSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsSelectionSettingsBorder]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsSelectionSettingsBorderMutableBuilder[Self <: CommonSeriesOptionsSelectionSettingsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsTooltip extends StObject {
    
    /** Options for customizing the border of the tooltip.
      */
    var border: js.UndefOr[CommonSeriesOptionsTooltipBorder] = js.native
    
    /** Specifies the duration, the tooltip has to be displayed.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.native
    
    /** Enables/disables the animation of the tooltip when moving from one point to other.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Background color of the tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Format of the tooltip content.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.native
    
    /** Opacity of the tooltip.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Customize the corner radius of the tooltip rectangle.
      * @Default {0}
      */
    var rx: js.UndefOr[Double] = js.native
    
    /** Customize the corner radius of the tooltip rectangle.
      * @Default {0}
      */
    var ry: js.UndefOr[Double] = js.native
    
    /** Custom template to format the tooltip content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
    
    /** Controls the visibility of the tooltip.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CommonSeriesOptionsTooltip {
    
    @scala.inline
    def apply(): CommonSeriesOptionsTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTooltip]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsTooltipMutableBuilder[Self <: CommonSeriesOptionsTooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CommonSeriesOptionsTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsTooltipBorder extends StObject {
    
    /** Border color of the tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsTooltipBorder {
    
    @scala.inline
    def apply(): CommonSeriesOptionsTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTooltipBorder]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsTooltipBorderMutableBuilder[Self <: CommonSeriesOptionsTooltipBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsTrendline extends StObject {
    
    /** Past trends of the current series.
      * @Default {0}
      */
    var backwardForecast: js.UndefOr[Double] = js.native
    
    /** Pattern of dashes and gaps used to stroke the trendline.
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Fill color of the trendlines.
      * @Default {#0000FF}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Future trends of the current series.
      * @Default {0}
      */
    var forwardForecast: js.UndefOr[Double] = js.native
    
    /** Specifies the intercept value of the trendlines.
      * @Default {null}
      */
    var intercept: js.UndefOr[Double] = js.native
    
    /** Name for the trendlines that is to be displayed in the legend text.
      * @Default {trendline}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Opacity of the trendline.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the moving average starting period value.
      * @Default {2}
      */
    var period: js.UndefOr[Double] = js.native
    
    /** Specifies the order of the polynomial trendlines.
      * @Default {0}
      */
    var polynomialOrder: js.UndefOr[Double] = js.native
    
    /** Options for customizing the tooltip of the trendlines in the chart.
      */
    var tooltip: js.UndefOr[CommonSeriesOptionsTrendlinesTooltip] = js.native
    
    /** Specifies the type of the trendline for the series.
      * @Default {linear. See TrendlinesType}
      */
    var `type`: js.UndefOr[TrendlinesType | String] = js.native
    
    /** Show/hides the trendline.
      */
    var visibility: js.UndefOr[Boolean] = js.native
    
    /** Show/hides the trendline legend.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.native
    
    /** Width of the trendlines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsTrendline {
    
    @scala.inline
    def apply(): CommonSeriesOptionsTrendline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTrendline]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsTrendlineMutableBuilder[Self <: CommonSeriesOptionsTrendline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackwardForecast(value: Double): Self = StObject.set(x, "backwardForecast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackwardForecastUndefined: Self = StObject.set(x, "backwardForecast", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setForwardForecast(value: Double): Self = StObject.set(x, "forwardForecast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardForecastUndefined: Self = StObject.set(x, "forwardForecast", js.undefined)
      
      @scala.inline
      def setIntercept(value: Double): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setPolynomialOrder(value: Double): Self = StObject.set(x, "polynomialOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolynomialOrderUndefined: Self = StObject.set(x, "polynomialOrder", js.undefined)
      
      @scala.inline
      def setTooltip(value: CommonSeriesOptionsTrendlinesTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: TrendlinesType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsTrendlinesTooltip extends StObject {
    
    /** Options for customizing the border of the  trendline tooltip.
      */
    var border: js.UndefOr[CommonSeriesOptionsTrendlinesTooltipBorder] = js.native
    
    /** Specifies the duration, the tooltip has to be displayed.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.native
    
    /** Enables/disables the animation of the trendline tooltip when moving from one point to other.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Background color of the trendline tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Format of the tooltip content displayed in the trendlines.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.native
    
    /** Opacity of the trendline tooltip.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Customize the corner radius of the trendline tooltip rectangle.
      * @Default {0}
      */
    var rx: js.UndefOr[Double] = js.native
    
    /** Customize the corner radius of the trendline tooltip rectangle.
      * @Default {0}
      */
    var ry: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsTrendlinesTooltip {
    
    @scala.inline
    def apply(): CommonSeriesOptionsTrendlinesTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTrendlinesTooltip]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsTrendlinesTooltipMutableBuilder[Self <: CommonSeriesOptionsTrendlinesTooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CommonSeriesOptionsTrendlinesTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
  
  @js.native
  trait CommonSeriesOptionsTrendlinesTooltipBorder extends StObject {
    
    /** Border color of the trendline tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the trendline tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CommonSeriesOptionsTrendlinesTooltipBorder {
    
    @scala.inline
    def apply(): CommonSeriesOptionsTrendlinesTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSeriesOptionsTrendlinesTooltipBorder]
    }
    
    @scala.inline
    implicit class CommonSeriesOptionsTrendlinesTooltipBorderMutableBuilder[Self <: CommonSeriesOptionsTrendlinesTooltipBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Crosshair extends StObject {
    
    /** Options for customizing the crosshair line.
      */
    var line: js.UndefOr[CrosshairLine] = js.native
    
    /** Options for customizing the marker in crosshair.
      */
    var marker: js.UndefOr[CrosshairMarker] = js.native
    
    /** Options for customizing the trackball tooltip.
      */
    var trackballTooltipSettings: js.UndefOr[CrosshairTrackballTooltipSettings] = js.native
    
    /** Specifies the type of the crosshair. It can be trackball or crosshair
      * @Default {crosshair. See CrosshairType}
      */
    var `type`: js.UndefOr[CrosshairType | String] = js.native
    
    /** Show/hides the crosshair/trackball visibility.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Crosshair {
    
    @scala.inline
    def apply(): Crosshair = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Crosshair]
    }
    
    @scala.inline
    implicit class CrosshairMutableBuilder[Self <: Crosshair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLine(value: CrosshairLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setMarker(value: CrosshairMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setTrackballTooltipSettings(value: CrosshairTrackballTooltipSettings): Self = StObject.set(x, "trackballTooltipSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackballTooltipSettingsUndefined: Self = StObject.set(x, "trackballTooltipSettings", js.undefined)
      
      @scala.inline
      def setType(value: CrosshairType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CrosshairLine extends StObject {
    
    /** Color of the crosshair line.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Width of the crosshair line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CrosshairLine {
    
    @scala.inline
    def apply(): CrosshairLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairLine]
    }
    
    @scala.inline
    implicit class CrosshairLineMutableBuilder[Self <: CrosshairLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CrosshairMarker extends StObject {
    
    /** Options for customizing the border.
      */
    var border: js.UndefOr[CrosshairMarkerBorder] = js.native
    
    /** Opacity of the marker.
      * @Default {true}
      */
    var opacity: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the size of the marker.
      */
    var size: js.UndefOr[CrosshairMarkerSize] = js.native
    
    /** Show/hides the marker.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CrosshairMarker {
    
    @scala.inline
    def apply(): CrosshairMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairMarker]
    }
    
    @scala.inline
    implicit class CrosshairMarkerMutableBuilder[Self <: CrosshairMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CrosshairMarkerBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: CrosshairMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CrosshairMarkerBorder extends StObject {
    
    /** Border width of the marker.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CrosshairMarkerBorder {
    
    @scala.inline
    def apply(): CrosshairMarkerBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairMarkerBorder]
    }
    
    @scala.inline
    implicit class CrosshairMarkerBorderMutableBuilder[Self <: CrosshairMarkerBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CrosshairMarkerSize extends StObject {
    
    /** Height of the marker.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Width of the marker.
      * @Default {10}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CrosshairMarkerSize {
    
    @scala.inline
    def apply(): CrosshairMarkerSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairMarkerSize]
    }
    
    @scala.inline
    implicit class CrosshairMarkerSizeMutableBuilder[Self <: CrosshairMarkerSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CrosshairTrackballTooltipSettings extends StObject {
    
    /** Options for customizing the trackball tooltip border.
      */
    var border: js.UndefOr[CrosshairTrackballTooltipSettingsBorder] = js.native
    
    /** Background color of the trackball tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Specifies the mode of the trackball tooltip.
      * @Default {float. See CrosshairMode}
      */
    var mode: js.UndefOr[CrosshairMode | String] = js.native
    
    /** Opacity value of the trackball tooltip.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Rounded corner x value of the trackball tooltip.
      * @Default {3}
      */
    var rx: js.UndefOr[Double] = js.native
    
    /** Rounded corner y value of the trackball tooltip.
      * @Default {3}
      */
    var ry: js.UndefOr[Double] = js.native
  }
  object CrosshairTrackballTooltipSettings {
    
    @scala.inline
    def apply(): CrosshairTrackballTooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairTrackballTooltipSettings]
    }
    
    @scala.inline
    implicit class CrosshairTrackballTooltipSettingsMutableBuilder[Self <: CrosshairTrackballTooltipSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CrosshairTrackballTooltipSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setMode(value: CrosshairMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
  
  @js.native
  trait CrosshairTrackballTooltipSettingsBorder extends StObject {
    
    /** Border color of the trackball tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the trackball tooltip.
      * @Default {null}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CrosshairTrackballTooltipSettingsBorder {
    
    @scala.inline
    def apply(): CrosshairTrackballTooltipSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairTrackballTooltipSettingsBorder]
    }
    
    @scala.inline
    implicit class CrosshairTrackballTooltipSettingsBorderMutableBuilder[Self <: CrosshairTrackballTooltipSettingsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DisplayTextRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** text - Text displayed in data label. You can add custom text to the data label    locationX - X-coordinate of data label location    locationY - Y-coordinate of data label
      * location    seriesIndex - Index of the series in series Collection whose data label is being rendered    pointIndex - Index of the point in series whose data label is being
      * rendered
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DisplayTextRenderingEventArgs {
    
    @scala.inline
    def apply(): DisplayTextRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayTextRenderingEventArgs]
    }
    
    @scala.inline
    implicit class DisplayTextRenderingEventArgsMutableBuilder[Self <: DisplayTextRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragEndEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** seriesIndex - Series Index of the point held for dragging    pointIndex - PointIndex of the point held for dragging    oldValue - Previous value of the point before dragging
      * newValue - Current value of the point    series - Contains the all the series information of the chart
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DragEndEventArgs {
    
    @scala.inline
    def apply(): DragEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEndEventArgs]
    }
    
    @scala.inline
    implicit class DragEndEventArgsMutableBuilder[Self <: DragEndEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragStartEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** seriesIndex - Series Index of the point held for dragging    pointIndex - PointIndex of the point held for dragging    point - Information of the point held for dragging
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DragStartEventArgs {
    
    @scala.inline
    def apply(): DragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStartEventArgs]
    }
    
    @scala.inline
    implicit class DragStartEventArgsMutableBuilder[Self <: DragStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DraggingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** seriesIndex - Series Index of the point held for dragging    pointIndex - PointIndex of the point held for dragging    oldValue - Previous value of the point before dragging
      * newValue - Current value of the point
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DraggingEventArgs {
    
    @scala.inline
    def apply(): DraggingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggingEventArgs]
    }
    
    @scala.inline
    implicit class DraggingEventArgsMutableBuilder[Self <: DraggingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ErrorBarRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** errorBar - Error bar Object
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ErrorBarRenderingEventArgs {
    
    @scala.inline
    def apply(): ErrorBarRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarRenderingEventArgs]
    }
    
    @scala.inline
    implicit class ErrorBarRenderingEventArgsMutableBuilder[Self <: ErrorBarRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ExportSettings extends StObject {
    
    /** Specifies the name of the action URL
      */
    var action: js.UndefOr[String] = js.native
    
    /** Specifies the angle for rotation
      * @Default {0}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Specifies the downloading filename
      * @Default {chart}
      */
    var filename: js.UndefOr[String] = js.native
    
    /** Specifies the mode of exporting
      * @Default {client}
      */
    var mode: js.UndefOr[ExportingMode | String] = js.native
    
    /** Enable/ disable the multiple excel exporting
      * @Default {false}
      */
    var multipleExport: js.UndefOr[Boolean] = js.native
    
    /** Specifies the orientation of the document
      * @Default {portrait}
      */
    var orientation: js.UndefOr[ExportingOrientation | String] = js.native
    
    /** Specifies the format of the file to export
      * @Default {png}
      */
    var `type`: js.UndefOr[ExportingType | String] = js.native
  }
  object ExportSettings {
    
    @scala.inline
    def apply(): ExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSettings]
    }
    
    @scala.inline
    implicit class ExportSettingsMutableBuilder[Self <: ExportSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setMode(value: ExportingMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMultipleExport(value: Boolean): Self = StObject.set(x, "multipleExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleExportUndefined: Self = StObject.set(x, "multipleExport", js.undefined)
      
      @scala.inline
      def setOrientation(value: ExportingOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setType(value: ExportingType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Indicator extends StObject {
    
    /** Specifies animation duration for indicator rendering.
      * @Default {null}
      */
    var animationDuration: js.UndefOr[Boolean] = js.native
    
    /** The dPeriod value for stochastic indicator.
      * @Default {3}
      */
    var dPeriod: js.UndefOr[Double] = js.native
    
    /** Enables/disables the animation.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Color of the technical indicator.
      * @Default {#00008B}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options to customize the histogram in MACD indicator.
      */
    var histogram: js.UndefOr[IndicatorsHistogram] = js.native
    
    /** Specifies the k period in stochastic indicator.
      * @Default {3}
      */
    var kPeriod: js.UndefOr[Double] = js.native
    
    /** Specifies the long period in MACD indicator.
      * @Default {26}
      */
    var longPeriod: js.UndefOr[Double] = js.native
    
    /** Options to customize the lower line in indicators.
      */
    var lowerLine: js.UndefOr[IndicatorsLowerLine] = js.native
    
    /** Options to customize the MACD line.
      */
    var macdLine: js.UndefOr[IndicatorsMacdLine] = js.native
    
    /** Specifies the type of the MACD indicator.
      * @Default {line. See MACDType}
      */
    var macdType: js.UndefOr[String] = js.native
    
    /** Specifies period value in indicator.
      * @Default {14}
      */
    var period: js.UndefOr[Double] = js.native
    
    /** Options to customize the period line in indicators.
      */
    var periodLine: js.UndefOr[IndicatorsPeriodLine] = js.native
    
    /** Name of the series for which indicator has to be drawn.
      */
    var seriesName: js.UndefOr[String] = js.native
    
    /** Specifies the short period in MACD indicator.
      * @Default {13}
      */
    var shortPeriod: js.UndefOr[Double] = js.native
    
    /** Specifies the standard deviation value for Bollinger band indicator.
      * @Default {2}
      */
    var standardDeviations: js.UndefOr[Double] = js.native
    
    /** Options to customize the tooltip.
      */
    var tooltip: js.UndefOr[IndicatorsTooltip] = js.native
    
    /** Trigger value of MACD indicator.
      * @Default {9}
      */
    var trigger: js.UndefOr[Double] = js.native
    
    /** Specifies the type of indicator that has to be rendered.
      * @Default {sma. See IndicatorsType}
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Options to customize the upper line in indicators
      */
    var upperLine: js.UndefOr[IndicatorsUpperLine] = js.native
    
    /** Specifies the visibility of indicator.
      * @Default {visible}
      */
    var visibility: js.UndefOr[String] = js.native
    
    /** Width of the indicator line.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
    
    /** Name of the horizontal axis used for indicator. Primary X axis is used when x axis name is not specified.
      */
    var xAxisName: js.UndefOr[String] = js.native
    
    /** Name of the vertical axis used for indicator. Primary Y axis is used when y axis name is not specified
      */
    var yAxisName: js.UndefOr[String] = js.native
  }
  object Indicator {
    
    @scala.inline
    def apply(): Indicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indicator]
    }
    
    @scala.inline
    implicit class IndicatorMutableBuilder[Self <: Indicator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Boolean): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setDPeriod(value: Double): Self = StObject.set(x, "dPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDPeriodUndefined: Self = StObject.set(x, "dPeriod", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHistogram(value: IndicatorsHistogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
      
      @scala.inline
      def setKPeriod(value: Double): Self = StObject.set(x, "kPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKPeriodUndefined: Self = StObject.set(x, "kPeriod", js.undefined)
      
      @scala.inline
      def setLongPeriod(value: Double): Self = StObject.set(x, "longPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongPeriodUndefined: Self = StObject.set(x, "longPeriod", js.undefined)
      
      @scala.inline
      def setLowerLine(value: IndicatorsLowerLine): Self = StObject.set(x, "lowerLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerLineUndefined: Self = StObject.set(x, "lowerLine", js.undefined)
      
      @scala.inline
      def setMacdLine(value: IndicatorsMacdLine): Self = StObject.set(x, "macdLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacdLineUndefined: Self = StObject.set(x, "macdLine", js.undefined)
      
      @scala.inline
      def setMacdType(value: String): Self = StObject.set(x, "macdType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacdTypeUndefined: Self = StObject.set(x, "macdType", js.undefined)
      
      @scala.inline
      def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodLine(value: IndicatorsPeriodLine): Self = StObject.set(x, "periodLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodLineUndefined: Self = StObject.set(x, "periodLine", js.undefined)
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setSeriesName(value: String): Self = StObject.set(x, "seriesName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesNameUndefined: Self = StObject.set(x, "seriesName", js.undefined)
      
      @scala.inline
      def setShortPeriod(value: Double): Self = StObject.set(x, "shortPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortPeriodUndefined: Self = StObject.set(x, "shortPeriod", js.undefined)
      
      @scala.inline
      def setStandardDeviations(value: Double): Self = StObject.set(x, "standardDeviations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardDeviationsUndefined: Self = StObject.set(x, "standardDeviations", js.undefined)
      
      @scala.inline
      def setTooltip(value: IndicatorsTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTrigger(value: Double): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpperLine(value: IndicatorsUpperLine): Self = StObject.set(x, "upperLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpperLineUndefined: Self = StObject.set(x, "upperLine", js.undefined)
      
      @scala.inline
      def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXAxisName(value: String): Self = StObject.set(x, "xAxisName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAxisNameUndefined: Self = StObject.set(x, "xAxisName", js.undefined)
      
      @scala.inline
      def setYAxisName(value: String): Self = StObject.set(x, "yAxisName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxisNameUndefined: Self = StObject.set(x, "yAxisName", js.undefined)
    }
  }
  
  @js.native
  trait IndicatorsHistogram extends StObject {
    
    /** Options to customize the histogram border in MACD indicator.
      */
    var border: js.UndefOr[IndicatorsHistogramBorder] = js.native
    
    /** Color of histogram columns in MACD indicator.
      * @Default {#ccccff}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Opacity of histogram columns in MACD indicator.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object IndicatorsHistogram {
    
    @scala.inline
    def apply(): IndicatorsHistogram = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsHistogram]
    }
    
    @scala.inline
    implicit class IndicatorsHistogramMutableBuilder[Self <: IndicatorsHistogram] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: IndicatorsHistogramBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait IndicatorsHistogramBorder extends StObject {
    
    /** Color of the histogram border in MACD indicator.
      * @Default {#9999ff}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Controls the width of histogram border line in MACD indicator.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IndicatorsHistogramBorder {
    
    @scala.inline
    def apply(): IndicatorsHistogramBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsHistogramBorder]
    }
    
    @scala.inline
    implicit class IndicatorsHistogramBorderMutableBuilder[Self <: IndicatorsHistogramBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IndicatorsLowerLine extends StObject {
    
    /** Color of lower line.
      * @Default {#008000}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Width of the lower line.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IndicatorsLowerLine {
    
    @scala.inline
    def apply(): IndicatorsLowerLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsLowerLine]
    }
    
    @scala.inline
    implicit class IndicatorsLowerLineMutableBuilder[Self <: IndicatorsLowerLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IndicatorsMacdLine extends StObject {
    
    /** Color of MACD line.
      * @Default {#ff9933}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Width of the MACD line.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IndicatorsMacdLine {
    
    @scala.inline
    def apply(): IndicatorsMacdLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsMacdLine]
    }
    
    @scala.inline
    implicit class IndicatorsMacdLineMutableBuilder[Self <: IndicatorsMacdLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IndicatorsPeriodLine extends StObject {
    
    /** Color of period line in indicator.
      * @Default {blue}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Width of the period line in indicators.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IndicatorsPeriodLine {
    
    @scala.inline
    def apply(): IndicatorsPeriodLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsPeriodLine]
    }
    
    @scala.inline
    implicit class IndicatorsPeriodLineMutableBuilder[Self <: IndicatorsPeriodLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IndicatorsTooltip extends StObject {
    
    /** Option to customize the border of indicator tooltip.
      */
    var border: js.UndefOr[IndicatorsTooltipBorder] = js.native
    
    /** Specifies the animation duration of indicator tooltip.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.native
    
    /** Enables/disables the tooltip animation.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Background color of indicator tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Format of indicator tooltip. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.native
    
    /** Opacity of indicator tooltip.
      * @Default {0.95}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Controls the visibility of indicator tooltip.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object IndicatorsTooltip {
    
    @scala.inline
    def apply(): IndicatorsTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsTooltip]
    }
    
    @scala.inline
    implicit class IndicatorsTooltipMutableBuilder[Self <: IndicatorsTooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: IndicatorsTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait IndicatorsTooltipBorder extends StObject {
    
    /** Border color of indicator tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of indicator tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IndicatorsTooltipBorder {
    
    @scala.inline
    def apply(): IndicatorsTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsTooltipBorder]
    }
    
    @scala.inline
    implicit class IndicatorsTooltipBorderMutableBuilder[Self <: IndicatorsTooltipBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IndicatorsUpperLine extends StObject {
    
    /** Fill color of the upper line in indicators
      * @Default {#ff9933}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Width of the upper line in indicators.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IndicatorsUpperLine {
    
    @scala.inline
    def apply(): IndicatorsUpperLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndicatorsUpperLine]
    }
    
    @scala.inline
    implicit class IndicatorsUpperLineMutableBuilder[Self <: IndicatorsUpperLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Legend extends StObject {
    
    /** Horizontal alignment of the legend.
      * @Default {Center. See Alignment}
      */
    var alignment: js.UndefOr[Alignment | String] = js.native
    
    /** Background for the legend. Use this property to add a background image or background color for the legend.
      */
    var background: js.UndefOr[String] = js.native
    
    /** Options for customizing the legend border.
      */
    var border: js.UndefOr[LegendBorder] = js.native
    
    /** Number of columns to arrange the legend items.
      * @Default {null}
      */
    var columnCount: js.UndefOr[Double] = js.native
    
    /** Controls whether legend has to use scrollbar or not. When enabled, scroll bar appears depending upon size and position properties of legend.
      * @Default {true}
      */
    var enableScrollbar: js.UndefOr[Boolean] = js.native
    
    /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible series is displayed in gray color.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options to customize the font used for legend item text.
      */
    var font: js.UndefOr[LegendFont] = js.native
    
    /** Gap or padding between the legend items.
      * @Default {10}
      */
    var itemPadding: js.UndefOr[Double] = js.native
    
    /** Options to customize the style of legend items.
      */
    var itemStyle: js.UndefOr[LegendItemStyle] = js.native
    
    /** Options to customize the location of chart legend. Legend is placed in provided location only when value of position property is custom
      */
    var location: js.UndefOr[LegendLocation] = js.native
    
    /** Opacity of the legend.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the chart area. To manually specify the location of legend, set
      * **custom** as value to this property.
      * @Default {Bottom. See Position}
      */
    var position: js.UndefOr[Position | String] = js.native
    
    /** Number of rows to arrange the legend items.
      * @Default {null}
      */
    var rowCount: js.UndefOr[Double] = js.native
    
    /** Shape of the legend items. Default shape for pie and doughnut series is circle and all other series uses rectangle.
      * @Default {None. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Options to customize the size of the legend.
      */
    var size: js.UndefOr[LegendSize] = js.native
    
    /** Specifies the action taken when the legend width is more than the textWidth.
      * @Default {none. See textOverflow}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.native
    
    /** Text width for legend item.
      * @Default {34}
      */
    var textWidth: js.UndefOr[Double] = js.native
    
    /** Options to customize the legend title.
      */
    var title: js.UndefOr[LegendTitle] = js.native
    
    /** Controls the selection through the legend.
      * @Default {true}
      */
    var toggleSeriesVisibility: js.UndefOr[Boolean] = js.native
    
    /** Controls the visibility of the legend.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Legend {
    
    @scala.inline
    def apply(): Legend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Legend]
    }
    
    @scala.inline
    implicit class LegendMutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: Alignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorder(value: LegendBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      @scala.inline
      def setEnableScrollbar(value: Boolean): Self = StObject.set(x, "enableScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableScrollbarUndefined: Self = StObject.set(x, "enableScrollbar", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: LegendFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      @scala.inline
      def setItemStyle(value: LegendItemStyle): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setLocation(value: LegendLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPosition(value: Position | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: LegendSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextWidth(value: Double): Self = StObject.set(x, "textWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextWidthUndefined: Self = StObject.set(x, "textWidth", js.undefined)
      
      @scala.inline
      def setTitle(value: LegendTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToggleSeriesVisibility(value: Boolean): Self = StObject.set(x, "toggleSeriesVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleSeriesVisibilityUndefined: Self = StObject.set(x, "toggleSeriesVisibility", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait LegendBorder extends StObject {
    
    /** Border color of the legend.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the legend.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LegendBorder {
    
    @scala.inline
    def apply(): LegendBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendBorder]
    }
    
    @scala.inline
    implicit class LegendBorderMutableBuilder[Self <: LegendBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendBoundsCalculateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** legendBoundsHeight - Height of the legend    legendBoundsWidth - Width of the legend.    legendBoundsRows - Number of rows to display the legend items
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LegendBoundsCalculateEventArgs {
    
    @scala.inline
    def apply(): LegendBoundsCalculateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendBoundsCalculateEventArgs]
    }
    
    @scala.inline
    implicit class LegendBoundsCalculateEventArgsMutableBuilder[Self <: LegendBoundsCalculateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LegendFont extends StObject {
    
    /** Font family for legend item text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for legend item text.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight for legend item text.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Font size for legend item text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object LegendFont {
    
    @scala.inline
    def apply(): LegendFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendFont]
    }
    
    @scala.inline
    implicit class LegendFontMutableBuilder[Self <: LegendFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** startX - X-coordinate of legend item in pixel    startY - Y-coordinate of legend item in pixel    LegendItem - Instance of the legend item object that is about to be rendered
      * style - Options to customize the legend item styles such as border, color, size, etcâ€¦,    Bounds - Instance that holds information about legend bounds and legend item bounds.
      * symbolShape - Name of the legend item shape. Use this option to customize legend item shape before rendering    series - Instance of the series object corresponding to the
      * legend item
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LegendItemClickEventArgs {
    
    @scala.inline
    def apply(): LegendItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemClickEventArgs]
    }
    
    @scala.inline
    implicit class LegendItemClickEventArgsMutableBuilder[Self <: LegendItemClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** startX - X-coordinate of legend item in pixel    startY - Y-coordinate of legend item in pixel    LegendItem - Instance of the legend item object that is about to be rendered
      * style - Options to customize the legend item styles such as border, color, size, etcâ€¦,    Bounds - Instance that holds information about legend bounds and legend item bounds.
      * symbolShape - Name of the legend item shape. Use this option to customize legend item shape before rendering    series - Instance of the series object corresponding to the
      * legend item
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LegendItemMouseMoveEventArgs {
    
    @scala.inline
    def apply(): LegendItemMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit class LegendItemMouseMoveEventArgsMutableBuilder[Self <: LegendItemMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** startX - X-coordinate of legend item in pixel    startY - Y-coordinate of legend item in pixel    legendItem - Instance of the legend item object that is about to be rendered
      * style - Options to customize the legend item styles such as border, color, size, etc.    symbolShape - Name of the legend item shape. Use this option to customize legend item
      * shape before rendering
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LegendItemRenderingEventArgs {
    
    @scala.inline
    def apply(): LegendItemRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemRenderingEventArgs]
    }
    
    @scala.inline
    implicit class LegendItemRenderingEventArgsMutableBuilder[Self <: LegendItemRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemStyle extends StObject {
    
    /** Options for customizing the border of legend items.
      */
    var border: js.UndefOr[LegendItemStyleBorder] = js.native
    
    /** Height of the shape in legend items.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Width of the shape in legend items.
      * @Default {10}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LegendItemStyle {
    
    @scala.inline
    def apply(): LegendItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemStyle]
    }
    
    @scala.inline
    implicit class LegendItemStyleMutableBuilder[Self <: LegendItemStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: LegendItemStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemStyleBorder extends StObject {
    
    /** Border color of the legend items.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the legend items.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LegendItemStyleBorder {
    
    @scala.inline
    def apply(): LegendItemStyleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemStyleBorder]
    }
    
    @scala.inline
    implicit class LegendItemStyleBorderMutableBuilder[Self <: LegendItemStyleBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendLocation extends StObject {
    
    /** X value or horizontal offset to position the legend in chart.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Y value or vertical offset to position the legend.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object LegendLocation {
    
    @scala.inline
    def apply(): LegendLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendLocation]
    }
    
    @scala.inline
    implicit class LegendLocationMutableBuilder[Self <: LegendLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait LegendSize extends StObject {
    
    /** Height of the legend. Height can be specified in either pixel or percentage.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Width of the legend. Width can be specified in either pixel or percentage.
      * @Default {null}
      */
    var width: js.UndefOr[String] = js.native
  }
  object LegendSize {
    
    @scala.inline
    def apply(): LegendSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendSize]
    }
    
    @scala.inline
    implicit class LegendSizeMutableBuilder[Self <: LegendSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendTitle extends StObject {
    
    /** Options to customize the font used for legend title
      */
    var font: js.UndefOr[LegendTitleFont] = js.native
    
    /** Text to be displayed in legend title.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Alignment of the legend title.
      * @Default {center. See Alignment}
      */
    var textAlignment: js.UndefOr[Alignment | String] = js.native
  }
  object LegendTitle {
    
    @scala.inline
    def apply(): LegendTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitle]
    }
    
    @scala.inline
    implicit class LegendTitleMutableBuilder[Self <: LegendTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: LegendTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: Alignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait LegendTitleFont extends StObject {
    
    /** Font family for the text in legend title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for legend title.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight for legend title.
      * @Default {normal. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Font size for legend title.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object LegendTitleFont {
    
    @scala.inline
    def apply(): LegendTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitleFont]
    }
    
    @scala.inline
    implicit class LegendTitleFontMutableBuilder[Self <: LegendTitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Margin extends StObject {
    
    /** Spacing for the bottom margin of the chart area. Setting positive value decreases the height of the chart area from the bottom.
      * @Default {10}
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** Spacing for the left margin of chart area. Setting positive value decreases the width of the chart area from left side.
      * @Default {10}
      */
    var left: js.UndefOr[Double] = js.native
    
    /** Spacing for the right margin of chart area. Setting positive value decreases the width of the chart area from right side.
      * @Default {10}
      */
    var right: js.UndefOr[Double] = js.native
    
    /** Spacing for the top margin of chart area. Setting positive value decreases the height of the chart area from the top.
      * @Default {10}
      */
    var top: js.UndefOr[Double] = js.native
  }
  object Margin {
    
    @scala.inline
    def apply(): Margin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Margin]
    }
    
    @scala.inline
    implicit class MarginMutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Fires, after the chart is resized.
      */
    var afterResize: js.UndefOr[js.Function1[/* e */ AfterResizeEventArgs, scala.Unit]] = js.native
    
    /** Fires after the series animation is completed. This event will be triggered for each series when animation is enabled.
      */
    var animationComplete: js.UndefOr[js.Function1[/* e */ AnimationCompleteEventArgs, scala.Unit]] = js.native
    
    /** Fires on clicking the annotation.
      */
    var annotationClick: js.UndefOr[js.Function1[/* e */ AnnotationClickEventArgs, scala.Unit]] = js.native
    
    /** Options for adding and customizing annotations in Chart.
      */
    var annotations: js.UndefOr[js.Array[Annotation]] = js.native
    
    /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s
      * xAxisName property to link both axis and series.
      */
    var axes: js.UndefOr[js.Array[Axis]] = js.native
    
    /** Fires before rendering the labels. This event is fired for each label in axis. You can use this event to add custom text to axis labels.
      */
    var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, scala.Unit]] = js.native
    
    /** Fires during the initialization of axis labels.
      */
    var axesLabelsInitialize: js.UndefOr[js.Function1[/* e */ AxesLabelsInitializeEventArgs, scala.Unit]] = js.native
    
    /** Fires during axes range calculation. This event is fired for each axis present in Chart. You can use this event to customize axis range as required.
      */
    var axesRangeCalculate: js.UndefOr[js.Function1[/* e */ AxesRangeCalculateEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering the axis title. This event is triggered for each axis with title. You can use this event to add custom text to axis title.
      */
    var axesTitleRendering: js.UndefOr[js.Function1[/* e */ AxesTitleRenderingEventArgs, scala.Unit]] = js.native
    
    /** Fires, on clicking the axis label.
      */
    var axisLabelClick: js.UndefOr[js.Function1[/* e */ AxisLabelClickEventArgs, scala.Unit]] = js.native
    
    /** Fires on moving mouse over the axis label.
      */
    var axisLabelMouseMove: js.UndefOr[js.Function1[/* e */ AxisLabelMouseMoveEventArgs, scala.Unit]] = js.native
    
    /** URL of the image to be used as chart background.
      * @Default {null}
      */
    var backGroundImageUrl: js.UndefOr[String] = js.native
    
    /** Sets the background color of the  chart.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.native
    
    /** Fires, when chart size is changing.
      */
    var beforeResize: js.UndefOr[js.Function1[/* e */ BeforeResizeEventArgs, scala.Unit]] = js.native
    
    /** Options for customizing the color, opacity and width of the chart border.
      */
    var border: js.UndefOr[Border] = js.native
    
    /** Options for configuring the border and background of the plot area.
      */
    var chartArea: js.UndefOr[ChartArea] = js.native
    
    /** Fires during the calculation of chart area bounds. You can use this event to customize the bounds of chart area.
      */
    var chartAreaBoundsCalculate: js.UndefOr[js.Function1[/* e */ ChartAreaBoundsCalculateEventArgs, scala.Unit]] = js.native
    
    /** Fires, on the clicking the chart.
      */
    var chartClick: js.UndefOr[js.Function1[/* e */ ChartClickEventArgs, scala.Unit]] = js.native
    
    /** Fires, on double clicking the chart.
      */
    var chartDoubleClick: js.UndefOr[js.Function1[/* e */ ChartDoubleClickEventArgs, scala.Unit]] = js.native
    
    /** Fires when the mouse pointer leaves the chart
      */
    var chartMouseLeave: js.UndefOr[js.Function1[/* e */ ChartMouseLeaveEventArgs, scala.Unit]] = js.native
    
    /** Fires on moving mouse over the chart.
      */
    var chartMouseMove: js.UndefOr[js.Function1[/* e */ ChartMouseMoveEventArgs, scala.Unit]] = js.native
    
    /** Options to split Chart into multiple plotting areas vertically. Each object in the collection represents a plotting area in Chart.
      */
    var columnDefinitions: js.UndefOr[js.Array[ColumnDefinition]] = js.native
    
    /** Options for configuring the properties of all the series. You can also override the options for specific series by using series collection.
      */
    var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.native
    
    /** Fires after chart is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.native
    
    /** Options for displaying and customizing the crosshair.
      */
    var crosshair: js.UndefOr[Crosshair] = js.native
    
    /** Depth of the 3D Chart from front view of series to background wall. This property is applicable only for 3D view.
      * @Default {100}
      */
    var depth: js.UndefOr[Double] = js.native
    
    /** Fires when chart is destroyed completely.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering the data labels. This event is triggered for each data label in the series. You can use this event to add custom text in data labels.
      */
    var displayTextRendering: js.UndefOr[js.Function1[/* e */ DisplayTextRenderingEventArgs, scala.Unit]] = js.native
    
    /** Fires when the dragging is completed
      */
    var dragEnd: js.UndefOr[js.Function1[/* e */ DragEndEventArgs, scala.Unit]] = js.native
    
    /** Fires when the dragging is started
      */
    var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.native
    
    /** Fires while  dragging
      */
    var dragging: js.UndefOr[js.Function1[/* e */ DraggingEventArgs, scala.Unit]] = js.native
    
    /** Controls whether 3D view has to be enabled or not. 3D view is supported only for column, bar. Stacking column, stacking bar, pie and doughnut series types.
      * @Default {false}
      */
    var enable3D: js.UndefOr[Boolean] = js.native
    
    /** Controls whether Chart has to be rendered as Canvas or SVG. Canvas rendering supports all functionalities in SVG rendering except 3D Charts.
      * @Default {false}
      */
    var enableCanvasRendering: js.UndefOr[Boolean] = js.native
    
    /** Controls whether 3D view has to be rotated on dragging. This property is applicable only for 3D view.
      * @Default {false}
      */
    var enableRotation: js.UndefOr[Boolean] = js.native
    
    /** Fires, when error bar is rendering.
      */
    var errorBarRendering: js.UndefOr[js.Function1[/* e */ ErrorBarRenderingEventArgs, scala.Unit]] = js.native
    
    /** This provides options for customizing export settings
      */
    var exportSettings: js.UndefOr[ExportSettings] = js.native
    
    /** Options to customize the technical indicators.
      */
    var indicators: js.UndefOr[js.Array[Indicator]] = js.native
    
    /** Controls whether the series has to be rendered at initial loading of chart, this will be useful in scenarios where chart is placed at the bottom of the web page and we need to
      * render the series only when the chart is visible while scrolling to the top.
      * @Default {true}
      */
    var initSeriesRender: js.UndefOr[Boolean] = js.native
    
    /** Controls whether Chart has to be responsive while resizing.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Options to customize the legend items and legend title.
      */
    var legend: js.UndefOr[Legend] = js.native
    
    /** Fires during the calculation of legend bounds. You can use this event to customize the bounds of legend.
      */
    var legendBoundsCalculate: js.UndefOr[js.Function1[/* e */ LegendBoundsCalculateEventArgs, scala.Unit]] = js.native
    
    /** Fires on clicking the legend item.
      */
    var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit]] = js.native
    
    /** Fires when moving mouse over legend item. You can use this event for hit testing on legend items.
      */
    var legendItemMouseMove: js.UndefOr[js.Function1[/* e */ LegendItemMouseMoveEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering the legend item. This event is fired for each legend item in Chart. You can use this event to customize legend item shape or add custom text to legend item.
      */
    var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit]] = js.native
    
    /** Fires before loading the chart.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.native
    
    /** Name of the culture based on which chart should be localized. Number and date time values are localized with respect to the culture name.String type properties like title text are
      * not localized automatically. Provide localized text as value to string type properties.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Options to customize the left, right, top and bottom margins of chart area.
      */
    var margin: js.UndefOr[Margin] = js.native
    
    /** Fires, on the clicking the Multi level labels of the chart .
      */
    var multiLevelLabelClick: js.UndefOr[js.Function1[/* e */ MultiLevelLabelClickEventArgs, scala.Unit]] = js.native
    
    /** Fires, when multi level labels are rendering.
      */
    var multiLevelLabelRendering: js.UndefOr[js.Function1[/* e */ MultiLevelLabelRenderingEventArgs, scala.Unit]] = js.native
    
    /** Palette is used to store the series fill color in array and apply the color to series collection in the order of series index.
      * @Default {null}
      */
    var palette: js.UndefOr[js.Array[_]] = js.native
    
    /** Perspective angle of the 3D view. Chart appears closer when perspective angle is decreased, and distant when perspective angle is increased.This property is applicable only when
      * 3D view is enabled
      * @Default {90}
      */
    var perspectiveAngle: js.UndefOr[Double] = js.native
    
    /** Fires on clicking a point in chart. You can use this event to handle clicks made on points.
      */
    var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit]] = js.native
    
    /** Fires when mouse is moved over a point.
      */
    var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering chart.
      */
    var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, scala.Unit]] = js.native
    
    /** This is a horizontal axis that contains options to configure axis and it is the primary x axis for all the series in series array. To override x axis for particular series, create
      * an axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both axis and series.
      */
    var primaryXAxis: js.UndefOr[PrimaryXAxis] = js.native
    
    /** This is a vertical axis that contains options to configure axis. This is the primary y axis for all the series in series array. To override y axis for particular series, create an
      * axis object by providing unique name by using name property and add it to axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both axis and series.
      */
    var primaryYAxis: js.UndefOr[PrimaryYAxis] = js.native
    
    /** Fires after selected the data in chart.
      */
    var rangeSelected: js.UndefOr[js.Function1[/* e */ RangeSelectedEventArgs, scala.Unit]] = js.native
    
    /** Rotation angle of the 3D view. This property is applicable only when 3D view is enabled.
      * @Default {0}
      */
    var rotation: js.UndefOr[Double] = js.native
    
    /** Options to split Chart into multiple plotting areas horizontally. Each object in the collection represents a plotting area in Chart.
      */
    var rowDefinitions: js.UndefOr[js.Array[RowDefinition]] = js.native
    
    /** Trigger, after the scrollbar position is changed.
      */
    var scrollChanged: js.UndefOr[js.Function1[/* e */ ScrollChangedEventArgs, scala.Unit]] = js.native
    
    /** Event triggered when scroll end
      */
    var scrollEnd: js.UndefOr[js.Function1[/* e */ ScrollEndEventArgs, scala.Unit]] = js.native
    
    /** Event triggered when scroll starts
      */
    var scrollStart: js.UndefOr[js.Function1[/* e */ ScrollStartEventArgs, scala.Unit]] = js.native
    
    /** Options for displaying the chart along with selected points while loading
      * @Default {[ ]}
      */
    var selectedDataPointIndexes: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies the properties used for customizing the series.
      */
    var series: js.UndefOr[js.Array[Series]] = js.native
    
    /** Fires after selecting a series. This event is triggered after selecting a series only if selection mode is series.
      */
    var seriesRegionClick: js.UndefOr[js.Function1[/* e */ SeriesRegionClickEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering a series. This event is fired for each series in Chart.
      */
    var seriesRendering: js.UndefOr[js.Function1[/* e */ SeriesRenderingEventArgs, scala.Unit]] = js.native
    
    /** Controls whether data points has to be displayed side by side or along the depth of the axis.
      * @Default {false}
      */
    var sideBySideSeriesPlacement: js.UndefOr[Boolean] = js.native
    
    /** Options to customize the Chart size.
      */
    var size: js.UndefOr[Size] = js.native
    
    /** Fires when the sub Title of the chart is rendered
      */
    var subTitleRendering: js.UndefOr[js.Function1[/* e */ SubTitleRenderingEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering the marker symbols. This event is triggered for each marker in Chart.
      */
    var symbolRendering: js.UndefOr[js.Function1[/* e */ SymbolRenderingEventArgs, scala.Unit]] = js.native
    
    /** Specifies the theme for Chart.
      * @Default {Flatlight. See Theme}
      */
    var theme: js.UndefOr[Theme | String] = js.native
    
    /** Slope angle of 3D Chart. This property is applicable only when 3D view is enabled.
      * @Default {0}
      */
    var tilt: js.UndefOr[Double] = js.native
    
    /** Options for customizing the title and subtitle of Chart.
      */
    var title: js.UndefOr[Title] = js.native
    
    /** Fires before rendering the Chart title. You can use this event to add custom text in Chart title.
      */
    var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering the tooltip. This event is fired when tooltip is enabled and mouse is hovered on a Chart point. You can use this event to customize tooltip before rendering.
      */
    var toolTipInitialize: js.UndefOr[js.Function1[/* e */ ToolTipInitializeEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering crosshair tooltip in axis. This event is fired for each axis with crosshair label enabled. You can use this event to customize crosshair label before
      * rendering
      */
    var trackAxisToolTip: js.UndefOr[js.Function1[/* e */ TrackAxisToolTipEventArgs, scala.Unit]] = js.native
    
    /** Fires before rendering trackball tooltip. This event is fired for each series in Chart because trackball tooltip is displayed for all the series. You can use this event to
      * customize the text displayed in trackball tooltip.
      */
    var trackToolTip: js.UndefOr[js.Function1[/* e */ TrackToolTipEventArgs, scala.Unit]] = js.native
    
    /** Fires, when trendlines are rendering.
      */
    var trendlineRendering: js.UndefOr[js.Function1[/* e */ TrendlineRenderingEventArgs, scala.Unit]] = js.native
    
    /** Width of the wall used in 3D Chart. Wall is present only in Cartesian type 3D series and not in 3D pie or Doughnut series. This property is applicable only when 3D view is enabled.
      * @Default {2}
      */
    var wallSize: js.UndefOr[Double] = js.native
    
    /** Fires while performing rectangle zooming in chart.
      */
    var zoomed: js.UndefOr[js.Function1[/* e */ ZoomedEventArgs, scala.Unit]] = js.native
    
    /** Options for enabling zooming feature of chart.
      */
    var zooming: js.UndefOr[Zooming] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.datavisualization.Chart.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.datavisualization.Chart.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.datavisualization.Chart.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterResize(value: /* e */ AfterResizeEventArgs => scala.Unit): Self = StObject.set(x, "afterResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterResizeUndefined: Self = StObject.set(x, "afterResize", js.undefined)
      
      @scala.inline
      def setAnimationComplete(value: /* e */ AnimationCompleteEventArgs => scala.Unit): Self = StObject.set(x, "animationComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnimationCompleteUndefined: Self = StObject.set(x, "animationComplete", js.undefined)
      
      @scala.inline
      def setAnnotationClick(value: /* e */ AnnotationClickEventArgs => scala.Unit): Self = StObject.set(x, "annotationClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnnotationClickUndefined: Self = StObject.set(x, "annotationClick", js.undefined)
      
      @scala.inline
      def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
      
      @scala.inline
      def setAxes(value: js.Array[Axis]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesLabelRendering(value: /* e */ AxesLabelRenderingEventArgs => scala.Unit): Self = StObject.set(x, "axesLabelRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAxesLabelRenderingUndefined: Self = StObject.set(x, "axesLabelRendering", js.undefined)
      
      @scala.inline
      def setAxesLabelsInitialize(value: /* e */ AxesLabelsInitializeEventArgs => scala.Unit): Self = StObject.set(x, "axesLabelsInitialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAxesLabelsInitializeUndefined: Self = StObject.set(x, "axesLabelsInitialize", js.undefined)
      
      @scala.inline
      def setAxesRangeCalculate(value: /* e */ AxesRangeCalculateEventArgs => scala.Unit): Self = StObject.set(x, "axesRangeCalculate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAxesRangeCalculateUndefined: Self = StObject.set(x, "axesRangeCalculate", js.undefined)
      
      @scala.inline
      def setAxesTitleRendering(value: /* e */ AxesTitleRenderingEventArgs => scala.Unit): Self = StObject.set(x, "axesTitleRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAxesTitleRenderingUndefined: Self = StObject.set(x, "axesTitleRendering", js.undefined)
      
      @scala.inline
      def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      @scala.inline
      def setAxesVarargs(value: Axis*): Self = StObject.set(x, "axes", js.Array(value :_*))
      
      @scala.inline
      def setAxisLabelClick(value: /* e */ AxisLabelClickEventArgs => scala.Unit): Self = StObject.set(x, "axisLabelClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAxisLabelClickUndefined: Self = StObject.set(x, "axisLabelClick", js.undefined)
      
      @scala.inline
      def setAxisLabelMouseMove(value: /* e */ AxisLabelMouseMoveEventArgs => scala.Unit): Self = StObject.set(x, "axisLabelMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAxisLabelMouseMoveUndefined: Self = StObject.set(x, "axisLabelMouseMove", js.undefined)
      
      @scala.inline
      def setBackGroundImageUrl(value: String): Self = StObject.set(x, "backGroundImageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackGroundImageUrlUndefined: Self = StObject.set(x, "backGroundImageUrl", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBeforeResize(value: /* e */ BeforeResizeEventArgs => scala.Unit): Self = StObject.set(x, "beforeResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeResizeUndefined: Self = StObject.set(x, "beforeResize", js.undefined)
      
      @scala.inline
      def setBorder(value: Border): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setChartArea(value: ChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartAreaBoundsCalculate(value: /* e */ ChartAreaBoundsCalculateEventArgs => scala.Unit): Self = StObject.set(x, "chartAreaBoundsCalculate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChartAreaBoundsCalculateUndefined: Self = StObject.set(x, "chartAreaBoundsCalculate", js.undefined)
      
      @scala.inline
      def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
      
      @scala.inline
      def setChartClick(value: /* e */ ChartClickEventArgs => scala.Unit): Self = StObject.set(x, "chartClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChartClickUndefined: Self = StObject.set(x, "chartClick", js.undefined)
      
      @scala.inline
      def setChartDoubleClick(value: /* e */ ChartDoubleClickEventArgs => scala.Unit): Self = StObject.set(x, "chartDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChartDoubleClickUndefined: Self = StObject.set(x, "chartDoubleClick", js.undefined)
      
      @scala.inline
      def setChartMouseLeave(value: /* e */ ChartMouseLeaveEventArgs => scala.Unit): Self = StObject.set(x, "chartMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChartMouseLeaveUndefined: Self = StObject.set(x, "chartMouseLeave", js.undefined)
      
      @scala.inline
      def setChartMouseMove(value: /* e */ ChartMouseMoveEventArgs => scala.Unit): Self = StObject.set(x, "chartMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChartMouseMoveUndefined: Self = StObject.set(x, "chartMouseMove", js.undefined)
      
      @scala.inline
      def setColumnDefinitions(value: js.Array[ColumnDefinition]): Self = StObject.set(x, "columnDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDefinitionsUndefined: Self = StObject.set(x, "columnDefinitions", js.undefined)
      
      @scala.inline
      def setColumnDefinitionsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columnDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setCommonSeriesOptions(value: CommonSeriesOptions): Self = StObject.set(x, "commonSeriesOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonSeriesOptionsUndefined: Self = StObject.set(x, "commonSeriesOptions", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => scala.Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCrosshair(value: Crosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => scala.Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDisplayTextRendering(value: /* e */ DisplayTextRenderingEventArgs => scala.Unit): Self = StObject.set(x, "displayTextRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisplayTextRenderingUndefined: Self = StObject.set(x, "displayTextRendering", js.undefined)
      
      @scala.inline
      def setDragEnd(value: /* e */ DragEndEventArgs => scala.Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
      
      @scala.inline
      def setDragStart(value: /* e */ DragStartEventArgs => scala.Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      @scala.inline
      def setDragging(value: /* e */ DraggingEventArgs => scala.Unit): Self = StObject.set(x, "dragging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setEnable3D(value: Boolean): Self = StObject.set(x, "enable3D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable3DUndefined: Self = StObject.set(x, "enable3D", js.undefined)
      
      @scala.inline
      def setEnableCanvasRendering(value: Boolean): Self = StObject.set(x, "enableCanvasRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCanvasRenderingUndefined: Self = StObject.set(x, "enableCanvasRendering", js.undefined)
      
      @scala.inline
      def setEnableRotation(value: Boolean): Self = StObject.set(x, "enableRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRotationUndefined: Self = StObject.set(x, "enableRotation", js.undefined)
      
      @scala.inline
      def setErrorBarRendering(value: /* e */ ErrorBarRenderingEventArgs => scala.Unit): Self = StObject.set(x, "errorBarRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorBarRenderingUndefined: Self = StObject.set(x, "errorBarRendering", js.undefined)
      
      @scala.inline
      def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      @scala.inline
      def setIndicators(value: js.Array[Indicator]): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
      
      @scala.inline
      def setIndicatorsVarargs(value: Indicator*): Self = StObject.set(x, "indicators", js.Array(value :_*))
      
      @scala.inline
      def setInitSeriesRender(value: Boolean): Self = StObject.set(x, "initSeriesRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitSeriesRenderUndefined: Self = StObject.set(x, "initSeriesRender", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendBoundsCalculate(value: /* e */ LegendBoundsCalculateEventArgs => scala.Unit): Self = StObject.set(x, "legendBoundsCalculate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendBoundsCalculateUndefined: Self = StObject.set(x, "legendBoundsCalculate", js.undefined)
      
      @scala.inline
      def setLegendItemClick(value: /* e */ LegendItemClickEventArgs => scala.Unit): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
      
      @scala.inline
      def setLegendItemMouseMove(value: /* e */ LegendItemMouseMoveEventArgs => scala.Unit): Self = StObject.set(x, "legendItemMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendItemMouseMoveUndefined: Self = StObject.set(x, "legendItemMouseMove", js.undefined)
      
      @scala.inline
      def setLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => scala.Unit): Self = StObject.set(x, "legendItemRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendItemRenderingUndefined: Self = StObject.set(x, "legendItemRendering", js.undefined)
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => scala.Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMultiLevelLabelClick(value: /* e */ MultiLevelLabelClickEventArgs => scala.Unit): Self = StObject.set(x, "multiLevelLabelClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiLevelLabelClickUndefined: Self = StObject.set(x, "multiLevelLabelClick", js.undefined)
      
      @scala.inline
      def setMultiLevelLabelRendering(value: /* e */ MultiLevelLabelRenderingEventArgs => scala.Unit): Self = StObject.set(x, "multiLevelLabelRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiLevelLabelRenderingUndefined: Self = StObject.set(x, "multiLevelLabelRendering", js.undefined)
      
      @scala.inline
      def setPalette(value: js.Array[_]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPaletteVarargs(value: js.Any*): Self = StObject.set(x, "palette", js.Array(value :_*))
      
      @scala.inline
      def setPerspectiveAngle(value: Double): Self = StObject.set(x, "perspectiveAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspectiveAngleUndefined: Self = StObject.set(x, "perspectiveAngle", js.undefined)
      
      @scala.inline
      def setPointRegionClick(value: /* e */ PointRegionClickEventArgs => scala.Unit): Self = StObject.set(x, "pointRegionClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointRegionClickUndefined: Self = StObject.set(x, "pointRegionClick", js.undefined)
      
      @scala.inline
      def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => scala.Unit): Self = StObject.set(x, "pointRegionMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointRegionMouseMoveUndefined: Self = StObject.set(x, "pointRegionMouseMove", js.undefined)
      
      @scala.inline
      def setPreRender(value: /* e */ PreRenderEventArgs => scala.Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreRenderUndefined: Self = StObject.set(x, "preRender", js.undefined)
      
      @scala.inline
      def setPrimaryXAxis(value: PrimaryXAxis): Self = StObject.set(x, "primaryXAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryXAxisUndefined: Self = StObject.set(x, "primaryXAxis", js.undefined)
      
      @scala.inline
      def setPrimaryYAxis(value: PrimaryYAxis): Self = StObject.set(x, "primaryYAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryYAxisUndefined: Self = StObject.set(x, "primaryYAxis", js.undefined)
      
      @scala.inline
      def setRangeSelected(value: /* e */ RangeSelectedEventArgs => scala.Unit): Self = StObject.set(x, "rangeSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRangeSelectedUndefined: Self = StObject.set(x, "rangeSelected", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setRowDefinitions(value: js.Array[RowDefinition]): Self = StObject.set(x, "rowDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDefinitionsUndefined: Self = StObject.set(x, "rowDefinitions", js.undefined)
      
      @scala.inline
      def setRowDefinitionsVarargs(value: RowDefinition*): Self = StObject.set(x, "rowDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setScrollChanged(value: /* e */ ScrollChangedEventArgs => scala.Unit): Self = StObject.set(x, "scrollChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollChangedUndefined: Self = StObject.set(x, "scrollChanged", js.undefined)
      
      @scala.inline
      def setScrollEnd(value: /* e */ ScrollEndEventArgs => scala.Unit): Self = StObject.set(x, "scrollEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollEndUndefined: Self = StObject.set(x, "scrollEnd", js.undefined)
      
      @scala.inline
      def setScrollStart(value: /* e */ ScrollStartEventArgs => scala.Unit): Self = StObject.set(x, "scrollStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollStartUndefined: Self = StObject.set(x, "scrollStart", js.undefined)
      
      @scala.inline
      def setSelectedDataPointIndexes(value: js.Array[_]): Self = StObject.set(x, "selectedDataPointIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDataPointIndexesUndefined: Self = StObject.set(x, "selectedDataPointIndexes", js.undefined)
      
      @scala.inline
      def setSelectedDataPointIndexesVarargs(value: js.Any*): Self = StObject.set(x, "selectedDataPointIndexes", js.Array(value :_*))
      
      @scala.inline
      def setSeries(value: js.Array[Series]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesRegionClick(value: /* e */ SeriesRegionClickEventArgs => scala.Unit): Self = StObject.set(x, "seriesRegionClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSeriesRegionClickUndefined: Self = StObject.set(x, "seriesRegionClick", js.undefined)
      
      @scala.inline
      def setSeriesRendering(value: /* e */ SeriesRenderingEventArgs => scala.Unit): Self = StObject.set(x, "seriesRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSeriesRenderingUndefined: Self = StObject.set(x, "seriesRendering", js.undefined)
      
      @scala.inline
      def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      @scala.inline
      def setSeriesVarargs(value: Series*): Self = StObject.set(x, "series", js.Array(value :_*))
      
      @scala.inline
      def setSideBySideSeriesPlacement(value: Boolean): Self = StObject.set(x, "sideBySideSeriesPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideBySideSeriesPlacementUndefined: Self = StObject.set(x, "sideBySideSeriesPlacement", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSubTitleRendering(value: /* e */ SubTitleRenderingEventArgs => scala.Unit): Self = StObject.set(x, "subTitleRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubTitleRenderingUndefined: Self = StObject.set(x, "subTitleRendering", js.undefined)
      
      @scala.inline
      def setSymbolRendering(value: /* e */ SymbolRenderingEventArgs => scala.Unit): Self = StObject.set(x, "symbolRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSymbolRenderingUndefined: Self = StObject.set(x, "symbolRendering", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
      
      @scala.inline
      def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleRendering(value: /* e */ TitleRenderingEventArgs => scala.Unit): Self = StObject.set(x, "titleRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderingUndefined: Self = StObject.set(x, "titleRendering", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToolTipInitialize(value: /* e */ ToolTipInitializeEventArgs => scala.Unit): Self = StObject.set(x, "toolTipInitialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolTipInitializeUndefined: Self = StObject.set(x, "toolTipInitialize", js.undefined)
      
      @scala.inline
      def setTrackAxisToolTip(value: /* e */ TrackAxisToolTipEventArgs => scala.Unit): Self = StObject.set(x, "trackAxisToolTip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrackAxisToolTipUndefined: Self = StObject.set(x, "trackAxisToolTip", js.undefined)
      
      @scala.inline
      def setTrackToolTip(value: /* e */ TrackToolTipEventArgs => scala.Unit): Self = StObject.set(x, "trackToolTip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrackToolTipUndefined: Self = StObject.set(x, "trackToolTip", js.undefined)
      
      @scala.inline
      def setTrendlineRendering(value: /* e */ TrendlineRenderingEventArgs => scala.Unit): Self = StObject.set(x, "trendlineRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrendlineRenderingUndefined: Self = StObject.set(x, "trendlineRendering", js.undefined)
      
      @scala.inline
      def setWallSize(value: Double): Self = StObject.set(x, "wallSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWallSizeUndefined: Self = StObject.set(x, "wallSize", js.undefined)
      
      @scala.inline
      def setZoomed(value: /* e */ ZoomedEventArgs => scala.Unit): Self = StObject.set(x, "zoomed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomedUndefined: Self = StObject.set(x, "zoomed", js.undefined)
      
      @scala.inline
      def setZooming(value: Zooming): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
  
  @js.native
  trait MultiLevelLabelClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to chart area.    axis - axis of the multi level labels.    multiLevelLabel - Multi level label details
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object MultiLevelLabelClickEventArgs {
    
    @scala.inline
    def apply(): MultiLevelLabelClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiLevelLabelClickEventArgs]
    }
    
    @scala.inline
    implicit class MultiLevelLabelClickEventArgsMutableBuilder[Self <: MultiLevelLabelClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MultiLevelLabelRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** MultiLevelLabels - MultiLevel Label Object
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object MultiLevelLabelRenderingEventArgs {
    
    @scala.inline
    def apply(): MultiLevelLabelRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiLevelLabelRenderingEventArgs]
    }
    
    @scala.inline
    implicit class MultiLevelLabelRenderingEventArgsMutableBuilder[Self <: MultiLevelLabelRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PointRegionClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** locationX - X-coordinate of point in pixel    locationY - Y-coordinate of point in pixel    seriesIndex - Index of the series in series collection to which the point belongs
      * pointIndex - Index of the point in series
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PointRegionClickEventArgs {
    
    @scala.inline
    def apply(): PointRegionClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionClickEventArgs]
    }
    
    @scala.inline
    implicit class PointRegionClickEventArgsMutableBuilder[Self <: PointRegionClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PointRegionMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** locationX - X-coordinate of point in pixel    locationY - Y-coordinate of point in pixel    seriesIndex - Index of the series in series collection to which the point belongs
      * pointIndex - Index of the point in series
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PointRegionMouseMoveEventArgs {
    
    @scala.inline
    def apply(): PointRegionMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit class PointRegionMouseMoveEventArgsMutableBuilder[Self <: PointRegionMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PreRenderEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PreRenderEventArgs {
    
    @scala.inline
    def apply(): PreRenderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreRenderEventArgs]
    }
    
    @scala.inline
    implicit class PreRenderEventArgsMutableBuilder[Self <: PreRenderEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxis extends StObject {
    
    /** Specifies the position of the axis labels.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[LabelAlignment | String] = js.native
    
    /** Options for customizing horizontal axis alternate grid band.
      */
    var alternateGridBand: js.UndefOr[PrimaryXAxisAlternateGridBand] = js.native
    
    /** Options for customizing the axis line.
      */
    var axisLine: js.UndefOr[PrimaryXAxisAxisLine] = js.native
    
    /** Specifies the index of the column where the axis is associated, when the chart area is divided into multiple plot areas by using columnDefinitions.
      * @Default {null}
      */
    var columnIndex: js.UndefOr[Double] = js.native
    
    /** Specifies the number of columns or plot areas an axis has to span horizontally.
      * @Default {null}
      */
    var columnSpan: js.UndefOr[Double] = js.native
    
    /** Specifies where horizontal axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum
      * value of crossing axis, then axis will be placed at the opposite side.
      * @Default {null}
      */
    var crossesAt: js.UndefOr[Double] = js.native
    
    /** Name of the axis used for crossing. Vertical axis name should be provided for horizontal axis and vice versa. If the provided name does not belongs to a valid axis, then primary X
      * axis or primary Y axis will be used for crossing
      * @Default {null}
      */
    var crossesInAxis: js.UndefOr[String] = js.native
    
    /** Options to customize the crosshair label.
      */
    var crosshairLabel: js.UndefOr[PrimaryXAxisCrosshairLabel] = js.native
    
    /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
      * @Default {null}
      */
    var desiredIntervals: js.UndefOr[Double] = js.native
    
    /** Specifies the position of labels at the edge of the axis.
      * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
      */
    var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | String] = js.native
    
    /** Specifies the interval of the axis according to the zoomed data of the chart.
      * @Default {true}
      */
    var enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the font of the axis Labels.
      */
    var font: js.UndefOr[PrimaryXAxisFont] = js.native
    
    /** Specifies the type of interval in date time axis.
      * @Default {null. See IntervalType}
      */
    var intervalType: js.UndefOr[IntervalType | String] = js.native
    
    /** Category axis can also plot points based on index value of data points. Index based plotting can be enabled by setting â€˜isIndexedâ€™ property to true.
      * @Default {false}
      */
    var isIndexed: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether to inverse the axis.
      * @Default {false}
      */
    var isInversed: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the border of the labels.
      */
    var labelBorder: js.UndefOr[PrimaryXAxisLabelBorder] = js.native
    
    /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
      * @Default {null}
      */
    var labelFormat: js.UndefOr[String] = js.native
    
    /** Specifies the action to take when the axis labels are overlapping with each other.
      * @Default {ej.datavisualization.Chart.LabelIntersectAction.None. See LabelIntersectAction}
      */
    var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.native
    
    /** Specifies the placement of labels.
      * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
    
    /** Specifies the position of the axis labels.
      * @Default {outside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.native
    
    /** Angle in degrees to rotate the axis labels.
      * @Default {null}
      */
    var labelRotation: js.UndefOr[Double] = js.native
    
    /** Logarithmic base value. This is applicable only for logarithmic axis.
      * @Default {10}
      */
    var logBase: js.UndefOr[Double] = js.native
    
    /** Options for customizing major gird lines.
      */
    var majorGridLines: js.UndefOr[PrimaryXAxisMajorGridLines] = js.native
    
    /** Options for customizing the major tick lines.
      */
    var majorTickLines: js.UndefOr[PrimaryXAxisMajorTickLines] = js.native
    
    /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
      * @Default {34}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.native
    
    /** Maximum number of labels to be displayed in every 100 pixels.
      * @Default {3}
      */
    var maximumLabels: js.UndefOr[Double] = js.native
    
    /** Options for customizing the minor grid lines.
      */
    var minorGridLines: js.UndefOr[PrimaryXAxisMinorGridLines] = js.native
    
    /** Options for customizing the minor tick lines.
      */
    var minorTickLines: js.UndefOr[PrimaryXAxisMinorTickLines] = js.native
    
    /** Specifies the number of minor ticks per interval.
      * @Default {null}
      */
    var minorTicksPerInterval: js.UndefOr[Double] = js.native
    
    /** Options for customizing the multi level labels.
      * @Default {[ ]}
      */
    var multiLevelLabels: js.UndefOr[js.Array[PrimaryXAxisMultiLevelLabel]] = js.native
    
    /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Specifies whether to render the axis at the opposite side of its default position.
      * @Default {false}
      */
    var opposedPosition: js.UndefOr[Boolean] = js.native
    
    /** Specifies the orientation of the axis line
      * @Default {Horizontal}
      */
    var orientation: js.UndefOr[AxisOrientation | String] = js.native
    
    /** Specifies the padding for the plot area.
      * @Default {10}
      */
    var plotOffset: js.UndefOr[Double] = js.native
    
    /** Options to customize the range of the axis.
      */
    var range: js.UndefOr[PrimaryXAxisRange] = js.native
    
    /** Specifies the padding for the axis range.
      * @Default {None. See RangePadding}
      */
    var rangePadding: js.UndefOr[RangePadding | String] = js.native
    
    /** Rounds the number to the given number of decimals.
      * @Default {null}
      */
    var roundingPlaces: js.UndefOr[Double] = js.native
    
    /** Options for customizing the axis scrollbar
      */
    var scrollbarSettings: js.UndefOr[PrimaryXAxisScrollbarSettings] = js.native
    
    /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
      * @Default {true}
      */
    var showNextToAxisLine: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the strip lines.
      * @Default {[ ]}
      */
    var stripLine: js.UndefOr[js.Array[PrimaryXAxisStripLine]] = js.native
    
    /** Specifies the position of the axis tick lines.
      * @Default {outside. See TickLinesPosition}
      */
    var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.native
    
    /** Options for customizing the axis title.
      */
    var title: js.UndefOr[PrimaryXAxisTitle] = js.native
    
    /** Specifies the type of data the axis is handling.
      * @Default {null. See ValueType}
      */
    var valueType: js.UndefOr[ValueType | String] = js.native
    
    /** Show/hides the axis.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Value ranges from 0 to 1.
      * @Default {1}
      */
    var zoomFactor: js.UndefOr[Double] = js.native
    
    /** Position of the zoomed axis. Value ranges from 0 to 1.
      * @Default {0}
      */
    var zoomPosition: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxis {
    
    @scala.inline
    def apply(): PrimaryXAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxis]
    }
    
    @scala.inline
    implicit class PrimaryXAxisMutableBuilder[Self <: PrimaryXAxis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: LabelAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setAlternateGridBand(value: PrimaryXAxisAlternateGridBand): Self = StObject.set(x, "alternateGridBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateGridBandUndefined: Self = StObject.set(x, "alternateGridBand", js.undefined)
      
      @scala.inline
      def setAxisLine(value: PrimaryXAxisAxisLine): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      @scala.inline
      def setCrossesAt(value: Double): Self = StObject.set(x, "crossesAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossesAtUndefined: Self = StObject.set(x, "crossesAt", js.undefined)
      
      @scala.inline
      def setCrossesInAxis(value: String): Self = StObject.set(x, "crossesInAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossesInAxisUndefined: Self = StObject.set(x, "crossesInAxis", js.undefined)
      
      @scala.inline
      def setCrosshairLabel(value: PrimaryXAxisCrosshairLabel): Self = StObject.set(x, "crosshairLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrosshairLabelUndefined: Self = StObject.set(x, "crosshairLabel", js.undefined)
      
      @scala.inline
      def setDesiredIntervals(value: Double): Self = StObject.set(x, "desiredIntervals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredIntervalsUndefined: Self = StObject.set(x, "desiredIntervals", js.undefined)
      
      @scala.inline
      def setEdgeLabelPlacement(value: EdgeLabelPlacement | String): Self = StObject.set(x, "edgeLabelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeLabelPlacementUndefined: Self = StObject.set(x, "edgeLabelPlacement", js.undefined)
      
      @scala.inline
      def setEnableAutoIntervalOnZooming(value: Boolean): Self = StObject.set(x, "enableAutoIntervalOnZooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAutoIntervalOnZoomingUndefined: Self = StObject.set(x, "enableAutoIntervalOnZooming", js.undefined)
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: PrimaryXAxisFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setIntervalType(value: IntervalType | String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      @scala.inline
      def setIsIndexed(value: Boolean): Self = StObject.set(x, "isIndexed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIndexedUndefined: Self = StObject.set(x, "isIndexed", js.undefined)
      
      @scala.inline
      def setIsInversed(value: Boolean): Self = StObject.set(x, "isInversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInversedUndefined: Self = StObject.set(x, "isInversed", js.undefined)
      
      @scala.inline
      def setLabelBorder(value: PrimaryXAxisLabelBorder): Self = StObject.set(x, "labelBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBorderUndefined: Self = StObject.set(x, "labelBorder", js.undefined)
      
      @scala.inline
      def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      @scala.inline
      def setLabelIntersectAction(value: LabelIntersectAction | String): Self = StObject.set(x, "labelIntersectAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelIntersectActionUndefined: Self = StObject.set(x, "labelIntersectAction", js.undefined)
      
      @scala.inline
      def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelRotationUndefined: Self = StObject.set(x, "labelRotation", js.undefined)
      
      @scala.inline
      def setLogBase(value: Double): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
      
      @scala.inline
      def setMajorGridLines(value: PrimaryXAxisMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
      
      @scala.inline
      def setMajorTickLines(value: PrimaryXAxisMajorTickLines): Self = StObject.set(x, "majorTickLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTickLinesUndefined: Self = StObject.set(x, "majorTickLines", js.undefined)
      
      @scala.inline
      def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      @scala.inline
      def setMaximumLabels(value: Double): Self = StObject.set(x, "maximumLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLabelsUndefined: Self = StObject.set(x, "maximumLabels", js.undefined)
      
      @scala.inline
      def setMinorGridLines(value: PrimaryXAxisMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
      
      @scala.inline
      def setMinorTickLines(value: PrimaryXAxisMinorTickLines): Self = StObject.set(x, "minorTickLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTickLinesUndefined: Self = StObject.set(x, "minorTickLines", js.undefined)
      
      @scala.inline
      def setMinorTicksPerInterval(value: Double): Self = StObject.set(x, "minorTicksPerInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTicksPerIntervalUndefined: Self = StObject.set(x, "minorTicksPerInterval", js.undefined)
      
      @scala.inline
      def setMultiLevelLabels(value: js.Array[PrimaryXAxisMultiLevelLabel]): Self = StObject.set(x, "multiLevelLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiLevelLabelsUndefined: Self = StObject.set(x, "multiLevelLabels", js.undefined)
      
      @scala.inline
      def setMultiLevelLabelsVarargs(value: PrimaryXAxisMultiLevelLabel*): Self = StObject.set(x, "multiLevelLabels", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpposedPosition(value: Boolean): Self = StObject.set(x, "opposedPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpposedPositionUndefined: Self = StObject.set(x, "opposedPosition", js.undefined)
      
      @scala.inline
      def setOrientation(value: AxisOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPlotOffset(value: Double): Self = StObject.set(x, "plotOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlotOffsetUndefined: Self = StObject.set(x, "plotOffset", js.undefined)
      
      @scala.inline
      def setRange(value: PrimaryXAxisRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangePadding(value: RangePadding | String): Self = StObject.set(x, "rangePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangePaddingUndefined: Self = StObject.set(x, "rangePadding", js.undefined)
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRoundingPlaces(value: Double): Self = StObject.set(x, "roundingPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundingPlacesUndefined: Self = StObject.set(x, "roundingPlaces", js.undefined)
      
      @scala.inline
      def setScrollbarSettings(value: PrimaryXAxisScrollbarSettings): Self = StObject.set(x, "scrollbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarSettingsUndefined: Self = StObject.set(x, "scrollbarSettings", js.undefined)
      
      @scala.inline
      def setShowNextToAxisLine(value: Boolean): Self = StObject.set(x, "showNextToAxisLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNextToAxisLineUndefined: Self = StObject.set(x, "showNextToAxisLine", js.undefined)
      
      @scala.inline
      def setStripLine(value: js.Array[PrimaryXAxisStripLine]): Self = StObject.set(x, "stripLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLineUndefined: Self = StObject.set(x, "stripLine", js.undefined)
      
      @scala.inline
      def setStripLineVarargs(value: PrimaryXAxisStripLine*): Self = StObject.set(x, "stripLine", js.Array(value :_*))
      
      @scala.inline
      def setTickLinesPosition(value: TickLinesPosition | String): Self = StObject.set(x, "tickLinesPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickLinesPositionUndefined: Self = StObject.set(x, "tickLinesPosition", js.undefined)
      
      @scala.inline
      def setTitle(value: PrimaryXAxisTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValueType(value: ValueType | String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
      
      @scala.inline
      def setZoomPosition(value: Double): Self = StObject.set(x, "zoomPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomPositionUndefined: Self = StObject.set(x, "zoomPosition", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisAlternateGridBand extends StObject {
    
    /** Options for customizing even grid band.
      */
    var even: js.UndefOr[PrimaryXAxisAlternateGridBandEven] = js.native
    
    /** Options for customizing odd grid band.
      */
    var odd: js.UndefOr[PrimaryXAxisAlternateGridBandOdd] = js.native
  }
  object PrimaryXAxisAlternateGridBand {
    
    @scala.inline
    def apply(): PrimaryXAxisAlternateGridBand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisAlternateGridBand]
    }
    
    @scala.inline
    implicit class PrimaryXAxisAlternateGridBandMutableBuilder[Self <: PrimaryXAxisAlternateGridBand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEven(value: PrimaryXAxisAlternateGridBandEven): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
      
      @scala.inline
      def setOdd(value: PrimaryXAxisAlternateGridBandOdd): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOddUndefined: Self = StObject.set(x, "odd", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisAlternateGridBandEven extends StObject {
    
    /** Fill color for the even grid bands.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Opacity of the even grid band.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisAlternateGridBandEven {
    
    @scala.inline
    def apply(): PrimaryXAxisAlternateGridBandEven = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisAlternateGridBandEven]
    }
    
    @scala.inline
    implicit class PrimaryXAxisAlternateGridBandEvenMutableBuilder[Self <: PrimaryXAxisAlternateGridBandEven] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisAlternateGridBandOdd extends StObject {
    
    /** Fill color of the odd grid bands
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Opacity of odd grid band
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisAlternateGridBandOdd {
    
    @scala.inline
    def apply(): PrimaryXAxisAlternateGridBandOdd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisAlternateGridBandOdd]
    }
    
    @scala.inline
    implicit class PrimaryXAxisAlternateGridBandOddMutableBuilder[Self <: PrimaryXAxisAlternateGridBandOdd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisAxisLine extends StObject {
    
    /** Default Value
      */
    var color: js.UndefOr[String] = js.native
    
    /** Pattern of dashes and gaps to be applied to the axis line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Padding for axis line. Normally, it is used along with plotOffset to pad the plot area.
      * @Default {null}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Show/hides the axis line.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of axis line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisAxisLine {
    
    @scala.inline
    def apply(): PrimaryXAxisAxisLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisAxisLine]
    }
    
    @scala.inline
    implicit class PrimaryXAxisAxisLineMutableBuilder[Self <: PrimaryXAxisAxisLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisCrosshairLabel extends StObject {
    
    /** Show/hides the crosshair label associated with this axis.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PrimaryXAxisCrosshairLabel {
    
    @scala.inline
    def apply(): PrimaryXAxisCrosshairLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisCrosshairLabel]
    }
    
    @scala.inline
    implicit class PrimaryXAxisCrosshairLabelMutableBuilder[Self <: PrimaryXAxisCrosshairLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisFont extends StObject {
    
    /** Font family of labels.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of labels.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the label.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the axis labels.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the axis labels.
      * @Default {13px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object PrimaryXAxisFont {
    
    @scala.inline
    def apply(): PrimaryXAxisFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisFont]
    }
    
    @scala.inline
    implicit class PrimaryXAxisFontMutableBuilder[Self <: PrimaryXAxisFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisLabelBorder extends StObject {
    
    /** Specifies the color of the label border.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the width of the label border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisLabelBorder {
    
    @scala.inline
    def apply(): PrimaryXAxisLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisLabelBorder]
    }
    
    @scala.inline
    implicit class PrimaryXAxisLabelBorderMutableBuilder[Self <: PrimaryXAxisLabelBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisMajorGridLines extends StObject {
    
    /** Color of the major grid line.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Pattern of dashes and gaps used to stroke the major grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Opacity of major grid lines.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Show/hides the major grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the major grid lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisMajorGridLines {
    
    @scala.inline
    def apply(): PrimaryXAxisMajorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMajorGridLines]
    }
    
    @scala.inline
    implicit class PrimaryXAxisMajorGridLinesMutableBuilder[Self <: PrimaryXAxisMajorGridLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisMajorTickLines extends StObject {
    
    /** Length of the major tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Show/hides the major tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the major tick lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisMajorTickLines {
    
    @scala.inline
    def apply(): PrimaryXAxisMajorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMajorTickLines]
    }
    
    @scala.inline
    implicit class PrimaryXAxisMajorTickLinesMutableBuilder[Self <: PrimaryXAxisMajorTickLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisMinorGridLines extends StObject {
    
    /** Patterns of dashes and gaps used to stroke the minor grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Show/hides the minor grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the minorGridLines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisMinorGridLines {
    
    @scala.inline
    def apply(): PrimaryXAxisMinorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMinorGridLines]
    }
    
    @scala.inline
    implicit class PrimaryXAxisMinorGridLinesMutableBuilder[Self <: PrimaryXAxisMinorGridLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisMinorTickLines extends StObject {
    
    /** Length of the minor tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Show/hides the minor tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the minor tick line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisMinorTickLines {
    
    @scala.inline
    def apply(): PrimaryXAxisMinorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMinorTickLines]
    }
    
    @scala.inline
    implicit class PrimaryXAxisMinorTickLinesMutableBuilder[Self <: PrimaryXAxisMinorTickLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisMultiLevelLabel extends StObject {
    
    /** Options for customizing the border of the series.
      */
    var border: js.UndefOr[PrimaryXAxisMultiLevelLabelsBorder] = js.native
    
    /** Ending value of the multi level labels.
      * @Default {null}
      */
    var end: js.UndefOr[js.Any] = js.native
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[PrimaryXAxisMultiLevelLabelsFont] = js.native
    
    /** Specifies the level of multi level labels.
      * @Default {0}
      */
    var level: js.UndefOr[Double] = js.native
    
    /** Specifies the maximum width of the text in multi level labels.
      * @Default {null}
      */
    var maximumTextWidth: js.UndefOr[Double] = js.native
    
    /** Starting value of the multi level labels.
      * @Default {null}
      */
    var start: js.UndefOr[js.Any] = js.native
    
    /** Text of the multi level labels.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of the text in multi level labels.
      * @Default {center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies the handling of text over flow in multi level labels.
      * @Default {center. See TextOverflow}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.native
    
    /** Visibility of the multi level labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PrimaryXAxisMultiLevelLabel {
    
    @scala.inline
    def apply(): PrimaryXAxisMultiLevelLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMultiLevelLabel]
    }
    
    @scala.inline
    implicit class PrimaryXAxisMultiLevelLabelMutableBuilder[Self <: PrimaryXAxisMultiLevelLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: PrimaryXAxisMultiLevelLabelsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFont(value: PrimaryXAxisMultiLevelLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMaximumTextWidth(value: Double): Self = StObject.set(x, "maximumTextWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTextWidthUndefined: Self = StObject.set(x, "maximumTextWidth", js.undefined)
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisMultiLevelLabelsBorder extends StObject {
    
    /** Border color of the multi level labels.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border type of the multi level labels.
      * @Default {rectangle. See Type}
      */
    var `type`: js.UndefOr[MultiLevelLabelsBorderType | String] = js.native
    
    /** Border width of the multi level labels.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisMultiLevelLabelsBorder {
    
    @scala.inline
    def apply(): PrimaryXAxisMultiLevelLabelsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMultiLevelLabelsBorder]
    }
    
    @scala.inline
    implicit class PrimaryXAxisMultiLevelLabelsBorderMutableBuilder[Self <: PrimaryXAxisMultiLevelLabelsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setType(value: MultiLevelLabelsBorderType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisMultiLevelLabelsFont extends StObject {
    
    /** Font color of the multi level labels text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the multi level labels text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the multi level labels text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the multi level label text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.native
    
    /** Opacity of the multi level label text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the multi level label text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object PrimaryXAxisMultiLevelLabelsFont {
    
    @scala.inline
    def apply(): PrimaryXAxisMultiLevelLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisMultiLevelLabelsFont]
    }
    
    @scala.inline
    implicit class PrimaryXAxisMultiLevelLabelsFontMutableBuilder[Self <: PrimaryXAxisMultiLevelLabelsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisRange extends StObject {
    
    /** Interval of the axis range.
      * @Default {null}
      */
    var interval: js.UndefOr[Double] = js.native
    
    /** Maximum value of the axis range.
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.native
    
    /** Minimum value of the axis range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisRange {
    
    @scala.inline
    def apply(): PrimaryXAxisRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisRange]
    }
    
    @scala.inline
    implicit class PrimaryXAxisRangeMutableBuilder[Self <: PrimaryXAxisRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisScrollbarSettings extends StObject {
    
    /** Controls whether scrollbar has to be responsive in the chart.
      * @Default {false}
      */
    var canResize: js.UndefOr[Boolean] = js.native
    
    /** The maximum number of points to be displayed in the scrollbar.
      * @Default {null}
      */
    var pointsLength: js.UndefOr[Double] = js.native
    
    /** Options to customize the range for the scrollbar in the axis.
      */
    var range: js.UndefOr[PrimaryXAxisScrollbarSettingsRange] = js.native
    
    /** Specifies to enables or disables the scroll bar.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PrimaryXAxisScrollbarSettings {
    
    @scala.inline
    def apply(): PrimaryXAxisScrollbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisScrollbarSettings]
    }
    
    @scala.inline
    implicit class PrimaryXAxisScrollbarSettingsMutableBuilder[Self <: PrimaryXAxisScrollbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanResize(value: Boolean): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
      
      @scala.inline
      def setPointsLength(value: Double): Self = StObject.set(x, "pointsLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsLengthUndefined: Self = StObject.set(x, "pointsLength", js.undefined)
      
      @scala.inline
      def setRange(value: PrimaryXAxisScrollbarSettingsRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisScrollbarSettingsRange extends StObject {
    
    /** Maximum value for the scrollbar range .
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.native
    
    /** Minimum value of the scrollbar range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.native
  }
  object PrimaryXAxisScrollbarSettingsRange {
    
    @scala.inline
    def apply(): PrimaryXAxisScrollbarSettingsRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisScrollbarSettingsRange]
    }
    
    @scala.inline
    implicit class PrimaryXAxisScrollbarSettingsRangeMutableBuilder[Self <: PrimaryXAxisScrollbarSettingsRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisStripLine extends StObject {
    
    /** Border color of the strip line.
      * @Default {gray}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Background color of the strip line.
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.native
    
    /** End value of the strip line.
      * @Default {null}
      */
    var end: js.UndefOr[Double] = js.native
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[PrimaryXAxisStripLineFont] = js.native
    
    /** Start value of the strip line.
      * @Default {null}
      */
    var start: js.UndefOr[Double] = js.native
    
    /** Indicates whether to render the strip line from the minimum/start value of the axis. This property does not work when start property is set.
      * @Default {false}
      */
    var startFromAxis: js.UndefOr[Boolean] = js.native
    
    /** Specifies text to be displayed inside the strip line.
      * @Default {stripLine}
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of the text inside the strip line.
      * @Default {middlecenter. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Show/hides the strip line.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the strip line.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
    
    /** Specifies the order where the strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered under the series and when it is â€œoverâ€, it is
      * rendered above the series.
      * @Default {over. See ZIndex}
      */
    var zIndex: js.UndefOr[ZIndex | String] = js.native
  }
  object PrimaryXAxisStripLine {
    
    @scala.inline
    def apply(): PrimaryXAxisStripLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisStripLine]
    }
    
    @scala.inline
    implicit class PrimaryXAxisStripLineMutableBuilder[Self <: PrimaryXAxisStripLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFont(value: PrimaryXAxisStripLineFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFromAxis(value: Boolean): Self = StObject.set(x, "startFromAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFromAxisUndefined: Self = StObject.set(x, "startFromAxis", js.undefined)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: ZIndex | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisStripLineFont extends StObject {
    
    /** Font color of the strip line text.
      * @Default {black}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the strip line text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the strip line text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the strip line text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.native
    
    /** Opacity of the strip line text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the strip line text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object PrimaryXAxisStripLineFont {
    
    @scala.inline
    def apply(): PrimaryXAxisStripLineFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisStripLineFont]
    }
    
    @scala.inline
    implicit class PrimaryXAxisStripLineFontMutableBuilder[Self <: PrimaryXAxisStripLineFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisTitle extends StObject {
    
    /** Specifies the position of the axis title.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the title font.
      */
    var font: js.UndefOr[PrimaryXAxisTitleFont] = js.native
    
    /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
      * @Default {34}
      */
    var maximumTitleWidth: js.UndefOr[Double] = js.native
    
    /** offset value for axis title.
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Specifies the position of the axis title.
      * @Default {outside. See Position}
      */
    var position: js.UndefOr[LabelPosition | String] = js.native
    
    /** Title for the axis.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Controls the visibility of axis title.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PrimaryXAxisTitle {
    
    @scala.inline
    def apply(): PrimaryXAxisTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisTitle]
    }
    
    @scala.inline
    implicit class PrimaryXAxisTitleMutableBuilder[Self <: PrimaryXAxisTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: TextAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: PrimaryXAxisTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setMaximumTitleWidth(value: Double): Self = StObject.set(x, "maximumTitleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTitleWidthUndefined: Self = StObject.set(x, "maximumTitleWidth", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: LabelPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryXAxisTitleFont extends StObject {
    
    /** Font family of the title text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the title text.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the title text.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the axis title text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the axis title.
      * @Default {16px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object PrimaryXAxisTitleFont {
    
    @scala.inline
    def apply(): PrimaryXAxisTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryXAxisTitleFont]
    }
    
    @scala.inline
    implicit class PrimaryXAxisTitleFontMutableBuilder[Self <: PrimaryXAxisTitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxis extends StObject {
    
    /** Specifies the position of the axis labels.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[LabelAlignment | String] = js.native
    
    /** Options for customizing vertical axis alternate grid band.
      */
    var alternateGridBand: js.UndefOr[PrimaryYAxisAlternateGridBand] = js.native
    
    /** Options for customizing the axis line.
      */
    var axisLine: js.UndefOr[PrimaryYAxisAxisLine] = js.native
    
    /** Specifies where horizontal axis should intersect the vertical axis or vice versa. Value should be provided in axis co-ordinates. If provided value is greater than the maximum
      * value of crossing axis, then axis will be placed at the opposite side.
      * @Default {null}
      */
    var crossesAt: js.UndefOr[Double] = js.native
    
    /** Name of the axis used for crossing. Vertical axis name should be provided for horizontal axis and vice versa. If the provided name does not belongs to a valid axis, then primary X
      * axis or primary Y axis will be used for crossing
      * @Default {null}
      */
    var crossesInAxis: js.UndefOr[String] = js.native
    
    /** Options to customize the crosshair label.
      */
    var crosshairLabel: js.UndefOr[PrimaryYAxisCrosshairLabel] = js.native
    
    /** With this setting, you can request axis to calculate intervals approximately equal to your desired interval.
      * @Default {null}
      */
    var desiredIntervals: js.UndefOr[Double] = js.native
    
    /** Specifies the position of labels at the edge of the axis.
      * @Default {ej.datavisualization.Chart.EdgeLabelPlacement.None. See EdgeLabelPlacement}
      */
    var edgeLabelPlacement: js.UndefOr[EdgeLabelPlacement | String] = js.native
    
    /** Specifies the interval of the axis according to the zoomed data of the chart.
      * @Default {true}
      */
    var enableAutoIntervalOnZooming: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether to trim the axis label when the width of the label exceeds the maximumLabelWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the font of the axis Labels.
      */
    var font: js.UndefOr[PrimaryYAxisFont] = js.native
    
    /** Specifies the type of interval in date time axis.
      * @Default {null. See IntervalType}
      */
    var intervalType: js.UndefOr[IntervalType | String] = js.native
    
    /** Specifies whether to inverse the axis.
      * @Default {false}
      */
    var isInversed: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the border of the labels.
      */
    var labelBorder: js.UndefOr[PrimaryYAxisLabelBorder] = js.native
    
    /** Custom formatting for axis label and supports all standard formatting type of numerical and date time values.
      * @Default {null}
      */
    var labelFormat: js.UndefOr[String] = js.native
    
    /** Specifies the action to take when the axis labels are overlapping with each other.
      * @Default {ej.datavisualization.Chart.LabelIntersectAction.None}
      */
    var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.native
    
    /** Specifies the placement of labels.
      * @Default {ej.datavisualization.Chart.LabelPlacement.BetweenTicks. See LabelPlacement}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
    
    /** Specifies the position of the axis labels.
      * @Default {outside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.native
    
    /** Logarithmic base value. This is applicable only for logarithmic axis.
      * @Default {10}
      */
    var logBase: js.UndefOr[Double] = js.native
    
    /** Options for customizing major gird lines.
      */
    var majorGridLines: js.UndefOr[PrimaryYAxisMajorGridLines] = js.native
    
    /** Options for customizing the major tick lines.
      */
    var majorTickLines: js.UndefOr[PrimaryYAxisMajorTickLines] = js.native
    
    /** Maximum width of the axis label. When the label exceeds the width, the label gets trimmed when the enableTrim is set to true.
      * @Default {ej.datavisualization.Chart.maximumLabelWidth type {int}}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.native
    
    /** Maximum number of labels to be displayed in every 100 pixels.
      * @Default {3}
      */
    var maximumLabels: js.UndefOr[Double] = js.native
    
    /** Options for customizing the minor grid lines.
      */
    var minorGridLines: js.UndefOr[PrimaryYAxisMinorGridLines] = js.native
    
    /** Options for customizing the minor tick lines.
      */
    var minorTickLines: js.UndefOr[PrimaryYAxisMinorTickLines] = js.native
    
    /** Specifies the number of minor ticks per interval.
      * @Default {null}
      */
    var minorTicksPerInterval: js.UndefOr[Double] = js.native
    
    /** Options for customizing the multi level labels.
      * @Default {[ ]}
      */
    var multiLevelLabels: js.UndefOr[js.Array[PrimaryYAxisMultiLevelLabel]] = js.native
    
    /** Unique name of the axis. To associate an axis with the series, you have to set this name to the xAxisName/yAxisName property of the series.
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Specifies whether to render the axis at the opposite side of its default position.
      * @Default {false}
      */
    var opposedPosition: js.UndefOr[Boolean] = js.native
    
    /** Specifies the orientation of the axis line in the chart.
      * @Default {Vertical}
      */
    var orientation: js.UndefOr[AxisOrientation | String] = js.native
    
    /** Specifies the padding for the plot area.
      * @Default {10}
      */
    var plotOffset: js.UndefOr[Double] = js.native
    
    /** Options to customize the range of the axis.
      */
    var range: js.UndefOr[PrimaryYAxisRange] = js.native
    
    /** Specifies the padding for the axis range.
      * @Default {ej.datavisualization.Chart.RangePadding.None. See RangePadding}
      */
    var rangePadding: js.UndefOr[RangePadding | String] = js.native
    
    /** Rounds the number to the given number of decimals.
      * @Default {null}
      */
    var roundingPlaces: js.UndefOr[Double] = js.native
    
    /** Specifies the index of the row to which the axis is associated, when the chart area is divided into multiple plot areas by using rowDefinitions.
      * @Default {null}
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    /** Specifies the number of row or plot areas an axis has to span vertically.
      * @Default {null}
      */
    var rowSpan: js.UndefOr[Double] = js.native
    
    /** Options for customizing the axis scrollbar.
      */
    var scrollbarSettings: js.UndefOr[PrimaryYAxisScrollbarSettings] = js.native
    
    /** Specifies whether the axis elements need to be placed nearby the axis line, while crossing.
      * @Default {true}
      */
    var showNextToAxisLine: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the strip lines.
      * @Default {[ ]}
      */
    var stripLine: js.UndefOr[js.Array[PrimaryYAxisStripLine]] = js.native
    
    /** Specifies the position of the axis tick lines.
      * @Default {outside. See TickLinesPosition}
      */
    var tickLinesPosition: js.UndefOr[TickLinesPosition | String] = js.native
    
    /** Options for customizing the axis title.
      */
    var title: js.UndefOr[PrimaryYAxisTitle] = js.native
    
    /** Specifies the type of data the axis is handling.
      * @Default {null. See ValueType}
      */
    var valueType: js.UndefOr[ValueType | String] = js.native
    
    /** Show/hides the axis.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** The axis is scaled by this factor. When zoomFactor is 0.5, the chart is scaled by 200% along this axis. Values ranges from 0 to 1.
      * @Default {1}
      */
    var zoomFactor: js.UndefOr[Double] = js.native
    
    /** Position of the zoomed axis. Value ranges from 0 to 1
      * @Default {0}
      */
    var zoomPosition: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxis {
    
    @scala.inline
    def apply(): PrimaryYAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxis]
    }
    
    @scala.inline
    implicit class PrimaryYAxisMutableBuilder[Self <: PrimaryYAxis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: LabelAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setAlternateGridBand(value: PrimaryYAxisAlternateGridBand): Self = StObject.set(x, "alternateGridBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateGridBandUndefined: Self = StObject.set(x, "alternateGridBand", js.undefined)
      
      @scala.inline
      def setAxisLine(value: PrimaryYAxisAxisLine): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
      
      @scala.inline
      def setCrossesAt(value: Double): Self = StObject.set(x, "crossesAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossesAtUndefined: Self = StObject.set(x, "crossesAt", js.undefined)
      
      @scala.inline
      def setCrossesInAxis(value: String): Self = StObject.set(x, "crossesInAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossesInAxisUndefined: Self = StObject.set(x, "crossesInAxis", js.undefined)
      
      @scala.inline
      def setCrosshairLabel(value: PrimaryYAxisCrosshairLabel): Self = StObject.set(x, "crosshairLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrosshairLabelUndefined: Self = StObject.set(x, "crosshairLabel", js.undefined)
      
      @scala.inline
      def setDesiredIntervals(value: Double): Self = StObject.set(x, "desiredIntervals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredIntervalsUndefined: Self = StObject.set(x, "desiredIntervals", js.undefined)
      
      @scala.inline
      def setEdgeLabelPlacement(value: EdgeLabelPlacement | String): Self = StObject.set(x, "edgeLabelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeLabelPlacementUndefined: Self = StObject.set(x, "edgeLabelPlacement", js.undefined)
      
      @scala.inline
      def setEnableAutoIntervalOnZooming(value: Boolean): Self = StObject.set(x, "enableAutoIntervalOnZooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAutoIntervalOnZoomingUndefined: Self = StObject.set(x, "enableAutoIntervalOnZooming", js.undefined)
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: PrimaryYAxisFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setIntervalType(value: IntervalType | String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      @scala.inline
      def setIsInversed(value: Boolean): Self = StObject.set(x, "isInversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInversedUndefined: Self = StObject.set(x, "isInversed", js.undefined)
      
      @scala.inline
      def setLabelBorder(value: PrimaryYAxisLabelBorder): Self = StObject.set(x, "labelBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBorderUndefined: Self = StObject.set(x, "labelBorder", js.undefined)
      
      @scala.inline
      def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
      
      @scala.inline
      def setLabelIntersectAction(value: LabelIntersectAction | String): Self = StObject.set(x, "labelIntersectAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelIntersectActionUndefined: Self = StObject.set(x, "labelIntersectAction", js.undefined)
      
      @scala.inline
      def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLogBase(value: Double): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
      
      @scala.inline
      def setMajorGridLines(value: PrimaryYAxisMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
      
      @scala.inline
      def setMajorTickLines(value: PrimaryYAxisMajorTickLines): Self = StObject.set(x, "majorTickLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTickLinesUndefined: Self = StObject.set(x, "majorTickLines", js.undefined)
      
      @scala.inline
      def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      @scala.inline
      def setMaximumLabels(value: Double): Self = StObject.set(x, "maximumLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLabelsUndefined: Self = StObject.set(x, "maximumLabels", js.undefined)
      
      @scala.inline
      def setMinorGridLines(value: PrimaryYAxisMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
      
      @scala.inline
      def setMinorTickLines(value: PrimaryYAxisMinorTickLines): Self = StObject.set(x, "minorTickLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTickLinesUndefined: Self = StObject.set(x, "minorTickLines", js.undefined)
      
      @scala.inline
      def setMinorTicksPerInterval(value: Double): Self = StObject.set(x, "minorTicksPerInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTicksPerIntervalUndefined: Self = StObject.set(x, "minorTicksPerInterval", js.undefined)
      
      @scala.inline
      def setMultiLevelLabels(value: js.Array[PrimaryYAxisMultiLevelLabel]): Self = StObject.set(x, "multiLevelLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiLevelLabelsUndefined: Self = StObject.set(x, "multiLevelLabels", js.undefined)
      
      @scala.inline
      def setMultiLevelLabelsVarargs(value: PrimaryYAxisMultiLevelLabel*): Self = StObject.set(x, "multiLevelLabels", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpposedPosition(value: Boolean): Self = StObject.set(x, "opposedPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpposedPositionUndefined: Self = StObject.set(x, "opposedPosition", js.undefined)
      
      @scala.inline
      def setOrientation(value: AxisOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPlotOffset(value: Double): Self = StObject.set(x, "plotOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlotOffsetUndefined: Self = StObject.set(x, "plotOffset", js.undefined)
      
      @scala.inline
      def setRange(value: PrimaryYAxisRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangePadding(value: RangePadding | String): Self = StObject.set(x, "rangePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangePaddingUndefined: Self = StObject.set(x, "rangePadding", js.undefined)
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRoundingPlaces(value: Double): Self = StObject.set(x, "roundingPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundingPlacesUndefined: Self = StObject.set(x, "roundingPlaces", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setScrollbarSettings(value: PrimaryYAxisScrollbarSettings): Self = StObject.set(x, "scrollbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarSettingsUndefined: Self = StObject.set(x, "scrollbarSettings", js.undefined)
      
      @scala.inline
      def setShowNextToAxisLine(value: Boolean): Self = StObject.set(x, "showNextToAxisLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNextToAxisLineUndefined: Self = StObject.set(x, "showNextToAxisLine", js.undefined)
      
      @scala.inline
      def setStripLine(value: js.Array[PrimaryYAxisStripLine]): Self = StObject.set(x, "stripLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLineUndefined: Self = StObject.set(x, "stripLine", js.undefined)
      
      @scala.inline
      def setStripLineVarargs(value: PrimaryYAxisStripLine*): Self = StObject.set(x, "stripLine", js.Array(value :_*))
      
      @scala.inline
      def setTickLinesPosition(value: TickLinesPosition | String): Self = StObject.set(x, "tickLinesPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickLinesPositionUndefined: Self = StObject.set(x, "tickLinesPosition", js.undefined)
      
      @scala.inline
      def setTitle(value: PrimaryYAxisTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValueType(value: ValueType | String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
      
      @scala.inline
      def setZoomPosition(value: Double): Self = StObject.set(x, "zoomPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomPositionUndefined: Self = StObject.set(x, "zoomPosition", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisAlternateGridBand extends StObject {
    
    /** Options for customizing even grid band.
      */
    var even: js.UndefOr[PrimaryYAxisAlternateGridBandEven] = js.native
    
    /** Options for customizing odd grid band.
      */
    var odd: js.UndefOr[PrimaryYAxisAlternateGridBandOdd] = js.native
  }
  object PrimaryYAxisAlternateGridBand {
    
    @scala.inline
    def apply(): PrimaryYAxisAlternateGridBand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisAlternateGridBand]
    }
    
    @scala.inline
    implicit class PrimaryYAxisAlternateGridBandMutableBuilder[Self <: PrimaryYAxisAlternateGridBand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEven(value: PrimaryYAxisAlternateGridBandEven): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
      
      @scala.inline
      def setOdd(value: PrimaryYAxisAlternateGridBandOdd): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOddUndefined: Self = StObject.set(x, "odd", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisAlternateGridBandEven extends StObject {
    
    /** Fill color for the even grid bands.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Opacity of the even grid band.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisAlternateGridBandEven {
    
    @scala.inline
    def apply(): PrimaryYAxisAlternateGridBandEven = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisAlternateGridBandEven]
    }
    
    @scala.inline
    implicit class PrimaryYAxisAlternateGridBandEvenMutableBuilder[Self <: PrimaryYAxisAlternateGridBandEven] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisAlternateGridBandOdd extends StObject {
    
    /** Fill color of the odd grid bands.
      * @Default {transparent}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Opacity of odd grid band.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisAlternateGridBandOdd {
    
    @scala.inline
    def apply(): PrimaryYAxisAlternateGridBandOdd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisAlternateGridBandOdd]
    }
    
    @scala.inline
    implicit class PrimaryYAxisAlternateGridBandOddMutableBuilder[Self <: PrimaryYAxisAlternateGridBandOdd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisAxisLine extends StObject {
    
    /** Color of axis line.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Pattern of dashes and gaps to be applied to the axis line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Padding for axis line. Normally, it is used along with plotOffset to pad the plot area.
      * @Default {null}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Show/hides the axis line.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of axis line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisAxisLine {
    
    @scala.inline
    def apply(): PrimaryYAxisAxisLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisAxisLine]
    }
    
    @scala.inline
    implicit class PrimaryYAxisAxisLineMutableBuilder[Self <: PrimaryYAxisAxisLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisCrosshairLabel extends StObject {
    
    /** Show/hides the crosshair label associated with this axis.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PrimaryYAxisCrosshairLabel {
    
    @scala.inline
    def apply(): PrimaryYAxisCrosshairLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisCrosshairLabel]
    }
    
    @scala.inline
    implicit class PrimaryYAxisCrosshairLabelMutableBuilder[Self <: PrimaryYAxisCrosshairLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisFont extends StObject {
    
    /** Font family of labels.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of labels.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the label.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the axis labels.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the axis labels.
      * @Default {13px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object PrimaryYAxisFont {
    
    @scala.inline
    def apply(): PrimaryYAxisFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisFont]
    }
    
    @scala.inline
    implicit class PrimaryYAxisFontMutableBuilder[Self <: PrimaryYAxisFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisLabelBorder extends StObject {
    
    /** Specifies the color of the label border.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the width of the label border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisLabelBorder {
    
    @scala.inline
    def apply(): PrimaryYAxisLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisLabelBorder]
    }
    
    @scala.inline
    implicit class PrimaryYAxisLabelBorderMutableBuilder[Self <: PrimaryYAxisLabelBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisMajorGridLines extends StObject {
    
    /** Color of the major grid lines.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Pattern of dashes and gaps used to stroke the major grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Opacity of major grid lines.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Show/hides the major grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the major grid lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisMajorGridLines {
    
    @scala.inline
    def apply(): PrimaryYAxisMajorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMajorGridLines]
    }
    
    @scala.inline
    implicit class PrimaryYAxisMajorGridLinesMutableBuilder[Self <: PrimaryYAxisMajorGridLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisMajorTickLines extends StObject {
    
    /** Length of the major tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Show/hides the major tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the major tick lines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisMajorTickLines {
    
    @scala.inline
    def apply(): PrimaryYAxisMajorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMajorTickLines]
    }
    
    @scala.inline
    implicit class PrimaryYAxisMajorTickLinesMutableBuilder[Self <: PrimaryYAxisMajorTickLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisMinorGridLines extends StObject {
    
    /** Patterns of dashes and gaps used to stroke the minor grid lines.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Show/hides the minor grid lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the minorGridLines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisMinorGridLines {
    
    @scala.inline
    def apply(): PrimaryYAxisMinorGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMinorGridLines]
    }
    
    @scala.inline
    implicit class PrimaryYAxisMinorGridLinesMutableBuilder[Self <: PrimaryYAxisMinorGridLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisMinorTickLines extends StObject {
    
    /** Length of the minor tick lines.
      * @Default {5}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Show/hides the minor tick lines.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the minor tick line
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisMinorTickLines {
    
    @scala.inline
    def apply(): PrimaryYAxisMinorTickLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMinorTickLines]
    }
    
    @scala.inline
    implicit class PrimaryYAxisMinorTickLinesMutableBuilder[Self <: PrimaryYAxisMinorTickLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisMultiLevelLabel extends StObject {
    
    /** Options for customizing the border of the series.
      */
    var border: js.UndefOr[PrimaryYAxisMultiLevelLabelsBorder] = js.native
    
    /** Ending value of the multi level labels.
      * @Default {null}
      */
    var end: js.UndefOr[Double] = js.native
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[PrimaryYAxisMultiLevelLabelsFont] = js.native
    
    /** Specifies the level of multi level labels.
      * @Default {0}
      */
    var level: js.UndefOr[Double] = js.native
    
    /** Specifies the maximum width of the text in multi level labels.
      * @Default {null}
      */
    var maximumTextWidth: js.UndefOr[Double] = js.native
    
    /** Starting value of the multi level labels.
      * @Default {null}
      */
    var start: js.UndefOr[Double] = js.native
    
    /** Text of the multi level labels.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of the text in multi level labels.
      * @Default {center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies the handling of text over flow in multi level labels.
      * @Default {center. See TextOverflow}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.native
    
    /** Visibility of the multi level labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PrimaryYAxisMultiLevelLabel {
    
    @scala.inline
    def apply(): PrimaryYAxisMultiLevelLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMultiLevelLabel]
    }
    
    @scala.inline
    implicit class PrimaryYAxisMultiLevelLabelMutableBuilder[Self <: PrimaryYAxisMultiLevelLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: PrimaryYAxisMultiLevelLabelsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFont(value: PrimaryYAxisMultiLevelLabelsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMaximumTextWidth(value: Double): Self = StObject.set(x, "maximumTextWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTextWidthUndefined: Self = StObject.set(x, "maximumTextWidth", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisMultiLevelLabelsBorder extends StObject {
    
    /** Border color of the multi level labels.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border type of the multi level labels.
      * @Default {rectangle. See Type}
      */
    var `type`: js.UndefOr[MultiLevelLabelsBorderType | String] = js.native
    
    /** Border width of the multi level labels.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisMultiLevelLabelsBorder {
    
    @scala.inline
    def apply(): PrimaryYAxisMultiLevelLabelsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMultiLevelLabelsBorder]
    }
    
    @scala.inline
    implicit class PrimaryYAxisMultiLevelLabelsBorderMutableBuilder[Self <: PrimaryYAxisMultiLevelLabelsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setType(value: MultiLevelLabelsBorderType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisMultiLevelLabelsFont extends StObject {
    
    /** Font color of the multi level labels text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the multi level labels text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the multi level labels text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the multi level label text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.native
    
    /** Opacity of the multi level label text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the multi level label text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object PrimaryYAxisMultiLevelLabelsFont {
    
    @scala.inline
    def apply(): PrimaryYAxisMultiLevelLabelsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisMultiLevelLabelsFont]
    }
    
    @scala.inline
    implicit class PrimaryYAxisMultiLevelLabelsFontMutableBuilder[Self <: PrimaryYAxisMultiLevelLabelsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisRange extends StObject {
    
    /** Interval for the range.
      * @Default {null}
      */
    var interval: js.UndefOr[Double] = js.native
    
    /** Maximum value of the axis range.
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.native
    
    /** Minimum value of the axis range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisRange {
    
    @scala.inline
    def apply(): PrimaryYAxisRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisRange]
    }
    
    @scala.inline
    implicit class PrimaryYAxisRangeMutableBuilder[Self <: PrimaryYAxisRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisScrollbarSettings extends StObject {
    
    /** Controls whether scrollbar has to be responsive in the chart.
      * @Default {false}
      */
    var canResize: js.UndefOr[Boolean] = js.native
    
    /** The maximum number of points to be displayed in the scrollbar.
      * @Default {null}
      */
    var pointsLength: js.UndefOr[Double] = js.native
    
    /** Options to customize the range for the scrollbar in the axis.
      */
    var range: js.UndefOr[PrimaryYAxisScrollbarSettingsRange] = js.native
    
    /** Specifies to enable or disable the scrollbar.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PrimaryYAxisScrollbarSettings {
    
    @scala.inline
    def apply(): PrimaryYAxisScrollbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisScrollbarSettings]
    }
    
    @scala.inline
    implicit class PrimaryYAxisScrollbarSettingsMutableBuilder[Self <: PrimaryYAxisScrollbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanResize(value: Boolean): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
      
      @scala.inline
      def setPointsLength(value: Double): Self = StObject.set(x, "pointsLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsLengthUndefined: Self = StObject.set(x, "pointsLength", js.undefined)
      
      @scala.inline
      def setRange(value: PrimaryYAxisScrollbarSettingsRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisScrollbarSettingsRange extends StObject {
    
    /** Maximum value for the scrollbar range .
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.native
    
    /** Minimum value of the scrollbar range.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.native
  }
  object PrimaryYAxisScrollbarSettingsRange {
    
    @scala.inline
    def apply(): PrimaryYAxisScrollbarSettingsRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisScrollbarSettingsRange]
    }
    
    @scala.inline
    implicit class PrimaryYAxisScrollbarSettingsRangeMutableBuilder[Self <: PrimaryYAxisScrollbarSettingsRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisStripLine extends StObject {
    
    /** Border color of the strip line.
      * @Default {gray}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Background color of the strip line.
      * @Default {gray}
      */
    var color: js.UndefOr[String] = js.native
    
    /** End value of the strip line.
      * @Default {null}
      */
    var end: js.UndefOr[Double] = js.native
    
    /** Options for customizing the font of the text.
      */
    var font: js.UndefOr[PrimaryYAxisStripLineFont] = js.native
    
    /** Start value of the strip line.
      * @Default {null}
      */
    var start: js.UndefOr[Double] = js.native
    
    /** Indicates whether to render the strip line from the minimum/start value of the axis. This property wonâ€™t work when start property is set.
      * @Default {false}
      */
    var startFromAxis: js.UndefOr[Boolean] = js.native
    
    /** Specifies text to be displayed inside the strip line.
      * @Default {stripLine}
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of the text inside the strip line.
      * @Default {middlecenter. See TextAlignment}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Show/hides the strip line.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the strip line.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
    
    /** Specifies the order in which strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered below the series and when it is â€œoverâ€, it is
      * rendered above the series.
      * @Default {over. See ZIndex}
      */
    var zIndex: js.UndefOr[ZIndex | String] = js.native
  }
  object PrimaryYAxisStripLine {
    
    @scala.inline
    def apply(): PrimaryYAxisStripLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisStripLine]
    }
    
    @scala.inline
    implicit class PrimaryYAxisStripLineMutableBuilder[Self <: PrimaryYAxisStripLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFont(value: PrimaryYAxisStripLineFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFromAxis(value: Boolean): Self = StObject.set(x, "startFromAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFromAxisUndefined: Self = StObject.set(x, "startFromAxis", js.undefined)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: ZIndex | String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisStripLineFont extends StObject {
    
    /** Font color of the strip line text.
      * @Default {black}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the strip line text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the strip line text.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the strip line text.
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[String] = js.native
    
    /** Opacity of the strip line text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the strip line text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object PrimaryYAxisStripLineFont {
    
    @scala.inline
    def apply(): PrimaryYAxisStripLineFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisStripLineFont]
    }
    
    @scala.inline
    implicit class PrimaryYAxisStripLineFontMutableBuilder[Self <: PrimaryYAxisStripLineFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisTitle extends StObject {
    
    /** Specifies the position of the axis title.
      * @Default {center. See Alignment}
      */
    var alignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
      * @Default {ej.datavisualization.Chart.enableTrim}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the title font.
      */
    var font: js.UndefOr[PrimaryYAxisTitleFont] = js.native
    
    /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
      * @Default {ej.datavisualization.Chart.maximumTitleWidth.null}
      */
    var maximumTitleWidth: js.UndefOr[Double] = js.native
    
    /** offset value for axis title.
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Specifies the position of the axis title.
      * @Default {outside. See Position}
      */
    var position: js.UndefOr[LabelPosition | String] = js.native
    
    /** Title for the axis.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Controls the visibility of axis title.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PrimaryYAxisTitle {
    
    @scala.inline
    def apply(): PrimaryYAxisTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisTitle]
    }
    
    @scala.inline
    implicit class PrimaryYAxisTitleMutableBuilder[Self <: PrimaryYAxisTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: TextAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: PrimaryYAxisTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setMaximumTitleWidth(value: Double): Self = StObject.set(x, "maximumTitleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTitleWidthUndefined: Self = StObject.set(x, "maximumTitleWidth", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: LabelPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryYAxisTitleFont extends StObject {
    
    /** Font family of the title text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the title text.
      * @Default {ej.datavisualization.Chart.FontStyle.Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the title text.
      * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the axis title text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the axis title.
      * @Default {16px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object PrimaryYAxisTitleFont {
    
    @scala.inline
    def apply(): PrimaryYAxisTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryYAxisTitleFont]
    }
    
    @scala.inline
    implicit class PrimaryYAxisTitleFontMutableBuilder[Self <: PrimaryYAxisTitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait RangeSelectedEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Selected data collection of object
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RangeSelectedEventArgs {
    
    @scala.inline
    def apply(): RangeSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSelectedEventArgs]
    }
    
    @scala.inline
    implicit class RangeSelectedEventArgsMutableBuilder[Self <: RangeSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RowDefinition extends StObject {
    
    /** Color of the line that indicates the starting point of the row in plotting area.
      * @Default {transparent}
      */
    var lineColor: js.UndefOr[String] = js.native
    
    /** Width of the line that indicates the starting point of the row in plot area.
      * @Default {1}
      */
    var lineWidth: js.UndefOr[Double] = js.native
    
    /** Height of the row in plotting area. Height is measured in either pixel or percentage based on the value of unit property.
      * @Default {50}
      */
    var rowHeight: js.UndefOr[Double] = js.native
    
    /** Specifies the unit to measure the height of the row in plotting area.
      * @Default {'pixel'. See Unit}
      */
    var unit: js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.Chart.Unit | String] = js.native
  }
  object RowDefinition {
    
    @scala.inline
    def apply(): RowDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDefinition]
    }
    
    @scala.inline
    implicit class RowDefinitionMutableBuilder[Self <: RowDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setUnit(value: typingsSlinky.ejWebAll.ej.datavisualization.Chart.Unit | String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait ScrollChangedEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** oldRange - returns the scrollbar position old start and end range value on change end of scrollbar    newRange - returns the scrollbar position new start and end range value
      * on change end of scrollbar
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ScrollChangedEventArgs {
    
    @scala.inline
    def apply(): ScrollChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollChangedEventArgs]
    }
    
    @scala.inline
    implicit class ScrollChangedEventArgsMutableBuilder[Self <: ScrollChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ScrollEndEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** oldRange - returns the scrollbar position old start and end range value on change end of scrollbar    newRange - returns the scrollbar position new start and end range value
      * on change end of scrollbar
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ScrollEndEventArgs {
    
    @scala.inline
    def apply(): ScrollEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollEndEventArgs]
    }
    
    @scala.inline
    implicit class ScrollEndEventArgsMutableBuilder[Self <: ScrollEndEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ScrollStartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** startRange - returns the scrollbar position starting range value on changing scrollbar    endRange - returns the scrollbar position end range value on changing scrollbar
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the RangeNavigator model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ScrollStartEventArgs {
    
    @scala.inline
    def apply(): ScrollStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollStartEventArgs]
    }
    
    @scala.inline
    implicit class ScrollStartEventArgsMutableBuilder[Self <: ScrollStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Series extends StObject {
    
    /** Specifies animation duration for series rendering.
      * @Default {null}
      */
    var animationDuration: js.UndefOr[String] = js.native
    
    /** Color of the point, where the close is up in financial chart.
      * @Default {null}
      */
    var bearFillColor: js.UndefOr[String] = js.native
    
    /** Options for customizing the border of the series.
      */
    var border: js.UndefOr[SeriesBorder] = js.native
    
    /** Quartile calculation has been performed in three different formulas to render the boxplot series .
      * @Default {exclusive.See BoxPlotMode}
      */
    var boxPlotMode: js.UndefOr[LabelPosition | String] = js.native
    
    /** Options for customizing the bubble options of the Bubble series
      */
    var bubbleOptions: js.UndefOr[SeriesBubbleOptions] = js.native
    
    /** Color of the point, where the close is down in financial chart.
      * @Default {null}
      */
    var bullFillColor: js.UndefOr[String] = js.native
    
    /** Specifies spline tension values for cardinal spline type.Value ranges from 0 to 1.
      * @Default {0.5}
      */
    var cardinalSplineTension: js.UndefOr[Double] = js.native
    
    /** Name of the property in the datasource that contains close value for the series.
      * @Default {null}
      */
    var close: js.UndefOr[String] = js.native
    
    /** To render the column and bar type series in rectangle/cylinder shape. See ColumnFacet
      * @Default {rectangle}
      */
    var columnFacet: js.UndefOr[ColumnFacet | String] = js.native
    
    /** Spacing between columns of different series. Value ranges from 0 to 1
      * @Default {0}
      */
    var columnSpacing: js.UndefOr[Double] = js.native
    
    /** Relative width of the columns in column type series. Value ranges from 0 to 1. Width also depends upon columnSpacing property.
      * @Default {0.7}
      */
    var columnWidth: js.UndefOr[Double] = js.native
    
    /** Options for customizing the waterfall connector line.
      */
    var connectorLine: js.UndefOr[SeriesConnectorLine] = js.native
    
    /** Options for customizing the corner radius. cornerRadius property also takes the numeric input and applies it for all the four corners of the column.
      */
    var cornerRadius: js.UndefOr[SeriesCornerRadius] = js.native
    
    /** Pattern of dashes and gaps used to stroke the line type series.
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Specifies the dataSource for the series. It can be an array of JSON objects or an instance of ej.DataManager.
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.native
    
    /** Controls the size of the hole in doughnut series. Value ranges from 0 to 1.
      * @Default {0.4}
      */
    var doughnutCoefficient: js.UndefOr[Double] = js.native
    
    /** Controls the size of the doughnut series. Value ranges from 0 to 1.
      * @Default {0.8}
      */
    var doughnutSize: js.UndefOr[Double] = js.native
    
    /** Options to customize the drag and drop in series.
      */
    var dragSettings: js.UndefOr[SeriesDragSettings] = js.native
    
    /** Type of series to be drawn in radar or polar series.
      * @Default {line. See DrawType}
      */
    var drawType: js.UndefOr[DrawType | String] = js.native
    
    /** Options for customizing the empty point in the series.
      */
    var emptyPointSettings: js.UndefOr[SeriesEmptyPointSettings] = js.native
    
    /** Enable/disable the animation of series.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** To avoid overlapping of data labels smartly.
      * @Default {null}
      */
    var enableSmartLabels: js.UndefOr[Double] = js.native
    
    /** End angle of pie/doughnut series. For a complete circle, it has to be 360, by default.
      * @Default {null}
      */
    var endAngle: js.UndefOr[Double] = js.native
    
    /** Options to customize the error bar in series.
      */
    var errorBar: js.UndefOr[SeriesErrorBar] = js.native
    
    /** Explodes the pie/doughnut slices on mouse move.
      * @Default {false}
      */
    var explode: js.UndefOr[Boolean] = js.native
    
    /** Explodes all the slice of pie/doughnut on render.
      * @Default {null}
      */
    var explodeAll: js.UndefOr[Boolean] = js.native
    
    /** Index of the point to be exploded from pie/doughnut/pyramid/funnel.
      * @Default {null}
      */
    var explodeIndex: js.UndefOr[Double] = js.native
    
    /** Specifies the distance of the slice from the center, when it is exploded.
      * @Default {25}
      */
    var explodeOffset: js.UndefOr[Double] = js.native
    
    /** Fill color of the series.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options for customizing the series font.
      */
    var font: js.UndefOr[SeriesFont] = js.native
    
    /** Specifies the height of the funnel in funnel series. Values can be in both pixel and percentage.
      * @Default {32.7%}
      */
    var funnelHeight: js.UndefOr[String] = js.native
    
    /** Specifies the width of the funnel in funnel series. Values can be in both pixel and percentage.
      * @Default {11.6%}
      */
    var funnelWidth: js.UndefOr[String] = js.native
    
    /** Gap between the slices of pyramid/funnel series.
      * @Default {0}
      */
    var gapRatio: js.UndefOr[Double] = js.native
    
    /** Distance between the two pie's in pieOfPie series.
      * @Default {50}
      */
    var gapWidth: js.UndefOr[Double] = js.native
    
    /** Name of the property in the datasource that contains high value for the series.
      * @Default {null}
      */
    var high: js.UndefOr[String] = js.native
    
    /** Options for customizing the appearance of the series or data point while highlighting.
      */
    var highlightSettings: js.UndefOr[SeriesHighlightSettings] = js.native
    
    /** Specifies whether to join start and end point of a line/area series used in polar/radar chart to form a closed path.
      * @Default {true}
      */
    var isClosed: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether to stack the column series in polar/radar charts.
      * @Default {true}
      */
    var isStacking: js.UndefOr[Boolean] = js.native
    
    /** Renders the chart vertically. This is applicable only for Cartesian type series.
      * @Default {false}
      */
    var isTransposed: js.UndefOr[Boolean] = js.native
    
    /** Position of the data label in pie/doughnut/pyramid/funnel series. OutsideExtended position is not applicable for pyramid/funnel.
      * @Default {inside. See LabelPosition}
      */
    var labelPosition: js.UndefOr[LabelPosition | String] = js.native
    
    /** Specifies the line cap of the series.
      * @Default {Butt. See LineCap}
      */
    var lineCap: js.UndefOr[LineCap | String] = js.native
    
    /** Specifies the type of shape to be used where two lines meet.
      * @Default {Round. See LineJoin}
      */
    var lineJoin: js.UndefOr[LineJoin | String] = js.native
    
    /** Name of the property in the datasource that contains low value for the series.
      * @Default {null}
      */
    var low: js.UndefOr[String] = js.native
    
    /** Options for displaying and customizing marker for individual point in a series. Marker contains shapes and/or data labels.
      */
    var marker: js.UndefOr[SeriesMarker] = js.native
    
    /** Name of the series, that is to be displayed in the legend.
      * @Default {Add a comment to this line}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Opacity of the series.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Name of the property in the datasource that contains open value for the series.
      * @Default {null}
      */
    var open: js.UndefOr[String] = js.native
    
    /** Options for customizing the outlier of individual series.
      */
    var outlierSettings: js.UndefOr[SeriesOutlierSettings] = js.native
    
    /** Name of a field in data source where fill color for all the data points is generated.
      */
    var palette: js.UndefOr[String] = js.native
    
    /** Controls the size of pie series. Value ranges from 0 to 1.
      * @Default {0.8}
      */
    var pieCoefficient: js.UndefOr[Double] = js.native
    
    /** Controls the size of the second pie in pieOfPie series. Value ranges from 0 to 1.
      * @Default {0.6}
      */
    var pieOfPieCoefficient: js.UndefOr[Double] = js.native
    
    /** Name of the property in the datasource that contains fill color for the series.
      * @Default {null}
      */
    var pointColorMappingName: js.UndefOr[String] = js.native
    
    /** Option to add data points; each point should have x and y property. Also, optionally, you can customize the points color, border, marker by using fill, border and marker options.
      */
    var points: js.UndefOr[js.Array[SeriesPoint]] = js.native
    
    /** Fill color for the positive column of the waterfall.
      * @Default {null}
      */
    var positiveFill: js.UndefOr[String] = js.native
    
    /** Specifies the mode of the pyramid series.
      * @Default {linear}
      */
    var pyramidMode: js.UndefOr[PyramidMode | String] = js.native
    
    /** Specifies ej.Query to select data from dataSource. This property is applicable only when the dataSource is ej.DataManager.
      * @Default {null}
      */
    var query: js.UndefOr[js.Any] = js.native
    
    /** Options for customizing the appearance of the series/data point on selection.
      */
    var selectionSettings: js.UndefOr[SeriesSelectionSettings] = js.native
    
    /** Render the x mark in the center of the box and whisker series type.x represents the average value of the box and whisker series.
      * @Default {true}
      */
    var showMedian: js.UndefOr[Boolean] = js.native
    
    /** Name of the property in the datasource that contains the size value for the bubble series.
      * @Default {null}
      */
    var size: js.UndefOr[String] = js.native
    
    /** Specifies the different types of spline curve.
      * @Default {Natural. See SplineType}
      */
    var splineType: js.UndefOr[SplineType | String] = js.native
    
    /** Specifies the mode for splitting the data points in pieOfPie series.
      * @Default {value. See SplitMode}
      */
    var splitMode: js.UndefOr[SplitMode | String] = js.native
    
    /** Split Value of pieOfPie series.
      * @Default {null}
      */
    var splitValue: js.UndefOr[String] = js.native
    
    /** To group the series of stacking collection.
      */
    var stackingGroup: js.UndefOr[String] = js.native
    
    /** Start angle from where the pie/doughnut series renders. It starts from 0, by default.
      * @Default {null}
      */
    var startAngle: js.UndefOr[Double] = js.native
    
    /** Options for customizing the tooltip of chart.
      */
    var tooltip: js.UndefOr[SeriesTooltip] = js.native
    
    /** Option to add trendlines to chart.
      */
    var trendlines: js.UndefOr[js.Array[SeriesTrendline]] = js.native
    
    /** Specifies the type of the series to render in chart.
      * @Default {column. see Type}
      */
    var `type`: js.UndefOr[typingsSlinky.ejWebAll.ej.Type | String] = js.native
    
    /** Controls the visibility of the series.
      * @Default {visible}
      */
    var visibility: js.UndefOr[String] = js.native
    
    /** Enables or disables the visibility of legend item.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.native
    
    /** Specifies the name of the x-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
      * @Default {null}
      */
    var xAxisName: js.UndefOr[String] = js.native
    
    /** Name of the property in the datasource that contains x value for the series.
      * @Default {null}
      */
    var xName: js.UndefOr[String] = js.native
    
    /** Specifies the name of the y-axis that has to be associated with this series. Add an axis instance with this name to axes collection.
      * @Default {null}
      */
    var yAxisName: js.UndefOr[String] = js.native
    
    /** Name of the property in the datasource that contains y value for the series.
      * @Default {null}
      */
    var yName: js.UndefOr[String] = js.native
    
    /** Z-order of the series.
      * @Default {0}
      */
    var zOrder: js.UndefOr[Double] = js.native
  }
  object Series {
    
    @scala.inline
    def apply(): Series = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Series]
    }
    
    @scala.inline
    implicit class SeriesMutableBuilder[Self <: Series] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBearFillColor(value: String): Self = StObject.set(x, "bearFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBearFillColorUndefined: Self = StObject.set(x, "bearFillColor", js.undefined)
      
      @scala.inline
      def setBorder(value: SeriesBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBoxPlotMode(value: LabelPosition | String): Self = StObject.set(x, "boxPlotMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxPlotModeUndefined: Self = StObject.set(x, "boxPlotMode", js.undefined)
      
      @scala.inline
      def setBubbleOptions(value: SeriesBubbleOptions): Self = StObject.set(x, "bubbleOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleOptionsUndefined: Self = StObject.set(x, "bubbleOptions", js.undefined)
      
      @scala.inline
      def setBullFillColor(value: String): Self = StObject.set(x, "bullFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBullFillColorUndefined: Self = StObject.set(x, "bullFillColor", js.undefined)
      
      @scala.inline
      def setCardinalSplineTension(value: Double): Self = StObject.set(x, "cardinalSplineTension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardinalSplineTensionUndefined: Self = StObject.set(x, "cardinalSplineTension", js.undefined)
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setColumnFacet(value: ColumnFacet | String): Self = StObject.set(x, "columnFacet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnFacetUndefined: Self = StObject.set(x, "columnFacet", js.undefined)
      
      @scala.inline
      def setColumnSpacing(value: Double): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpacingUndefined: Self = StObject.set(x, "columnSpacing", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setConnectorLine(value: SeriesConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      @scala.inline
      def setCornerRadius(value: SeriesCornerRadius): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDoughnutCoefficient(value: Double): Self = StObject.set(x, "doughnutCoefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoughnutCoefficientUndefined: Self = StObject.set(x, "doughnutCoefficient", js.undefined)
      
      @scala.inline
      def setDoughnutSize(value: Double): Self = StObject.set(x, "doughnutSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoughnutSizeUndefined: Self = StObject.set(x, "doughnutSize", js.undefined)
      
      @scala.inline
      def setDragSettings(value: SeriesDragSettings): Self = StObject.set(x, "dragSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragSettingsUndefined: Self = StObject.set(x, "dragSettings", js.undefined)
      
      @scala.inline
      def setDrawType(value: DrawType | String): Self = StObject.set(x, "drawType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTypeUndefined: Self = StObject.set(x, "drawType", js.undefined)
      
      @scala.inline
      def setEmptyPointSettings(value: SeriesEmptyPointSettings): Self = StObject.set(x, "emptyPointSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyPointSettingsUndefined: Self = StObject.set(x, "emptyPointSettings", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableSmartLabels(value: Double): Self = StObject.set(x, "enableSmartLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSmartLabelsUndefined: Self = StObject.set(x, "enableSmartLabels", js.undefined)
      
      @scala.inline
      def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setErrorBar(value: SeriesErrorBar): Self = StObject.set(x, "errorBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorBarUndefined: Self = StObject.set(x, "errorBar", js.undefined)
      
      @scala.inline
      def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplodeAll(value: Boolean): Self = StObject.set(x, "explodeAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplodeAllUndefined: Self = StObject.set(x, "explodeAll", js.undefined)
      
      @scala.inline
      def setExplodeIndex(value: Double): Self = StObject.set(x, "explodeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplodeIndexUndefined: Self = StObject.set(x, "explodeIndex", js.undefined)
      
      @scala.inline
      def setExplodeOffset(value: Double): Self = StObject.set(x, "explodeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplodeOffsetUndefined: Self = StObject.set(x, "explodeOffset", js.undefined)
      
      @scala.inline
      def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: SeriesFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFunnelHeight(value: String): Self = StObject.set(x, "funnelHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunnelHeightUndefined: Self = StObject.set(x, "funnelHeight", js.undefined)
      
      @scala.inline
      def setFunnelWidth(value: String): Self = StObject.set(x, "funnelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunnelWidthUndefined: Self = StObject.set(x, "funnelWidth", js.undefined)
      
      @scala.inline
      def setGapRatio(value: Double): Self = StObject.set(x, "gapRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapRatioUndefined: Self = StObject.set(x, "gapRatio", js.undefined)
      
      @scala.inline
      def setGapWidth(value: Double): Self = StObject.set(x, "gapWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapWidthUndefined: Self = StObject.set(x, "gapWidth", js.undefined)
      
      @scala.inline
      def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHighlightSettings(value: SeriesHighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      @scala.inline
      def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClosedUndefined: Self = StObject.set(x, "isClosed", js.undefined)
      
      @scala.inline
      def setIsStacking(value: Boolean): Self = StObject.set(x, "isStacking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStackingUndefined: Self = StObject.set(x, "isStacking", js.undefined)
      
      @scala.inline
      def setIsTransposed(value: Boolean): Self = StObject.set(x, "isTransposed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTransposedUndefined: Self = StObject.set(x, "isTransposed", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: LabelPosition | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLineCap(value: LineCap | String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineJoin(value: LineJoin | String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      @scala.inline
      def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setMarker(value: SeriesMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOutlierSettings(value: SeriesOutlierSettings): Self = StObject.set(x, "outlierSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlierSettingsUndefined: Self = StObject.set(x, "outlierSettings", js.undefined)
      
      @scala.inline
      def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPieCoefficient(value: Double): Self = StObject.set(x, "pieCoefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPieCoefficientUndefined: Self = StObject.set(x, "pieCoefficient", js.undefined)
      
      @scala.inline
      def setPieOfPieCoefficient(value: Double): Self = StObject.set(x, "pieOfPieCoefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPieOfPieCoefficientUndefined: Self = StObject.set(x, "pieOfPieCoefficient", js.undefined)
      
      @scala.inline
      def setPointColorMappingName(value: String): Self = StObject.set(x, "pointColorMappingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointColorMappingNameUndefined: Self = StObject.set(x, "pointColorMappingName", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Array[SeriesPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPointsVarargs(value: SeriesPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setPositiveFill(value: String): Self = StObject.set(x, "positiveFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveFillUndefined: Self = StObject.set(x, "positiveFill", js.undefined)
      
      @scala.inline
      def setPyramidMode(value: PyramidMode | String): Self = StObject.set(x, "pyramidMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPyramidModeUndefined: Self = StObject.set(x, "pyramidMode", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSelectionSettings(value: SeriesSelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      @scala.inline
      def setShowMedian(value: Boolean): Self = StObject.set(x, "showMedian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMedianUndefined: Self = StObject.set(x, "showMedian", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplineType(value: SplineType | String): Self = StObject.set(x, "splineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplineTypeUndefined: Self = StObject.set(x, "splineType", js.undefined)
      
      @scala.inline
      def setSplitMode(value: SplitMode | String): Self = StObject.set(x, "splitMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitModeUndefined: Self = StObject.set(x, "splitMode", js.undefined)
      
      @scala.inline
      def setSplitValue(value: String): Self = StObject.set(x, "splitValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitValueUndefined: Self = StObject.set(x, "splitValue", js.undefined)
      
      @scala.inline
      def setStackingGroup(value: String): Self = StObject.set(x, "stackingGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackingGroupUndefined: Self = StObject.set(x, "stackingGroup", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setTooltip(value: SeriesTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTrendlines(value: js.Array[SeriesTrendline]): Self = StObject.set(x, "trendlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrendlinesUndefined: Self = StObject.set(x, "trendlines", js.undefined)
      
      @scala.inline
      def setTrendlinesVarargs(value: SeriesTrendline*): Self = StObject.set(x, "trendlines", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      @scala.inline
      def setXAxisName(value: String): Self = StObject.set(x, "xAxisName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAxisNameUndefined: Self = StObject.set(x, "xAxisName", js.undefined)
      
      @scala.inline
      def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      @scala.inline
      def setYAxisName(value: String): Self = StObject.set(x, "yAxisName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxisNameUndefined: Self = StObject.set(x, "yAxisName", js.undefined)
      
      @scala.inline
      def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
      
      @scala.inline
      def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
    }
  }
  
  @js.native
  trait SeriesBorder extends StObject {
    
    /** Border color of the series.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** DashArray for border of the series.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Border width of the series.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesBorder {
    
    @scala.inline
    def apply(): SeriesBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesBorder]
    }
    
    @scala.inline
    implicit class SeriesBorderMutableBuilder[Self <: SeriesBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesBubbleOptions extends StObject {
    
    /** Used for setting the maximum radius of the bubble
      * @Default {3}
      */
    var maxRadius: js.UndefOr[Double] = js.native
    
    /** Used for the setting the minimum radius of the bubble
      * @Default {1}
      */
    var minRadius: js.UndefOr[Double] = js.native
    
    /** Used for the calculation of the bubble radius based on the mode selected
      * @Default {minMax .See RadiusMode}
      */
    var radiusMode: js.UndefOr[RadiusMode | String] = js.native
  }
  object SeriesBubbleOptions {
    
    @scala.inline
    def apply(): SeriesBubbleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesBubbleOptions]
    }
    
    @scala.inline
    implicit class SeriesBubbleOptionsMutableBuilder[Self <: SeriesBubbleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxRadius(value: Double): Self = StObject.set(x, "maxRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRadiusUndefined: Self = StObject.set(x, "maxRadius", js.undefined)
      
      @scala.inline
      def setMinRadius(value: Double): Self = StObject.set(x, "minRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRadiusUndefined: Self = StObject.set(x, "minRadius", js.undefined)
      
      @scala.inline
      def setRadiusMode(value: RadiusMode | String): Self = StObject.set(x, "radiusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusModeUndefined: Self = StObject.set(x, "radiusMode", js.undefined)
    }
  }
  
  @js.native
  trait SeriesConnectorLine extends StObject {
    
    /** Color of the connector line.
      * @Default {#565656}
      */
    var color: js.UndefOr[String] = js.native
    
    /** DashArray of the connector line.
      * @Default {null}
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Opacity of the connector line.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Width of the connector line.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesConnectorLine {
    
    @scala.inline
    def apply(): SeriesConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesConnectorLine]
    }
    
    @scala.inline
    implicit class SeriesConnectorLineMutableBuilder[Self <: SeriesConnectorLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesCornerRadius extends StObject {
    
    /** Specifies the radius for the bottom left corner.
      * @Default {0}
      */
    var bottomLeft: js.UndefOr[Double] = js.native
    
    /** Specifies the radius for the bottom right corner.
      * @Default {0}
      */
    var bottomRight: js.UndefOr[Double] = js.native
    
    /** Specifies the radius for the top left corner.
      * @Default {0}
      */
    var topLeft: js.UndefOr[Double] = js.native
    
    /** Specifies the radius for the top right corner.
      * @Default {0}
      */
    var topRight: js.UndefOr[Double] = js.native
  }
  object SeriesCornerRadius {
    
    @scala.inline
    def apply(): SeriesCornerRadius = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesCornerRadius]
    }
    
    @scala.inline
    implicit class SeriesCornerRadiusMutableBuilder[Self <: SeriesCornerRadius] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      @scala.inline
      def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      @scala.inline
      def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      @scala.inline
      def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    }
  }
  
  @js.native
  trait SeriesDragSettings extends StObject {
    
    /** drag/drop the series
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Specifies the type of drag settings.
      * @Default {xy}
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SeriesDragSettings {
    
    @scala.inline
    def apply(): SeriesDragSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesDragSettings]
    }
    
    @scala.inline
    implicit class SeriesDragSettingsMutableBuilder[Self <: SeriesDragSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SeriesEmptyPointSettings extends StObject {
    
    /** Specifies the mode of empty point.
      * @Default {gap}
      */
    var displayMode: js.UndefOr[EmptyPointMode | String] = js.native
    
    /** Options for customizing the color and border of the empty point in the series.
      */
    var style: js.UndefOr[SeriesEmptyPointSettingsStyle] = js.native
    
    /** Controls the visibility of the empty point.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SeriesEmptyPointSettings {
    
    @scala.inline
    def apply(): SeriesEmptyPointSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesEmptyPointSettings]
    }
    
    @scala.inline
    implicit class SeriesEmptyPointSettingsMutableBuilder[Self <: SeriesEmptyPointSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayMode(value: EmptyPointMode | String): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      @scala.inline
      def setStyle(value: SeriesEmptyPointSettingsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait SeriesEmptyPointSettingsStyle extends StObject {
    
    /** Options for customizing border of the empty point in the series.
      */
    var border: js.UndefOr[SeriesEmptyPointSettingsStyleBorder] = js.native
    
    /** Color of the empty point.
      */
    var color: js.UndefOr[String] = js.native
  }
  object SeriesEmptyPointSettingsStyle {
    
    @scala.inline
    def apply(): SeriesEmptyPointSettingsStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesEmptyPointSettingsStyle]
    }
    
    @scala.inline
    implicit class SeriesEmptyPointSettingsStyleMutableBuilder[Self <: SeriesEmptyPointSettingsStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: SeriesEmptyPointSettingsStyleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  @js.native
  trait SeriesEmptyPointSettingsStyleBorder extends StObject {
    
    /** Border color of the empty point.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the empty point.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesEmptyPointSettingsStyleBorder {
    
    @scala.inline
    def apply(): SeriesEmptyPointSettingsStyleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesEmptyPointSettingsStyleBorder]
    }
    
    @scala.inline
    implicit class SeriesEmptyPointSettingsStyleBorderMutableBuilder[Self <: SeriesEmptyPointSettingsStyleBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesErrorBar extends StObject {
    
    /** Options for customizing the error bar cap.
      */
    var cap: js.UndefOr[SeriesErrorBarCap] = js.native
    
    /** Specifies the direction of error bar.
      * @Default {both}
      */
    var direction: js.UndefOr[ErrorBarDirection | String] = js.native
    
    /** Fill color of the error bar.
      * @Default {#000000}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Value of horizontal  error bar.
      * @Default {1}
      */
    var horizontalErrorValue: js.UndefOr[Double] = js.native
    
    /** Value of negative horizontal error bar.
      * @Default {1}
      */
    var horizontalNegativeErrorValue: js.UndefOr[Double] = js.native
    
    /** Value of positive horizontal error bar.
      * @Default {1}
      */
    var horizontalPositiveErrorValue: js.UndefOr[Double] = js.native
    
    /** Specifies the mode of error bar.
      * @Default {vertical}
      */
    var mode: js.UndefOr[ErrorBarMode | String] = js.native
    
    /** Specifies the type of error bar.
      * @Default {FixedValue}
      */
    var `type`: js.UndefOr[ErrorBarType | String] = js.native
    
    /** Value of vertical error bar.
      * @Default {3}
      */
    var verticalErrorValue: js.UndefOr[Double] = js.native
    
    /** Value of negative vertical error bar.
      * @Default {5}
      */
    var verticalNegativeErrorValue: js.UndefOr[Double] = js.native
    
    /** Value of positive vertical error bar.
      * @Default {5}
      */
    var verticalPositiveErrorValue: js.UndefOr[Double] = js.native
    
    /** Show/hides the error bar
      * @Default {visible}
      */
    var visibility: js.UndefOr[Boolean] = js.native
    
    /** Width of the error bar.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesErrorBar {
    
    @scala.inline
    def apply(): SeriesErrorBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesErrorBar]
    }
    
    @scala.inline
    implicit class SeriesErrorBarMutableBuilder[Self <: SeriesErrorBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCap(value: SeriesErrorBarCap): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
      
      @scala.inline
      def setDirection(value: ErrorBarDirection | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHorizontalErrorValue(value: Double): Self = StObject.set(x, "horizontalErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalErrorValueUndefined: Self = StObject.set(x, "horizontalErrorValue", js.undefined)
      
      @scala.inline
      def setHorizontalNegativeErrorValue(value: Double): Self = StObject.set(x, "horizontalNegativeErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalNegativeErrorValueUndefined: Self = StObject.set(x, "horizontalNegativeErrorValue", js.undefined)
      
      @scala.inline
      def setHorizontalPositiveErrorValue(value: Double): Self = StObject.set(x, "horizontalPositiveErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalPositiveErrorValueUndefined: Self = StObject.set(x, "horizontalPositiveErrorValue", js.undefined)
      
      @scala.inline
      def setMode(value: ErrorBarMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setType(value: ErrorBarType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVerticalErrorValue(value: Double): Self = StObject.set(x, "verticalErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalErrorValueUndefined: Self = StObject.set(x, "verticalErrorValue", js.undefined)
      
      @scala.inline
      def setVerticalNegativeErrorValue(value: Double): Self = StObject.set(x, "verticalNegativeErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalNegativeErrorValueUndefined: Self = StObject.set(x, "verticalNegativeErrorValue", js.undefined)
      
      @scala.inline
      def setVerticalPositiveErrorValue(value: Double): Self = StObject.set(x, "verticalPositiveErrorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalPositiveErrorValueUndefined: Self = StObject.set(x, "verticalPositiveErrorValue", js.undefined)
      
      @scala.inline
      def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesErrorBarCap extends StObject {
    
    /** Color of the error bar cap.
      * @Default {#000000}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Length of the error bar cap.
      * @Default {1}
      */
    var length: js.UndefOr[Double] = js.native
    
    /** Show/Hides the error bar cap.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the error bar cap.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesErrorBarCap {
    
    @scala.inline
    def apply(): SeriesErrorBarCap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesErrorBarCap]
    }
    
    @scala.inline
    implicit class SeriesErrorBarCapMutableBuilder[Self <: SeriesErrorBarCap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesFont extends StObject {
    
    /** Font color of the series text.
      * @Default {#707070}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font Family of the series.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font Style of the series.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the series.
      * @Default {Regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of series text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Size of the series text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object SeriesFont {
    
    @scala.inline
    def apply(): SeriesFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesFont]
    }
    
    @scala.inline
    implicit class SeriesFontMutableBuilder[Self <: SeriesFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait SeriesHighlightSettings extends StObject {
    
    /** Options for customizing the border of series on highlight.
      */
    var border: js.UndefOr[SeriesHighlightSettingsBorder] = js.native
    
    /** Color of the series/point on highlight.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Custom pattern for the series on highlight.
      */
    var customPattern: js.UndefOr[String] = js.native
    
    /** Enables/disables the ability to highlight series or data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether series or data point has to be highlighted.
      * @Default {series. See Mode}
      */
    var mode: js.UndefOr[Mode | String] = js.native
    
    /** Opacity of the series/point on highlight.
      * @Default {0.6}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the pattern for the series/point on highlight.
      * @Default {none. See Pattern}
      */
    var pattern: js.UndefOr[String] = js.native
  }
  object SeriesHighlightSettings {
    
    @scala.inline
    def apply(): SeriesHighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesHighlightSettings]
    }
    
    @scala.inline
    implicit class SeriesHighlightSettingsMutableBuilder[Self <: SeriesHighlightSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: SeriesHighlightSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCustomPattern(value: String): Self = StObject.set(x, "customPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPatternUndefined: Self = StObject.set(x, "customPattern", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  @js.native
  trait SeriesHighlightSettingsBorder extends StObject {
    
    /** Border color of the series/point on highlight.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the series/point on highlight.
      * @Default {2}
      */
    var width: js.UndefOr[String] = js.native
  }
  object SeriesHighlightSettingsBorder {
    
    @scala.inline
    def apply(): SeriesHighlightSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesHighlightSettingsBorder]
    }
    
    @scala.inline
    implicit class SeriesHighlightSettingsBorderMutableBuilder[Self <: SeriesHighlightSettingsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarker extends StObject {
    
    /** Options for customizing the border of the marker shape.
      */
    var border: js.UndefOr[SeriesMarkerBorder] = js.native
    
    /** Options for displaying and customizing data labels.
      */
    var dataLabel: js.UndefOr[SeriesMarkerDataLabel] = js.native
    
    /** Color of the marker shape.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** The URL for the Image that is to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** Opacity of the marker.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the shape of the marker.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Options for customizing the size of the marker shape.
      */
    var size: js.UndefOr[SeriesMarkerSize] = js.native
    
    /** Controls the visibility of the marker shape.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SeriesMarker {
    
    @scala.inline
    def apply(): SeriesMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarker]
    }
    
    @scala.inline
    implicit class SeriesMarkerMutableBuilder[Self <: SeriesMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: SeriesMarkerBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDataLabel(value: SeriesMarkerDataLabel): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: SeriesMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarkerBorder extends StObject {
    
    /** Border color of the marker shape.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the marker shape.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesMarkerBorder {
    
    @scala.inline
    def apply(): SeriesMarkerBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerBorder]
    }
    
    @scala.inline
    implicit class SeriesMarkerBorderMutableBuilder[Self <: SeriesMarkerBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarkerDataLabel extends StObject {
    
    /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
      * @Default {null}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Options for customizing the border of the data label.
      */
    var border: js.UndefOr[SeriesMarkerDataLabelBorder] = js.native
    
    /** Options for displaying and customizing the line that connects point and data label.
      */
    var connectorLine: js.UndefOr[SeriesMarkerDataLabelConnectorLine] = js.native
    
    /** Enables saturation to the data label.
      * @Default {false}
      */
    var enableContrastColor: js.UndefOr[Boolean] = js.native
    
    /** Enable the wrap option to the data label.
      * @Default {false}
      */
    var enableWrap: js.UndefOr[Boolean] = js.native
    
    /** Background color of the data label.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[SeriesMarkerDataLabelFont] = js.native
    
    /** Horizontal alignment of the data label.
      * @Default {center}
      */
    var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.native
    
    /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
      */
    var margin: js.UndefOr[SeriesMarkerDataLabelMargin] = js.native
    
    /** Maximum label width of the data label.
      * @Default {null}
      */
    var maximumLabelWidth: js.UndefOr[Double] = js.native
    
    /** Options for customizing the datalabel positions
      */
    var offset: js.UndefOr[SeriesMarkerDataLabelOffset] = js.native
    
    /** Opacity of the data label.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Background shape of the data label.
      * @Default {No shape is rendered by default, so its value is â€˜noneâ€™. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Displays the partially visible data labels inside the chart Area.
      * @Default {false}
      */
    var showEdgeLabels: js.UndefOr[Boolean] = js.native
    
    /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      */
    var template: js.UndefOr[String] = js.native
    
    /** Name of a field in data source where datalabel text is displayed.
      */
    var textMappingName: js.UndefOr[String] = js.native
    
    /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
      * candle and OHLC.
      * @Default {top. See TextPosition}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.native
    
    /** Vertical alignment of the data label.
      * @Default {'center'}
      */
    var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.native
    
    /** Controls the visibility of the data labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SeriesMarkerDataLabel {
    
    @scala.inline
    def apply(): SeriesMarkerDataLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabel]
    }
    
    @scala.inline
    implicit class SeriesMarkerDataLabelMutableBuilder[Self <: SeriesMarkerDataLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setBorder(value: SeriesMarkerDataLabelBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setConnectorLine(value: SeriesMarkerDataLabelConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      @scala.inline
      def setEnableContrastColor(value: Boolean): Self = StObject.set(x, "enableContrastColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableContrastColorUndefined: Self = StObject.set(x, "enableContrastColor", js.undefined)
      
      @scala.inline
      def setEnableWrap(value: Boolean): Self = StObject.set(x, "enableWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWrapUndefined: Self = StObject.set(x, "enableWrap", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: SeriesMarkerDataLabelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHorizontalTextAlignment(value: HorizontalTextAlignment | String): Self = StObject.set(x, "horizontalTextAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "horizontalTextAlignment", js.undefined)
      
      @scala.inline
      def setMargin(value: SeriesMarkerDataLabelMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMaximumLabelWidth(value: Double): Self = StObject.set(x, "maximumLabelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLabelWidthUndefined: Self = StObject.set(x, "maximumLabelWidth", js.undefined)
      
      @scala.inline
      def setOffset(value: SeriesMarkerDataLabelOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setShowEdgeLabels(value: Boolean): Self = StObject.set(x, "showEdgeLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowEdgeLabelsUndefined: Self = StObject.set(x, "showEdgeLabels", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTextMappingName(value: String): Self = StObject.set(x, "textMappingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMappingNameUndefined: Self = StObject.set(x, "textMappingName", js.undefined)
      
      @scala.inline
      def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      @scala.inline
      def setVerticalTextAlignment(value: VerticalTextAlignment | String): Self = StObject.set(x, "verticalTextAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalTextAlignmentUndefined: Self = StObject.set(x, "verticalTextAlignment", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarkerDataLabelBorder extends StObject {
    
    /** Border color of the data label.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the data label.
      * @Default {0.1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesMarkerDataLabelBorder {
    
    @scala.inline
    def apply(): SeriesMarkerDataLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelBorder]
    }
    
    @scala.inline
    implicit class SeriesMarkerDataLabelBorderMutableBuilder[Self <: SeriesMarkerDataLabelBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarkerDataLabelConnectorLine extends StObject {
    
    /** Color of the connector.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Height of the connector.
      * @Default {null}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
      * @Default {line. See ConnectorLineType}
      */
    var `type`: js.UndefOr[typingsSlinky.ejWebAll.ej.Type | String] = js.native
    
    /** Width of the connector.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesMarkerDataLabelConnectorLine {
    
    @scala.inline
    def apply(): SeriesMarkerDataLabelConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelConnectorLine]
    }
    
    @scala.inline
    implicit class SeriesMarkerDataLabelConnectorLineMutableBuilder[Self <: SeriesMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setType(value: typingsSlinky.ejWebAll.ej.Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarkerDataLabelFont extends StObject {
    
    /** Font color of the data label text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the data label.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the data label.
      * @Default {regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object SeriesMarkerDataLabelFont {
    
    @scala.inline
    def apply(): SeriesMarkerDataLabelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelFont]
    }
    
    @scala.inline
    implicit class SeriesMarkerDataLabelFontMutableBuilder[Self <: SeriesMarkerDataLabelFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarkerDataLabelMargin extends StObject {
    
    /** Bottom margin of the text.
      * @Default {5}
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** Left margin of the text.
      * @Default {5}
      */
    var left: js.UndefOr[Double] = js.native
    
    /** Right margin of the text.
      * @Default {5}
      */
    var right: js.UndefOr[Double] = js.native
    
    /** Top margin of the text.
      * @Default {5}
      */
    var top: js.UndefOr[Double] = js.native
  }
  object SeriesMarkerDataLabelMargin {
    
    @scala.inline
    def apply(): SeriesMarkerDataLabelMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelMargin]
    }
    
    @scala.inline
    implicit class SeriesMarkerDataLabelMarginMutableBuilder[Self <: SeriesMarkerDataLabelMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarkerDataLabelOffset extends StObject {
    
    /** X value or horizontal offset to position the labels in chart.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Y value or vertical offset to position the labels.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object SeriesMarkerDataLabelOffset {
    
    @scala.inline
    def apply(): SeriesMarkerDataLabelOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerDataLabelOffset]
    }
    
    @scala.inline
    implicit class SeriesMarkerDataLabelOffsetMutableBuilder[Self <: SeriesMarkerDataLabelOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait SeriesMarkerSize extends StObject {
    
    /** Height of the marker.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Width of the marker.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesMarkerSize {
    
    @scala.inline
    def apply(): SeriesMarkerSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesMarkerSize]
    }
    
    @scala.inline
    implicit class SeriesMarkerSizeMutableBuilder[Self <: SeriesMarkerSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesOutlierSettings extends StObject {
    
    /** Specifies the shape of the outlier.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Options for customizing the size of the outlier shape.
      */
    var size: js.UndefOr[SeriesOutlierSettingsSize] = js.native
  }
  object SeriesOutlierSettings {
    
    @scala.inline
    def apply(): SeriesOutlierSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesOutlierSettings]
    }
    
    @scala.inline
    implicit class SeriesOutlierSettingsMutableBuilder[Self <: SeriesOutlierSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: SeriesOutlierSettingsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait SeriesOutlierSettingsSize extends StObject {
    
    /** Height of the outlier shape.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Width of the outlier shape.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesOutlierSettingsSize {
    
    @scala.inline
    def apply(): SeriesOutlierSettingsSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesOutlierSettingsSize]
    }
    
    @scala.inline
    implicit class SeriesOutlierSettingsSizeMutableBuilder[Self <: SeriesOutlierSettingsSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPoint extends StObject {
    
    /** Options for customizing the border of a point. This is applicable only for column type series and accumulation type series.
      */
    var border: js.UndefOr[SeriesPointsBorder] = js.native
    
    /** Close value of the point. Close value is applicable only for financial type series.
      * @Default {null}
      */
    var close: js.UndefOr[Double] = js.native
    
    /** Background color of the point. This is applicable only for column type series and accumulation type series.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** High value of the point. High value is applicable only for financial type series, range area series and range column series.
      * @Default {null}
      */
    var high: js.UndefOr[Double] = js.native
    
    /** Low value of the point. Low value is applicable only for financial type series, range area series and range column series.
      * @Default {null}
      */
    var low: js.UndefOr[Double] = js.native
    
    /** Options for displaying and customizing marker for a data point. Marker contains shapes and/or data labels.
      */
    var marker: js.UndefOr[SeriesPointsMarker] = js.native
    
    /** Open value of the point. This is applicable only for financial type series.
      * @Default {null}
      */
    var open: js.UndefOr[Double] = js.native
    
    /** To show/hide the intermediate summary from the last intermediate point.
      * @Default {false}
      */
    var showIntermediateSum: js.UndefOr[Boolean] = js.native
    
    /** To show/hide the total summary of the waterfall series.
      * @Default {false}
      */
    var showTotalSum: js.UndefOr[Boolean] = js.native
    
    /** Size of a bubble in the bubble series. This is applicable only for the bubble series.
      * @Default {null}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Datalabel text for the point.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
    
    /** Enables or disables the visibility of legend item.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.native
    
    /** X value of the point.
      * @Default {null}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Y value of the point.
      * @Default {null}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object SeriesPoint {
    
    @scala.inline
    def apply(): SeriesPoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPoint]
    }
    
    @scala.inline
    implicit class SeriesPointMutableBuilder[Self <: SeriesPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: SeriesPointsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setMarker(value: SeriesPointsMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setShowIntermediateSum(value: Boolean): Self = StObject.set(x, "showIntermediateSum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIntermediateSumUndefined: Self = StObject.set(x, "showIntermediateSum", js.undefined)
      
      @scala.inline
      def setShowTotalSum(value: Boolean): Self = StObject.set(x, "showTotalSum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTotalSumUndefined: Self = StObject.set(x, "showTotalSum", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsBorder extends StObject {
    
    /** Border color of the point.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the point.
      * @Default {null}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesPointsBorder {
    
    @scala.inline
    def apply(): SeriesPointsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsBorder]
    }
    
    @scala.inline
    implicit class SeriesPointsBorderMutableBuilder[Self <: SeriesPointsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsMarker extends StObject {
    
    /** Options for customizing the border of the marker shape.
      */
    var border: js.UndefOr[SeriesPointsMarkerBorder] = js.native
    
    /** Options for displaying and customizing data label.
      */
    var dataLabel: js.UndefOr[SeriesPointsMarkerDataLabel] = js.native
    
    /** Color of the marker shape.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** The URL for the Image that is to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** Opacity of the marker.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the shape of the marker.
      * @Default {circle. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Options for customizing the size of the marker shape.
      */
    var size: js.UndefOr[SeriesPointsMarkerSize] = js.native
    
    /** Controls the visibility of the marker shape.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SeriesPointsMarker {
    
    @scala.inline
    def apply(): SeriesPointsMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarker]
    }
    
    @scala.inline
    implicit class SeriesPointsMarkerMutableBuilder[Self <: SeriesPointsMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: SeriesPointsMarkerBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDataLabel(value: SeriesPointsMarkerDataLabel): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: SeriesPointsMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsMarkerBorder extends StObject {
    
    /** Border color of the marker shape.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the marker shape.
      * @Default {3}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesPointsMarkerBorder {
    
    @scala.inline
    def apply(): SeriesPointsMarkerBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerBorder]
    }
    
    @scala.inline
    implicit class SeriesPointsMarkerBorderMutableBuilder[Self <: SeriesPointsMarkerBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsMarkerDataLabel extends StObject {
    
    /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
      * @Default {null}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Options for customizing the border of the data label.
      */
    var border: js.UndefOr[SeriesPointsMarkerDataLabelBorder] = js.native
    
    /** Options for displaying and customizing the line that connects point and data label.
      */
    var connectorLine: js.UndefOr[SeriesPointsMarkerDataLabelConnectorLine] = js.native
    
    /** Background color of the data label.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[SeriesPointsMarkerDataLabelFont] = js.native
    
    /** Horizontal alignment of the data label.
      * @Default {center}
      */
    var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.native
    
    /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
      */
    var margin: js.UndefOr[SeriesPointsMarkerDataLabelMargin] = js.native
    
    /** Moves the label vertically by specified offset.
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Opacity of the data label.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Background shape of the data label.
      * @Default {No shape is rendered by default, so its value is â€˜noneâ€™. See Shape}
      */
    var shape: js.UndefOr[Shape | String] = js.native
    
    /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      */
    var template: js.UndefOr[String] = js.native
    
    /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
      * candle and OHLC.
      * @Default {top. See TextPosition}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.native
    
    /** Vertical alignment of the data label.
      * @Default {'center'}
      */
    var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.native
    
    /** Controls the visibility of the data labels.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SeriesPointsMarkerDataLabel {
    
    @scala.inline
    def apply(): SeriesPointsMarkerDataLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabel]
    }
    
    @scala.inline
    implicit class SeriesPointsMarkerDataLabelMutableBuilder[Self <: SeriesPointsMarkerDataLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setBorder(value: SeriesPointsMarkerDataLabelBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setConnectorLine(value: SeriesPointsMarkerDataLabelConnectorLine): Self = StObject.set(x, "connectorLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorLineUndefined: Self = StObject.set(x, "connectorLine", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: SeriesPointsMarkerDataLabelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHorizontalTextAlignment(value: HorizontalTextAlignment | String): Self = StObject.set(x, "horizontalTextAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalTextAlignmentUndefined: Self = StObject.set(x, "horizontalTextAlignment", js.undefined)
      
      @scala.inline
      def setMargin(value: SeriesPointsMarkerDataLabelMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShape(value: Shape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      @scala.inline
      def setVerticalTextAlignment(value: VerticalTextAlignment | String): Self = StObject.set(x, "verticalTextAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalTextAlignmentUndefined: Self = StObject.set(x, "verticalTextAlignment", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsMarkerDataLabelBorder extends StObject {
    
    /** Border color of the data label.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the data label.
      * @Default {0.1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesPointsMarkerDataLabelBorder {
    
    @scala.inline
    def apply(): SeriesPointsMarkerDataLabelBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabelBorder]
    }
    
    @scala.inline
    implicit class SeriesPointsMarkerDataLabelBorderMutableBuilder[Self <: SeriesPointsMarkerDataLabelBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsMarkerDataLabelConnectorLine extends StObject {
    
    /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
      * @Default {line. See ConnectorLineType}
      */
    var `type`: js.UndefOr[ConnectorLineType | String] = js.native
    
    /** Width of the connector.
      * @Default {0.5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesPointsMarkerDataLabelConnectorLine {
    
    @scala.inline
    def apply(): SeriesPointsMarkerDataLabelConnectorLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabelConnectorLine]
    }
    
    @scala.inline
    implicit class SeriesPointsMarkerDataLabelConnectorLineMutableBuilder[Self <: SeriesPointsMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ConnectorLineType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsMarkerDataLabelFont extends StObject {
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the data label.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the data label.
      * @Default {regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object SeriesPointsMarkerDataLabelFont {
    
    @scala.inline
    def apply(): SeriesPointsMarkerDataLabelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabelFont]
    }
    
    @scala.inline
    implicit class SeriesPointsMarkerDataLabelFontMutableBuilder[Self <: SeriesPointsMarkerDataLabelFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsMarkerDataLabelMargin extends StObject {
    
    /** Bottom margin of the text.
      * @Default {5}
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** Left margin of the text.
      * @Default {5}
      */
    var left: js.UndefOr[Double] = js.native
    
    /** Right margin of the text.
      * @Default {5}
      */
    var right: js.UndefOr[Double] = js.native
    
    /** Top margin of the text.
      * @Default {5}
      */
    var top: js.UndefOr[Double] = js.native
  }
  object SeriesPointsMarkerDataLabelMargin {
    
    @scala.inline
    def apply(): SeriesPointsMarkerDataLabelMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerDataLabelMargin]
    }
    
    @scala.inline
    implicit class SeriesPointsMarkerDataLabelMarginMutableBuilder[Self <: SeriesPointsMarkerDataLabelMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait SeriesPointsMarkerSize extends StObject {
    
    /** Height of the marker.
      * @Default {6}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Width of the marker.
      * @Default {6}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesPointsMarkerSize {
    
    @scala.inline
    def apply(): SeriesPointsMarkerSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesPointsMarkerSize]
    }
    
    @scala.inline
    implicit class SeriesPointsMarkerSizeMutableBuilder[Self <: SeriesPointsMarkerSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesRegionClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** series - Instance of the selected series    seriesIndex - Index of the selected series
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SeriesRegionClickEventArgs {
    
    @scala.inline
    def apply(): SeriesRegionClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesRegionClickEventArgs]
    }
    
    @scala.inline
    implicit class SeriesRegionClickEventArgsMutableBuilder[Self <: SeriesRegionClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SeriesRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** series - Instance of the series which is about to get rendered
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SeriesRenderingEventArgs {
    
    @scala.inline
    def apply(): SeriesRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesRenderingEventArgs]
    }
    
    @scala.inline
    implicit class SeriesRenderingEventArgsMutableBuilder[Self <: SeriesRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SeriesSelectionSettings extends StObject {
    
    /** Options for customizing the border of series on selection.
      */
    var border: js.UndefOr[SeriesSelectionSettingsBorder] = js.native
    
    /** Color of the series/point on selection.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Custom pattern for the series on selection.
      */
    var customPattern: js.UndefOr[String] = js.native
    
    /** Enables/disables the ability to select a series/data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether series or data point has to be selected.
      * @Default {series. See Mode}
      */
    var mode: js.UndefOr[Mode | String] = js.native
    
    /** Opacity of the series/point on selection.
      * @Default {0.6}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the pattern for the series/point on selection.
      * @Default {none. See Pattern}
      */
    var pattern: js.UndefOr[String] = js.native
    
    /** Specifies the drawn rectangle type.
      * @Default {xy}
      */
    var rangeType: js.UndefOr[RangeType | String] = js.native
    
    /** Specifies the type of selection.
      * @Default {single}
      */
    var `type`: js.UndefOr[SelectionType | String] = js.native
  }
  object SeriesSelectionSettings {
    
    @scala.inline
    def apply(): SeriesSelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesSelectionSettings]
    }
    
    @scala.inline
    implicit class SeriesSelectionSettingsMutableBuilder[Self <: SeriesSelectionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: SeriesSelectionSettingsBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCustomPattern(value: String): Self = StObject.set(x, "customPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPatternUndefined: Self = StObject.set(x, "customPattern", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setMode(value: Mode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setRangeType(value: RangeType | String): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
      
      @scala.inline
      def setType(value: SelectionType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SeriesSelectionSettingsBorder extends StObject {
    
    /** Border color of the series/point on selection.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the series/point on selection.
      * @Default {2}
      */
    var width: js.UndefOr[String] = js.native
  }
  object SeriesSelectionSettingsBorder {
    
    @scala.inline
    def apply(): SeriesSelectionSettingsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesSelectionSettingsBorder]
    }
    
    @scala.inline
    implicit class SeriesSelectionSettingsBorderMutableBuilder[Self <: SeriesSelectionSettingsBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesTooltip extends StObject {
    
    /** Options for customizing the border of the tooltip.
      */
    var border: js.UndefOr[SeriesTooltipBorder] = js.native
    
    /** Specifies the duration, the tooltip has to be displayed.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.native
    
    /** Enables/disables the animation of the tooltip when moving from one point to another.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Background color of the tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Format of the tooltip content.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.native
    
    /** Opacity of the tooltip.
      * @Default {0.95}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Customize the corner radius of the tooltip rectangle.
      * @Default {0}
      */
    var rx: js.UndefOr[Double] = js.native
    
    /** Customize the corner radius of the tooltip rectangle.
      * @Default {0}
      */
    var ry: js.UndefOr[Double] = js.native
    
    /** Custom template to format the tooltip content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
    
    /** Controls the visibility of the tooltip.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SeriesTooltip {
    
    @scala.inline
    def apply(): SeriesTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTooltip]
    }
    
    @scala.inline
    implicit class SeriesTooltipMutableBuilder[Self <: SeriesTooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: SeriesTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait SeriesTooltipBorder extends StObject {
    
    /** Border Color of the tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border Width of the tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesTooltipBorder {
    
    @scala.inline
    def apply(): SeriesTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTooltipBorder]
    }
    
    @scala.inline
    implicit class SeriesTooltipBorderMutableBuilder[Self <: SeriesTooltipBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesTrendline extends StObject {
    
    /** Past trends of the current series.
      * @Default {0}
      */
    var backwardForecast: js.UndefOr[Double] = js.native
    
    /** Pattern of dashes and gaps used to stroke the trendline.
      */
    var dashArray: js.UndefOr[String] = js.native
    
    /** Fill color of the trendlines.
      * @Default {#0000FF}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Future trends of the current series.
      * @Default {0}
      */
    var forwardForecast: js.UndefOr[Double] = js.native
    
    /** Specifies the trendline intercept value
      * @Default {null}
      */
    var intercept: js.UndefOr[Double] = js.native
    
    /** Name for the trendlines that is to be displayed in legend text.
      * @Default {Trendline}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Opacity of the trendline.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the moving average starting period  value.
      * @Default {2}
      */
    var period: js.UndefOr[Double] = js.native
    
    /** Specifies the order of polynomial trendlines.
      * @Default {0}
      */
    var polynomialOrder: js.UndefOr[Double] = js.native
    
    /** Options for customizing the trendline tooltip
      */
    var tooltip: js.UndefOr[SeriesTrendlinesTooltip] = js.native
    
    /** Specifies the type of trendline for the series.
      * @Default {linear. See TrendlinesType}
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Show/hides the trendline.
      */
    var visibility: js.UndefOr[Boolean] = js.native
    
    /** Show/hides the trendline legend.
      * @Default {visible}
      */
    var visibleOnLegend: js.UndefOr[String] = js.native
    
    /** Width of the trendlines.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesTrendline {
    
    @scala.inline
    def apply(): SeriesTrendline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTrendline]
    }
    
    @scala.inline
    implicit class SeriesTrendlineMutableBuilder[Self <: SeriesTrendline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackwardForecast(value: Double): Self = StObject.set(x, "backwardForecast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackwardForecastUndefined: Self = StObject.set(x, "backwardForecast", js.undefined)
      
      @scala.inline
      def setDashArray(value: String): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setForwardForecast(value: Double): Self = StObject.set(x, "forwardForecast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardForecastUndefined: Self = StObject.set(x, "forwardForecast", js.undefined)
      
      @scala.inline
      def setIntercept(value: Double): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setPolynomialOrder(value: Double): Self = StObject.set(x, "polynomialOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolynomialOrderUndefined: Self = StObject.set(x, "polynomialOrder", js.undefined)
      
      @scala.inline
      def setTooltip(value: SeriesTrendlinesTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setVisibleOnLegend(value: String): Self = StObject.set(x, "visibleOnLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleOnLegendUndefined: Self = StObject.set(x, "visibleOnLegend", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SeriesTrendlinesTooltip extends StObject {
    
    /** Options for customizing the border of the trendline tooltip.
      */
    var border: js.UndefOr[SeriesTrendlinesTooltipBorder] = js.native
    
    /** Specifies the duration of the trendline tooltip to be displayed.
      * @Default {500ms}
      */
    var duration: js.UndefOr[String] = js.native
    
    /** Enables/disables the animation of the trendline tooltip when moving from one point to other.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Background color of the trendline tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Format of the trendline tooltip content.
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.native
    
    /** Opacity of the trendline tooltip.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Customize the corner radius of the trendline tooltip rectangle.
      * @Default {0}
      */
    var rx: js.UndefOr[Double] = js.native
    
    /** Customize the corner radius of the trendline tooltip rectangle.
      * @Default {0}
      */
    var ry: js.UndefOr[Double] = js.native
  }
  object SeriesTrendlinesTooltip {
    
    @scala.inline
    def apply(): SeriesTrendlinesTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTrendlinesTooltip]
    }
    
    @scala.inline
    implicit class SeriesTrendlinesTooltipMutableBuilder[Self <: SeriesTrendlinesTooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: SeriesTrendlinesTooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
  
  @js.native
  trait SeriesTrendlinesTooltipBorder extends StObject {
    
    /** Specify the Border color of the  trendline tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the trendline tooltip.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SeriesTrendlinesTooltipBorder {
    
    @scala.inline
    def apply(): SeriesTrendlinesTooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeriesTrendlinesTooltipBorder]
    }
    
    @scala.inline
    implicit class SeriesTrendlinesTooltipBorderMutableBuilder[Self <: SeriesTrendlinesTooltipBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    /** Height of the Chart. Height can be specified in either pixel or percentage.
      * @Default {'450'}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Width of the Chart. Width can be specified in either pixel or percentage.
      * @Default {'450'}
      */
    var width: js.UndefOr[String] = js.native
  }
  object Size {
    
    @scala.inline
    def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SubTitleRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - location of the subTitle text    subtitle - text of the subtitle    size - Size of the Subtitle text
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SubTitleRenderingEventArgs {
    
    @scala.inline
    def apply(): SubTitleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubTitleRenderingEventArgs]
    }
    
    @scala.inline
    implicit class SubTitleRenderingEventArgsMutableBuilder[Self <: SubTitleRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SymbolRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - Instance that holds the location of marker symbol    style - Options to customize the marker style such as color, border and size
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SymbolRenderingEventArgs {
    
    @scala.inline
    def apply(): SymbolRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolRenderingEventArgs]
    }
    
    @scala.inline
    implicit class SymbolRenderingEventArgsMutableBuilder[Self <: SymbolRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Title extends StObject {
    
    /** Background color for the chart title.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.native
    
    /** Options to customize the border of the title.
      */
    var border: js.UndefOr[TitleBorder] = js.native
    
    /** Specifies whether to trim the Chart Title when the width of the title exceeds the maximumWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the font of Chart title.
      */
    var font: js.UndefOr[TitleFont] = js.native
    
    /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
      * @Default {auto}
      */
    var maximumWidth: js.UndefOr[String] = js.native
    
    /** Options to customize the sub title of Chart.
      */
    var subTitle: js.UndefOr[TitleSubTitle] = js.native
    
    /** Text to be displayed in Chart title.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Alignment of the title text.
      * @Default {Center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[Alignment | String] = js.native
    
    /** Specifies the action taken when the Chart width is more than the titleWidth.
      * @Default {trim.}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.native
    
    /** Controls the visibility of the Chart title
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Title {
    
    @scala.inline
    def apply(): Title = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Title]
    }
    
    @scala.inline
    implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorder(value: TitleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: TitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setMaximumWidth(value: String): Self = StObject.set(x, "maximumWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumWidthUndefined: Self = StObject.set(x, "maximumWidth", js.undefined)
      
      @scala.inline
      def setSubTitle(value: TitleSubTitle): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: Alignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TitleBorder extends StObject {
    
    /** color of the title border.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** opacity of the title border.
      * @Default {0.8}
      */
    var cornerRadius: js.UndefOr[Double] = js.native
    
    /** opacity of the title border.
      * @Default {0.8}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Width of the title border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object TitleBorder {
    
    @scala.inline
    def apply(): TitleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleBorder]
    }
    
    @scala.inline
    implicit class TitleBorderMutableBuilder[Self <: TitleBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TitleFont extends StObject {
    
    /** Font family for Chart title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for Chart title.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight for Chart title.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the Chart title.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size for Chart title.
      * @Default {20px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object TitleFont {
    
    @scala.inline
    def apply(): TitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleFont]
    }
    
    @scala.inline
    implicit class TitleFontMutableBuilder[Self <: TitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait TitleRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - Option to customize the title location in pixels    size - Read-only option to find the size of the title    title - Use this option to add custom text in title
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TitleRenderingEventArgs {
    
    @scala.inline
    def apply(): TitleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleRenderingEventArgs]
    }
    
    @scala.inline
    implicit class TitleRenderingEventArgsMutableBuilder[Self <: TitleRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TitleSubTitle extends StObject {
    
    /** Background color for the chart subtitle.
      * @Default {transparent}
      */
    var background: js.UndefOr[String] = js.native
    
    /** Options to customize the border of the title.
      */
    var border: js.UndefOr[TitleSubTitleBorder] = js.native
    
    /** Specifies whether to trim the Chart SubTitle when the width of the Subtitle exceeds the maximumWidth.
      * @Default {false}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Options for customizing the font of sub title.
      */
    var font: js.UndefOr[TitleSubTitleFont] = js.native
    
    /** Maximum width of the Subtitle, when the Subtitle exceeds this width, the Subtitle gets trimmed, when enableTrim is true.
      * @Default {auto}
      */
    var maximumWidth: js.UndefOr[String] = js.native
    
    /** Text to be displayed in sub title.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Alignment of sub title text.
      * @Default {far. See TextAlignment}
      */
    var textAlignment: js.UndefOr[Alignment | String] = js.native
    
    /** Specifies the action taken when the Chart width is more than the SubTitleWidth.
      * @Default {trim.}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.native
    
    /** Controls the visibility of the Chart SubTitle
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object TitleSubTitle {
    
    @scala.inline
    def apply(): TitleSubTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubTitle]
    }
    
    @scala.inline
    implicit class TitleSubTitleMutableBuilder[Self <: TitleSubTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorder(value: TitleSubTitleBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: TitleSubTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setMaximumWidth(value: String): Self = StObject.set(x, "maximumWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumWidthUndefined: Self = StObject.set(x, "maximumWidth", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: Alignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TitleSubTitleBorder extends StObject {
    
    /** color of the subtitle border.
      * @Default {transparent}
      */
    var color: js.UndefOr[String] = js.native
    
    /** opacity of the subtitle border.
      * @Default {0.8}
      */
    var cornerRadius: js.UndefOr[Double] = js.native
    
    /** opacity of the subtitle border.
      * @Default {0.8}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Width of the subtitle border.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object TitleSubTitleBorder {
    
    @scala.inline
    def apply(): TitleSubTitleBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubTitleBorder]
    }
    
    @scala.inline
    implicit class TitleSubTitleBorderMutableBuilder[Self <: TitleSubTitleBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TitleSubTitleFont extends StObject {
    
    /** Font family of sub title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for sub title.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight for sub title.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the sub title.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size for sub title.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object TitleSubTitleFont {
    
    @scala.inline
    def apply(): TitleSubTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubTitleFont]
    }
    
    @scala.inline
    implicit class TitleSubTitleFontMutableBuilder[Self <: TitleSubTitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait ToolTipInitializeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** currentText - Text to be displayed in tooltip. Set this option to customize the text displayed in tooltip    pointIndex - Index of the point on which mouse is hovered
      * seriesIndex - Index of the series in series collection whose point is hovered by mouse
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ToolTipInitializeEventArgs {
    
    @scala.inline
    def apply(): ToolTipInitializeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolTipInitializeEventArgs]
    }
    
    @scala.inline
    implicit class ToolTipInitializeEventArgsMutableBuilder[Self <: ToolTipInitializeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TrackAxisToolTipEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - Location of the crosshair label in pixels    axisIndex - Index of the axis for which crosshair label is displayed    crossAxis - Instance of the chart axis object
      * for which cross hair label is displayed    currentTrackText - Text to be displayed in crosshair label. Use this option to add custom text in crosshair label
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TrackAxisToolTipEventArgs {
    
    @scala.inline
    def apply(): TrackAxisToolTipEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackAxisToolTipEventArgs]
    }
    
    @scala.inline
    implicit class TrackAxisToolTipEventArgsMutableBuilder[Self <: TrackAxisToolTipEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TrackToolTipEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - Location of the trackball tooltip in pixels    pointIndex - Index of the point for which trackball tooltip is displayed    seriesIndex - Index of the series in
      * series collection    currentText - Text to be displayed in trackball tooltip. Use this option to add custom text in trackball tooltip    series - Instance of the series object
      * for which trackball tooltip is displayed.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TrackToolTipEventArgs {
    
    @scala.inline
    def apply(): TrackToolTipEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackToolTipEventArgs]
    }
    
    @scala.inline
    implicit class TrackToolTipEventArgsMutableBuilder[Self <: TrackToolTipEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TrendlineRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** trendlines - Trendline Object    series - Series data of the chart    forwardForecast - Forward Forecast value for the trendline    backwardForecast - Backward Forecast value
      * for the trendline
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TrendlineRenderingEventArgs {
    
    @scala.inline
    def apply(): TrendlineRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrendlineRenderingEventArgs]
    }
    
    @scala.inline
    implicit class TrendlineRenderingEventArgsMutableBuilder[Self <: TrendlineRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ZoomedEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Selected data collection of object
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the chart model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ZoomedEventArgs {
    
    @scala.inline
    def apply(): ZoomedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomedEventArgs]
    }
    
    @scala.inline
    implicit class ZoomedEventArgsMutableBuilder[Self <: ZoomedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Zooming extends StObject {
    
    /** Enables or disables zooming.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Enable or disables the differed zooming. When it is enabled, chart is updated only on mouse up action while zooming and panning.
      * @Default {false}
      */
    var enableDeferredZoom: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the ability to zoom the chart on moving the mouse wheel.
      * @Default {false}
      */
    var enableMouseWheel: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables pinch zooming.
      * @Default {true}
      */
    var enablePinching: js.UndefOr[Boolean] = js.native
    
    /** Toggles the visibility of the scrollbar, which will be displayed while zooming.
      * @Default {false}
      */
    var enableScrollbar: js.UndefOr[Boolean] = js.native
    
    /** To display user specified buttons in zooming toolbar.
      * @Default {[zoomIn, zoomOut, zoom, pan, reset]}
      */
    var toolbarItems: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies whether to allow zooming the chart vertically or horizontally or in both ways.
      * @Default {'x,y'}
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object Zooming {
    
    @scala.inline
    def apply(): Zooming = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Zooming]
    }
    
    @scala.inline
    implicit class ZoomingMutableBuilder[Self <: Zooming] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDeferredZoom(value: Boolean): Self = StObject.set(x, "enableDeferredZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDeferredZoomUndefined: Self = StObject.set(x, "enableDeferredZoom", js.undefined)
      
      @scala.inline
      def setEnableMouseWheel(value: Boolean): Self = StObject.set(x, "enableMouseWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMouseWheelUndefined: Self = StObject.set(x, "enableMouseWheel", js.undefined)
      
      @scala.inline
      def setEnablePinching(value: Boolean): Self = StObject.set(x, "enablePinching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePinchingUndefined: Self = StObject.set(x, "enablePinching", js.undefined)
      
      @scala.inline
      def setEnableScrollbar(value: Boolean): Self = StObject.set(x, "enableScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableScrollbarUndefined: Self = StObject.set(x, "enableScrollbar", js.undefined)
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setToolbarItems(value: js.Array[_]): Self = StObject.set(x, "toolbarItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarItemsUndefined: Self = StObject.set(x, "toolbarItems", js.undefined)
      
      @scala.inline
      def setToolbarItemsVarargs(value: js.Any*): Self = StObject.set(x, "toolbarItems", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
