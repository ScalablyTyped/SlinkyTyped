package typingsSlinky.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserRequest extends js.Object {
  /**
    * The organization that contains the user to be deleted.
    */
  var OrganizationId: typingsSlinky.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
  /**
    * The identifier of the user to be deleted.
    */
  var UserId: WorkMailIdentifier = js.native
}

object DeleteUserRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

