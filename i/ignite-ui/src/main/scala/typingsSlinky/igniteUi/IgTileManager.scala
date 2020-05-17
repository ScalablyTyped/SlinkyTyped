package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTileManager
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the duration of the animations in the tile manager.
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the columns count in the container.
  	 *
  	 *
  	 * Valid values:
  	 * "null" The column count will be automatically calculated.
  	 * "number" The column count can be set as a number.
  	 */
  var cols: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the height of each column in the container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The column height can be set in pixels (px), percentage (%) or asterisk (*) which will distribute all the height between all the columns equally.
  	 * "number" The column height can be set as a number representing value in pixels.
  	 * "array" The column height can be set as an array, specifying height for each column. If more than one column has an asterisk value, the remaining height will be equally distributed between these columns.
  	 * "null" The column height will be calculated based on the container height and the other options.
  	 */
  var columnHeight: js.UndefOr[String | Double | js.Array[_]] = js.native
  /**
  	 * Gets/Sets the width of each column in the container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The column width can be set in pixels (px), percentage (%) or asterisk (*) which will distribute all the width between all the columns equally.
  	 * "number" The column width can be set as a number representing value in pixels.
  	 * "array" The column width can be set as an array, specifying width for each column. If more than one column has an asterisk value, the remaining width will be equally distributed between these columns.
  	 * "null" The column width will be calculated based on the container width and the other options.
  	 */
  var columnWidth: js.UndefOr[String | Double | js.Array[_]] = js.native
  /**
  	 * Fired before databinding is performed
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager performing databinding.
  	 *             Use ui.dataSource to get a reference to the [$.ig.DataSource](ig.datasource) the tile manager is to be databound to.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
  	 * Fired after databinding is complete
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager performing databinding.
  	 *             Use ui.dataView to get a reference to the data the tile manager is databound to.
  	 *             Use ui.success to get see if the databinding was performed correctly.
  	 *             Use ui.errorMessage to get the error message if the databinding failed.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
  	 * Specifies any valid data source accepted by [$.ig.DataSource](ig.datasource), or an instance of an [$.ig.DataSource](ig.datasource) itself.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type) and its type property.
  	 *
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Specifies a remote URL accepted by [$.ig.DataSource](ig.datasource) in order to request data from it.
  	 *
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the height of the container.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The height width can be set in pixels (px) and percentage (%).
  	 * "number" The height width can be set as a number in pixels.
  	 * "null" The height width can be set as a number in pixels.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets/Sets the tiles configurations. Every tile is described by rowSpan, colSpan, rowIndex and colIndex.
  	 *
  	 *
  	 * Valid values:
  	 * "array" An array with colSpan, rowSpan, colIndex, rowIndex configurations for each tile.
  	 * "null" Default tile configurations of rowSpan: 1 and colSpan: 1 will be used.
  	 */
  var items: js.UndefOr[js.Object] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets the horizontal spacing between tiles.
  	 *
  	 *                 number  The horizontal spacing between tiles can be set as a number.
  	 */
  var marginLeft: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the vertical spacing between tiles.
  	 *
  	 *                 number  The vertical spacing between tiles can be set as a number.
  	 */
  var marginTop: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the content of the tiles in maximized state.
  	 *
  	 *
  	 * Valid values:
  	 * "string" When initializing on html markup provide jQuery selector specifying which elements of the tile to be shown in maximized state. When initializing on data source provide igTemplate that will be rendered for the maximized state.
  	 * "null" The whole content of the tile will be visible in maximized state.
  	 */
  var maximizedState: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the index of which items configuration will be used for positioning and sizing of the maximized tile.
  	 *
  	 *
  	 * Valid values:
  	 * "number" The maximizedTileindex can be set as a number.
  	 * "null" Option is ignored.
  	 */
  var maximizedTileIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the content of the tiles in minimized state.
  	 *
  	 *
  	 * Valid values:
  	 * "string" When initializing on html markup provide jQuery selector specifying what content of the tile to be shown in minimized state. When initializing on data source provide igTemplate that will be rendered for the minimized state.
  	 * "null" The whole content of the tile will be visible in minimized state.
  	 */
  var minimizedState: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets JQuery selector that specifies which elements will not trigger maximizing when clicked on.
  	 *
  	 */
  var preventMaximizingSelector: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets whether the items will rearrange when the container is resized.
  	 *
  	 */
  var rearrangeItems: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Fired after rendering of the tile manager completes.
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager performing rendering.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Fired before rendering of the tile manager begins.
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager performing rendering.
  	 *             Use ui.tiles to get a reference to the tiles the tile manager is going to render. If using data source this referes to the data provided.
  	 *             Use ui.items to get a reference to the item configurations the tile manager has.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  /**
  	 * Specifies the HTTP request method.
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the HTTP content type for the response object. See [Perform an asynchronous HTTP (Ajax) request](http://api.jquery.com/jQuery.ajax/).
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.native
  /**
  	 * Property in the response which specifies where the data records array will be held (if the response is wrapped). See [$.ig.DataSource responseDataKey](ig.datasource#options:settings.responseDataKey).
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the name of the property in which data records are held if the response is wrapped.
  	 * "null" Option is ignored.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of [$.ig.DataSource type](ig.datasource#options:settings.type) and its type property.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 * "null" Option is ignored.
  	 */
  var responseDataType: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets how many columns to be displayed in the right panel when the tiles are minimized.
  	 *
  	 *
  	 * Valid values:
  	 * "number" Set the number of right panel columns as a number. The minimum value is 1.
  	 * "null" Default of 1 column will be used.
  	 */
  var rightPanelCols: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the height of the minimized tiles in the right panel.
  	 *
  	 *
  	 * Valid values:
  	 * "number" Set the height of the minimized tiles as a number.
  	 * "null" Default value equal to the column height will be used.
  	 */
  var rightPanelTilesHeight: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the width of the minimized tiles in the right panel.
  	 *
  	 *
  	 * Valid values:
  	 * "number" Set the width of the minimized tiles as a number.
  	 * "null" Default value equal to the column width will be used.
  	 */
  var rightPanelTilesWidth: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets the rows count in the container.
  	 *
  	 *
  	 * Valid values:
  	 * "number" The row count can be set as a number.
  	 * "null" The row count will be automatically calculated.
  	 */
  var rows: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets whether the right panel should show scrollbar when tiles are overflowing.
  	 *
  	 */
  var showRightPanelScroll: js.UndefOr[Boolean] = js.native
  /**
  	 * Configure the container variable representation, which defines splitter functionality.
  	 *
  	 */
  var splitterOptions: js.UndefOr[IgTileManagerSplitterOptions] = js.native
  /**
  	 * Fired after a tile in the tile manager is maximized.
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager the maximized tile belongs to.
  	 *             Use ui.tile to get the jQuery element of the maximized tile
  	 */
  var tileMaximized: js.UndefOr[TileMaximizedEvent] = js.native
  /**
  	 * Fired before a tile in the tile manager is maximized.
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager performing the maximizing the tile belongs to.
  	 *             Use ui.tile to get the jQuery element of the tile being maximized
  	 *             Use ui.minimizingTile to get reference to the tile that is minimizing simultaneously or null if no tile is minimizing.
  	 */
  var tileMaximizing: js.UndefOr[TileMaximizingEvent] = js.native
  /**
  	 * Fired after a tile in the tile manager is minimized.
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager the minimized tile belongs to.
  	 *             Use ui.tile to get the jQuery element of the minimized tile
  	 */
  var tileMinimized: js.UndefOr[TileMinimizedEvent] = js.native
  /**
  	 * Fired before a tile in the tile manager is minimized.
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager performing the minimizing the tile belongs to.
  	 *             Use ui.tile to get the jQuery element of the tile being minimized
  	 *             Use ui.maximizingTile to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
  	 */
  var tileMinimizing: js.UndefOr[TileMinimizingEvent] = js.native
  /**
  	 * Event Fired after a tile has been rendered in the container
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager performing rendering.
  	 *             Use ui.tile to get a reference to the rendered tile
  	 */
  var tileRendered: js.UndefOr[TileRenderedEvent] = js.native
  /**
  	 * Event fired before a tile is rendered in the container
  	 *
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.owner to get a reference to the tile manager performing rendering.
  	 *             Use ui.tile to get a reference to the tile being rendered
  	 */
  var tileRendering: js.UndefOr[TileRenderingEvent] = js.native
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "string" The container width can be set in pixels (px) and percentage (%).
  	 * "number" The container width can be set as a number in pixels.
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgTileManager {
  @scala.inline
  def apply(): IgTileManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTileManager]
  }
  @scala.inline
  implicit class IgTileManagerOps[Self <: IgTileManager] (val x: Self) extends AnyVal {
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
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeight(value: String | Double | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: String | Double | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
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
    def withItems(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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
    def withMaximizedState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedState")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizedTileIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedTileIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizedTileIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedTileIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizedState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizedState")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventMaximizingSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventMaximizingSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventMaximizingSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventMaximizingSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withRearrangeItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearrangeItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRearrangeItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearrangeItems")(js.undefined)
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
    def withRightPanelCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPanelCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightPanelCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPanelCols")(js.undefined)
        ret
    }
    @scala.inline
    def withRightPanelTilesHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPanelTilesHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightPanelTilesHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPanelTilesHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRightPanelTilesWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPanelTilesWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightPanelTilesWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPanelTilesWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRightPanelScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRightPanelScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRightPanelScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRightPanelScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitterOptions(value: IgTileManagerSplitterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTileMaximized(value: (/* event */ Event, /* ui */ TileMaximizedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMaximized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTileMaximized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMaximized")(js.undefined)
        ret
    }
    @scala.inline
    def withTileMaximizing(value: (/* event */ Event, /* ui */ TileMaximizingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMaximizing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTileMaximizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMaximizing")(js.undefined)
        ret
    }
    @scala.inline
    def withTileMinimized(value: (/* event */ Event, /* ui */ TileMinimizedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMinimized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTileMinimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMinimized")(js.undefined)
        ret
    }
    @scala.inline
    def withTileMinimizing(value: (/* event */ Event, /* ui */ TileMinimizingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMinimizing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTileMinimizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMinimizing")(js.undefined)
        ret
    }
    @scala.inline
    def withTileRendered(value: (/* event */ Event, /* ui */ TileRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTileRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withTileRendering(value: (/* event */ Event, /* ui */ TileRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTileRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRendering")(js.undefined)
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

