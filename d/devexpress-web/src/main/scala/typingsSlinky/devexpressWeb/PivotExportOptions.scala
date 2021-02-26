package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Pivot dashboard item is exported.
  */
@js.native
trait PivotExportOptions extends StObject {
  
  /** @deprecated The PivotExportOptions.PrintHeadersOnEveryPage property is obsolete now. Use the DashboardPdfExportOptions.PivotPrintHeadersOnEveryPage property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether to print the column headers of the Pivot dashboard item on every page.
    */
  var PrintHeadersOnEveryPage: Boolean = js.native
}
object PivotExportOptions {
  
  @scala.inline
  def apply(PrintHeadersOnEveryPage: Boolean): PivotExportOptions = {
    val __obj = js.Dynamic.literal(PrintHeadersOnEveryPage = PrintHeadersOnEveryPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotExportOptions]
  }
  
  @scala.inline
  implicit class PivotExportOptionsMutableBuilder[Self <: PivotExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintHeadersOnEveryPage(value: Boolean): Self = StObject.set(x, "PrintHeadersOnEveryPage", value.asInstanceOf[js.Any])
  }
}
