package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnHidingRefusedEventUIParam extends StObject {
  
  /**
    * Array of column keys. Has a value only if the column's key is a string.
    */
  var columnKeys: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ColumnHidingRefusedEventUIParam {
  
  @scala.inline
  def apply(): ColumnHidingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHidingRefusedEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnHidingRefusedEventUIParamMutableBuilder[Self <: ColumnHidingRefusedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKeys(value: js.Array[_]): Self = StObject.set(x, "columnKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeysUndefined: Self = StObject.set(x, "columnKeys", js.undefined)
    
    @scala.inline
    def setColumnKeysVarargs(value: js.Any*): Self = StObject.set(x, "columnKeys", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
