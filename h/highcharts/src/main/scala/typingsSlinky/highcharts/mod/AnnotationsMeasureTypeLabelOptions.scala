package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureTypeLabelOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the label text (min, max, average, bins
    * values).
    *
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Formatter function for the label text.
    *
    * Available data are:
    *
    *  (see online documentation for example)
    */
  var formatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highstock) CSS styles for the measure label.
    */
  var style: js.UndefOr[AnnotationsMeasureTypeLabelStyleOptions | CSSObject] = js.native
}

object AnnotationsMeasureTypeLabelOptions {
  @scala.inline
  def apply(): AnnotationsMeasureTypeLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeLabelOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureTypeLabelOptionsOps[Self <: AnnotationsMeasureTypeLabelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnnotationsMeasureTypeLabelStyleOptions | CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

