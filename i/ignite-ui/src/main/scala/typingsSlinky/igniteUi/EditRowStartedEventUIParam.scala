package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditRowStartedEventUIParam extends StObject {
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Checks if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.native
}
object EditRowStartedEventUIParam {
  
  @scala.inline
  def apply(): EditRowStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowStartedEventUIParam]
  }
  
  @scala.inline
  implicit class EditRowStartedEventUIParamMutableBuilder[Self <: EditRowStartedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRowAdding(value: Boolean): Self = StObject.set(x, "rowAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowAddingUndefined: Self = StObject.set(x, "rowAdding", js.undefined)
    
    @scala.inline
    def setRowID(value: js.Any): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
  }
}
