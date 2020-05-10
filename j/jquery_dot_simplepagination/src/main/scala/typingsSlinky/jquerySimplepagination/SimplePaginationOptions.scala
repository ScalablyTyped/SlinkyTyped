package typingsSlinky.jquerySimplepagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplePaginationOptions extends js.Object {
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
    * 	If specified, items and itemsOnPage will not be used to calculate the number of pages.
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
  implicit class SimplePaginationOptionsOps[Self <: SimplePaginationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayedPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayedPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedPages")(js.undefined)
        ret
    }
    @scala.inline
    def withEdges(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsePageSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsePageSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsePageSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsePageSet")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipseText")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefTextPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefTextPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrefTextPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefTextPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefTextSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefTextSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrefTextSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefTextSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertPageOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertPageOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertPageOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertPageOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Double): Self = {
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
    def withItemsOnPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsOnPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsOnPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsOnPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMap(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMap")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNextAtFront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextAtFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextAtFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextAtFront")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageClick(value: (/* page */ Double, /* event */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPageClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAnchors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAnchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAnchors")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEndEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEndEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEndEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEndEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStartEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStartEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStartEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStartEdge")(js.undefined)
        ret
    }
  }
  
}

