package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection.AccountsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection.ContactsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection.LocationsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection.SettingsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection.SubscriptionsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection.TimelineCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Attachment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.AuthToken
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Command
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Location
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.MenuItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.MenuValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Notification
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.NotificationConfig
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.TimelineItem
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.UserAction
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mirror_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.native
  var Contacts: js.UndefOr[ContactsCollection] = js.native
  var Locations: js.UndefOr[LocationsCollection] = js.native
  var Settings: js.UndefOr[SettingsCollection] = js.native
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.native
  var Timeline: js.UndefOr[TimelineCollection] = js.native
  // Create a new instance of Account
  def newAccount(): Account = js.native
  // Create a new instance of Attachment
  def newAttachment(): Attachment = js.native
  // Create a new instance of AuthToken
  def newAuthToken(): AuthToken = js.native
  // Create a new instance of Command
  def newCommand(): Command = js.native
  // Create a new instance of Contact
  def newContact(): Contact = js.native
  // Create a new instance of Location
  def newLocation(): Location = js.native
  // Create a new instance of MenuItem
  def newMenuItem(): MenuItem = js.native
  // Create a new instance of MenuValue
  def newMenuValue(): MenuValue = js.native
  // Create a new instance of Notification
  def newNotification(): Notification = js.native
  // Create a new instance of NotificationConfig
  def newNotificationConfig(): NotificationConfig = js.native
  // Create a new instance of Subscription
  def newSubscription(): Subscription = js.native
  // Create a new instance of TimelineItem
  def newTimelineItem(): TimelineItem = js.native
  // Create a new instance of UserAction
  def newUserAction(): UserAction = js.native
  // Create a new instance of UserData
  def newUserData(): UserData = js.native
}

object Mirror_ {
  @scala.inline
  def apply(
    newAccount: () => Account,
    newAttachment: () => Attachment,
    newAuthToken: () => AuthToken,
    newCommand: () => Command,
    newContact: () => Contact,
    newLocation: () => Location,
    newMenuItem: () => MenuItem,
    newMenuValue: () => MenuValue,
    newNotification: () => Notification,
    newNotificationConfig: () => NotificationConfig,
    newSubscription: () => Subscription,
    newTimelineItem: () => TimelineItem,
    newUserAction: () => UserAction,
    newUserData: () => UserData
  ): Mirror_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAttachment = js.Any.fromFunction0(newAttachment), newAuthToken = js.Any.fromFunction0(newAuthToken), newCommand = js.Any.fromFunction0(newCommand), newContact = js.Any.fromFunction0(newContact), newLocation = js.Any.fromFunction0(newLocation), newMenuItem = js.Any.fromFunction0(newMenuItem), newMenuValue = js.Any.fromFunction0(newMenuValue), newNotification = js.Any.fromFunction0(newNotification), newNotificationConfig = js.Any.fromFunction0(newNotificationConfig), newSubscription = js.Any.fromFunction0(newSubscription), newTimelineItem = js.Any.fromFunction0(newTimelineItem), newUserAction = js.Any.fromFunction0(newUserAction), newUserData = js.Any.fromFunction0(newUserData))
    __obj.asInstanceOf[Mirror_]
  }
  @scala.inline
  implicit class Mirror_Ops[Self <: Mirror_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAccount(value: () => Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAttachment(value: () => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAttachment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAuthToken(value: () => AuthToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAuthToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCommand(value: () => Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCommand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewContact(value: () => Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newContact")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLocation(value: () => Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMenuItem(value: () => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMenuItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMenuValue(value: () => MenuValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMenuValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNotification(value: () => Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNotification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNotificationConfig(value: () => NotificationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNotificationConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubscription(value: () => Subscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubscription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTimelineItem(value: () => TimelineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTimelineItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserAction(value: () => UserAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserData(value: () => UserData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAccounts(value: AccountsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withContacts(value: ContactsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contacts")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: LocationsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locations")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: SettingsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(js.undefined)
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
    @scala.inline
    def withTimeline(value: TimelineCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(js.undefined)
        ret
    }
  }
  
}

