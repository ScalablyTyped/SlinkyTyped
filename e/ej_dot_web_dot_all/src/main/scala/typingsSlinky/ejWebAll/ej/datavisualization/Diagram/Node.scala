package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /** Defines the type of BPMN Activity. Applicable, if the node is a BPMN activity.
    * @Default {ej.datavisualization.Diagram.BPMNActivity.Task}
    */
  var activity: js.UndefOr[BPMNActivity | String] = js.native
  /** To maintain additional information about nodes
    * @Default {{}}
    */
  var addInfo: js.UndefOr[js.Any] = js.native
  /** Defines the additional information of a process. It is not directly related to the message flows or sequence flows of the process.
    * @Default {ej.datavisualization.Diagram.BPMNTextAnnotation()}
    */
  var annotation: js.UndefOr[NodesAnnotation] = js.native
  /** Sets the border color of node
    * @Default {black}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Sets the pattern of dashes and gaps to stroke the border
    */
  var borderDashArray: js.UndefOr[String] = js.native
  /** defines the node border with a smooth transition from one color to another color.
    * @Default {null}
    */
  var borderGradient: js.UndefOr[js.Any] = js.native
  /** Sets the border width of the node
    * @Default {1}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /** Defines whether the group can be ungrouped or not
    * @Default {true}
    */
  var canUngroup: js.UndefOr[Boolean] = js.native
  /** Array of JSON objects where each object represents a child node/connector
    * @Default {[]}
    */
  var children: js.UndefOr[js.Array[_]] = js.native
  /** Defines the name, attributes and methods of a Class. Applicable, if the node is a Class.
    * @Default {null}
    */
  var `class`: js.UndefOr[NodesClass] = js.native
  /** Sets the type of UML classifier. Applicable, if the node is a UML Class Diagram shape.
    * @Default {ej.datavisualization.Diagram.ClassifierShapes.Class}
    */
  var classifier: js.UndefOr[ClassifierShapes | String] = js.native
  /** Defines the state of the node is collapsed.
    */
  var collapseIcon: js.UndefOr[NodesCollapseIcon] = js.native
  /** Defines the distance to be left between a node and its connections(In coming and out going connections).
    * @Default {0}
    */
  var connectorPadding: js.UndefOr[Double] = js.native
  /** Enables or disables the default behaviors of the node.
    * @Default {ej.datavisualization.Diagram.NodeConstraints.Default}
    */
  var constraints: js.UndefOr[NodeConstraints | String] = js.native
  /** Defines how the child objects need to be arranged(Either in any predefined manner or automatically). Applicable, if the node is a group.
    * @Default {null}
    */
  var container: js.UndefOr[NodesContainer] = js.native
  /** Defines the corner radius of rectangular shapes.
    * @Default {0}
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  /** This property allows you to customize nodes appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Defines the BPMN data object
    */
  var data: js.UndefOr[NodesData] = js.native
  /** Defines an Enumeration in a UML Class Diagram
    * @Default {null}
    */
  var enumeration: js.UndefOr[NodesEnumeration] = js.native
  /** Sets the type of the BPMN Events. Applicable, if the node is a BPMN event.
    * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
    */
  var event: js.UndefOr[BPMNEvents | String] = js.native
  /** Defines whether the node can be automatically arranged using layout or not
    * @Default {false}
    */
  var excludeFromLayout: js.UndefOr[Boolean] = js.native
  /** Defines the state of the node is expanded or collapsed.
    */
  var expandIcon: js.UndefOr[NodesExpandIcon] = js.native
  /** Defines the fill color of the node
    * @Default {white}
    */
  var fillColor: js.UndefOr[String] = js.native
  /** Sets the type of the BPMN Gateway. Applicable, if the node is a BPMN gateway.
    * @Default {ej.datavisualization.Diagram.BPMNGateways.None}
    */
  var gateway: js.UndefOr[BPMNGateways | String] = js.native
  /** Paints the node with a smooth transition from one color to another color
    */
  var gradient: js.UndefOr[NodesGradient] = js.native
  /** Defines the header of a swimlane/lane
    * @Default {{ text: Title, fontSize: 11 }}
    */
  var header: js.UndefOr[js.Any] = js.native
  /** Defines the height of the node
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** Sets the horizontal alignment of the node. Applicable, if the parent of the node is a container.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Left}
    */
  var horizontalAlign: js.UndefOr[HorizontalAlignment | String] = js.native
  /** A read only collection of the incoming connectors/edges of the node
    * @Default {[]}
    */
  var inEdges: js.UndefOr[js.Array[_]] = js.native
  /** Defines an interface in a UML Class Diagram
    * @Default {null}
    */
  var interface: js.UndefOr[NodesInterface] = js.native
  /** Defines whether the sub tree of the node is expanded or collapsed
    * @Default {true}
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /** Sets the node as a swimlane
    * @Default {false}
    */
  var isSwimlane: js.UndefOr[Boolean] = js.native
  /** A collection of objects where each object represents a label
    * @Default {[]}
    */
  var labels: js.UndefOr[js.Array[NodesLabel]] = js.native
  /** An array of objects where each object represents a lane. Applicable, if the node is a swimlane.
    * @Default {[]}
    */
  var lanes: js.UndefOr[js.Array[NodesLane]] = js.native
  /** Defines the minimum space to be left between the bottom of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginBottom: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the left of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginLeft: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the right of the parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginRight: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the top of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginTop: js.UndefOr[Double] = js.native
  /** Defines the maximum height limit of the node
    * @Default {0}
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /** Defines the maximum width limit of the node
    * @Default {0}
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /** Defines the minimum height limit of the node
    * @Default {0}
    */
  var minHeight: js.UndefOr[Double] = js.native
  /** Defines the minimum width limit of the node
    * @Default {0}
    */
  var minWidth: js.UndefOr[Double] = js.native
  /** Sets the unique identifier of the node
    */
  var name: js.UndefOr[String] = js.native
  /** Defines the position of the node on X-Axis
    * @Default {0}
    */
  var offsetX: js.UndefOr[Double] = js.native
  /** Defines the position of the node on Y-Axis
    * @Default {0}
    */
  var offsetY: js.UndefOr[Double] = js.native
  /** Defines the opaque of the node
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Defines the orientation of nodes. Applicable, if the node is a swimlane.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[String] = js.native
  /** A read only collection of outgoing connectors/edges of the node
    * @Default {[]}
    */
  var outEdges: js.UndefOr[js.Array[_]] = js.native
  /** Defines the minimum padding value to be left between the bottom most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingBottom: js.UndefOr[Double] = js.native
  /** Defines the minimum padding value to be left between the left most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingLeft: js.UndefOr[Double] = js.native
  /** Defines the minimum padding value to be left between the right most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingRight: js.UndefOr[Double] = js.native
  /** Defines the minimum padding value to be left between the top most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingTop: js.UndefOr[Double] = js.native
  /** Defines the size and preview size of the node to add that to symbol palette
    * @Default {null}
    */
  var paletteItem: js.UndefOr[NodesPaletteItem] = js.native
  /** Sets the name of the parent group
    */
  var parent: js.UndefOr[String] = js.native
  /** Sets the path geometry that defines the shape of a path node
    */
  var pathData: js.UndefOr[String] = js.native
  /** Sets the height of the phase headers
    * @Default {0}
    */
  var phaseSize: js.UndefOr[Double] = js.native
  /** An array of objects, where each object represents a smaller region(phase) of a swimlane.
    * @Default {[]}
    */
  var phases: js.UndefOr[js.Array[NodesPhase]] = js.native
  /** Sets the ratio/ fractional value relative to node, based on which the node will be transformed(positioning, scaling and rotation)
    * @Default {ej.datavisualization.Diagram.Points(0.5,0.5)}
    */
  var pivot: js.UndefOr[js.Any] = js.native
  /** Defines a collection of points to draw a polygon. Applicable, if the shape is a polygon.
    * @Default {[]}
    */
  var points: js.UndefOr[js.Array[_]] = js.native
  /** An array of objects where each object represents a port
    * @Default {[]}
    */
  var ports: js.UndefOr[js.Array[NodesPort]] = js.native
  /** Sets the angle to which the node should be rotated
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[Double] = js.native
  /** Defines the opacity and the position of shadow
    * @Default {ej.datavisualization.Diagram.Shadow()}
    */
  var shadow: js.UndefOr[NodesShadow] = js.native
  /** Sets the shape of the node. It depends upon the type of node.
    * @Default {ej.datavisualization.Diagram.BasicShapes.Rectangle}
    */
  var shape: js.UndefOr[BasicShapes | FlowShapes | BPMNShapes | UMLActivityShapes | String] = js.native
  /** Sets the source path of the image. Applicable, if the type of the node is image.
    */
  var source: js.UndefOr[String] = js.native
  /** Defines the sub process of a BPMN Activity. Applicable, if the type of the BPMN activity is sub process.
    * @Default {ej.datavisualization.Diagram.BPMNSubProcess()}
    */
  var subProcess: js.UndefOr[NodesSubProcess] = js.native
  /** Defines the task of the BPMN activity. Applicable, if the type of activity is set as task.
    * @Default {ej.datavisualization.Diagram.BPMNTask()}
    */
  var task: js.UndefOr[NodesTask] = js.native
  /** Sets the id of svg/html templates. Applicable, if the node is HTML or native.
    */
  var templateId: js.UndefOr[String] = js.native
  /** Defines the textBlock of a text node
    * @Default {null}
    */
  var textBlock: js.UndefOr[js.Any] = js.native
  /** Defines the tooltip that should be shown when the mouse hovers over node. For tooltip properties, refer Tooltip
    * @Default {null}
    */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** Sets the type of BPMN Event Triggers.
    * @Default {ej.datavisualization.Diagram.BPMNTriggers.None}
    */
  var trigger: js.UndefOr[BPMNTriggers | String] = js.native
  /** Defines the type of the node.
    * @Default {ej.datavisualization.Diagram.Shapes.Basic}
    */
  var `type`: js.UndefOr[Shapes | String] = js.native
  /** Sets the vertical alignment of a node. Applicable, if the parent of a node is a container.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Top}
    */
  var verticalAlign: js.UndefOr[VerticalAlignment | String] = js.native
  /** Defines the visibility of the node
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Defines the width of the node
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
  /** Defines the z-index of the node
    * @Default {0}
    */
  var zOrder: js.UndefOr[Double] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: BPMNActivity | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(js.undefined)
        ret
    }
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
    def withAnnotation(value: NodesAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
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
    def withBorderDashArray(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderGradient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderGradient")(js.undefined)
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
    def withCanUngroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUngroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanUngroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUngroup")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: NodesClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withClassifier(value: ClassifierShapes | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseIcon(value: NodesCollapseIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: NodeConstraints | String): Self = {
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
    def withContainer(value: NodesContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
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
    def withData(value: NodesData): Self = {
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
    def withEnumeration(value: NodesEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumeration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumeration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumeration")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: BPMNEvents | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFromLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFromLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandIcon(value: NodesExpandIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.undefined)
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
    def withGateway(value: BPMNGateways | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(js.undefined)
        ret
    }
    @scala.inline
    def withGradient(value: NodesGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
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
    def withInEdges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withInterface(value: NodesInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSwimlane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSwimlane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSwimlane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSwimlane")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[NodesLabel]): Self = {
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
    def withLanes(value: js.Array[NodesLane]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanes")(js.undefined)
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
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
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
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withOutEdges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteItem(value: NodesPaletteItem): Self = {
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
    def withPathData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathData")(js.undefined)
        ret
    }
    @scala.inline
    def withPhaseSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhaseSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPhases(value: js.Array[NodesPhase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phases")(js.undefined)
        ret
    }
    @scala.inline
    def withPivot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivot")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[NodesPort]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
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
    def withShadow(value: NodesShadow): Self = {
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
    def withShape(value: BasicShapes | FlowShapes | BPMNShapes | UMLActivityShapes | String): Self = {
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
    def withSource(value: String): Self = {
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
    @scala.inline
    def withSubProcess(value: NodesSubProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withTask(value: NodesTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBlock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBlock")(js.undefined)
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
    def withTrigger(value: BPMNTriggers | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Shapes | String): Self = {
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

