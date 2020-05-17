package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaSvgStyle extends js.Object {
  var areaSvgStyle: js.UndefOr[js.Object] = js.native
  var dataAreaDefaults: js.UndefOr[SelectedInnerColor] = js.native
  var dataMarkerDefaults: js.UndefOr[BorderStyle] = js.native
  var hoverBehaviorDelay: js.UndefOr[Double] = js.native
  var labelStyle: js.UndefOr[js.Object] = js.native
  var linkDefaults: js.UndefOr[ColorWidth] = js.native
}

object AreaSvgStyle {
  @scala.inline
  def apply(): AreaSvgStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSvgStyle]
  }
  @scala.inline
  implicit class AreaSvgStyleOps[Self <: AreaSvgStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaSvgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaSvgStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaSvgStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAreaDefaults(value: SelectedInnerColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAreaDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAreaDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAreaDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMarkerDefaults(value: BorderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMarkerDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMarkerDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMarkerDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBehaviorDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBehaviorDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkDefaults(value: ColorWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkDefaults")(js.undefined)
        ret
    }
  }
  
}

