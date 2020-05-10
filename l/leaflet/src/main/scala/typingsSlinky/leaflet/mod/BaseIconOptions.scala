package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseIconOptions extends LayerOptions {
  var className: js.UndefOr[String] = js.native
  var iconAnchor: js.UndefOr[PointExpression] = js.native
  var iconRetinaUrl: js.UndefOr[String] = js.native
  var iconSize: js.UndefOr[PointExpression] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var popupAnchor: js.UndefOr[PointExpression] = js.native
  var shadowAnchor: js.UndefOr[PointExpression] = js.native
  var shadowRetinaUrl: js.UndefOr[String] = js.native
  var shadowSize: js.UndefOr[PointExpression] = js.native
  var shadowUrl: js.UndefOr[String] = js.native
  var tooltipAnchor: js.UndefOr[PointExpression] = js.native
}

object BaseIconOptions {
  @scala.inline
  def apply(): BaseIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseIconOptions]
  }
  @scala.inline
  implicit class BaseIconOptionsOps[Self <: BaseIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withIconAnchor(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withIconRetinaUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRetinaUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRetinaUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRetinaUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSize(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupAnchor(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowAnchor(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowRetinaUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRetinaUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowRetinaUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRetinaUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowSize(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipAnchor(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipAnchor")(js.undefined)
        ret
    }
  }
  
}

