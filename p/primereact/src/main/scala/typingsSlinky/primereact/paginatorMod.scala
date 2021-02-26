package typingsSlinky.primereact

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginatorMod {
  
  @JSImport("primereact/components/paginator/Paginator", "Paginator")
  @js.native
  class Paginator protected ()
    extends Component[PaginatorProps, js.Any, js.Any] {
    def this(props: PaginatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaginatorProps, context: js.Any) = this()
  }
  
  @js.native
  trait PageState extends StObject {
    
    var first: Double = js.native
    
    var page: Double = js.native
    
    var pageCount: Double = js.native
    
    var rows: Double = js.native
  }
  object PageState {
    
    @scala.inline
    def apply(first: Double, page: Double, pageCount: Double, rows: Double): PageState = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageState]
    }
    
    @scala.inline
    implicit class PageStateMutableBuilder[Self <: PageState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaginatorProps extends StObject {
    
    var alwaysShow: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var currentPageReportTemplate: js.UndefOr[String] = js.native
    
    var dropdownAppendTo: js.UndefOr[js.Any] = js.native
    
    var first: js.UndefOr[Double] = js.native
    
    var leftContent: js.UndefOr[ReactElement] = js.native
    
    var onPageChange: js.UndefOr[js.Function1[/* event */ PageState, Unit]] = js.native
    
    var pageLinkSize: js.UndefOr[Double] = js.native
    
    var rightContent: js.UndefOr[ReactElement] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var rowsPerPageOptions: js.UndefOr[js.Array[_]] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var totalRecords: js.UndefOr[Double] = js.native
  }
  object PaginatorProps {
    
    @scala.inline
    def apply(): PaginatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginatorProps]
    }
    
    @scala.inline
    implicit class PaginatorPropsMutableBuilder[Self <: PaginatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrentPageReportTemplate(value: String): Self = StObject.set(x, "currentPageReportTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageReportTemplateUndefined: Self = StObject.set(x, "currentPageReportTemplate", js.undefined)
      
      @scala.inline
      def setDropdownAppendTo(value: js.Any): Self = StObject.set(x, "dropdownAppendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAppendToUndefined: Self = StObject.set(x, "dropdownAppendTo", js.undefined)
      
      @scala.inline
      def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setLeftContent(value: ReactElement): Self = StObject.set(x, "leftContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftContentUndefined: Self = StObject.set(x, "leftContent", js.undefined)
      
      @scala.inline
      def setOnPageChange(value: /* event */ PageState => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      @scala.inline
      def setPageLinkSize(value: Double): Self = StObject.set(x, "pageLinkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageLinkSizeUndefined: Self = StObject.set(x, "pageLinkSize", js.undefined)
      
      @scala.inline
      def setRightContent(value: ReactElement): Self = StObject.set(x, "rightContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightContentUndefined: Self = StObject.set(x, "rightContent", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsPerPageOptions(value: js.Array[_]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
      
      @scala.inline
      def setRowsPerPageOptionsVarargs(value: js.Any*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    }
  }
}
