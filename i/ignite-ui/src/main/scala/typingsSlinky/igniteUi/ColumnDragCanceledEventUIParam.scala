package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDragCanceledEventUIParam extends StObject {
  
  /**
    * Gets the column index of the column that was being dragged.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the column key of the column that was being dragged.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the orginal th being dragged.
    */
  var header: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to cloned DOM element that was actually being dragged.
    */
  var helper: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[String] = js.native
}
object ColumnDragCanceledEventUIParam {
  
  @scala.inline
  def apply(): ColumnDragCanceledEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDragCanceledEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnDragCanceledEventUIParamMutableBuilder[Self <: ColumnDragCanceledEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
