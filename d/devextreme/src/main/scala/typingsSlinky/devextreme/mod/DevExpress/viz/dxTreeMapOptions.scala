package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonColorCodeField
import typingsSlinky.devextreme.AnonElementModelNode
import typingsSlinky.devextreme.AnonHeaderHeight
import typingsSlinky.devextreme.AnonJQueryEventModelNode
import typingsSlinky.devextreme.AnonModelRoot
import typingsSlinky.devextreme.AnonRect
import typingsSlinky.devextreme.AnonSelectionStyle
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.leftBottomRightTop
import typingsSlinky.devextreme.devextremeStrings.leftTopRightBottom
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.rightBottomLeftTop
import typingsSlinky.devextreme.devextremeStrings.rightTopLeftBottom
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.devextremeStrings.sliceanddice
import typingsSlinky.devextreme.devextremeStrings.squarified
import typingsSlinky.devextreme.devextremeStrings.strip
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeMapOptions extends BaseWidgetOptions[dxTreeMap] {
  /** Specifies the name of the data source field that provides nested items for a group. Applies to hierarchical data sources only. */
  var childrenField: js.UndefOr[String] = js.native
  /** Specifies the name of the data source field that provides colors for tiles. */
  var colorField: js.UndefOr[String] = js.native
  /** Manages the color settings. */
  var colorizer: js.UndefOr[AnonColorCodeField] = js.native
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** Configures groups. */
  var group: js.UndefOr[AnonHeaderHeight] = js.native
  /** Specifies whether tiles and groups change their style when a user pauses on them. */
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the name of the data source field that provides IDs for items. Applies to plain data sources only. */
  var idField: js.UndefOr[String] = js.native
  /** Specifies whether the user will interact with a single tile or its group. */
  var interactWithGroup: js.UndefOr[Boolean] = js.native
  /** Specifies the name of the data source field that provides texts for tile and group labels. */
  var labelField: js.UndefOr[String] = js.native
  /** Specifies the layout algorithm. */
  var layoutAlgorithm: js.UndefOr[sliceanddice | squarified | strip | (js.Function1[/* e */ AnonRect, _])] = js.native
  /** Specifies the direction in which the items will be laid out. */
  var layoutDirection: js.UndefOr[
    leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom
  ] = js.native
  /** Specifies how many hierarchical levels must be visualized. */
  var maxDepth: js.UndefOr[Double] = js.native
  /** A function that is executed when a node is clicked or tapped. */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventModelNode, _]) | String] = js.native
  /** A function that is executed when a user drills up or down. */
  var onDrill: js.UndefOr[js.Function1[/* e */ AnonElementModelNode, _]] = js.native
  /** A function that is executed after the pointer enters or leaves a node. */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ AnonElementModelNode, _]] = js.native
  /** A function that is executed only once, after the nodes are initialized. */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ AnonModelRoot, _]] = js.native
  /** A function that is executed before the nodes are displayed and each time the collection of active nodes is changed. */
  var onNodesRendering: js.UndefOr[js.Function1[/* e */ AnonElementModelNode, _]] = js.native
  /** A function that is executed when a node is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementModelNode, _]] = js.native
  /** Specifies the name of the data source field that provides parent IDs for items. Applies to plain data sources only. */
  var parentField: js.UndefOr[String] = js.native
  /** @deprecated Use the tile.label.textOverflow option instead. */
  /** Decides whether those labels that overflow their tile/group should be hidden or truncated with ellipsis. */
  var resolveLabelOverflow: js.UndefOr[ellipsis | hide] = js.native
  /** Specifies whether a single or multiple nodes can be in the selected state simultaneously. */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.native
  /** Configures tiles. */
  var tile: js.UndefOr[AnonSelectionStyle] = js.native
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
  @JSName("tooltip")
  var tooltip_dxTreeMapOptions: js.UndefOr[dxTreeMapTooltip] = js.native
  /** Specifies the name of the data source field that provides values for tiles. */
  var valueField: js.UndefOr[String] = js.native
}

object dxTreeMapOptions {
  @scala.inline
  def apply(): dxTreeMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeMapOptions]
  }
  @scala.inline
  implicit class dxTreeMapOptionsOps[Self <: dxTreeMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenField")(js.undefined)
        ret
    }
    @scala.inline
    def withColorField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorField")(js.undefined)
        ret
    }
    @scala.inline
    def withColorizer(value: AnonColorCodeField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorizer")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: AnonHeaderHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idField")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractWithGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactWithGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractWithGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactWithGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutAlgorithmFunction1(value: /* e */ AnonRect => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlgorithm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayoutAlgorithm(value: sliceanddice | squarified | strip | (js.Function1[/* e */ AnonRect, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutDirection(value: leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickFunction1(value: /* e */ AnonJQueryEventModelNode => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClick(value: (js.Function1[/* e */ AnonJQueryEventModelNode, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrill(value: /* e */ AnonElementModelNode => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrill")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHoverChanged(value: /* e */ AnonElementModelNode => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoverChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHoverChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoverChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodesInitialized(value: /* e */ AnonModelRoot => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodesInitialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodesInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodesInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodesRendering(value: /* e */ AnonElementModelNode => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodesRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodesRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodesRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AnonElementModelNode => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withParentField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentField")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveLabelOverflow(value: ellipsis | hide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLabelOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveLabelOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLabelOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: multiple | none | single_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTile(value: AnonSelectionStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: dxTreeMapTooltip): Self = {
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
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

