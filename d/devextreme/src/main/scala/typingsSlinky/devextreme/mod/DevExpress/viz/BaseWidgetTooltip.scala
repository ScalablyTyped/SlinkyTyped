package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Blur
import typingsSlinky.devextreme.anon.DashStyleOpacity
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
@js.native
trait BaseWidgetTooltip extends js.Object {
  /** Specifies the length of a tooltip's arrow in pixels. */
  var arrowLength: js.UndefOr[Double] = js.native
  /** Configures a tooltip's border. */
  var border: js.UndefOr[DashStyleOpacity] = js.native
  /** Colors all tooltips. */
  var color: js.UndefOr[String] = js.native
  /** Specifies the container in which to draw tooltips. The default container is the HTML DOM `` element. */
  var container: js.UndefOr[String | Element | JQuery] = js.native
  /** Makes all the tooltip's corners rounded. */
  var cornerRadius: js.UndefOr[Double] = js.native
  /** Enables tooltips. */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies tooltips' font options. */
  var font: js.UndefOr[Font] = js.native
  /** Formats a value before it is displayed it in a tooltip. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  /** Specifies tooltips' transparency. */
  var opacity: js.UndefOr[Double] = js.native
  /** Generates an empty space, measured in pixels, between a tooltip's left/right border and its text. */
  var paddingLeftRight: js.UndefOr[Double] = js.native
  /** Generates an empty space, measured in pixels, between a tooltip's top/bottom border and its text. */
  var paddingTopBottom: js.UndefOr[Double] = js.native
  /** Configures a tooltip's shadow. */
  var shadow: js.UndefOr[Blur] = js.native
  /** Specifies a tooltip's z-index. */
  var zIndex: js.UndefOr[Double] = js.native
}

object BaseWidgetTooltip {
  @scala.inline
  def apply(): BaseWidgetTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetTooltip]
  }
  @scala.inline
  implicit class BaseWidgetTooltipOps[Self <: BaseWidgetTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLength")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: DashStyleOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
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
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeftRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeftRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeftRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeftRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTopBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTopBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Blur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

