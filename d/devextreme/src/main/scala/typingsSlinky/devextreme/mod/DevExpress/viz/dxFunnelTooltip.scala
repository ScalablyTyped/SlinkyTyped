package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Percent
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFunnelTooltip extends BaseWidgetTooltip {
  /** Specifies a custom template for a tooltip. */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* info */ Percent, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Customizes a specific tooltip's appearance. */
  var customizeTooltip: js.UndefOr[js.Function1[/* info */ Percent, _]] = js.native
}

object dxFunnelTooltip {
  @scala.inline
  def apply(): dxFunnelTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelTooltip]
  }
  @scala.inline
  implicit class dxFunnelTooltipOps[Self <: dxFunnelTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentTemplateFunction2(value: (/* info */ Percent, /* element */ dxElement) => String | Element | JQuery): Self = {
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
      value: template | (js.Function2[/* info */ Percent, /* element */ dxElement, String | Element | JQuery])
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
    def withCustomizeTooltip(value: /* info */ Percent => _): Self = {
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
  }
  
}

