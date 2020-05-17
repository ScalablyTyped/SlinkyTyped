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
import scala.scalajs.js.annotation._

@js.native
trait dxBarGaugeLegend extends BaseLegend {
  /** Specifies the hint that appears when a user hovers the mouse pointer over a legend item. */
  var customizeHint: js.UndefOr[js.Function1[/* arg */ ItemText, String]] = js.native
  /** Allows you to change the order, text, and visibility of legend items. */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[BarGaugeLegendItem], js.Array[BarGaugeLegendItem]]
  ] = js.native
  /** Customizes the text displayed by legend items. */
  var customizeText: js.UndefOr[js.Function1[/* arg */ ItemText, String]] = js.native
  /** Formats the item text before it is displayed. Accepts only numeric formats. When unspecified, it inherits the label's format. */
  var itemTextFormat: js.UndefOr[format] = js.native
  /** Specifies an SVG element that serves as a custom legend item marker. */
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
    def withCustomizeHint(value: /* arg */ ItemText => String): Self = {
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
    def withCustomizeItems(value: /* items */ js.Array[BarGaugeLegendItem] => js.Array[BarGaugeLegendItem]): Self = {
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
    def withCustomizeText(value: /* arg */ ItemText => String): Self = {
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
    def withItemTextFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItemTextFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerTemplateFunction2(
      value: (/* legendItem */ BarGaugeLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
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
          /* legendItem */ BarGaugeLegendItem, 
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

