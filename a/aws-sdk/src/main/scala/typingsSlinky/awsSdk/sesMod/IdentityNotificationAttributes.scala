package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityNotificationAttributes extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish bounce notifications.
    */
  var BounceTopic: NotificationTopic = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish complaint notifications.
    */
  var ComplaintTopic: NotificationTopic = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish delivery notifications.
    */
  var DeliveryTopic: NotificationTopic = js.native
  /**
    * Describes whether Amazon SES will forward bounce and complaint notifications as email. true indicates that Amazon SES will forward bounce and complaint notifications as email, while false indicates that bounce and complaint notifications will be published only to the specified bounce and complaint Amazon SNS topics.
    */
  var ForwardingEnabled: Enabled = js.native
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Bounce. A value of true specifies that Amazon SES will include headers in bounce notifications, and a value of false specifies that Amazon SES will not include headers in bounce notifications.
    */
  var HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.native
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Complaint. A value of true specifies that Amazon SES will include headers in complaint notifications, and a value of false specifies that Amazon SES will not include headers in complaint notifications.
    */
  var HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.native
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Delivery. A value of true specifies that Amazon SES will include headers in delivery notifications, and a value of false specifies that Amazon SES will not include headers in delivery notifications.
    */
  var HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.native
}

object IdentityNotificationAttributes {
  @scala.inline
  def apply(
    BounceTopic: NotificationTopic,
    ComplaintTopic: NotificationTopic,
    DeliveryTopic: NotificationTopic,
    ForwardingEnabled: Enabled
  ): IdentityNotificationAttributes = {
    val __obj = js.Dynamic.literal(BounceTopic = BounceTopic.asInstanceOf[js.Any], ComplaintTopic = ComplaintTopic.asInstanceOf[js.Any], DeliveryTopic = DeliveryTopic.asInstanceOf[js.Any], ForwardingEnabled = ForwardingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationAttributes]
  }
  @scala.inline
  implicit class IdentityNotificationAttributesOps[Self <: IdentityNotificationAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounceTopic(value: NotificationTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplaintTopic(value: NotificationTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplaintTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryTopic(value: NotificationTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardingEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadersInBounceNotificationsEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadersInBounceNotificationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadersInBounceNotificationsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadersInBounceNotificationsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersInComplaintNotificationsEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadersInComplaintNotificationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadersInComplaintNotificationsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadersInComplaintNotificationsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersInDeliveryNotificationsEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadersInDeliveryNotificationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadersInDeliveryNotificationsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadersInDeliveryNotificationsEnabled")(js.undefined)
        ret
    }
  }
  
}

