package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  /** Enable or disable connector's segment overlapping with each other when executing the layout with multiple parents.
    * @Default {false}
    */
  var avoidSegmentOverlapping: js.UndefOr[Boolean] = js.native
  /** Specifies the custom bounds to arrange/align the layout
    * @Default {ej.datavisualization.Diagram.Rectangle()}
    */
  var bounds: js.UndefOr[js.Any] = js.native
  /** Defines the fixed node with reference to which, the layout will be arranged and fixed node will not be repositioned
    */
  var fixedNode: js.UndefOr[String] = js.native
  /** Defines a method to customize the segments based on source and target nodes.
    * @Default {null}
    */
  var getConnectorSegments: js.UndefOr[js.Any] = js.native
  /** Customizes the orientation of trees/sub trees. For orientations, see Chart Orientations. For chart types, see Chart Types
    * @Default {null}
    */
  var getLayoutInfo: js.UndefOr[js.Any] = js.native
  /** Defines how to horizontally align the layout within the layout bounds
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
  /** Sets the space to be horizontally left between nodes
    * @Default {30}
    */
  var horizontalSpacing: js.UndefOr[Double] = js.native
  /** Defines the space to be left between layout bounds and layout.
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.native
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {1000}
    */
  var maxIteration: js.UndefOr[Double] = js.native
  /** Sets the orientation/direction to arrange the diagram elements.
    * @Default {ej.datavisualization.Diagram.LayoutOrientations.TopToBottom}
    */
  var orientation: js.UndefOr[LayoutOrientations | String] = js.native
  /** Sets the value is used to define the root node of the layout.
    * @Default {30}
    */
  var root: js.UndefOr[String] = js.native
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {0.442}
    */
  var springFactor: js.UndefOr[Double] = js.native
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {100}
    */
  var springLength: js.UndefOr[Double] = js.native
  /** Sets the type of the layout based on which the elements will be arranged.
    * @Default {ej.datavisualization.Diagram.LayoutTypes.None}
    */
  var `type`: js.UndefOr[LayoutTypes | String] = js.native
  /** Defines how to vertically align the layout within the layout bounds
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  /** Sets the space to be vertically left between nodes
    * @Default {30}
    */
  var verticalSpacing: js.UndefOr[Double] = js.native
}

object Layout {
  @scala.inline
  def apply(): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidSegmentOverlapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidSegmentOverlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidSegmentOverlapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidSegmentOverlapping")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetConnectorSegments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectorSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetConnectorSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectorSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayoutInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetLayoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutInfo")(js.undefined)
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
    def withHorizontalSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
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
    def withMaxIteration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: LayoutOrientations | String): Self = {
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
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springLength")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: LayoutTypes | String): Self = {
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
    def withVerticalSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSpacing")(js.undefined)
        ret
    }
  }
  
}

