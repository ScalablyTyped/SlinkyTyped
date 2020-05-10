package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgChartSpec extends js.Object {
  /**
    * The data containing the labels for all the nodes in the chart.  Labels
    * must be unique.
    */
  var labels: js.UndefOr[ChartData] = js.native
  /** The color of the org chart nodes. */
  var nodeColor: js.UndefOr[Color] = js.native
  /**
    * The color of the org chart nodes.
    * If node_color is also set, this field takes precedence.
    */
  var nodeColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The size of the org chart nodes. */
  var nodeSize: js.UndefOr[String] = js.native
  /**
    * The data containing the label of the parent for the corresponding node.
    * A blank value indicates that the node has no parent and is a top-level
    * node.
    * This field is optional.
    */
  var parentLabels: js.UndefOr[ChartData] = js.native
  /** The color of the selected org chart nodes. */
  var selectedNodeColor: js.UndefOr[Color] = js.native
  /**
    * The color of the selected org chart nodes.
    * If selected_node_color is also set, this field takes precedence.
    */
  var selectedNodeColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The data containing the tooltip for the corresponding node.  A blank value
    * results in no tooltip being displayed for the node.
    * This field is optional.
    */
  var tooltips: js.UndefOr[ChartData] = js.native
}

object OrgChartSpec {
  @scala.inline
  def apply(): OrgChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgChartSpec]
  }
  @scala.inline
  implicit class OrgChartSpecOps[Self <: OrgChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: ChartData): Self = {
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
    def withNodeColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLabels(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedNodeColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedNodeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedNodeColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodeColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedNodeColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodeColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltips(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.undefined)
        ret
    }
  }
  
}

