package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ValueText
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures tooltips. */
@js.native
trait BaseGaugeTooltip extends BaseWidgetTooltip {
  /** Specifies a custom template for a tooltip. */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* scaleValue */ ValueText, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Allows you to change the appearance of specified tooltips. */
  var customizeTooltip: js.UndefOr[js.Function1[/* scaleValue */ ValueText, _]] = js.native
}

object BaseGaugeTooltip {
  @scala.inline
  def apply(): BaseGaugeTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeTooltip]
  }
  @scala.inline
  implicit class BaseGaugeTooltipOps[Self <: BaseGaugeTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentTemplateFunction2(value: (/* scaleValue */ ValueText, /* element */ dxElement) => String | Element | JQuery): Self = {
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
      value: template | (js.Function2[/* scaleValue */ ValueText, /* element */ dxElement, String | Element | JQuery])
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
    def withCustomizeTooltip(value: /* scaleValue */ ValueText => _): Self = {
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

