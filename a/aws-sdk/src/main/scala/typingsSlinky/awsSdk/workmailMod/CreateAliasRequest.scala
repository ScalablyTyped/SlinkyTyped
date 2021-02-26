package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAliasRequest extends StObject {
  
  /**
    * The alias to add to the member set.
    */
  var Alias: EmailAddress = js.native
  
  /**
    * The member (user or group) to which this alias is added.
    */
  var EntityId: WorkMailIdentifier = js.native
  
  /**
    * The organization under which the member (user or group) exists.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
}
object CreateAliasRequest {
  
  @scala.inline
  def apply(Alias: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasRequest]
  }
  
  @scala.inline
  implicit class CreateAliasRequestMutableBuilder[Self <: CreateAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: EmailAddress): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
