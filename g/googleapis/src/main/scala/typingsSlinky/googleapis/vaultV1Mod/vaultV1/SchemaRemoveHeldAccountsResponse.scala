package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for batch delete held accounts.
  */
@js.native
trait SchemaRemoveHeldAccountsResponse extends StObject {
  
  /**
    * A list of statuses for deleted accounts. Results have the same order as
    * the request.
    */
  var statuses: js.UndefOr[js.Array[SchemaStatus]] = js.native
}
object SchemaRemoveHeldAccountsResponse {
  
  @scala.inline
  def apply(): SchemaRemoveHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveHeldAccountsResponse]
  }
  
  @scala.inline
  implicit class SchemaRemoveHeldAccountsResponseMutableBuilder[Self <: SchemaRemoveHeldAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatuses(value: js.Array[SchemaStatus]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    @scala.inline
    def setStatusesVarargs(value: SchemaStatus*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
