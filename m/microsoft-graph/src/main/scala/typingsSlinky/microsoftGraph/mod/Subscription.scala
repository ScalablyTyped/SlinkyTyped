package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends Entity {
  // Identifier of the application used to create the subscription. Read-only.
  var applicationId: js.UndefOr[String] = js.native
  /**
    * Required. Indicates the type of change in the subscribed resource that will raise a notification. The supported values
    * are: created, updated, deleted. Multiple values can be combined using a comma-separated list.Note: Drive root item
    * notifications support only the updated changeType. User and group notifications support updated and deleted changeType.
    */
  var changeType: js.UndefOr[String] = js.native
  /**
    * Optional. Specifies the value of the clientState property sent by the service in each notification. The maximum length
    * is 128 characters. The client can check that the notification came from the service by comparing the value of the
    * clientState property sent with the subscription with the value of the clientState property received with each
    * notification.
    */
  var clientState: js.UndefOr[String] = js.native
  /**
    * Identifier of the user or service principal that created the subscription. If the app used delegated permissions to
    * create the subscription, this field contains the id of the signed-in user the app called on behalf of. If the app used
    * application permissions, this field contains the id of the service principal corresponding to the app. Read-only.
    */
  var creatorId: js.UndefOr[String] = js.native
  /**
    * Required. Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount
    * of time from subscription creation that varies for the resource subscribed to. See the table below for maximum
    * supported subscription length of time.
    */
  var expirationDateTime: js.UndefOr[String] = js.native
  // Required. The URL of the endpoint that will receive the notifications. This URL must make use of the HTTPS protocol.
  var notificationUrl: js.UndefOr[String] = js.native
  /**
    * Required. Specifies the resource that will be monitored for changes. Do not include the base URL
    * (https://graph.microsoft.com/v1.0/).
    */
  var resource: js.UndefOr[String] = js.native
}

object Subscription {
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(js.undefined)
        ret
    }
    @scala.inline
    def withClientState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientState")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorId")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

