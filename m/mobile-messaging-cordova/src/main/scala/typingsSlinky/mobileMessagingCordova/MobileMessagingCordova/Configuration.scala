package typingsSlinky.mobileMessagingCordova.MobileMessagingCordova

import typingsSlinky.mobileMessagingCordova.AnonActions
import typingsSlinky.mobileMessagingCordova.AnonApplicationCodePersistingDisabled
import typingsSlinky.mobileMessagingCordova.AnonForceCleanup
import typingsSlinky.mobileMessagingCordova.AnonMultipleNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var android: js.UndefOr[AnonMultipleNotifications] = js.native
  /**
    * The application code of your Application from Push Portal website
    */
  var applicationCode: String = js.native
  var defaultMessageStorage: js.UndefOr[Boolean] = js.native
  var geofencingEnabled: js.UndefOr[Boolean] = js.native
  var ios: js.UndefOr[AnonForceCleanup] = js.native
  /**
    * Message storage save callback
    */
  var messageStorage: js.UndefOr[String] = js.native
  var notificationCategories: js.UndefOr[js.Array[AnonActions]] = js.native
  var privacySettings: js.UndefOr[AnonApplicationCodePersistingDisabled] = js.native
}

object Configuration {
  @scala.inline
  def apply(applicationCode: String): Configuration = {
    val __obj = js.Dynamic.literal(applicationCode = applicationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroid(value: AnonMultipleNotifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMessageStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMessageStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMessageStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMessageStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withGeofencingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geofencingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeofencingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geofencingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIos(value: AnonForceCleanup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationCategories(value: js.Array[AnonActions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacySettings(value: AnonApplicationCodePersistingDisabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacySettings")(js.undefined)
        ret
    }
  }
  
}

