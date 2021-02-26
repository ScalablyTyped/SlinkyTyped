package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialHeaderFooter
import typingsSlinky.exceljs.anon.PartialPageSetup
import typingsSlinky.exceljs.anon.PartialWorksheetPropertie
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddWorksheetOptions extends StObject {
  
  var headerFooter: PartialHeaderFooter = js.native
  
  var pageSetup: PartialPageSetup = js.native
  
  var properties: PartialWorksheetPropertie = js.native
  
  var state: WorksheetState = js.native
  
  var views: js.Array[Partial[WorksheetView]] = js.native
}
object AddWorksheetOptions {
  
  @scala.inline
  def apply(
    headerFooter: PartialHeaderFooter,
    pageSetup: PartialPageSetup,
    properties: PartialWorksheetPropertie,
    state: WorksheetState,
    views: js.Array[Partial[WorksheetView]]
  ): AddWorksheetOptions = {
    val __obj = js.Dynamic.literal(headerFooter = headerFooter.asInstanceOf[js.Any], pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddWorksheetOptions]
  }
  
  @scala.inline
  implicit class AddWorksheetOptionsMutableBuilder[Self <: AddWorksheetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderFooter(value: PartialHeaderFooter): Self = StObject.set(x, "headerFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSetup(value: PartialPageSetup): Self = StObject.set(x, "pageSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: PartialWorksheetPropertie): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: WorksheetState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: js.Array[Partial[WorksheetView]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsVarargs(value: Partial[WorksheetView]*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
