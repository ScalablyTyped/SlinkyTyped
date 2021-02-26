package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateConnectionAliasRequest extends StObject {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: ConnectionAliasId = js.native
  
  /**
    * The identifier of the directory to associate the connection alias with.
    */
  var ResourceId: NonEmptyString = js.native
}
object AssociateConnectionAliasRequest {
  
  @scala.inline
  def apply(AliasId: ConnectionAliasId, ResourceId: NonEmptyString): AssociateConnectionAliasRequest = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateConnectionAliasRequest]
  }
  
  @scala.inline
  implicit class AssociateConnectionAliasRequestMutableBuilder[Self <: AssociateConnectionAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
