package typingsSlinky.gridstack

import org.scalajs.dom.raw.Element
import typingsSlinky.gridstack.gridstackStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gridstack Options
  * Defines the options for a Gridstack
  */
@js.native
trait GridstackOptions extends js.Object {
  /**
    * accept widgets dragged from other grids or from outside (default: `false`). Can be:
    * `true` (uses `'.grid-stack-item'` class filter) or `false`,
    * string for explicit class name,
    * function returning a boolean. See [example](http://gridstack.github.io/gridstack.js/demo/two.html)
    */
  var acceptWidgets: js.UndefOr[
    Boolean | String | (js.Function2[/* i */ Double, /* element */ Element, Boolean])
  ] = js.native
  /**
    * if true the resizing handles are shown even if the user is not hovering over the widget (default?: false)
    */
  var alwaysShowResizeHandle: js.UndefOr[Boolean] = js.native
  /**
    * turns animation on (default?: true)
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * if false gridstack will not initialize existing items (default?: true)
    */
  var auto: js.UndefOr[Boolean] = js.native
  /**
    * one cell height (default?: 60). Can be:
    *  an integer (px)
    *  a string (ex: '100px', '10em', '10rem', '10%')
    *  0 or null, in which case the library will not generate styles for rows. Everything must be defined in CSS files.
    *  'auto' - height will be calculated to match cell width (initial square grid).
    */
  var cellHeight: js.UndefOr[Double | String] = js.native
  /**
    * (internal?) unit for cellHeight (default? 'px')
    */
  var cellHeightUnit: js.UndefOr[String] = js.native
  /**
    * number of columns (default?: 12). Note: IF you change this, CSS also have to change. See https://github.com/gridstack/gridstack.js#change-grid-columns
    */
  var column: js.UndefOr[Double] = js.native
  /** class that implement drag'n'drop functionality for gridstack. If false grid will be static.
    * (default?: null - first available plugin will be used)
    */
  var ddPlugin: js.UndefOr[Boolean | Null | js.Any] = js.native
  /** disallows dragging of widgets (default?: false) */
  var disableDrag: js.UndefOr[Boolean] = js.native
  /** disables the onColumnMode when the window width is less than minWidth (default?: false) */
  var disableOneColumnMode: js.UndefOr[Boolean] = js.native
  /** disallows resizing of widgets (default?: false). */
  var disableResize: js.UndefOr[Boolean] = js.native
  /**
    * let user drag nested grid items out of a parent or not (default false)
    */
  var dragOut: js.UndefOr[Boolean] = js.native
  /**
    * allows to override jQuery UI draggable options. (default?: { handle?: '.grid-stack-item-content', scroll?: true, appendTo?: 'body', containment: null })
    */
  var draggable: js.UndefOr[js.Object] = js.native
  /**
    * enable floating widgets (default?: false) See example (http://gridstack.github.io/gridstack.js/demo/float.html)
    */
  var float: js.UndefOr[Boolean] = js.native
  /**
    * draggable handle selector (default?: '.grid-stack-item-content')
    */
  var handle: js.UndefOr[String] = js.native
  /** draggable handle class (e.g. 'grid-stack-item-content'). If set 'handle' is ignored (default?: null) */
  var handleClass: js.UndefOr[String] = js.native
  /**
    * widget class (default?: 'grid-stack-item')
    */
  var itemClass: js.UndefOr[String] = js.native
  /**
    * maximum rows amount. Default? is 0 which means no maximum rows
    */
  var maxRow: js.UndefOr[Double] = js.native
  /**
    * minimal width. If window width is less, grid will be shown in one column mode (default?: 768)
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * set to true if you want oneColumnMode to use the DOM order and ignore x,y from normal multi column 
    * layouts during sorting. This enables you to have custom 1 column layout that differ from the rest. (default?: false)
    */
  var oneColumnModeDomSort: js.UndefOr[Boolean] = js.native
  /**
    * class for placeholder (default?: 'grid-stack-placeholder')
    */
  var placeholderClass: js.UndefOr[String] = js.native
  /** placeholder default content (default?: '') */
  var placeholderText: js.UndefOr[String] = js.native
  /**
    * if true widgets could be removed by dragging outside of the grid. It could also be a jQuery selector string,
    * in this case widgets will be removed by dropping them there (default?: false)
    * See example (http://gridstack.github.io/gridstack.js/demo/two.html)
    */
  var removable: js.UndefOr[Boolean | String] = js.native
  /**
    * time in milliseconds before widget is being removed while dragging outside of the grid. (default?: 2000)
    */
  var removeTimeout: js.UndefOr[Double] = js.native
  /**
    * allows to override jQuery UI resizable options. (default?: { autoHide?: true, handles?: 'se' })
    */
  var resizable: js.UndefOr[js.Object] = js.native
  /**
    * if true turns grid to RTL. Possible values are true, false, 'auto' (default?: 'auto')
    * See [example](http://gridstack.github.io/gridstack.js/demo/rtl.html)
    */
  var rtl: js.UndefOr[Boolean | auto] = js.native
  /**
    * makes grid static (default?: false).If true widgets are not movable/resizable.
    * You don't even need jQueryUI draggable/resizable. A CSS class
    * 'grid-stack-static' is also added to the container.
    */
  var staticGrid: js.UndefOr[Boolean] = js.native
  /**
    * vertical gap size (default?: 20). Can be:
    *  an integer (px)
    *  a string (ex: '2em', '20px', '2rem')
    */
  var verticalMargin: js.UndefOr[Double | String] = js.native
  /**
    * (internal?) unit for verticalMargin (default? 'px')
    */
  var verticalMarginUnit: js.UndefOr[String] = js.native
}

object GridstackOptions {
  @scala.inline
  def apply(): GridstackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridstackOptions]
  }
  @scala.inline
  implicit class GridstackOptionsOps[Self <: GridstackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptWidgetsFunction2(value: (/* i */ Double, /* element */ Element) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptWidgets")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAcceptWidgets(value: Boolean | String | (js.Function2[/* i */ Double, /* element */ Element, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptWidgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptWidgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptWidgets")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysShowResizeHandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowResizeHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowResizeHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowResizeHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHeightUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeightUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHeightUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeightUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withDdPlugin(value: Boolean | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDdPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddPlugin")(js.undefined)
        ret
    }
    @scala.inline
    def withDdPluginNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddPlugin")(null)
        ret
    }
    @scala.inline
    def withDisableDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableOneColumnMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOneColumnMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOneColumnMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOneColumnMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withDragOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOut")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRow")(js.undefined)
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
    def withOneColumnModeDomSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneColumnModeDomSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneColumnModeDomSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneColumnModeDomSort")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovable(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removable")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalMargin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalMarginUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalMarginUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalMarginUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalMarginUnit")(js.undefined)
        ret
    }
  }
  
}

