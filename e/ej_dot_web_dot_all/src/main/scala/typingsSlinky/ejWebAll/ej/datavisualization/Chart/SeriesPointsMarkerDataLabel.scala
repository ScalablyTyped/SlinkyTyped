package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPointsMarkerDataLabel extends js.Object {
  /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
    * @Default {null}
    */
  var angle: js.UndefOr[Double] = js.native
  /** Options for customizing the border of the data label.
    */
  var border: js.UndefOr[SeriesPointsMarkerDataLabelBorder] = js.native
  /** Options for displaying and customizing the line that connects point and data label.
    */
  var connectorLine: js.UndefOr[SeriesPointsMarkerDataLabelConnectorLine] = js.native
  /** Background color of the data label.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[SeriesPointsMarkerDataLabelFont] = js.native
  /** Horizontal alignment of the data label.
    * @Default {center}
    */
  var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.native
  /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
    */
  var margin: js.UndefOr[SeriesPointsMarkerDataLabelMargin] = js.native
  /** Moves the label vertically by specified offset.
    * @Default {0}
    */
  var offset: js.UndefOr[Double] = js.native
  /** Opacity of the data label.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Background shape of the data label.
    * @Default {No shape is rendered by default, so its value is â€˜noneâ€™. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.native
  /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
    */
  var template: js.UndefOr[String] = js.native
  /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
    * candle and OHLC.
    * @Default {top. See TextPosition}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.native
  /** Vertical alignment of the data label.
    * @Default {'center'}
    */
  var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.native
  /** Controls the visibility of the data labels.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object SeriesPointsMarkerDataLabel {
  @scala.inline
  def apply(): SeriesPointsMarkerDataLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPointsMarkerDataLabel]
  }
  @scala.inline
  implicit class SeriesPointsMarkerDataLabelOps[Self <: SeriesPointsMarkerDataLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: SeriesPointsMarkerDataLabelBorder): Self = {
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
    def withConnectorLine(value: SeriesPointsMarkerDataLabelConnectorLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorLine")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: SeriesPointsMarkerDataLabelFont): Self = {
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
    def withHorizontalTextAlignment(value: HorizontalTextAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalTextAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalTextAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalTextAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: SeriesPointsMarkerDataLabelMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
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
    def withShape(value: Shape | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
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
    def withTextPosition(value: TextPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalTextAlignment(value: VerticalTextAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalTextAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalTextAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalTextAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

