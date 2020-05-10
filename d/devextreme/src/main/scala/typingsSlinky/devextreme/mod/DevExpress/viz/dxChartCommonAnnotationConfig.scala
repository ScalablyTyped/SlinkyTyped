package typingsSlinky.devextreme.mod.DevExpress.viz

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGGElement
import typingsSlinky.devextreme.AnonBlur
import typingsSlinky.devextreme.AnonCornerRadius
import typingsSlinky.devextreme.AnonUrl
import typingsSlinky.devextreme.devextremeStrings.breakWord
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.image
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.text
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonAnnotationConfig extends js.Object {
  /** Specifies whether users can drag and drop the annotation. */
  var allowDragging: js.UndefOr[Boolean] = js.native
  /** Positions the annotation relative to a specific argument. */
  var argument: js.UndefOr[Double | js.Date | String] = js.native
  /** Specifies the length of the annotation's arrow in pixels. */
  var arrowLength: js.UndefOr[Double] = js.native
  /** Specifies the width of the annotation's arrow at its junction with the annotation rectangle. */
  var arrowWidth: js.UndefOr[Double] = js.native
  /** Specifies the name of the value axis on which the value is specified. Useful for a multi-axis chart. */
  var axis: js.UndefOr[String] = js.native
  /** Configures the appearance of the annotation's border. */
  var border: js.UndefOr[AnonCornerRadius] = js.native
  /** Specifies the color that fills the annotation. */
  var color: js.UndefOr[String] = js.native
  /** Customizes the text and appearance of the annotation's tooltip. */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxChartAnnotationConfig | js.Any, _]] = js.native
  /** A container for custom data. */
  var data: js.UndefOr[js.Any] = js.native
  /** Specifies the annotation's description displayed in the tooltip. */
  var description: js.UndefOr[String] = js.native
  /** Specifies the annotation's font options. Applies only to text annotations. */
  var font: js.UndefOr[Font] = js.native
  /** Specifies the annotation's height in pixels. */
  var height: js.UndefOr[Double] = js.native
  /** Configures the image to be displayed in the annotation. Applies only if the type is "image". */
  var image: js.UndefOr[String | AnonUrl] = js.native
  /** Moves the annotation horizontally. */
  var offsetX: js.UndefOr[Double] = js.native
  /** Moves the annotation vertically. */
  var offsetY: js.UndefOr[Double] = js.native
  /** Specifies the annotation's opacity. */
  var opacity: js.UndefOr[Double] = js.native
  /** Along with paddingTopBottom, generates an empty space around the annotation's text or image; specified in pixels. */
  var paddingLeftRight: js.UndefOr[Double] = js.native
  /** Along with paddingLeftRight, generates an empty space around the annotation's text or image; specified in pixels. */
  var paddingTopBottom: js.UndefOr[Double] = js.native
  /** Anchors the annotation to a series point. Accepts the name of the point's series. */
  var series: js.UndefOr[String] = js.native
  /** Configures the annotation's shadows. */
  var shadow: js.UndefOr[AnonBlur] = js.native
  /** Specifies a custom template for the annotation. */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ dxChartAnnotationConfig | js.Any, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
  /** Specifies the annotation's text. Applies only if the type is "text". */
  var text: js.UndefOr[String] = js.native
  /** Specifies what to do with the annotation's text when it overflows the allocated space after applying wordWrap: hide, truncate it and display an ellipsis, or do nothing. */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  /** Specifies whether the annotation tooltip is enabled. */
  var tooltipEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies a custom template for an annotation's tooltip. */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxChartAnnotationConfig | js.Any, 
      /* element */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies whether the annotation displays a text or an image. This is a required setting. */
  var `type`: js.UndefOr[text | image | custom] = js.native
  /** Positions the annotation relative to a value on the specified value axis. */
  var value: js.UndefOr[Double | js.Date | String] = js.native
  /** Specifies the annotation's width in pixels. */
  var width: js.UndefOr[Double] = js.native
  /** Specifies how to wrap the annotation's text if it does not fit into a single line. */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
  /** Along with y, positions the annotation's center at a specific pixel coordinate. (0, 0) is the upper left corner of the chart. */
  var x: js.UndefOr[Double] = js.native
  /** Along with x, positions the annotation's center at a specific pixel coordinate. (0, 0) is the upper left corner of the chart. */
  var y: js.UndefOr[Double] = js.native
}

object dxChartCommonAnnotationConfig {
  @scala.inline
  def apply(): dxChartCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAnnotationConfig]
  }
  @scala.inline
  implicit class dxChartCommonAnnotationConfigOps[Self <: dxChartCommonAnnotationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgument(value: Double | js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLength")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: AnonCornerRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeTooltip(value: /* annotation */ dxChartAnnotationConfig | js.Any => _): Self = {
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
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String | AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeftRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeftRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeftRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeftRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTopBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTopBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: AnonBlur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction2(
      value: (/* annotation */ dxChartAnnotationConfig | js.Any, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(
      value: template | (js.Function2[
          /* annotation */ dxChartAnnotationConfig | js.Any, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverflow(value: ellipsis | hide | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplateFunction2(
      value: (/* annotation */ dxChartAnnotationConfig | js.Any, /* element */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTooltipTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipTemplate(
      value: template | (js.Function2[
          /* annotation */ dxChartAnnotationConfig | js.Any, 
          /* element */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: text | image | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double | js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: normal | breakWord | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

