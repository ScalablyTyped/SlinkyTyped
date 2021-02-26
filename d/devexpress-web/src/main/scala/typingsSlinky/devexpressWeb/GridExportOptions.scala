package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Grid dashboard item is exported.
  */
@js.native
trait GridExportOptions extends StObject {
  
  /** @deprecated The GridExportOptions.FitToPageWidth property is obsolete now. Use the DashboardPdfExportOptions.GridFitToPageWidth property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    */
  var FitToPageWidth: Boolean = js.native
  
  /** @deprecated The GridExportOptions.PrintHeadersOnEveryPage property is obsolete now. Use the DashboardPdfExportOptions.GridPrintHeadersOnEveryPage property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether to print column headers of the Grid dashboard item on every page.
    */
  var PrintHeadersOnEveryPage: Boolean = js.native
}
object GridExportOptions {
  
  @scala.inline
  def apply(FitToPageWidth: Boolean, PrintHeadersOnEveryPage: Boolean): GridExportOptions = {
    val __obj = js.Dynamic.literal(FitToPageWidth = FitToPageWidth.asInstanceOf[js.Any], PrintHeadersOnEveryPage = PrintHeadersOnEveryPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExportOptions]
  }
  
  @scala.inline
  implicit class GridExportOptionsMutableBuilder[Self <: GridExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFitToPageWidth(value: Boolean): Self = StObject.set(x, "FitToPageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintHeadersOnEveryPage(value: Boolean): Self = StObject.set(x, "PrintHeadersOnEveryPage", value.asInstanceOf[js.Any])
  }
}
