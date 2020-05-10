package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends js.Object {
  /** To maintain additional information about connectors
    * @Default {null}
    */
  var addInfo: js.UndefOr[js.Any] = js.native
  /** Defines the width of the line bridges
    * @Default {10}
    */
  var bridgeSpace: js.UndefOr[Double] = js.native
  /** Enables or disables the behaviors of connectors.
    * @Default {ej.datavisualization.Diagram.ConnectorConstraints.Default}
    */
  var constraints: js.UndefOr[ConnectorConstraints | String] = js.native
  /** Defines the radius of the rounded corner
    * @Default {0}
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  /** This property allows you to customize connectors appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets the horizontal alignment of the connector. Applicable, if the parent of the connector is a container.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Left}
    */
  var horizontalAlign: js.UndefOr[HorizontalAlignment | String] = js.native
  /** A collection of JSON objects where each object represents a label.
    * @Default {[]}
    */
  var labels: js.UndefOr[js.Array[ConnectorsLabel]] = js.native
  /** Sets the stroke color of the connector
    * @Default {black}
    */
  var lineColor: js.UndefOr[String] = js.native
  /** Sets the pattern of dashes and gaps used to stroke the path of the connector
    */
  var lineDashArray: js.UndefOr[String] = js.native
  /** Defines the padding value to ease the interaction with connectors
    * @Default {10}
    */
  var lineHitPadding: js.UndefOr[Double] = js.native
  /** Sets the width of the line
    * @Default {1}
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the bottom of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginBottom: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the left of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginLeft: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the right of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginRight: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the top of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginTop: js.UndefOr[Double] = js.native
  /** Sets a unique name for the connector
    */
  var name: js.UndefOr[String] = js.native
  /** Defines the transparency of the connector
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Defines the size and preview size of the node to add that to symbol palette. To explore palette item, refer Palette Item
    * @Default {null}
    */
  var paletteItem: js.UndefOr[js.Any] = js.native
  /** Sets the parent name of the connector.
    */
  var parent: js.UndefOr[String] = js.native
  /** An array of JSON objects where each object represents a segment
    * @Default {[ { type:straight } ]}
    */
  var segments: js.UndefOr[js.Array[ConnectorsSegment]] = js.native
  /** Defines the role/meaning of the connector
    * @Default {null}
    */
  var shape: js.UndefOr[ConnectorsShape] = js.native
  /** Defines the source decorator of the connector
    * @Default {{ shape:arrow, width: 8, height:8, borderColor:black, fillColor:black }}
    */
  var sourceDecorator: js.UndefOr[ConnectorsSourceDecorator] = js.native
  /** Sets the source node of the connector
    */
  var sourceNode: js.UndefOr[String] = js.native
  /** Defines the space to be left between the source node and the source point of a connector
    * @Default {0}
    */
  var sourcePadding: js.UndefOr[Double] = js.native
  /** Describes the start point of the connector
    * @Default {ej.datavisualization.Diagram.Point()}
    */
  var sourcePoint: js.UndefOr[ConnectorsSourcePoint] = js.native
  /** Sets the source port of the connector
    */
  var sourcePort: js.UndefOr[String] = js.native
  /** Defines the target decorator of the connector
    * @Default {{ shape:arrow, width: 8, height:8, borderColor:black, fillColor:black }}
    */
  var targetDecorator: js.UndefOr[ConnectorsTargetDecorator] = js.native
  /** Sets the target node of the connector
    */
  var targetNode: js.UndefOr[String] = js.native
  /** Defines the space to be left between the target node and the target point of the connector
    * @Default {0}
    */
  var targetPadding: js.UndefOr[Double] = js.native
  /** Describes the end point of the connector
    * @Default {ej.datavisualization.Diagram.Point()}
    */
  var targetPoint: js.UndefOr[ConnectorsSourcePoint] = js.native
  /** Sets the targetPort of the connector
    */
  var targetPort: js.UndefOr[String] = js.native
  /** Defines the tooltip that should be shown when the mouse hovers over connector. For tooltip properties, refer Tooltip
    * @Default {null}
    */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** To set the vertical alignment of connector (Applicable,if the parent is group).
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Top}
    */
  var verticalAlign: js.UndefOr[VerticalAlignment | String] = js.native
  /** Enables or disables the visibility of connector
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Sets the z-index of the connector
    * @Default {0}
    */
  var zOrder: js.UndefOr[Double] = js.native
}

object Connector {
  @scala.inline
  def apply(): Connector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connector]
  }
  @scala.inline
  implicit class ConnectorOps[Self <: Connector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withBridgeSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBridgeSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: ConnectorConstraints | String): Self = {
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
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlign(value: HorizontalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[ConnectorsLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashArray(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHitPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHitPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHitPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHitPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
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
    def withPaletteItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteItem")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[ConnectorsSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: ConnectorsShape): Self = {
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
    def withSourceDecorator(value: ConnectorsSourceDecorator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDecorator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDecorator")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePoint(value: ConnectorsSourcePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePort")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetDecorator(value: ConnectorsTargetDecorator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetDecorator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDecorator")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNode")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPoint(value: ConnectorsSourcePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPort")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
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
    def withZOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(js.undefined)
        ret
    }
  }
  
}

