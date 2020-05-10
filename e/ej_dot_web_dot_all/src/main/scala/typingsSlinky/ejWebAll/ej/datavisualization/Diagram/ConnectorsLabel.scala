package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorsLabel extends js.Object {
  /** Defines how the label should be aligned with respect to the segment
    * @Default {ej.datavisualization.Diagram.Alignment.Center}
    */
  var alignment: js.UndefOr[Alignment | String] = js.native
  /** Enables/disables the bold style
    * @Default {false}
    */
  var bold: js.UndefOr[Boolean] = js.native
  /** Sets the border color of the label
    * @Default {transparent}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Sets the border width of the label
    * @Default {0}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /** Defines whether the label should be aligned within the connector boundaries
    * @Default {true}
    */
  var boundaryConstraints: js.UndefOr[Boolean] = js.native
  /** Enables or disables the default behaviors of the label.
    * @Default {ej.datavisualization.Diagram.LabelConstraints.None}
    */
  var constraints: js.UndefOr[LabelConstraints | String] = js.native
  /** Sets the value which is used to drag the label within certain bounds.
    * @Default {null}
    */
  var dragLimit: js.UndefOr[ConnectorsLabelsDragLimit] = js.native
  /** Sets the fill color of the text area
    * @Default {transparent}
    */
  var fillColor: js.UndefOr[String] = js.native
  /** Sets the font color of the text
    * @Default {black}
    */
  var fontColor: js.UndefOr[String] = js.native
  /** Sets the font family of the text
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Defines the font size of the text
    * @Default {12}
    */
  var fontSize: js.UndefOr[Double] = js.native
  /** Sets the height of the label(the maximum value of label height and the connector height will be considered as label height)
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** Sets the horizontal alignment of the label.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
  /** Sets the hyperlink for the labels in the connectors.
    * @Default {none}
    */
  var hyperlink: js.UndefOr[String] = js.native
  /** Enables/disables the italic style
    * @Default {false}
    */
  var italic: js.UndefOr[Boolean] = js.native
  /** Sets the fraction/ratio(relative to connector) that defines the position of the label
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var margin: js.UndefOr[ConnectorsLabelsMargin] = js.native
  /** Gets whether the label is currently being edited or not.
    * @Default {ej.datavisualization.Diagram.LabelEditMode.Edit}
    */
  var mode: js.UndefOr[LabelEditMode | String] = js.native
  /** Sets the unique identifier of the label
    */
  var name: js.UndefOr[String] = js.native
  /** Sets the fraction/ratio(relative to connector) that defines the position of the label
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var offset: js.UndefOr[js.Any] = js.native
  /** Defines the transparency of labels
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Sets the padding for connector label.
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var padding: js.UndefOr[js.Any] = js.native
  /** Defines whether the label is editable or not
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Defines whether the label should be positioned whether relative to segments or connector boundaries
    * @Default {ej.datavisualization.Diagram.LabelRelativeMode.SegmentPath}
    */
  var relativeMode: js.UndefOr[LabelRelativeMode | String] = js.native
  /** Defines the angle to which the label needs to be rotated
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[Double] = js.native
  /** Sets the position of the label with respect to the total segment length
    * @Default {0.5}
    */
  var segmentOffset: js.UndefOr[String] = js.native
  /** Defines the label text
    */
  var text: js.UndefOr[String] = js.native
  /** Defines how to align the text inside the label.
    * @Default {ej.datavisualization.Diagram.TextAlign.Center}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  /** Sets how to decorate the label text.
    * @Default {ej.datavisualization.Diagram.TextDecorations.None}
    */
  var textDecoration: js.UndefOr[TextDecorations | String] = js.native
  /** Sets the vertical alignment of the label.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  /** Enables or disables the visibility of the label
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Sets the width of the label(the maximum value of label width and the connector width will be considered as label width)
    * @Default {50}
    */
  var width: js.UndefOr[Double] = js.native
  /** Defines how the label text needs to be wrapped.
    * @Default {ej.datavisualization.Diagram.TextWrapping.WrapWithOverflow}
    */
  var wrapping: js.UndefOr[TextWrapping | String] = js.native
}

object ConnectorsLabel {
  @scala.inline
  def apply(): ConnectorsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsLabel]
  }
  @scala.inline
  implicit class ConnectorsLabelOps[Self <: ConnectorsLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: Alignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryConstraints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: LabelConstraints | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withDragLimit(value: ConnectorsLabelsDragLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
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
    def withHorizontalAlignment(value: HorizontalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: ConnectorsLabelsMargin): Self = {
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
    def withMode(value: LabelEditMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Any): Self = {
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
    def withPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeMode(value: LabelRelativeMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentOffset")(js.undefined)
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
    def withTextAlign(value: TextAlign | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: TextDecorations | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: VerticalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
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
    def withWrapping(value: TextWrapping | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapping")(js.undefined)
        ret
    }
  }
  
}

