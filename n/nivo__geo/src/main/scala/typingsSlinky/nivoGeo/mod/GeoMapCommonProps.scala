package typingsSlinky.nivoGeo.mod

import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoGeo.anon.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMapCommonProps extends CommonProps {
  var borderColor: js.UndefOr[String | (FeatureAccessor[_, Double])] = js.native
  var borderWidth: js.UndefOr[Double | (FeatureAccessor[_, Double])] = js.native
  var fillColor: js.UndefOr[String | (FeatureAccessor[_, String])] = js.native
  var onClick: js.UndefOr[GeoMapEventHandler] = js.native
  var onMouseEnter: js.UndefOr[GeoMapEventHandler] = js.native
  var onMouseLeave: js.UndefOr[GeoMapEventHandler] = js.native
  var onMouseMove: js.UndefOr[GeoMapEventHandler] = js.native
  var tooltip: js.UndefOr[ReactComponentClass[Feature]] = js.native
}

object GeoMapCommonProps {
  @scala.inline
  def apply(features: js.Array[_]): GeoMapCommonProps = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMapCommonProps]
  }
  @scala.inline
  implicit class GeoMapCommonPropsOps[Self <: GeoMapCommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColorFunction1(value: _ => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderColor(value: String | (FeatureAccessor[_, Double])): Self = {
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
    def withBorderWidthFunction1(value: _ => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double | (FeatureAccessor[_, Double])): Self = {
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
    def withFillColorFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFillColor(value: String | (FeatureAccessor[_, String])): Self = {
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
    def withOnClick(value: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
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
    def withOnMouseEnter(value: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
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
    def withOnMouseLeave(value: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
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
    def withOnMouseMove(value: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
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
    def withTooltip(value: ReactComponentClass[Feature]): Self = {
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
  }
  
}

