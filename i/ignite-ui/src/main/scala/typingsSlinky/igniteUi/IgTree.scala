package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTree
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the duration of each animation such as the expand/collapse.
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets the data binding properties and keys. The igTree uses these to extract the corresponding data from the dataSource.
  	 *
  	 */
  var bindings: js.UndefOr[IgTreeBindings] = js.native
  /**
  	 * Gets the behavior and type of the checkboxes rendered for the tree nodes. Can be set only at initialization.
  	 *
  	 *
  	 * Valid values:
  	 * "off" Checkboxes are turned off and are not rendered for the tree.
  	 * "biState" Checkboxes are rendered and support two states (checked and unchecked). Checkboxes do not cascade down or up in this mode.
  	 * "triState" Checkboxes are rendered and support three states (checked, partial and unchecked). Checkboxes cascade up and down in this mode.
  	 */
  var checkboxMode: js.UndefOr[String] = js.native
  /**
  	 * Fired before databinding is performed.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
  	 * Fired after databinding is finished.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
  	 * Gets/Sets the igTree data source. Accepts any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
  	 * Once the data source is initialized, this option becomes an instance of the $.ig.HierarchicalDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the type of the data source. Delegates the value to [$.ig.DataSource.settings.type](ig.datasource#options:settings.type). Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource.settings.type.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the data source type implicitly.
  	 * "null" Type is inferred.
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets a remote URL accepted by [$.ig.DataSource](ig.datasource) in order to request data from it.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the remote url.
  	 * "null" Option is ignored.
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets the default target attribute value for the node anchors.
  	 *
  	 */
  var defaultNodeTarget: js.UndefOr[String] = js.native
  /**
  	 * Fired on node drag.
  	 */
  var drag: js.UndefOr[DragEvent] = js.native
  /**
  	 * Gets/Sets whether drag and drop functionality is enabled.
  	 *
  	 */
  var dragAndDrop: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets specific settings for the drag and drop functionality.
  	 *
  	 */
  var dragAndDropSettings: js.UndefOr[IgTreeDragAndDropSettings] = js.native
  /**
  	 * Fired on node drag start.
  	 */
  var dragStart: js.UndefOr[DragStartEvent] = js.native
  /**
  	 * Fired after a drag operation has completed.
  	 */
  var dragStop: js.UndefOr[DragStopEvent] = js.native
  /**
  	 * Gets/Sets how the height of of the control container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number in pixels.
  	 * "null" No height will be applied to the container and it will be rendered default for the browser rendering engine.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets/Sets whether nodes are hoverable. Setting this option to false would make the tree to not apply hover styles on the nodes when they are hovered.
  	 *
  	 */
  var hotTracking: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the initial depth the igTree is going to be expanded to upon initial render.
  	 *
  	 */
  var initialExpandDepth: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the CSS class applied to all leaf nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified class with a CSS sprite that would be rendered for each node that has no children (If you define both leafNodeImageUrl and leafNodeImageClass the leafNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var leafNodeImageClass: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the tooltip applied to all leaf node images.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified a tooltip that would be rendered for each node that has no children.
  	 * "null" Option is ignored
  	 */
  var leafNodeImageTooltip: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the image url applied to all leaf nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Image with the specified URL will be rendered for each node that has no children (If you define both leafNodeImageUrl and leafNodeImageClass the leafNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var leafNodeImageUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets whether all the data would be bound initially or each child collection would be bound upon expand.
  	 *
  	 */
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Fired after the checkstate of a node is changed.
  	 */
  var nodeCheckstateChanged: js.UndefOr[NodeCheckstateChangedEvent] = js.native
  /**
  	 * Fired before the checkbox state of a node is changed.
  	 */
  var nodeCheckstateChanging: js.UndefOr[NodeCheckstateChangingEvent] = js.native
  /**
  	 * Fired on node click.
  	 */
  var nodeClick: js.UndefOr[NodeClickEvent] = js.native
  /**
  	 * Fired after a node is collapsed.
  	 */
  var nodeCollapsed: js.UndefOr[NodeCollapsedEvent] = js.native
  /**
  	 * Fired before a node is collapsed.
  	 */
  var nodeCollapsing: js.UndefOr[NodeCollapsingEvent] = js.native
  /**
  	 * Fired on node double click.
  	 */
  var nodeDoubleClick: js.UndefOr[NodeDoubleClickEvent] = js.native
  /**
  	 * Fired after a node is dropped.
  	 */
  var nodeDropped: js.UndefOr[NodeDroppedEvent] = js.native
  /**
  	 * Fired before a node is dropped.
  	 */
  var nodeDropping: js.UndefOr[NodeDroppingEvent] = js.native
  /**
  	 * Fired after a node is expanded.
  	 */
  var nodeExpanded: js.UndefOr[NodeExpandedEvent] = js.native
  /**
  	 * Fired before a node is expanded.
  	 */
  var nodeExpanding: js.UndefOr[NodeExpandingEvent] = js.native
  /**
  	 * Fired after the children of a node are populated in the case of load on demand.
  	 */
  var nodePopulated: js.UndefOr[NodePopulatedEvent] = js.native
  /**
  	 * Fired before the children of a node are populated in the case of load on demand.
  	 */
  var nodePopulating: js.UndefOr[NodePopulatingEvent] = js.native
  /**
  	 * Gets/Sets the CSS class applied to all parent nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified class with a CSS sprite that would be rendered for each node that has children (If you define both parentNodeImageUrl and parentNodeImageClass the parentNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var parentNodeImageClass: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the tooltip applied to all parent node images.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specified a tooltip that would be rendered for each node that has children.
  	 * "null" Option is ignored
  	 */
  var parentNodeImageTooltip: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the image url applied to all parent nodes.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Image with the specified URL will be rendered for each node that has children (If you define both parentNodeImageUrl and parentNodeImageClass the parentNodeImageUrl would take priority).
  	 * "null" Option is ignored
  	 */
  var parentNodeImageUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets the node data-path attribute separator character.
  	 *
  	 */
  var pathSeparator: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Fired after rendering of the tree has finished.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Fired before rendering of the tree begins.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  /**
  	 * Gets the HTTP verb used for remote requests. Specifies the HTTP verb to be used to issue the requests to the [dataSourceUrl](ui.igtree#options:dataSourceUrl).
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.native
  /**
  	 * Gets the type of the content in a remote data source response. Content type of the response from the [dataSourceUrl](ui.igtree#options:dataSourceUrl). See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.native
  /**
  	 * Gets the JSON key at which a remote data source will write the data. Delegates the value to [$.ig.DataSource.settings.responseDataKey](ig.datasource#options:settings.responseDataKey). Please refer to the documentation of $.ig.DataSource.settings.responseDataKey.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the name of the property in which data records are held if the response is wrapped.
  	 * "null" Option is ignored.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the data type of the remote data source response. Delegates the value to [$.ig.DataSource.settings.responseDataType](ig.datasource#options:settings.responseDataType). Please refer to the documentation of $.ig.DataSource.settings.responseDataType.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType.
  	 * "null" Type is inferred.
  	 */
  var responseDataType: js.UndefOr[String] = js.native
  /**
  	 * Fired after a new node is selected.
  	 */
  var selectionChanged: js.UndefOr[IgTreeSelectionChangedEvent] = js.native
  /**
  	 * Fired before a new node is selected.
  	 */
  var selectionChanging: js.UndefOr[SelectionChangingEvent] = js.native
  /**
  	 * Gets/Sets one or more branches to be expanded at a time. If set to true then only one branch at each level of the tree can be expanded at a time. Otherwise multiple branches can be expanded at a time.
  	 *
  	 */
  var singleBranchExpand: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the URL to which updating requests will be made.
  	 *
  	 */
  var updateUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the width of the control container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number in pixels.
  	 * "null" No width will be applied to the container and it will be rendered by default for the browser rendering engine.
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgTree {
  @scala.inline
  def apply(): IgTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTree]
  }
  @scala.inline
  implicit class IgTreeOps[Self <: IgTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withBindings(value: IgTreeBindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
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
    def withDataSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNodeTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNodeTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNodeTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAndDropSettings(value: IgTreeDragAndDropSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAndDropSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: (/* event */ Event, /* ui */ DragStartEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStop(value: (/* event */ Event, /* ui */ DragStopEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withHotTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialExpandDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialExpandDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialExpandDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialExpandDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLeafNodeImageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafNodeImageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeafNodeImageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafNodeImageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLeafNodeImageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafNodeImageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeafNodeImageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafNodeImageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withLeafNodeImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafNodeImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeafNodeImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafNodeImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemand")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCheckstateChanged(value: (/* event */ Event, /* ui */ NodeCheckstateChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCheckstateChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeCheckstateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCheckstateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCheckstateChanging(value: (/* event */ Event, /* ui */ NodeCheckstateChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCheckstateChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeCheckstateChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCheckstateChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeClick(value: (/* event */ Event, /* ui */ NodeClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCollapsed(value: (/* event */ Event, /* ui */ NodeCollapsedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCollapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCollapsing(value: (/* event */ Event, /* ui */ NodeCollapsingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCollapsing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDoubleClick(value: (/* event */ Event, /* ui */ NodeDoubleClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDoubleClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDropped(value: (/* event */ Event, /* ui */ NodeDroppedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDropped")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeDropped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDropped")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDropping(value: (/* event */ Event, /* ui */ NodeDroppingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDropping")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeDropping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDropping")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeExpanded(value: (/* event */ Event, /* ui */ NodeExpandedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeExpanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeExpanding(value: (/* event */ Event, /* ui */ NodeExpandingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeExpanding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodeExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeExpanding")(js.undefined)
        ret
    }
    @scala.inline
    def withNodePopulated(value: (/* event */ Event, /* ui */ NodePopulatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePopulated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodePopulated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePopulated")(js.undefined)
        ret
    }
    @scala.inline
    def withNodePopulating(value: (/* event */ Event, /* ui */ NodePopulatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePopulating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNodePopulating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePopulating")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNodeImageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeImageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNodeImageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeImageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNodeImageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeImageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNodeImageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeImageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNodeImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNodeImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPathSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendering")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChanged(value: (/* event */ Event, /* ui */ IgTreeSelectionChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChanging(value: (/* event */ Event, /* ui */ SelectionChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectionChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleBranchExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleBranchExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleBranchExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleBranchExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
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
  }
  
}

