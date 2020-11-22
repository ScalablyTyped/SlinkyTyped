package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.devextreme.anon.ItemText
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxBarGaugeLegend extends BaseLegend {
  
  /**
    * [descr:dxBarGauge.Options.legend.customizeHint]
    */
  var customizeHint: js.UndefOr[js.Function1[/* arg */ ItemText, String]] = js.native
  
  /**
    * [descr:dxBarGauge.Options.legend.customizeItems]
    */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[BarGaugeLegendItem], js.Array[BarGaugeLegendItem]]
  ] = js.native
  
  /**
    * [descr:dxBarGauge.Options.legend.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* arg */ ItemText, String]] = js.native
  
  /**
    * [descr:dxBarGauge.Options.legend.itemTextFormat]
    */
  var itemTextFormat: js.UndefOr[format] = js.native
  
  /**
    * [descr:dxBarGauge.Options.legend.markerTemplate]
    */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ BarGaugeLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
}
object dxBarGaugeLegend {
  
  @scala.inline
  def apply(): dxBarGaugeLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBarGaugeLegend]
  }
  
  @scala.inline
  implicit class dxBarGaugeLegendOps[Self <: dxBarGaugeLegend] (val x: Self) extends AnyVal {
    
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
    def setCustomizeHint(value: /* arg */ ItemText => String): Self = this.set("customizeHint", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeHint: Self = this.set("customizeHint", js.undefined)
    
    @scala.inline
    def setCustomizeItems(value: /* items */ js.Array[BarGaugeLegendItem] => js.Array[BarGaugeLegendItem]): Self = this.set("customizeItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeItems: Self = this.set("customizeItems", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* arg */ ItemText => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setItemTextFormatFunction1(value: /* value */ Double | js.Date => String): Self = this.set("itemTextFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemTextFormat(value: format): Self = this.set("itemTextFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTextFormat: Self = this.set("itemTextFormat", js.undefined)
    
    @scala.inline
    def setMarkerTemplateFunction2(
      value: (/* legendItem */ BarGaugeLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("markerTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMarkerTemplateElement(value: Element): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ BarGaugeLegendItem, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerTemplate: Self = this.set("markerTemplate", js.undefined)
  }
}
