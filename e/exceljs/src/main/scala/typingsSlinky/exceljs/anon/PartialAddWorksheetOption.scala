package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.mod.WorksheetState
import typingsSlinky.exceljs.mod.WorksheetView
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.AddWorksheetOptions> */
@js.native
trait PartialAddWorksheetOption extends StObject {
  
  var headerFooter: js.UndefOr[PartialHeaderFooter] = js.native
  
  var pageSetup: js.UndefOr[PartialPageSetup] = js.native
  
  var properties: js.UndefOr[PartialWorksheetPropertie] = js.native
  
  var state: js.UndefOr[WorksheetState] = js.native
  
  var views: js.UndefOr[js.Array[Partial[WorksheetView]]] = js.native
}
object PartialAddWorksheetOption {
  
  @scala.inline
  def apply(): PartialAddWorksheetOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddWorksheetOption]
  }
  
  @scala.inline
  implicit class PartialAddWorksheetOptionMutableBuilder[Self <: PartialAddWorksheetOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderFooter(value: PartialHeaderFooter): Self = StObject.set(x, "headerFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFooterUndefined: Self = StObject.set(x, "headerFooter", js.undefined)
    
    @scala.inline
    def setPageSetup(value: PartialPageSetup): Self = StObject.set(x, "pageSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSetupUndefined: Self = StObject.set(x, "pageSetup", js.undefined)
    
    @scala.inline
    def setProperties(value: PartialWorksheetPropertie): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setState(value: WorksheetState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setViews(value: js.Array[Partial[WorksheetView]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: Partial[WorksheetView]*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
