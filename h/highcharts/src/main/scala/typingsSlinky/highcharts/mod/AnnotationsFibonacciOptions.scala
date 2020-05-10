package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsFibonacciOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationsFibonacciControlPointOptions] = js.native
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsFibonacciLabelOptions] = js.native
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsFibonacciShapeOptions] = js.native
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsFibonacciTypeOptions] = js.native
}

object AnnotationsFibonacciOptions {
  @scala.inline
  def apply(): AnnotationsFibonacciOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciOptions]
  }
  @scala.inline
  implicit class AnnotationsFibonacciOptionsOps[Self <: AnnotationsFibonacciOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlPointOptions(value: AnnotationsFibonacciControlPointOptions): Self = {
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
    def withLabelOptions(value: AnnotationsFibonacciLabelOptions): Self = {
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
    def withShapeOptions(value: AnnotationsFibonacciShapeOptions): Self = {
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
    def withTypeOptions(value: AnnotationsFibonacciTypeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOptions")(js.undefined)
        ret
    }
  }
  
}

