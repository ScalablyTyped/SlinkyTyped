package typingsSlinky.phonegapPluginPush

import typingsSlinky.phonegapPluginPush.PhonegapPluginPush.CategoryArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlert extends js.Object {
  /**
  			 * If true|"true" the device shows an alert on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var alert: js.UndefOr[Boolean | String] = js.native
  /**
  			 * If true|"true" the device sets the badge number on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var badge: js.UndefOr[Boolean | String] = js.native
  /**
  			 * The data required in order to enable Action Buttons for iOS.
  			 * Action Buttons on iOS - https://github.com/phonegap/phonegap-plugin-push/blob/master/docs/PAYLOAD.md#action-buttons-1
  			 */
  var categories: js.UndefOr[CategoryArray] = js.native
  /**
  			 * If true|"true" the badge will be cleared on app startup. Defaults to false|"false".
  			 */
  var clearBadge: js.UndefOr[Boolean | String] = js.native
  /**
  			 * Whether to use prod or sandbox GCM setting. Defaults to false.
  			 */
  var fcmSandbox: js.UndefOr[Boolean] = js.native
  /**
  			 * If true|"true" the device plays a sound on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var sound: js.UndefOr[Boolean | String] = js.native
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a FcmPubSub topic. Defaults to [].
  			 */
  var topics: js.UndefOr[js.Array[String]] = js.native
  /**
  			 * If true|"true" the device will be set up to receive VoIP Push notifications and the other options will be ignored
  			 * since VoIP notifications are silent notifications that should be handled in the "notification" event.
  			 * Default is false|"false".
  			 */
  var voip: js.UndefOr[Boolean | String] = js.native
}

object AnonAlert {
  @scala.inline
  def apply(): AnonAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAlert]
  }
  @scala.inline
  implicit class AnonAlertOps[Self <: AnonAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: CategoryArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withClearBadge(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBadge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBadge")(js.undefined)
        ret
    }
    @scala.inline
    def withFcmSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcmSandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFcmSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcmSandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
    @scala.inline
    def withTopics(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(js.undefined)
        ret
    }
    @scala.inline
    def withVoip(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voip")(js.undefined)
        ret
    }
  }
  
}

