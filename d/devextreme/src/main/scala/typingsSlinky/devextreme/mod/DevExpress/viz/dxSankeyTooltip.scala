package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonSource
import typingsSlinky.devextreme.AnonTitle
import typingsSlinky.devextreme.AnonWeightIn
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSankeyTooltip extends BaseWidgetTooltip {
  /** Customizes link tooltips' appearance. */
  var customizeLinkTooltip: js.UndefOr[js.Function1[/* info */ AnonSource, _]] = js.native
  /** Customizes node tooltips' appearance. */
  var customizeNodeTooltip: js.UndefOr[js.Function1[/* info */ AnonTitle, _]] = js.native
  /** Specifies a custom template for a link's tooltip. */
  var linkTooltipTemplate: js.UndefOr[
    template | (js.Function2[/* info */ AnonSource, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Specifies a custom template for a node's tooltip. */
  var nodeTooltipTemplate: js.UndefOr[
    template | (js.Function2[/* info */ AnonWeightIn, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
}

object dxSankeyTooltip {
  @scala.inline
  def apply(): dxSankeyTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSankeyTooltip]
  }
  @scala.inline
  implicit class dxSankeyTooltipOps[Self <: dxSankeyTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeLinkTooltip(value: /* info */ AnonSource => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeLinkTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeLinkTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeLinkTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeNodeTooltip(value: /* info */ AnonTitle => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeNodeTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeNodeTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeNodeTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkTooltipTemplateFunction2(value: (/* info */ AnonSource, /* element */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTooltipTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLinkTooltipTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkTooltipTemplate(
      value: template | (js.Function2[/* info */ AnonSource, /* element */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTooltipTemplateFunction2(value: (/* info */ AnonWeightIn, /* element */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTooltipTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNodeTooltipTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeTooltipTemplate(
      value: template | (js.Function2[/* info */ AnonWeightIn, /* element */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTooltipTemplate")(js.undefined)
        ret
    }
  }
  
}

