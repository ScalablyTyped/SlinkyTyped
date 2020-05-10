package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityNotificationAttributesRequest extends js.Object {
  /**
    * A list of one or more identities. You can specify an identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com.
    */
  var Identities: IdentityList = js.native
}

object GetIdentityNotificationAttributesRequest {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityNotificationAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityNotificationAttributesRequest]
  }
  @scala.inline
  implicit class GetIdentityNotificationAttributesRequestOps[Self <: GetIdentityNotificationAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentities(value: IdentityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

