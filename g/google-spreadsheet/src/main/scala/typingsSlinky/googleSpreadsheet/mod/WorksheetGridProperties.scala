package typingsSlinky.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetGridProperties extends StObject {
  
  var columnCount: js.UndefOr[Double] = js.native
  
  var columnGroupControlAfter: js.UndefOr[Boolean] = js.native
  
  var frozenColumnCount: js.UndefOr[Double] = js.native
  
  var frozenRowCount: js.UndefOr[Double] = js.native
  
  var hideGridlines: js.UndefOr[Boolean] = js.native
  
  var rowCount: js.UndefOr[Double] = js.native
  
  var rowGroupControlAfter: js.UndefOr[Boolean] = js.native
}
object WorksheetGridProperties {
  
  @scala.inline
  def apply(): WorksheetGridProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetGridProperties]
  }
  
  @scala.inline
  implicit class WorksheetGridPropertiesMutableBuilder[Self <: WorksheetGridProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    @scala.inline
    def setColumnGroupControlAfter(value: Boolean): Self = StObject.set(x, "columnGroupControlAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroupControlAfterUndefined: Self = StObject.set(x, "columnGroupControlAfter", js.undefined)
    
    @scala.inline
    def setFrozenColumnCount(value: Double): Self = StObject.set(x, "frozenColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenColumnCountUndefined: Self = StObject.set(x, "frozenColumnCount", js.undefined)
    
    @scala.inline
    def setFrozenRowCount(value: Double): Self = StObject.set(x, "frozenRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenRowCountUndefined: Self = StObject.set(x, "frozenRowCount", js.undefined)
    
    @scala.inline
    def setHideGridlines(value: Boolean): Self = StObject.set(x, "hideGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideGridlinesUndefined: Self = StObject.set(x, "hideGridlines", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRowGroupControlAfter(value: Boolean): Self = StObject.set(x, "rowGroupControlAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGroupControlAfterUndefined: Self = StObject.set(x, "rowGroupControlAfter", js.undefined)
  }
}
