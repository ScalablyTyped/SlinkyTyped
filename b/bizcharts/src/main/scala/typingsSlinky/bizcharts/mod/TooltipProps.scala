package typingsSlinky.bizcharts.mod

import typingsSlinky.bizcharts.AnonStyle
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps
  extends Props[js.Any] {
  var containerTpl: js.UndefOr[String] = js.native
  var crosshairs: js.UndefOr[AnonStyle | Boolean] = js.native
  var enterable: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[Boolean] = js.native
  var `g2-tooltip`: js.UndefOr[CSSProperties] = js.native
  var `g2-tooltip-list`: js.UndefOr[CSSProperties] = js.native
  var `g2-tooltip-list-item`: js.UndefOr[CSSProperties] = js.native
  var `g2-tooltip-marker`: js.UndefOr[CSSProperties] = js.native
  var `g2-tooltip-title`: js.UndefOr[CSSProperties] = js.native
  var htmlContent: js.UndefOr[
    js.Function2[/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]], String]
  ] = js.native
  var inPlot: js.UndefOr[Boolean] = js.native
  var itemTpl: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Double] = js.native
  var position: js.UndefOr[PositionType] = js.native
  var shared: js.UndefOr[Boolean] = js.native
  var showTitle: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var triggerOn: js.UndefOr[triggerOnType] = js.native
  var `type`: js.UndefOr[String] = js.native
  var useHtml: js.UndefOr[Boolean] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairs(value: AnonStyle | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairs")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterable")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip`(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-list`(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-list`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-list")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-list-item`(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-list-item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-list-item`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-list-item")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-marker`(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-marker`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-marker")(js.undefined)
        ret
    }
    @scala.inline
    def `withG2-tooltip-title`(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutG2-tooltip-title`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2-tooltip-title")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlContent(value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHtmlContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlContent")(js.undefined)
        ret
    }
    @scala.inline
    def withInPlot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInPlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPlot")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerOn(value: triggerOnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtml")(js.undefined)
        ret
    }
  }
  
}

