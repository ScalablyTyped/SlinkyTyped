package typingsSlinky.isotopeLayout.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsotopeOptions extends js.Object {
  /**
    * A horizontal grid layout where items are centered inside each cell. The grid is defined by columnWidth and rowHeight options.
    */
  var cellsByColumn: js.UndefOr[CellsByColumn] = js.native
  /**
    * A vertical grid layout where items are centered inside each cell. The grid is defined by columnWidth and rowHeight options.
    */
  var cellsByRow: js.UndefOr[CellsByRow] = js.native
  /**
    * CSS styles that are applied to the container element.
    */
  var containerStyle: js.UndefOr[Style] = js.native
  /**
    * Shows items that match the filter and hides items that do not match.
    * If set to a string, that value is used as a selector.
    * If filter is set to a function, that function checks each item and returns true or false if the item should be shown or hidden.
    */
  var filter: js.UndefOr[String | (js.Function1[/* itemElement */ HTMLElement, Boolean])] = js.native
  /**
    * Items are arranged into rows. Rows progress vertically. Similar to what you would expect from a layout that uses CSS floats. fitRows works well for items that have the same height.
    */
  var fitRows: js.UndefOr[FitRows] = js.native
  /**
    * Isotope reads data from HTML with the getSortData option.
    * getSortData is set with an object. The object’s keys are keywords used to sort by. Object values are either a shortcut string or function to retrieve the data.
    */
  var getSortData: js.UndefOr[Sorter] = js.native
  /**
    * The styles applied to hide items when filtering.
    */
  var hiddenStyle: js.UndefOr[Style] = js.native
  /**
    * Items are arranged horizontally.
    */
  var horiz: js.UndefOr[Horizontal] = js.native
  /**
    * Enables layout on initialization. Enabled by default initLayout: true.
    * Set initLayout: false to disable layout on initialization, so you can use methods or add events before the initial layout.
    * initLayout was previously isInitLayout in Isotope v2. isInitLayout will still work in Isotope v3
    */
  var initLayout: js.UndefOr[Boolean] = js.native
  /**
    * Specifies which child elements will be used as item elements in the layout.
    * We recommend always setting itemSelector. itemSelector is useful to exclude sizing elements or other elements that are not part of the layout.
    */
  var itemSelector: js.UndefOr[String] = js.native
  /**
    * Layout modes can have their own separate options. These are set in a corresponding object within the options.
    * masonry, fitRows, and vertical are included in Isotope by default. All other layout modes need to installed separately.
    */
  var layoutMode: js.UndefOr[LayoutModes] = js.native
  /**
    * The default layout mode. Items are arranged in a vertically cascading grid.
    */
  var masonry: js.UndefOr[Masonry] = js.native
  /**
    * Horizontal version of masonry. Items are arranged in a horizontally cascading grid.
    */
  var masontryHorizontal: js.UndefOr[MasonryHorizontal] = js.native
  /**
    * Controls the horizontal flow of the layout. By default, item elements start positioning at the left, with originLeft: true. Set originLeft: false for right-to-left layouts.
    */
  var originLeft: js.UndefOr[Boolean] = js.native
  /**
    * Controls the vertical flow of the layout. By default, item elements start positioning at the top. Set to false for bottom-up layouts. It’s like Tetris!
    */
  var originTop: js.UndefOr[Boolean] = js.native
  /**
    * The packery layout mode uses a bin-packing algorithm. This is a fancy way of saying “it fills empty gaps.” It works similarly to masonry, except gaps will be filled.
    */
  var packery: js.UndefOr[Packery] = js.native
  /**
    * Sets item positions in percent values, rather than pixel values. percentPosition: true works well with percent-width items, as items will not transition their position on resize.
    */
  var percentPosition: js.UndefOr[Boolean] = js.native
  /**
    * Adjusts sizes and positions when window is resized. Enabled by default resize: true.
    */
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * Sorts items ascendingly if sortAscending: true “A, B, C…”, “1, 2, 3…”, or descendingly if sortAscending: false, “Z, Y, X…”, “9, 8, 7…”.
    * You can set ascending order for each sortBy value by setting sortAscending to an object.
    */
  var sortAscending: js.UndefOr[Boolean | SortOrder] = js.native
  /**
    * Sorts items according to which property of getSortData. The value of sortBy needs to match a key name in getSortData.
    */
  var sortBy: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Staggers item transitions, so items transition incrementally after one another. Set as a CSS time format, '0.03s', or as a number in milliseconds, 30.
    */
  var stagger: js.UndefOr[Double | String] = js.native
  /**
    * Specifies which elements are stamped within the layout. Isotope will layout items around stamped elements.
    * The masonry, packery, and masonryHorizontal layout modes support stamping.
    * The stamp option stamps elements only when the Isotope instance is first initialized. You can stamp additional elements afterwards with the stamp method.
    */
  var stamp: js.UndefOr[String] = js.native
  /**
    * Duration of the transition when items change position or appearance, set in a CSS time format, or as a number in milliseconds. Default: transitionDuration: '0.4s'
    */
  var transitionDuration: js.UndefOr[Double | String] = js.native
  /**
    * Items are stacked vertically.
    */
  var vertical: js.UndefOr[Vertical] = js.native
  /**
    * The styles applied to reveal items when filtering.
    */
  var visibleStyle: js.UndefOr[Style] = js.native
}

object IsotopeOptions {
  @scala.inline
  def apply(): IsotopeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsotopeOptions]
  }
  @scala.inline
  implicit class IsotopeOptionsOps[Self <: IsotopeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellsByColumn(value: CellsByColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsByColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellsByColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsByColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withCellsByRow(value: CellsByRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsByRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellsByRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsByRow")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(value: /* itemElement */ HTMLElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: String | (js.Function1[/* itemElement */ HTMLElement, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFitRows(value: FitRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSortData(value: Sorter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetSortData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortData")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenStyle(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHoriz(value: Horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horiz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoriz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horiz")(js.undefined)
        ret
    }
    @scala.inline
    def withInitLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutMode(value: LayoutModes): Self = {
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
    def withMasonry(value: Masonry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masonry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasonry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masonry")(js.undefined)
        ret
    }
    @scala.inline
    def withMasontryHorizontal(value: MasonryHorizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masontryHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasontryHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masontryHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPackery(value: Packery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packery")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withSortAscending(value: Boolean | SortOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscending")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withStagger(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStagger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagger")(js.undefined)
        ret
    }
    @scala.inline
    def withStamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleStyle(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleStyle")(js.undefined)
        ret
    }
  }
  
}

