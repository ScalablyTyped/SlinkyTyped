package typingsSlinky.reactJsPagination

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ClassicComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-js-pagination", JSImport.Default)
  @js.native
  class default protected ()
    extends ClassicComponent[ReactJsPaginationProps, js.Object] {
    def this(props: ReactJsPaginationProps) = this()
    def this(props: ReactJsPaginationProps, context: js.Any) = this()
  }
  @JSImport("react-js-pagination", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactJsPaginationProps] = js.native
  
  @js.native
  trait ReactJsPaginationProps extends StObject {
    
    var activeClass: js.UndefOr[String] = js.native
    
    var activeLinkClass: js.UndefOr[String] = js.native
    
    var activePage: Double = js.native
    
    var disabledClass: js.UndefOr[String] = js.native
    
    var firstPageText: js.UndefOr[String | ReactElement] = js.native
    
    var getPageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.native
    
    var hideDisabled: js.UndefOr[Boolean] = js.native
    
    var hideFirstLastPages: js.UndefOr[Boolean] = js.native
    
    var hideNavigation: js.UndefOr[Boolean] = js.native
    
    var innerClass: js.UndefOr[String] = js.native
    
    var itemClass: js.UndefOr[String] = js.native
    
    var itemClassFirst: js.UndefOr[String] = js.native
    
    var itemClassLast: js.UndefOr[String] = js.native
    
    var itemClassNext: js.UndefOr[String] = js.native
    
    var itemClassPrev: js.UndefOr[String] = js.native
    
    var itemsCountPerPage: js.UndefOr[Double] = js.native
    
    var lastPageText: js.UndefOr[String | ReactElement] = js.native
    
    var linkClass: js.UndefOr[String] = js.native
    
    var linkClassFirst: js.UndefOr[String] = js.native
    
    var linkClassLast: js.UndefOr[String] = js.native
    
    var linkClassNext: js.UndefOr[String] = js.native
    
    var linkClassPrev: js.UndefOr[String] = js.native
    
    var nextPageText: js.UndefOr[String | ReactElement] = js.native
    
    def onChange(pageNumber: Double): Unit = js.native
    
    var pageRangeDisplayed: js.UndefOr[Double] = js.native
    
    var prevPageText: js.UndefOr[String | ReactElement] = js.native
    
    var totalItemsCount: Double = js.native
  }
  object ReactJsPaginationProps {
    
    @scala.inline
    def apply(activePage: Double, onChange: Double => Unit, totalItemsCount: Double): ReactJsPaginationProps = {
      val __obj = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactJsPaginationProps]
    }
    
    @scala.inline
    implicit class ReactJsPaginationPropsMutableBuilder[Self <: ReactJsPaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      @scala.inline
      def setActiveLinkClass(value: String): Self = StObject.set(x, "activeLinkClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLinkClassUndefined: Self = StObject.set(x, "activeLinkClass", js.undefined)
      
      @scala.inline
      def setActivePage(value: Double): Self = StObject.set(x, "activePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
      
      @scala.inline
      def setFirstPageText(value: String | ReactElement): Self = StObject.set(x, "firstPageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstPageTextReactElement(value: ReactElement): Self = StObject.set(x, "firstPageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstPageTextUndefined: Self = StObject.set(x, "firstPageText", js.undefined)
      
      @scala.inline
      def setGetPageUrl(value: /* pageNumber */ Double => String): Self = StObject.set(x, "getPageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPageUrlUndefined: Self = StObject.set(x, "getPageUrl", js.undefined)
      
      @scala.inline
      def setHideDisabled(value: Boolean): Self = StObject.set(x, "hideDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledUndefined: Self = StObject.set(x, "hideDisabled", js.undefined)
      
      @scala.inline
      def setHideFirstLastPages(value: Boolean): Self = StObject.set(x, "hideFirstLastPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideFirstLastPagesUndefined: Self = StObject.set(x, "hideFirstLastPages", js.undefined)
      
      @scala.inline
      def setHideNavigation(value: Boolean): Self = StObject.set(x, "hideNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNavigationUndefined: Self = StObject.set(x, "hideNavigation", js.undefined)
      
      @scala.inline
      def setInnerClass(value: String): Self = StObject.set(x, "innerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerClassUndefined: Self = StObject.set(x, "innerClass", js.undefined)
      
      @scala.inline
      def setItemClass(value: String): Self = StObject.set(x, "itemClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassFirst(value: String): Self = StObject.set(x, "itemClassFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassFirstUndefined: Self = StObject.set(x, "itemClassFirst", js.undefined)
      
      @scala.inline
      def setItemClassLast(value: String): Self = StObject.set(x, "itemClassLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassLastUndefined: Self = StObject.set(x, "itemClassLast", js.undefined)
      
      @scala.inline
      def setItemClassNext(value: String): Self = StObject.set(x, "itemClassNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassNextUndefined: Self = StObject.set(x, "itemClassNext", js.undefined)
      
      @scala.inline
      def setItemClassPrev(value: String): Self = StObject.set(x, "itemClassPrev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassPrevUndefined: Self = StObject.set(x, "itemClassPrev", js.undefined)
      
      @scala.inline
      def setItemClassUndefined: Self = StObject.set(x, "itemClass", js.undefined)
      
      @scala.inline
      def setItemsCountPerPage(value: Double): Self = StObject.set(x, "itemsCountPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsCountPerPageUndefined: Self = StObject.set(x, "itemsCountPerPage", js.undefined)
      
      @scala.inline
      def setLastPageText(value: String | ReactElement): Self = StObject.set(x, "lastPageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPageTextReactElement(value: ReactElement): Self = StObject.set(x, "lastPageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPageTextUndefined: Self = StObject.set(x, "lastPageText", js.undefined)
      
      @scala.inline
      def setLinkClass(value: String): Self = StObject.set(x, "linkClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkClassFirst(value: String): Self = StObject.set(x, "linkClassFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkClassFirstUndefined: Self = StObject.set(x, "linkClassFirst", js.undefined)
      
      @scala.inline
      def setLinkClassLast(value: String): Self = StObject.set(x, "linkClassLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkClassLastUndefined: Self = StObject.set(x, "linkClassLast", js.undefined)
      
      @scala.inline
      def setLinkClassNext(value: String): Self = StObject.set(x, "linkClassNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkClassNextUndefined: Self = StObject.set(x, "linkClassNext", js.undefined)
      
      @scala.inline
      def setLinkClassPrev(value: String): Self = StObject.set(x, "linkClassPrev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkClassPrevUndefined: Self = StObject.set(x, "linkClassPrev", js.undefined)
      
      @scala.inline
      def setLinkClassUndefined: Self = StObject.set(x, "linkClass", js.undefined)
      
      @scala.inline
      def setNextPageText(value: String | ReactElement): Self = StObject.set(x, "nextPageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPageTextReactElement(value: ReactElement): Self = StObject.set(x, "nextPageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPageTextUndefined: Self = StObject.set(x, "nextPageText", js.undefined)
      
      @scala.inline
      def setOnChange(value: Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageRangeDisplayed(value: Double): Self = StObject.set(x, "pageRangeDisplayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageRangeDisplayedUndefined: Self = StObject.set(x, "pageRangeDisplayed", js.undefined)
      
      @scala.inline
      def setPrevPageText(value: String | ReactElement): Self = StObject.set(x, "prevPageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPageTextReactElement(value: ReactElement): Self = StObject.set(x, "prevPageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPageTextUndefined: Self = StObject.set(x, "prevPageText", js.undefined)
      
      @scala.inline
      def setTotalItemsCount(value: Double): Self = StObject.set(x, "totalItemsCount", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[ReactJsPaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[ReactJsPaginationProps] = default
}
