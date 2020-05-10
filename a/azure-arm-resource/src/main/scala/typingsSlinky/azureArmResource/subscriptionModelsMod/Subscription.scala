package typingsSlinky.azureArmResource.subscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  /**
    * The authorization source of the request. Valid values are one or more combinations of Legacy,
    * RoleBased, Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
    */
  var authorizationSource: js.UndefOr[String] = js.native
  /**
    * The subscription display name.
    */
  val displayName: js.UndefOr[String] = js.native
  /**
    * The fully qualified ID for the subscription. For example,
    * /subscriptions/00000000-0000-0000-0000-000000000000.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The subscription state. Possible values are Enabled, Warned, PastDue, Disabled, and Deleted.
    * Possible values include: 'Enabled', 'Warned', 'PastDue', 'Disabled', 'Deleted'
    */
  val state: js.UndefOr[String] = js.native
  /**
    * The subscription ID.
    */
  val subscriptionId: js.UndefOr[String] = js.native
  /**
    * The subscription policies.
    */
  var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.native
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
    def withAuthorizationSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionPolicies(value: SubscriptionPolicies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionPolicies")(js.undefined)
        ret
    }
  }
  
}

