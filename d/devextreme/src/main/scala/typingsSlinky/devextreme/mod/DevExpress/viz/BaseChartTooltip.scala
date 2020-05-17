package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures tooltips. */
@js.native
trait BaseChartTooltip extends BaseWidgetTooltip {
  /** Formats the point argument before it is displayed in the tooltip. To format the point value, use the format option. */
  var argumentFormat: js.UndefOr[format] = js.native
  /** Specifies a custom template for a tooltip. */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* pointInfo */ js.Any, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Allows you to change tooltip appearance. */
  var customizeTooltip: js.UndefOr[js.Function1[/* pointInfo */ js.Any, _]] = js.native
  /** Specifies whether the tooltip is shared across all series points with the same argument. */
  var shared: js.UndefOr[Boolean] = js.native
}

object BaseChartTooltip {
  @scala.inline
  def apply(): BaseChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartTooltip]
  }
  @scala.inline
  implicit class BaseChartTooltipOps[Self <: BaseChartTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArgumentFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTemplateFunction2(value: (/* pointInfo */ js.Any, /* element */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContentTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentTemplate(
      value: template | (js.Function2[/* pointInfo */ js.Any, /* element */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeTooltip(value: /* pointInfo */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeTooltip")(js.undefined)
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
  }
  
}

