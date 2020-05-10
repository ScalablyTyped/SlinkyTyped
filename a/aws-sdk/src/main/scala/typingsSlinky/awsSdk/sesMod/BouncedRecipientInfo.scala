package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BouncedRecipientInfo extends js.Object {
  /**
    * The reason for the bounce. You must provide either this parameter or RecipientDsnFields.
    */
  var BounceType: js.UndefOr[typingsSlinky.awsSdk.sesMod.BounceType] = js.native
  /**
    * The email address of the recipient of the bounced email.
    */
  var Recipient: Address = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to receive email for the recipient of the bounced email. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var RecipientArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a BounceType. You must provide either this parameter or BounceType.
    */
  var RecipientDsnFields: js.UndefOr[typingsSlinky.awsSdk.sesMod.RecipientDsnFields] = js.native
}

object BouncedRecipientInfo {
  @scala.inline
  def apply(Recipient: Address): BouncedRecipientInfo = {
    val __obj = js.Dynamic.literal(Recipient = Recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BouncedRecipientInfo]
  }
  @scala.inline
  implicit class BouncedRecipientInfoOps[Self <: BouncedRecipientInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipient(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounceType(value: BounceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceType")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientDsnFields(value: RecipientDsnFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientDsnFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientDsnFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientDsnFields")(js.undefined)
        ret
    }
  }
  
}

