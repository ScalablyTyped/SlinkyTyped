package typingsSlinky.googleapis.anon

import typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.SchemaReportApiColumnSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortOrder extends StObject {
  
  var column: js.UndefOr[SchemaReportApiColumnSpec] = js.native
  
  var sortOrder: js.UndefOr[String] = js.native
}
object SortOrder {
  
  @scala.inline
  def apply(): SortOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOrder]
  }
  
  @scala.inline
  implicit class SortOrderMutableBuilder[Self <: SortOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: SchemaReportApiColumnSpec): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
