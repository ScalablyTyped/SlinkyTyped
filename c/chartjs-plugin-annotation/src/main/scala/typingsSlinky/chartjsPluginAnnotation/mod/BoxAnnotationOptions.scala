package typingsSlinky.chartjsPluginAnnotation.mod

import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxAnnotationOptions
  extends CommonAnnotationOptions
     with AnnotationOptions {
  var backgroundColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.native
  var borderColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  @JSName("type")
  var type_BoxAnnotationOptions: box = js.native
   // value or label
  var xMax: Double | String = js.native
  var xMin: Double | String = js.native
  var xScaleID: js.UndefOr[String] = js.native
  var yMax: Double | String = js.native
  var yMin: Double | String = js.native
  var yScaleID: js.UndefOr[String] = js.native
}

object BoxAnnotationOptions {
  @scala.inline
  def apply(
    `type`: box,
    xMax: Double | String,
    xMin: Double | String,
    yMax: Double | String,
    yMin: Double | String
  ): BoxAnnotationOptions = {
    val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxAnnotationOptions]
  }
  @scala.inline
  implicit class BoxAnnotationOptionsOps[Self <: BoxAnnotationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMax(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYMax(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYMin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
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
    def withXScaleID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScaleID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXScaleID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScaleID")(js.undefined)
        ret
    }
    @scala.inline
    def withYScaleID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScaleID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYScaleID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScaleID")(js.undefined)
        ret
    }
  }
  
}

