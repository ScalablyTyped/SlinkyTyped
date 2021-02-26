package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.native
  
  var compare: js.UndefOr[js.Function] = js.native
  
  var initialDirection: js.UndefOr[String] = js.native
}
object GridColumnSortable {
  
  @scala.inline
  def apply(): GridColumnSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnSortable]
  }
  
  @scala.inline
  implicit class GridColumnSortableMutableBuilder[Self <: GridColumnSortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
    
    @scala.inline
    def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setInitialDirection(value: String): Self = StObject.set(x, "initialDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDirectionUndefined: Self = StObject.set(x, "initialDirection", js.undefined)
  }
}
