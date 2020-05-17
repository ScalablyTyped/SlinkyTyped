package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies options of the legend. */
@js.native
trait BaseChartLegend extends BaseLegend {
  /** Allows you to change the order, text, and visibility of legend items. */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[BaseChartLegendItem], js.Array[BaseChartLegendItem]]
  ] = js.native
  /** Specifies an SVG element that serves as a custom legend item marker. */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ BaseChartLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
}

object BaseChartLegend {
  @scala.inline
  def apply(): BaseChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartLegend]
  }
  @scala.inline
  implicit class BaseChartLegendOps[Self <: BaseChartLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeItems(value: /* items */ js.Array[BaseChartLegendItem] => js.Array[BaseChartLegendItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerTemplateFunction2(
      value: (/* legendItem */ BaseChartLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMarkerTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ BaseChartLegendItem, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTemplate")(js.undefined)
        ret
    }
  }
  
}

