package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.CustomersCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.ResellernotifyCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.SubscriptionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Address
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.ChangePlanRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Customer
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.RenewalSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Seats
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Subscription
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlan
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlanCommitmentInterval
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTransferInfo
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTrialSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminReseller_ extends js.Object {
  var Customers: js.UndefOr[CustomersCollection] = js.native
  var Resellernotify: js.UndefOr[ResellernotifyCollection] = js.native
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.native
  // Create a new instance of Address
  def newAddress(): Address = js.native
  // Create a new instance of ChangePlanRequest
  def newChangePlanRequest(): ChangePlanRequest = js.native
  // Create a new instance of Customer
  def newCustomer(): Customer = js.native
  // Create a new instance of RenewalSettings
  def newRenewalSettings(): RenewalSettings = js.native
  // Create a new instance of Seats
  def newSeats(): Seats = js.native
  // Create a new instance of Subscription
  def newSubscription(): Subscription = js.native
  // Create a new instance of SubscriptionPlan
  def newSubscriptionPlan(): SubscriptionPlan = js.native
  // Create a new instance of SubscriptionPlanCommitmentInterval
  def newSubscriptionPlanCommitmentInterval(): SubscriptionPlanCommitmentInterval = js.native
  // Create a new instance of SubscriptionTransferInfo
  def newSubscriptionTransferInfo(): SubscriptionTransferInfo = js.native
  // Create a new instance of SubscriptionTrialSettings
  def newSubscriptionTrialSettings(): SubscriptionTrialSettings = js.native
}

object AdminReseller_ {
  @scala.inline
  def apply(
    newAddress: () => Address,
    newChangePlanRequest: () => ChangePlanRequest,
    newCustomer: () => Customer,
    newRenewalSettings: () => RenewalSettings,
    newSeats: () => Seats,
    newSubscription: () => Subscription,
    newSubscriptionPlan: () => SubscriptionPlan,
    newSubscriptionPlanCommitmentInterval: () => SubscriptionPlanCommitmentInterval,
    newSubscriptionTransferInfo: () => SubscriptionTransferInfo,
    newSubscriptionTrialSettings: () => SubscriptionTrialSettings
  ): AdminReseller_ = {
    val __obj = js.Dynamic.literal(newAddress = js.Any.fromFunction0(newAddress), newChangePlanRequest = js.Any.fromFunction0(newChangePlanRequest), newCustomer = js.Any.fromFunction0(newCustomer), newRenewalSettings = js.Any.fromFunction0(newRenewalSettings), newSeats = js.Any.fromFunction0(newSeats), newSubscription = js.Any.fromFunction0(newSubscription), newSubscriptionPlan = js.Any.fromFunction0(newSubscriptionPlan), newSubscriptionPlanCommitmentInterval = js.Any.fromFunction0(newSubscriptionPlanCommitmentInterval), newSubscriptionTransferInfo = js.Any.fromFunction0(newSubscriptionTransferInfo), newSubscriptionTrialSettings = js.Any.fromFunction0(newSubscriptionTrialSettings))
    __obj.asInstanceOf[AdminReseller_]
  }
  @scala.inline
  implicit class AdminReseller_Ops[Self <: AdminReseller_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAddress(value: () => Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChangePlanRequest(value: () => ChangePlanRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChangePlanRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomer(value: () => Customer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRenewalSettings(value: () => RenewalSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRenewalSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSeats(value: () => Seats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSeats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscription(value: () => Subscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscriptionPlan(value: () => SubscriptionPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscriptionPlan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscriptionPlanCommitmentInterval(value: () => SubscriptionPlanCommitmentInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscriptionPlanCommitmentInterval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscriptionTransferInfo(value: () => SubscriptionTransferInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscriptionTransferInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscriptionTrialSettings(value: () => SubscriptionTrialSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscriptionTrialSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCustomers(value: CustomersCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Customers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Customers")(js.undefined)
        ret
    }
    @scala.inline
    def withResellernotify(value: ResellernotifyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resellernotify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResellernotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resellernotify")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions(value: SubscriptionsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriptions")(js.undefined)
        ret
    }
  }
  
}

