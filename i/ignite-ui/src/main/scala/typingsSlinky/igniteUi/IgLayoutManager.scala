package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLayoutManager
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Options specific to a border layout
  	 *
  	 */
  var borderLayout: js.UndefOr[IgLayoutManagerBorderLayout] = js.native
  /**
  	 * Options specific to grid layout mode
  	 *
  	 */
  var gridLayout: js.UndefOr[IgLayoutManagerGridLayout] = js.native
  /**
  	 * Gets/Sets height of the layout container.
  	 *
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Event fired after items are resized.
  	 *                     Use ui.owner to get a reference to the layout manager performing resizing.
  	 */
  var internalResized: js.UndefOr[InternalResizedEvent] = js.native
  /**
  	 * Event fired before items are resized.
  	 *                     Use ui.owner to get a reference to the layout manager performing resizing.
  	 */
  var internalResizing: js.UndefOr[InternalResizingEvent] = js.native
  /**
  	 * Number of items to render, this is only applicable to layouts: vertical and flow
  	 *
  	 */
  var itemCount: js.UndefOr[Double] = js.native
  /**
  	 * Event fired after an item has been rendered in the container.
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get reference to the igLayoutManager.
  	 *                     Use ui.itemData to get a reference of item's settings, such as colspan ,rowspan, etc.
  	 *                     Use ui.index to get a reference of the item's index, if the layout is flow or vertical
  	 *                     Use ui.item to get a reference to the rendered item
  	 */
  var itemRendered: js.UndefOr[ItemRenderedEvent] = js.native
  /**
  	 * Event fired before an item is rendered in the container.
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get reference to the igLayoutManager.
  	 *                     Use ui.itemData to get a reference of item's settings, such as colspan ,rowspan, etc.
  	 *                     Use ui.index to get a reference of the item's index, if the layout is flow or vertical
  	 *                     Use ui.item to get a reference to the rendered item
  	 */
  var itemRendering: js.UndefOr[ItemRenderingEvent] = js.native
  /**
  	 * An array of item descriptions
  	 *                     this assumes the container is empty, and every item
  	 *                     is described by rowspan, colspan, etc. - otherwise values of
  	 *                     1 are assumed
  	 *                     items can have various properties some of which may not be applicable
  	 *                     depending on the layoutMode.
  	 *                     for example rowSpan/colSpan/colIndex/rowIndex are only applicable to gridlayout
  	 *
  	 */
  var items: js.UndefOr[js.Array[IgLayoutManagerItem]] = js.native
  /**
  	 * Defines the layout type
  	 *                 grid Column type can be set with grid layout
  	 *                 border Column type can be set with border layout
  	 *                 flow Column type can be set with flow layout
  	 *                 column Column type can be set with column layout
  	 *                 vertical Column type can be set with vertical layout
  	 *
  	 *
  	 * Valid values:
  	 * "grid"
  	 * "border"
  	 * "flow"
  	 * "column"
  	 * "vertical"
  	 */
  var layoutMode: js.UndefOr[js.Any] = js.native
  /**
  	 * Event fired after all items are rendered.
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get reference to the igLayoutManager.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Gets/Sets width of the layout container.
  	 *
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgLayoutManager {
  @scala.inline
  def apply(): IgLayoutManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManager]
  }
  @scala.inline
  implicit class IgLayoutManagerOps[Self <: IgLayoutManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderLayout(value: IgLayoutManagerBorderLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLayout(value: IgLayoutManagerGridLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLayout")(js.undefined)
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
    def withInternalResized(value: (/* event */ Event, /* ui */ InternalResizedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalResized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInternalResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalResized")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalResizing(value: (/* event */ Event, /* ui */ InternalResizingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalResizing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInternalResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRendered(value: (/* event */ Event, /* ui */ ItemRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRendering(value: (/* event */ Event, /* ui */ ItemRenderingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRendering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IgLayoutManagerItem]): Self = {
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
    def withLayoutMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMode")(js.undefined)
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

