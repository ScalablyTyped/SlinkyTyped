package typingsSlinky.chartjsPluginAnnotation.mod

import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.horizontal
import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineAnnotationOptions
  extends CommonAnnotationOptions
     with AnnotationOptions {
   // value or label
  var borderColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.native
  var borderDash: js.UndefOr[js.Array[Double]] = js.native
  var borderDashOffset: js.UndefOr[Double] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
   // value or label
  var endValue: js.UndefOr[Double | String] = js.native
  var label: js.UndefOr[LineAnnotationLabel] = js.native
  var mode: horizontal | vertical = js.native
  var scaleID: String = js.native
  @JSName("type")
  var type_LineAnnotationOptions: line = js.native
  var value: Double | String = js.native
}

object LineAnnotationOptions {
  @scala.inline
  def apply(mode: horizontal | vertical, scaleID: String, `type`: line, value: Double | String): LineAnnotationOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], scaleID = scaleID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAnnotationOptions]
  }
  @scala.inline
  implicit class LineAnnotationOptionsOps[Self <: LineAnnotationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderDash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDash")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEndValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: LineAnnotationLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

