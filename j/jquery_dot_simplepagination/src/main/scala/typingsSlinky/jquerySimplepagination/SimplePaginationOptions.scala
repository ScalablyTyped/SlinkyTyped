package typingsSlinky.jquerySimplepagination

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimplePaginationOptions extends StObject {
  
  /**
    * The class of the CSS theme.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var cssStyle: js.UndefOr[String] = js.native
  
  /**
    * Which page will be selected immediately after init.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var currentPage: js.UndefOr[Double] = js.native
  
  /**
    * How many page numbers should be visible while navigating.
    * Minimum allowed: 3 (previous, current & next)
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var displayedPages: js.UndefOr[Double] = js.native
  
  /**
    * How many page numbers are visible at the beginning/ending of the pagination.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var edges: js.UndefOr[Double] = js.native
  
  /**
    * When this option is true,
    * clicking on the ellipse will replace the ellipse
    * with a number type input in which you can manually set the resulting page.
    * 
    * @type {boolean}
    * @memberof SimplePaginationOptions
    */
  var ellipsePageSet: js.UndefOr[Boolean] = js.native
  
  var ellipseText: js.UndefOr[String] = js.native
  
  /**
    * A string used to build the href attribute, added before the page number.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var hrefTextPrefix: js.UndefOr[String] = js.native
  
  /**
    * Another string used to build the href attribute, added after the page number.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var hrefTextSuffix: js.UndefOr[String] = js.native
  
  var invertPageOrder: js.UndefOr[Boolean] = js.native
  
  /**
    * Total number of items that will be used to calculate the pages.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var items: js.UndefOr[Double] = js.native
  
  /**
    * Number of items displayed on each page.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var itemsOnPage: js.UndefOr[Double] = js.native
  
  /**
    * A collection of labels that will be used to render the pagination items, replacing the numbers.
    * 
    * @type {any[]}
    * @memberof SimplePaginationOptions
    */
  var labelMap: js.UndefOr[js.Array[_]] = js.native
  
  var listStyle: js.UndefOr[Boolean] = js.native
  
  var nextAtFront: js.UndefOr[Boolean] = js.native
  
  /**
    * Text to be display on the next button.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var nextText: js.UndefOr[String] = js.native
  
  /**
    * Function to call when the pagination is initialized.
    * 
    * @memberof SimplePaginationOptions
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Function to call when a page is clicked.
    * Page number and event are optional parameters.
    * 
    * @memberof SimplePaginationOptions
    */
  var onPageClick: js.UndefOr[js.Function2[/* page */ Double, /* event */ js.Any, Unit]] = js.native
  
  /**
    *     If specified, items and itemsOnPage will not be used to calculate the number of pages.
    * 
    * @type {number}
    * @memberof SimplePaginationOptions
    */
  var pages: js.UndefOr[Double] = js.native
  
  /**
    * Text to be display on the previous button.
    * 
    * @type {string}
    * @memberof SimplePaginationOptions
    */
  var prevText: js.UndefOr[String] = js.native
  
  /**
    * Set to false if you don't want to select the page immediately after click.
    * 
    * @type {boolean}
    * @memberof SimplePaginationOptions
    */
  var selectOnClick: js.UndefOr[Boolean] = js.native
  
  var useAnchors: js.UndefOr[Boolean] = js.native
  
  var useEndEdge: js.UndefOr[Boolean] = js.native
  
  var useStartEdge: js.UndefOr[Boolean] = js.native
}
object SimplePaginationOptions {
  
  @scala.inline
  def apply(): SimplePaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimplePaginationOptions]
  }
  
  @scala.inline
  implicit class SimplePaginationOptionsMutableBuilder[Self <: SimplePaginationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssStyle(value: String): Self = StObject.set(x, "cssStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssStyleUndefined: Self = StObject.set(x, "cssStyle", js.undefined)
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    @scala.inline
    def setDisplayedPages(value: Double): Self = StObject.set(x, "displayedPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedPagesUndefined: Self = StObject.set(x, "displayedPages", js.undefined)
    
    @scala.inline
    def setEdges(value: Double): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    @scala.inline
    def setEllipsePageSet(value: Boolean): Self = StObject.set(x, "ellipsePageSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsePageSetUndefined: Self = StObject.set(x, "ellipsePageSet", js.undefined)
    
    @scala.inline
    def setEllipseText(value: String): Self = StObject.set(x, "ellipseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipseTextUndefined: Self = StObject.set(x, "ellipseText", js.undefined)
    
    @scala.inline
    def setHrefTextPrefix(value: String): Self = StObject.set(x, "hrefTextPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefTextPrefixUndefined: Self = StObject.set(x, "hrefTextPrefix", js.undefined)
    
    @scala.inline
    def setHrefTextSuffix(value: String): Self = StObject.set(x, "hrefTextSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefTextSuffixUndefined: Self = StObject.set(x, "hrefTextSuffix", js.undefined)
    
    @scala.inline
    def setInvertPageOrder(value: Boolean): Self = StObject.set(x, "invertPageOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertPageOrderUndefined: Self = StObject.set(x, "invertPageOrder", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsOnPage(value: Double): Self = StObject.set(x, "itemsOnPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsOnPageUndefined: Self = StObject.set(x, "itemsOnPage", js.undefined)
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setLabelMap(value: js.Array[_]): Self = StObject.set(x, "labelMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMapUndefined: Self = StObject.set(x, "labelMap", js.undefined)
    
    @scala.inline
    def setLabelMapVarargs(value: js.Any*): Self = StObject.set(x, "labelMap", js.Array(value :_*))
    
    @scala.inline
    def setListStyle(value: Boolean): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
    
    @scala.inline
    def setNextAtFront(value: Boolean): Self = StObject.set(x, "nextAtFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextAtFrontUndefined: Self = StObject.set(x, "nextAtFront", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    @scala.inline
    def setOnPageClick(value: (/* page */ Double, /* event */ js.Any) => Unit): Self = StObject.set(x, "onPageClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPageClickUndefined: Self = StObject.set(x, "onPageClick", js.undefined)
    
    @scala.inline
    def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
    
    @scala.inline
    def setSelectOnClick(value: Boolean): Self = StObject.set(x, "selectOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnClickUndefined: Self = StObject.set(x, "selectOnClick", js.undefined)
    
    @scala.inline
    def setUseAnchors(value: Boolean): Self = StObject.set(x, "useAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAnchorsUndefined: Self = StObject.set(x, "useAnchors", js.undefined)
    
    @scala.inline
    def setUseEndEdge(value: Boolean): Self = StObject.set(x, "useEndEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEndEdgeUndefined: Self = StObject.set(x, "useEndEdge", js.undefined)
    
    @scala.inline
    def setUseStartEdge(value: Boolean): Self = StObject.set(x, "useStartEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStartEdgeUndefined: Self = StObject.set(x, "useStartEdge", js.undefined)
  }
}
