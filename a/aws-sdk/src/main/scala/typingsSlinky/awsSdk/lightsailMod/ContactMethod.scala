package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactMethod extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the contact method.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination of the contact method, such as an email address or a mobile phone number.
    */
  var contactEndpoint: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp when the contact method was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the contact method.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The protocol of the contact method, such as email or SMS (text messaging).
    */
  var protocol: js.UndefOr[ContactProtocol] = js.native
  /**
    * The Lightsail resource type (e.g., ContactMethod).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The current status of the contact method. A contact method has the following possible status:    PendingVerification — The contact method has not yet been verified, and the verification has not yet expired.    Valid — The contact method has been verified.    InValid — An attempt was made to verify the contact method, but the verification has expired.  
    */
  var status: js.UndefOr[ContactMethodStatus] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail contact method. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
}

object ContactMethod {
  @scala.inline
  def apply(): ContactMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactMethod]
  }
  @scala.inline
  implicit class ContactMethodOps[Self <: ContactMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withContactEndpoint(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: ResourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: ContactProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ContactMethodStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(js.undefined)
        ret
    }
  }
  
}

