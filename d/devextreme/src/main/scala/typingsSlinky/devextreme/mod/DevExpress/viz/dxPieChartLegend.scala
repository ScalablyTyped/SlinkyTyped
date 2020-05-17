package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.devextreme.anon.PointColor
import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPieChartLegend extends BaseChartLegend {
  /** Specifies the text for a hint that appears when a user hovers the mouse pointer over a legend item. */
  var customizeHint: js.UndefOr[js.Function1[/* pointInfo */ PointColor, String]] = js.native
  /** Allows you to change the order, text, and visibility of legend items. */
  @JSName("customizeItems")
  var customizeItems_dxPieChartLegend: js.UndefOr[
    js.Function1[/* items */ js.Array[PieChartLegendItem], js.Array[PieChartLegendItem]]
  ] = js.native
  /** Specifies a callback function that returns the text to be displayed by a legend item. */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ PointColor, String]] = js.native
  /** Specifies what chart elements to highlight when a corresponding item in the legend is hovered over. */
  var hoverMode: js.UndefOr[none | allArgumentPoints] = js.native
  /** Specifies an SVG element that serves as a custom legend item marker. */
  @JSName("markerTemplate")
  var markerTemplate_dxPieChartLegend: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ PieChartLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
}

object dxPieChartLegend {
  @scala.inline
  def apply(): dxPieChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartLegend]
  }
  @scala.inline
  implicit class dxPieChartLegendOps[Self <: dxPieChartLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeHint(value: /* pointInfo */ PointColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeHint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeHint")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeItems(value: /* items */ js.Array[PieChartLegendItem] => js.Array[PieChartLegendItem]): Self = {
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
    def withCustomizeText(value: /* pointInfo */ PointColor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverMode(value: none | allArgumentPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerTemplateFunction2(
      value: (/* legendItem */ PieChartLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
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
          /* legendItem */ PieChartLegendItem, 
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

