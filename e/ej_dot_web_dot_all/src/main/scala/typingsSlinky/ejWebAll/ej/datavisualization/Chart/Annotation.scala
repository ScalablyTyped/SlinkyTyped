package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
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
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withCoordinateUnit(value: CoordinateUnit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinateUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: HorizontalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: AnnotationsMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: VerticalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
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
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisName")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisName")(js.undefined)
        ret
    }
  }
  
}

