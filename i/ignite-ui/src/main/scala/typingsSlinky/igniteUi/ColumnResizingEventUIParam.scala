package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnResizingEventUIParam extends StObject {
  
  /**
    * Gets the resized column index.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the resized column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets the desired width(before min/max coercion) for the resized column.
    */
  var desiredWidth: js.UndefOr[Double] = js.native
  
  /**
    * Gets a reference to the GridResizing widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ColumnResizingEventUIParam {
  
  @scala.inline
  def apply(): ColumnResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnResizingEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnResizingEventUIParamMutableBuilder[Self <: ColumnResizingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setDesiredWidth(value: Double): Self = StObject.set(x, "desiredWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredWidthUndefined: Self = StObject.set(x, "desiredWidth", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
