package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Source
import typingsSlinky.devextreme.anon.WeightIn
import typingsSlinky.devextreme.anon.WeightOut
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSankeyTooltip extends BaseWidgetTooltip {
  
  /**
    * [descr:dxSankey.Options.tooltip.customizeLinkTooltip]
    */
  var customizeLinkTooltip: js.UndefOr[js.Function1[/* info */ Source, _]] = js.native
  
  /**
    * [descr:dxSankey.Options.tooltip.customizeNodeTooltip]
    */
  var customizeNodeTooltip: js.UndefOr[js.Function1[/* info */ WeightIn, _]] = js.native
  
  /**
    * [descr:dxSankey.Options.tooltip.linkTooltipTemplate]
    */
  var linkTooltipTemplate: js.UndefOr[
    template | (js.Function2[/* info */ Source, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxSankey.Options.tooltip.nodeTooltipTemplate]
    */
  var nodeTooltipTemplate: js.UndefOr[
    template | (js.Function2[/* info */ WeightOut, /* element */ dxElement, String | Element | JQuery])
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomizeLinkTooltip(value: /* info */ Source => _): Self = this.set("customizeLinkTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeLinkTooltip: Self = this.set("customizeLinkTooltip", js.undefined)
    
    @scala.inline
    def setCustomizeNodeTooltip(value: /* info */ WeightIn => _): Self = this.set("customizeNodeTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeNodeTooltip: Self = this.set("customizeNodeTooltip", js.undefined)
    
    @scala.inline
    def setLinkTooltipTemplateFunction2(value: (/* info */ Source, /* element */ dxElement) => String | Element | JQuery): Self = this.set("linkTooltipTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLinkTooltipTemplateElement(value: Element): Self = this.set("linkTooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTooltipTemplate(
      value: template | (js.Function2[/* info */ Source, /* element */ dxElement, String | Element | JQuery])
    ): Self = this.set("linkTooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkTooltipTemplate: Self = this.set("linkTooltipTemplate", js.undefined)
    
    @scala.inline
    def setNodeTooltipTemplateFunction2(value: (/* info */ WeightOut, /* element */ dxElement) => String | Element | JQuery): Self = this.set("nodeTooltipTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNodeTooltipTemplateElement(value: Element): Self = this.set("nodeTooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTooltipTemplate(
      value: template | (js.Function2[/* info */ WeightOut, /* element */ dxElement, String | Element | JQuery])
    ): Self = this.set("nodeTooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTooltipTemplate: Self = this.set("nodeTooltipTemplate", js.undefined)
  }
}
