package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationsMeasureControlPointOptions] = js.native
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsMeasureTypeOptions] = js.native
}

object AnnotationsMeasureOptions {
  @scala.inline
  def apply(): AnnotationsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureOptionsOps[Self <: AnnotationsMeasureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlPointOptions(value: AnnotationsMeasureControlPointOptions): Self = {
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
    def withTypeOptions(value: AnnotationsMeasureTypeOptions): Self = {
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

