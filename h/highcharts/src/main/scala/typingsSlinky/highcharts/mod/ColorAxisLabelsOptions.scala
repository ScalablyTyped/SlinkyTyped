package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorAxisLabelsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps) What part of the string the given
    * position is anchored to. If `left`, the left side of the string is at the
    * axis position. Can be one of `"left"`, `"center"` or `"right"`. Defaults
    * to an intelligent guess based on which side of the chart the axis is on
    * and the rotation of the label.
    */
  var align: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
    * of label rotation to prevent overlapping labels. If there is enough
    * space, labels are not rotated. As the chart gets narrower, it will start
    * rotating the labels -45 degrees, then remove every second label and try
    * again with rotations 0 and -45 etc. Set it to `false` to disable
    * rotation, which will cause the labels to word-wrap if possible.
    */
  var autoRotation: js.UndefOr[`false` | js.Array[Double]] = js.native
  
  /**
    * (Highcharts, Gantt) When each category width is more than this many
    * pixels, we don't apply auto rotation. Instead, we lay out the axis label
    * with word wrap. A lower limit makes sense when the label contains
    * multiple short words that don't extend the available horizontal space for
    * each label.
    */
  var autoRotationLimit: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Gantt) Polar charts only. The label's pixel distance from
    * the perimeter of the plot area.
    */
  var distance: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Enable or disable the axis labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) A format string for the axis label.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Callback JavaScript function to format
    * the label. The value is given by `this.value`. Additional properties for
    * `this` are `axis`, `chart`, `isFirst` and `isLast`. The value of the
    * default label formatter can be retrieved by calling
    * `this.axis.defaultLabelFormatter.call(this)` within the function.
    *
    * Defaults to: (see online documentation for example)
    */
  var formatter: js.UndefOr[AxisLabelsFormatterCallbackFunction] = js.native
  
  /**
    * (Gantt) The number of pixels to indent the labels per level in a treegrid
    * axis.
    */
  var indentation: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) How to handle overflowing labels on
    * horizontal color axis. If set to `"allow"`, it will not be aligned at
    * all. By default it `"justify"` labels inside the chart area. If there is
    * room to move it, it will be aligned to the edge, else it will be removed.
    */
  var overflow: js.UndefOr[OptionsOverflowValue] = js.native
  
  /**
    * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
    * space between them.
    */
  var padding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Defines how the labels are be repositioned according to the
    * 3D chart orientation.
    *
    * - `'offset'`: Maintain a fixed horizontal/vertical distance from the tick
    * marks, despite the chart orientation. This is the backwards compatible
    * behavior, and causes skewing of X and Z axes.
    *
    * - `'chart'`: Preserve 3D position relative to the chart. This looks nice,
    * but hard to read if the text isn't forward-facing.
    *
    * - `'flap'`: Rotated text along the axis to compensate for the chart
    * orientation. This tries to maintain text as legible as possible on all
    * orientations.
    *
    * - `'ortho'`: Rotated text along the axis direction so that the labels are
    * orthogonal to the axis. This is very similar to `'flap'`, but prevents
    * skewing the labels (X and Y scaling are still present).
    */
  var position3d: js.UndefOr[OptionsPosition3dValue] = js.native
  
  /**
    * (Highcharts, Gantt) Whether to reserve space for the labels. By default,
    * space is reserved for the labels in these cases:
    *
    * * On all horizontal axes.
    *
    * * On vertical axes if `label.align` is `right` on a left-side axis or
    * `left` on a right-side axis.
    *
    * * On vertical axes if `label.align` is `center`.
    *
    * This can be turned off when for example the labels are rendered inside
    * the plot area instead of outside.
    */
  var reserveSpace: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Rotation of the labels in degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) If enabled, the axis labels will skewed to follow the
    * perspective.
    *
    * This will fix overlapping labels and titles, but texts become less
    * legible due to the distortion.
    *
    * The final appearance depends heavily on `labels.position3d`.
    */
  var skew3d: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Horizontal axes only. The number of
    * lines to spread the labels over to make room or tighter labels.
    */
  var staggerLines: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) To show only every _n_'th label on the
    * axis, set the step to _n_. Setting the step to 2 shows every other label.
    *
    * By default, the step is calculated automatically to avoid overlap. To
    * prevent this, set it to 1\. This usually only happens on a category axis,
    * and is often a sign that you have chosen the wrong axis type.
    *
    * Read more at Axis docs => What axis should I use?
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) CSS styles for the label. Use
    * `whiteSpace: 'nowrap'` to prevent wrapping of category labels. Use
    * `textOverflow: 'none'` to prevent ellipsis (dots).
    *
    * In styled mode, the labels are styled with the `.highcharts-axis-labels`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the
    * labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The x position offset of all labels
    * relative to the tick positions on the axis.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The y position offset of all labels
    * relative to the tick positions on the axis. The default makes it adapt to
    * the font size of the bottom axis.
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The Z index for the axis labels.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object ColorAxisLabelsOptions {
  
  @scala.inline
  def apply(): ColorAxisLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisLabelsOptions]
  }
  
  @scala.inline
  implicit class ColorAxisLabelsOptionsMutableBuilder[Self <: ColorAxisLabelsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAutoRotation(value: `false` | js.Array[Double]): Self = StObject.set(x, "autoRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotationLimit(value: Double): Self = StObject.set(x, "autoRotationLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotationLimitUndefined: Self = StObject.set(x, "autoRotationLimit", js.undefined)
    
    @scala.inline
    def setAutoRotationUndefined: Self = StObject.set(x, "autoRotation", js.undefined)
    
    @scala.inline
    def setAutoRotationVarargs(value: Double*): Self = StObject.set(x, "autoRotation", js.Array(value :_*))
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatter(value: AxisLabelsFormatterCallbackFunction): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
    
    @scala.inline
    def setOverflow(value: OptionsOverflowValue): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPosition3d(value: OptionsPosition3dValue): Self = StObject.set(x, "position3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition3dUndefined: Self = StObject.set(x, "position3d", js.undefined)
    
    @scala.inline
    def setReserveSpace(value: Boolean): Self = StObject.set(x, "reserveSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReserveSpaceUndefined: Self = StObject.set(x, "reserveSpace", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSkew3d(value: Boolean): Self = StObject.set(x, "skew3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkew3dUndefined: Self = StObject.set(x, "skew3d", js.undefined)
    
    @scala.inline
    def setStaggerLines(value: Double): Self = StObject.set(x, "staggerLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaggerLinesUndefined: Self = StObject.set(x, "staggerLines", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
