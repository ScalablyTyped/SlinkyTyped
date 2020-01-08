package typingsSlinky.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopContactRequest extends js.Object {
  /**
    * The ID of the contact.
    */
  var ContactId: typingsSlinky.awsDashSdk.clientsConnectMod.ContactId = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsDashSdk.clientsConnectMod.InstanceId = js.native
}

object StopContactRequest {
  @scala.inline
  def apply(ContactId: ContactId, InstanceId: InstanceId): StopContactRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopContactRequest]
  }
}

