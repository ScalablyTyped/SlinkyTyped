package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnShownEventUIParam extends StObject {
  
  /**
    * Gets the shown column index.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the shown column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ColumnShownEventUIParam {
  
  @scala.inline
  def apply(): ColumnShownEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnShownEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnShownEventUIParamMutableBuilder[Self <: ColumnShownEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
