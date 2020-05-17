package typingsSlinky.nivoGeo.mod

import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoGeo.anon.FeatureChoroplethBoundFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoroplethCommonProps extends CommonProps {
  var borderColor: js.UndefOr[String | (FeatureAccessor[ChoroplethBoundFeature, Double])] = js.native
  var borderWidth: js.UndefOr[Double | (FeatureAccessor[ChoroplethBoundFeature, Double])] = js.native
  var colors: js.UndefOr[String | js.Array[String] | (FeatureAccessor[_, String])] = js.native
  var data: js.Array[_] = js.native
  var domain: js.Array[Double] = js.native
  var fillColor: js.UndefOr[String | (FeatureAccessor[ChoroplethBoundFeature, String])] = js.native
  var label: js.UndefOr[String | (FeatureAccessor[_, String])] = js.native
  var `match`: js.UndefOr[String | DatumMatcher] = js.native
  var onClick: js.UndefOr[ChoroplethEventHandler] = js.native
  var onMouseEnter: js.UndefOr[ChoroplethEventHandler] = js.native
  var onMouseLeave: js.UndefOr[ChoroplethEventHandler] = js.native
  var onMouseMove: js.UndefOr[ChoroplethEventHandler] = js.native
  var tooltip: js.UndefOr[ReactComponentClass[FeatureChoroplethBoundFeature]] = js.native
  var unknownColor: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | (FeatureAccessor[_, Double])] = js.native
  var valueFormat: js.UndefOr[String | (FeatureAccessor[_, String | Double])] = js.native
}

object ChoroplethCommonProps {
  @scala.inline
  def apply(data: js.Array[_], domain: js.Array[Double], features: js.Array[_]): ChoroplethCommonProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoroplethCommonProps]
  }
  @scala.inline
  implicit class ChoroplethCommonPropsOps[Self <: ChoroplethCommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColorFunction1(value: ChoroplethBoundFeature => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, Double])): Self = {
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
    def withBorderWidthFunction1(value: ChoroplethBoundFeature => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double | (FeatureAccessor[ChoroplethBoundFeature, Double])): Self = {
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
    def withColorsFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: String | js.Array[String] | (FeatureAccessor[_, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColorFunction1(value: ChoroplethBoundFeature => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFillColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: String | (FeatureAccessor[_, String])): Self = {
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
    @scala.inline
    def withMatchFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatch(value: String | DatumMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: ReactComponentClass[FeatureChoroplethBoundFeature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownColor")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFunction1(value: _ => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: String | (FeatureAccessor[_, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatFunction1(value: _ => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueFormat(value: String | (FeatureAccessor[_, String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(js.undefined)
        ret
    }
  }
  
}

