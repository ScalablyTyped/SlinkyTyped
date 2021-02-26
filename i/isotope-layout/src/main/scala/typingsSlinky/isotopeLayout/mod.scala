package typingsSlinky.isotopeLayout

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.addItems
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.appended
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.destroy
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.getFilteredItemElements
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.getItemElements
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.hideItemElements
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.insert
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.isotope
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.layout
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.layoutItems
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.prepended
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.reloadItems
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.remove
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.revealItemElements
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.shuffle
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.stamp
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.unstamp
import typingsSlinky.isotopeLayout.isotopeLayoutStrings.updateSortData
import typingsSlinky.isotopeLayout.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("isotope-layout", JSImport.Namespace)
  @js.native
  class Class protected () extends Isotope {
    def this(elementOrSelector: String, options: IsotopeOptions) = this()
    def this(elementOrSelector: HTMLElement, options: IsotopeOptions) = this()
  }
  
  @JSImport("isotope-layout", "data")
  @js.native
  def data(element: String): Isotope = js.native
  /**
    * Get the Isotope instance via its element. Isotope.data() is useful for getting the Isotope instance in JavaScript, after it has been initalized in HTML.
    */
  @JSImport("isotope-layout", "data")
  @js.native
  def data(element: HTMLElement): Isotope = js.native
  
  @js.native
  trait CellsByColumn extends StObject {
    
    var columnWidth: js.UndefOr[Double | String] = js.native
    
    var rowHeight: js.UndefOr[Double | String] = js.native
  }
  object CellsByColumn {
    
    @scala.inline
    def apply(): CellsByColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellsByColumn]
    }
    
    @scala.inline
    implicit class CellsByColumnMutableBuilder[Self <: CellsByColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  @js.native
  trait CellsByRow extends StObject {
    
    var columnWidth: js.UndefOr[Double | String] = js.native
    
    var rowHeight: js.UndefOr[Double | String] = js.native
  }
  object CellsByRow {
    
    @scala.inline
    def apply(): CellsByRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellsByRow]
    }
    
    @scala.inline
    implicit class CellsByRowMutableBuilder[Self <: CellsByRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  type Elements = js.Array[HTMLElement] | HTMLElement | JQuery | NodeList
  
  @js.native
  trait FitRows extends StObject {
    
    var gutter: js.UndefOr[Double | String] = js.native
  }
  object FitRows {
    
    @scala.inline
    def apply(): FitRows = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitRows]
    }
    
    @scala.inline
    implicit class FitRowsMutableBuilder[Self <: FitRows] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGutter(value: Double | String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    }
  }
  
  @js.native
  trait Horizontal extends StObject {
    
    var verticalAligment: js.UndefOr[Double] = js.native
  }
  object Horizontal {
    
    @scala.inline
    def apply(): Horizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Horizontal]
    }
    
    @scala.inline
    implicit class HorizontalMutableBuilder[Self <: Horizontal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerticalAligment(value: Double): Self = StObject.set(x, "verticalAligment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAligmentUndefined: Self = StObject.set(x, "verticalAligment", js.undefined)
    }
  }
  
  @js.native
  trait Isotope extends StObject {
    
    /**
      * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def addItems(elements: Elements): Unit = js.native
    
    /**
      * Adds and lays out newly appended item elements to the end of the layout.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def appended(elements: Elements): Unit = js.native
    
    /**
      * Filters, sorts, and lays out items. arrange is the principle method of Isotope. It is the default method with jQuery .isotope(). Pass in options to apply filtering and sorting.
      * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
      */
    def arrange(options: IsotopeOptions): Unit = js.native
    
    /**
      * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
      */
    def destroy(): Unit = js.native
    
    /**
      * Returns an array of filtered item elements in current sorted order.
      */
    def getFilteredItemElements(): js.Array[Element] = js.native
    
    /**
      * Returns an array of all item elements in the Isotope instance.
      */
    def getItemElements(): js.Array[Element] = js.native
    
    /**
      * Hide items.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def hideItemElements(elements: Elements): Unit = js.native
    
    /**
      * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def insert(elements: Elements): Unit = js.native
    
    /**
      * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
      */
    def layout(): Unit = js.native
    
    /**
      * Lays out specified items.
      * @param elements Array of Isotope.Items
      * @param isStill Disables transitions
      */
    def layoutItems(elements: js.Array[HTMLElement], isStill: Boolean): Unit = js.native
    
    /**
      * Adds and lays out newly prepended item elements at the beginning of layout.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def prepended(elements: Elements): Unit = js.native
    
    /**
      * Recollects all item elements.
      * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
      */
    def reloadItems(): Unit = js.native
    
    /**
      * Removes elements from the Isotope instance and DOM.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def remove(elements: Elements): Unit = js.native
    
    /**
      * Reveals hidden items.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def revealItemElements(elements: Elements): Unit = js.native
    
    /**
      * Shuffles items in a random order.
      */
    def shuffle(): Unit = js.native
    
    /**
      * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
      * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def stamp(elements: Elements): Unit = js.native
    
    /**
      * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def unstamp(elements: Elements): Unit = js.native
    
    /**
      * Updates sort data
      * @param elements Element, jQuery Object, NodeList, or Array of Elements
      */
    def updateSortData(elements: Elements): Unit = js.native
  }
  object Isotope {
    
    @scala.inline
    def apply(
      addItems: Elements => Unit,
      appended: Elements => Unit,
      arrange: IsotopeOptions => Unit,
      destroy: () => Unit,
      getFilteredItemElements: () => js.Array[Element],
      getItemElements: () => js.Array[Element],
      hideItemElements: Elements => Unit,
      insert: Elements => Unit,
      layout: () => Unit,
      layoutItems: (js.Array[HTMLElement], Boolean) => Unit,
      prepended: Elements => Unit,
      reloadItems: () => Unit,
      remove: Elements => Unit,
      revealItemElements: Elements => Unit,
      shuffle: () => Unit,
      stamp: Elements => Unit,
      unstamp: Elements => Unit,
      updateSortData: Elements => Unit
    ): Isotope = {
      val __obj = js.Dynamic.literal(addItems = js.Any.fromFunction1(addItems), appended = js.Any.fromFunction1(appended), arrange = js.Any.fromFunction1(arrange), destroy = js.Any.fromFunction0(destroy), getFilteredItemElements = js.Any.fromFunction0(getFilteredItemElements), getItemElements = js.Any.fromFunction0(getItemElements), hideItemElements = js.Any.fromFunction1(hideItemElements), insert = js.Any.fromFunction1(insert), layout = js.Any.fromFunction0(layout), layoutItems = js.Any.fromFunction2(layoutItems), prepended = js.Any.fromFunction1(prepended), reloadItems = js.Any.fromFunction0(reloadItems), remove = js.Any.fromFunction1(remove), revealItemElements = js.Any.fromFunction1(revealItemElements), shuffle = js.Any.fromFunction0(shuffle), stamp = js.Any.fromFunction1(stamp), unstamp = js.Any.fromFunction1(unstamp), updateSortData = js.Any.fromFunction1(updateSortData))
      __obj.asInstanceOf[Isotope]
    }
    
    @scala.inline
    implicit class IsotopeMutableBuilder[Self <: Isotope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddItems(value: Elements => Unit): Self = StObject.set(x, "addItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppended(value: Elements => Unit): Self = StObject.set(x, "appended", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArrange(value: IsotopeOptions => Unit): Self = StObject.set(x, "arrange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFilteredItemElements(value: () => js.Array[Element]): Self = StObject.set(x, "getFilteredItemElements", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItemElements(value: () => js.Array[Element]): Self = StObject.set(x, "getItemElements", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideItemElements(value: Elements => Unit): Self = StObject.set(x, "hideItemElements", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsert(value: Elements => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLayout(value: () => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLayoutItems(value: (js.Array[HTMLElement], Boolean) => Unit): Self = StObject.set(x, "layoutItems", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrepended(value: Elements => Unit): Self = StObject.set(x, "prepended", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReloadItems(value: () => Unit): Self = StObject.set(x, "reloadItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: Elements => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRevealItemElements(value: Elements => Unit): Self = StObject.set(x, "revealItemElements", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShuffle(value: () => Unit): Self = StObject.set(x, "shuffle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStamp(value: Elements => Unit): Self = StObject.set(x, "stamp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnstamp(value: Elements => Unit): Self = StObject.set(x, "unstamp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateSortData(value: Elements => Unit): Self = StObject.set(x, "updateSortData", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IsotopeOptions extends StObject {
    
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
    implicit class IsotopeOptionsMutableBuilder[Self <: IsotopeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellsByColumn(value: CellsByColumn): Self = StObject.set(x, "cellsByColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellsByColumnUndefined: Self = StObject.set(x, "cellsByColumn", js.undefined)
      
      @scala.inline
      def setCellsByRow(value: CellsByRow): Self = StObject.set(x, "cellsByRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellsByRowUndefined: Self = StObject.set(x, "cellsByRow", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: Style): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setFilter(value: String | (js.Function1[/* itemElement */ HTMLElement, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* itemElement */ HTMLElement => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFitRows(value: FitRows): Self = StObject.set(x, "fitRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitRowsUndefined: Self = StObject.set(x, "fitRows", js.undefined)
      
      @scala.inline
      def setGetSortData(value: Sorter): Self = StObject.set(x, "getSortData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetSortDataUndefined: Self = StObject.set(x, "getSortData", js.undefined)
      
      @scala.inline
      def setHiddenStyle(value: Style): Self = StObject.set(x, "hiddenStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenStyleUndefined: Self = StObject.set(x, "hiddenStyle", js.undefined)
      
      @scala.inline
      def setHoriz(value: Horizontal): Self = StObject.set(x, "horiz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizUndefined: Self = StObject.set(x, "horiz", js.undefined)
      
      @scala.inline
      def setInitLayout(value: Boolean): Self = StObject.set(x, "initLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitLayoutUndefined: Self = StObject.set(x, "initLayout", js.undefined)
      
      @scala.inline
      def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      @scala.inline
      def setLayoutMode(value: LayoutModes): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
      
      @scala.inline
      def setMasonry(value: Masonry): Self = StObject.set(x, "masonry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasonryUndefined: Self = StObject.set(x, "masonry", js.undefined)
      
      @scala.inline
      def setMasontryHorizontal(value: MasonryHorizontal): Self = StObject.set(x, "masontryHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasontryHorizontalUndefined: Self = StObject.set(x, "masontryHorizontal", js.undefined)
      
      @scala.inline
      def setOriginLeft(value: Boolean): Self = StObject.set(x, "originLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginLeftUndefined: Self = StObject.set(x, "originLeft", js.undefined)
      
      @scala.inline
      def setOriginTop(value: Boolean): Self = StObject.set(x, "originTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginTopUndefined: Self = StObject.set(x, "originTop", js.undefined)
      
      @scala.inline
      def setPackery(value: Packery): Self = StObject.set(x, "packery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackeryUndefined: Self = StObject.set(x, "packery", js.undefined)
      
      @scala.inline
      def setPercentPosition(value: Boolean): Self = StObject.set(x, "percentPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentPositionUndefined: Self = StObject.set(x, "percentPosition", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setSortAscending(value: Boolean | SortOrder): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
      
      @scala.inline
      def setSortBy(value: String | js.Array[String]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      @scala.inline
      def setSortByVarargs(value: String*): Self = StObject.set(x, "sortBy", js.Array(value :_*))
      
      @scala.inline
      def setStagger(value: Double | String): Self = StObject.set(x, "stagger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaggerUndefined: Self = StObject.set(x, "stagger", js.undefined)
      
      @scala.inline
      def setStamp(value: String): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStampUndefined: Self = StObject.set(x, "stamp", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double | String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setVertical(value: Vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setVisibleStyle(value: Style): Self = StObject.set(x, "visibleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleStyleUndefined: Self = StObject.set(x, "visibleStyle", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.masonry
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.fitRows
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.cellsByRow
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.vertical
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.packery
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.masonryHorizontal
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.fitColumns
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.cellsByColumn
    - typingsSlinky.isotopeLayout.isotopeLayoutStrings.horiz
  */
  trait LayoutModes extends StObject
  object LayoutModes {
    
    @scala.inline
    def cellsByColumn: typingsSlinky.isotopeLayout.isotopeLayoutStrings.cellsByColumn = "cellsByColumn".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.cellsByColumn]
    
    @scala.inline
    def cellsByRow: typingsSlinky.isotopeLayout.isotopeLayoutStrings.cellsByRow = "cellsByRow".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.cellsByRow]
    
    @scala.inline
    def fitColumns: typingsSlinky.isotopeLayout.isotopeLayoutStrings.fitColumns = "fitColumns".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.fitColumns]
    
    @scala.inline
    def fitRows: typingsSlinky.isotopeLayout.isotopeLayoutStrings.fitRows = "fitRows".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.fitRows]
    
    @scala.inline
    def horiz: typingsSlinky.isotopeLayout.isotopeLayoutStrings.horiz = "horiz".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.horiz]
    
    @scala.inline
    def masonry: typingsSlinky.isotopeLayout.isotopeLayoutStrings.masonry = "masonry".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.masonry]
    
    @scala.inline
    def masonryHorizontal: typingsSlinky.isotopeLayout.isotopeLayoutStrings.masonryHorizontal = "masonryHorizontal".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.masonryHorizontal]
    
    @scala.inline
    def packery: typingsSlinky.isotopeLayout.isotopeLayoutStrings.packery = "packery".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.packery]
    
    @scala.inline
    def vertical: typingsSlinky.isotopeLayout.isotopeLayoutStrings.vertical = "vertical".asInstanceOf[typingsSlinky.isotopeLayout.isotopeLayoutStrings.vertical]
  }
  
  @js.native
  trait Masonry extends StObject {
    
    var columnWidth: js.UndefOr[Double | String] = js.native
    
    var fitWidth: js.UndefOr[Boolean] = js.native
    
    var gutter: js.UndefOr[Double | String] = js.native
  }
  object Masonry {
    
    @scala.inline
    def apply(): Masonry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Masonry]
    }
    
    @scala.inline
    implicit class MasonryMutableBuilder[Self <: Masonry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setFitWidth(value: Boolean): Self = StObject.set(x, "fitWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitWidthUndefined: Self = StObject.set(x, "fitWidth", js.undefined)
      
      @scala.inline
      def setGutter(value: Double | String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    }
  }
  
  @js.native
  trait MasonryHorizontal extends StObject {
    
    var gutter: js.UndefOr[Double | String] = js.native
    
    var rowHeight: js.UndefOr[Double | String] = js.native
  }
  object MasonryHorizontal {
    
    @scala.inline
    def apply(): MasonryHorizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MasonryHorizontal]
    }
    
    @scala.inline
    implicit class MasonryHorizontalMutableBuilder[Self <: MasonryHorizontal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGutter(value: Double | String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  @js.native
  trait Packery extends StObject {
    
    var columnWidth: js.UndefOr[Double | String] = js.native
    
    var gutter: js.UndefOr[Double | String] = js.native
    
    var horizontal: js.UndefOr[Boolean] = js.native
    
    var rowHeight: js.UndefOr[Double] = js.native
  }
  object Packery {
    
    @scala.inline
    def apply(): Packery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Packery]
    }
    
    @scala.inline
    implicit class PackeryMutableBuilder[Self <: Packery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setGutter(value: Double | String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  type SortOrder = StringDictionary[Boolean]
  
  type Sorter = StringDictionary[(js.Function1[/* itemElm */ JQuery, Double | String]) | String]
  
  type Style = StringDictionary[Double | String]
  
  @js.native
  trait Vertical extends StObject {
    
    var horizontalAlignment: js.UndefOr[Double] = js.native
  }
  object Vertical {
    
    @scala.inline
    def apply(): Vertical = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vertical]
    }
    
    @scala.inline
    implicit class VerticalMutableBuilder[Self <: Vertical] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontalAlignment(value: Double): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      /**
        * Get the Isotope instance from a jQuery object. Isotope instances are useful to access Isotope properties.
        */
      @JSName("data")
      def data_isotope(methodName: isotope): Isotope = js.native
      
      /**
        * Filters, sorts, and lays out items.
        */
      def isotope(): JQuery = js.native
      /**
        * Filters, sorts, and lays out items. Pass in options to apply filtering and sorting.
        * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
        */
      def isotope(options: IsotopeOptions): JQuery = js.native
      /**
        * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_addItems(methodName: addItems, elements: Elements): JQuery = js.native
      /**
        * Adds and lays out newly appended item elements to the end of the layout.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_appended(methodName: appended, elements: Elements): JQuery = js.native
      /**
        * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
        */
      @JSName("isotope")
      def isotope_destroy(methodName: destroy): Unit = js.native
      /**
        * Returns an array of filtered item elements in current sorted order.
        */
      @JSName("isotope")
      def isotope_getFilteredItemElements(methodName: getFilteredItemElements): js.Array[Element] = js.native
      /**
        * Returns an array of all item elements in the Isotope instance.
        */
      @JSName("isotope")
      def isotope_getItemElements(methodName: getItemElements): js.Array[Element] = js.native
      /**
        * Hide items.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_hideItemElements(methodName: hideItemElements, elements: Elements): JQuery = js.native
      /**
        * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_insert(methodName: insert, elements: Elements): JQuery = js.native
      /**
        * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
        */
      @JSName("isotope")
      def isotope_layout(methodName: layout): JQuery = js.native
      /**
        * Lays out specified items.
        * @param elements Array of Isotope.Items
        * @param isStill Disables transitions
        */
      @JSName("isotope")
      def isotope_layoutItems(methodName: layoutItems, elements: js.Array[HTMLElement], isStill: Boolean): JQuery = js.native
      /**
        * Adds and lays out newly prepended item elements at the beginning of layout.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_prepended(methodName: prepended, elements: Elements): JQuery = js.native
      /**
        * Recollects all item elements.
        * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
        */
      @JSName("isotope")
      def isotope_reloadItems(methodName: reloadItems): JQuery = js.native
      /**
        * Removes elements from the Isotope instance and DOM.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_remove(methodName: remove, elements: Elements): JQuery = js.native
      /**
        * Reveals hidden items.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_revealItemElements(methodName: revealItemElements, elements: Elements): JQuery = js.native
      /**
        * Shuffles items in a random order.
        */
      @JSName("isotope")
      def isotope_shuffle(methodName: shuffle): JQuery = js.native
      /**
        * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
        * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_stamp(methodName: stamp, elements: Elements): JQuery = js.native
      /**
        * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_unstamp(methodName: unstamp, elements: Elements): JQuery = js.native
      /**
        * Updates sort data
        * @param elements Element, jQuery Object, NodeList, or Array of Elements
        */
      @JSName("isotope")
      def isotope_updateSortData(methodName: updateSortData, elements: Elements): JQuery = js.native
    }
  }
}
