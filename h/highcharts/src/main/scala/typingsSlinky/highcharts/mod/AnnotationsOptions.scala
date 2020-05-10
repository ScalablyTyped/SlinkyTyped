package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
    * points. Each control point inherits options from controlPointOptions
    * object. Options from the controlPointOptions can be overwritten by
    * options in a specific control point.
    */
  var controlPointOptions: js.UndefOr[js.Object | AnnotationsControlPointOptions] = js.native
  /**
    * (Highstock) A crooked line annotation.
    */
  var crookedLine: js.UndefOr[AnnotationsCrookedLineOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
    * draggable by a user. Possible values are `"x"`, `"xy"`, `"y"` and `""`
    * (disabled).
    */
  var draggable: js.UndefOr[OptionsDraggableValue] = js.native
  /**
    * (Highstock) An elliott wave annotation.
    */
  var elliottWave: js.UndefOr[AnnotationsElliottWaveOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
    */
  var events: js.UndefOr[AnnotationsEventsOptions] = js.native
  /**
    * (Highstock) A fibonacci annotation.
    */
  var fibonacci: js.UndefOr[AnnotationsFibonacciOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
    * Can be user later when removing an annotation in
    * Chart.removeAnnotation(id) method.
    */
  var id: js.UndefOr[Double | String] = js.native
  /**
    * (Highstock) An infinity line annotation.
    */
  var infinityLine: js.UndefOr[AnnotationsInfinityLineOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
    * Each label inherits options from the labelOptions object. An option from
    * the labelOptions can be overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsLabelOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
    * annotation. For options that apply to multiple labels, they can be added
    * to the labelOptions.
    */
  var labels: js.UndefOr[js.Array[AnnotationsLabelsOptions]] = js.native
  /**
    * (Highstock) A measure annotation.
    */
  var measure: js.UndefOr[AnnotationsMeasureOptions] = js.native
  /**
    * (Highstock) A pitchfork annotation.
    */
  var pitchfork: js.UndefOr[AnnotationsPitchforkOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
    * Each shape inherits options from the shapeOptions object. An option from
    * the shapeOptions can be overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsShapeOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
    * annotation. For options that apply to multiple shapes, then can be added
    * to the shapeOptions.
    */
  var shapes: js.UndefOr[js.Array[AnnotationsShapesOptions]] = js.native
  /**
    * (Highstock) A tunnel annotation.
    */
  var tunnel: js.UndefOr[AnnotationsTunnelOptions] = js.native
  /**
    * (Highstock) A vertical line annotation.
    */
  var verticalLine: js.UndefOr[AnnotationsVerticalLineOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
    * visible.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the annotation.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object AnnotationsOptions {
  @scala.inline
  def apply(): AnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsOptions]
  }
  @scala.inline
  implicit class AnnotationsOptionsOps[Self <: AnnotationsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlPointOptions(value: js.Object | AnnotationsControlPointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPointOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlPointOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPointOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCrookedLine(value: AnnotationsCrookedLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crookedLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrookedLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crookedLine")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: OptionsDraggableValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withElliottWave(value: AnnotationsElliottWaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliottWave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElliottWave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliottWave")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: AnnotationsEventsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFibonacci(value: AnnotationsFibonacciOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFibonacci: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacci")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinityLine(value: AnnotationsInfinityLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinityLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinityLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinityLine")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOptions(value: AnnotationsLabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[AnnotationsLabelsOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasure(value: AnnotationsMeasureOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchfork(value: AnnotationsPitchforkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchfork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchfork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchfork")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeOptions(value: AnnotationsShapeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShapes(value: js.Array[AnnotationsShapesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel(value: AnnotationsTunnelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLine(value: AnnotationsVerticalLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

