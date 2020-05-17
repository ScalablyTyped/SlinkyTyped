package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.devextreme.anon.ColorEnd
import typingsSlinky.devextreme.anon.Layer
import typingsSlinky.devextreme.devextremeStrings.circle
import typingsSlinky.devextreme.devextremeStrings.square
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxVectorMapLegends extends BaseLegend {
  /** Specifies text for a hint that appears when a user hovers the mouse pointer over the text of a legend item. */
  var customizeHint: js.UndefOr[js.Function1[/* itemInfo */ ColorEnd, String]] = js.native
  /** Allows you to change the order and visibility of legend items. */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[VectorMapLegendItem], js.Array[VectorMapLegendItem]]
  ] = js.native
  /** Specifies text for legend items. */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ ColorEnd, String]] = js.native
  /** Specifies the color of item markers in the legend. The specified color applied only when the legend uses 'size' source. */
  var markerColor: js.UndefOr[String] = js.native
  /** Specifies the shape of item markers. */
  var markerShape: js.UndefOr[circle | square] = js.native
  /** Specifies an SVG element that serves as a custom legend item marker. */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ VectorMapLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
  /** Specifies the source of data for the legend. */
  var source: js.UndefOr[Layer] = js.native
}

object dxVectorMapLegends {
  @scala.inline
  def apply(): dxVectorMapLegends = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapLegends]
  }
  @scala.inline
  implicit class dxVectorMapLegendsOps[Self <: dxVectorMapLegends] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeHint(value: /* itemInfo */ ColorEnd => String): Self = {
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
    def withCustomizeItems(value: /* items */ js.Array[VectorMapLegendItem] => js.Array[VectorMapLegendItem]): Self = {
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
    def withCustomizeText(value: /* itemInfo */ ColorEnd => String): Self = {
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
    def withMarkerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerShape(value: circle | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerShape")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerTemplateFunction2(
      value: (/* legendItem */ VectorMapLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
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
          /* legendItem */ VectorMapLegendItem, 
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
    @scala.inline
    def withSource(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

