package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.devextreme.anon.`23`
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFunnelLegend extends BaseLegend {
  
  /**
    * [descr:dxFunnel.Options.legend.customizeHint]
    */
  var customizeHint: js.UndefOr[js.Function1[/* itemInfo */ `23`, String]] = js.native
  
  /**
    * [descr:dxFunnel.Options.legend.customizeItems]
    */
  var customizeItems: js.UndefOr[js.Function1[/* items */ js.Array[FunnelLegendItem], js.Array[FunnelLegendItem]]] = js.native
  
  /**
    * [descr:dxFunnel.Options.legend.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ `23`, String]] = js.native
  
  /**
    * [descr:dxFunnel.Options.legend.markerTemplate]
    */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ FunnelLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
}
object dxFunnelLegend {
  
  @scala.inline
  def apply(): dxFunnelLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelLegend]
  }
  
  @scala.inline
  implicit class dxFunnelLegendOps[Self <: dxFunnelLegend] (val x: Self) extends AnyVal {
    
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
    def setCustomizeHint(value: /* itemInfo */ `23` => String): Self = this.set("customizeHint", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeHint: Self = this.set("customizeHint", js.undefined)
    
    @scala.inline
    def setCustomizeItems(value: /* items */ js.Array[FunnelLegendItem] => js.Array[FunnelLegendItem]): Self = this.set("customizeItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeItems: Self = this.set("customizeItems", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* itemInfo */ `23` => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setMarkerTemplateFunction2(
      value: (/* legendItem */ FunnelLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("markerTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMarkerTemplateElement(value: Element): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ FunnelLegendItem, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerTemplate: Self = this.set("markerTemplate", js.undefined)
  }
}
