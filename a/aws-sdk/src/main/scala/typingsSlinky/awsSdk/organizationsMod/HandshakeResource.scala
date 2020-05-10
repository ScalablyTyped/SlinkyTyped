package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandshakeResource extends js.Object {
  /**
    * When needed, contains an additional array of HandshakeResource objects.
    */
  var Resources: js.UndefOr[HandshakeResources] = js.native
  /**
    * The type of information being passed, specifying how the value is to be interpreted by the other party:    ACCOUNT - Specifies an AWS account ID number.    ORGANIZATION - Specifies an organization ID number.    EMAIL - Specifies the email address that is associated with the account that receives the handshake.     OWNER_EMAIL - Specifies the email address associated with the master account. Included as information about an organization.     OWNER_NAME - Specifies the name associated with the master account. Included as information about an organization.     NOTES - Additional text provided by the handshake initiator and intended for the recipient to read.  
    */
  var Type: js.UndefOr[HandshakeResourceType] = js.native
  /**
    * The information that is passed to the other party in the handshake. The format of the value string must match the requirements of the specified type.
    */
  var Value: js.UndefOr[HandshakeResourceValue] = js.native
}

object HandshakeResource {
  @scala.inline
  def apply(): HandshakeResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandshakeResource]
  }
  @scala.inline
  implicit class HandshakeResourceOps[Self <: HandshakeResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResources(value: HandshakeResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: HandshakeResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: HandshakeResourceValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

