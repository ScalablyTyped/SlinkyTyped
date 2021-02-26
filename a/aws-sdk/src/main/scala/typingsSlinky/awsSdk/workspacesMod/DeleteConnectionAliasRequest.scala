package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConnectionAliasRequest extends StObject {
  
  /**
    * The identifier of the connection alias to delete.
    */
  var AliasId: ConnectionAliasId = js.native
}
object DeleteConnectionAliasRequest {
  
  @scala.inline
  def apply(AliasId: ConnectionAliasId): DeleteConnectionAliasRequest = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionAliasRequest]
  }
  
  @scala.inline
  implicit class DeleteConnectionAliasRequestMutableBuilder[Self <: DeleteConnectionAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
