package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Index
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxBarGaugeTooltip extends BaseWidgetTooltip {
  /** Specifies a custom template for a tooltip. */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* scaleValue */ Index, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Allows you to change tooltip appearance. */
  var customizeTooltip: js.UndefOr[js.Function1[/* scaleValue */ Index, _]] = js.native
}

object dxBarGaugeTooltip {
  @scala.inline
  def apply(): dxBarGaugeTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBarGaugeTooltip]
  }
  @scala.inline
  implicit class dxBarGaugeTooltipOps[Self <: dxBarGaugeTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentTemplateFunction2(value: (/* scaleValue */ Index, /* element */ dxElement) => String | Element | JQuery): Self = {
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
      value: template | (js.Function2[/* scaleValue */ Index, /* element */ dxElement, String | Element | JQuery])
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
    def withCustomizeTooltip(value: /* scaleValue */ Index => _): Self = {
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

