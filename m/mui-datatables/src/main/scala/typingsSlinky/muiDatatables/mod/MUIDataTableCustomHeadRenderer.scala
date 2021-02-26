package typingsSlinky.muiDatatables.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<mui-datatables.mui-datatables.MUIDataTableColumn, 'name' | 'label'> & std.Pick<mui-datatables.mui-datatables.MUIDataTableColumnOptions, 'customHeadRender' | 'display' | 'filter' | 'sort' | 'download' | 'empty' | 'print' | 'searchable' | 'viewColumns'> & {  index :number} */
@js.native
trait MUIDataTableCustomHeadRenderer extends StObject {
  
  var customHeadRender: js.UndefOr[
    js.Function3[
      /* columnMeta */ this.type, 
      /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], 
      /* sortOrder */ MUISortOptions, 
      String | ReactElement
    ]
  ] = js.native
  
  var display: js.UndefOr[Display] = js.native
  
  var download: js.UndefOr[Boolean] = js.native
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[Boolean] = js.native
  
  var index: Double = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var print: js.UndefOr[Boolean] = js.native
  
  var searchable: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[Boolean] = js.native
  
  var viewColumns: js.UndefOr[Boolean] = js.native
}
object MUIDataTableCustomHeadRenderer {
  
  @scala.inline
  def apply(index: Double, name: String): MUIDataTableCustomHeadRenderer = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableCustomHeadRenderer]
  }
  
  @scala.inline
  implicit class MUIDataTableCustomHeadRendererMutableBuilder[Self <: MUIDataTableCustomHeadRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomHeadRender(
      value: (MUIDataTableCustomHeadRenderer, /* handleToggleColumn */ js.Function1[/* columnIndex */ Double, Unit], /* sortOrder */ MUISortOptions) => String | ReactElement
    ): Self = StObject.set(x, "customHeadRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCustomHeadRenderUndefined: Self = StObject.set(x, "customHeadRender", js.undefined)
    
    @scala.inline
    def setDisplay(value: Display): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setViewColumns(value: Boolean): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewColumnsUndefined: Self = StObject.set(x, "viewColumns", js.undefined)
  }
}
