package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesPort extends js.Object {
  /** Sets the border color of the port
    * @Default {#1a1a1a}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Sets the stroke width of the port
    * @Default {1}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /** Defines the space to be left between the port bounds and its incoming and outgoing connections.
    * @Default {0}
    */
  var connectorPadding: js.UndefOr[Double] = js.native
  /** Defines whether connections can be created with the port
    * @Default {ej.datavisualization.Diagram.PortConstraints.Connect}
    */
  var constraints: js.UndefOr[PortConstraints | String] = js.native
  /** This property allows you to customize ports appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets the fill color of the port
    * @Default {white}
    */
  var fillColor: js.UndefOr[String] = js.native
  /** Sets the unique identifier of the port
    */
  var name: js.UndefOr[String] = js.native
  /** Defines the position of the port as fraction/ ratio relative to node
    * @Default {ej.datavisualization.Diagram.Point(0, 0)}
    */
  var offset: js.UndefOr[js.Any] = js.native
  /** Sets the name of the node which contains this port.
    */
  var parent: js.UndefOr[String] = js.native
  /** Defines the path data to draw the port. Applicable, if the port shape is path.
    */
  var pathData: js.UndefOr[String] = js.native
  /** Defines the shape of the port.
    * @Default {ej.datavisualization.Diagram.PortShapes.Square}
    */
  var shape: js.UndefOr[PortShapes | String] = js.native
  /** Defines the size of the port
    * @Default {8}
    */
  var size: js.UndefOr[Double] = js.native
  /** Defines when the port should be visible.
    * @Default {ej.datavisualization.Diagram.PortVisibility.Default}
    */
  var visibility: js.UndefOr[PortVisibility | String] = js.native
}

object NodesPort {
  @scala.inline
  def apply(): NodesPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesPort]
  }
  @scala.inline
  implicit class NodesPortOps[Self <: NodesPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withConstraints(value: PortConstraints | String): Self = {
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
    def withShape(value: PortShapes | String): Self = {
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
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: PortVisibility | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

