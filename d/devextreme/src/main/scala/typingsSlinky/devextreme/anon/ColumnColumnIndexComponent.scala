package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.ui.dxTreeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnColumnIndexComponent extends StObject {
  
  var column: js.UndefOr[this.type] = js.native
  
  var columnIndex: js.UndefOr[Double] = js.native
  
  var component: js.UndefOr[dxTreeList] = js.native
}
object ColumnColumnIndexComponent {
  
  @scala.inline
  def apply(): ColumnColumnIndexComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnColumnIndexComponent]
  }
  
  @scala.inline
  implicit class ColumnColumnIndexComponentMutableBuilder[Self <: ColumnColumnIndexComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ColumnColumnIndexComponent): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
