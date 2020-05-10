package typingsSlinky.officeJs.Office

import typingsSlinky.officeJs.Office.MailboxEnums.ItemNotificationMessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of `NotificationMessageDetails` objects are returned by the `NotificationMessages.getAllAsync` method.
  *
  * [Api set: Mailbox 1.3]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait NotificationMessageDetails extends js.Object {
  /**
    * A reference to an icon that is defined in the manifest in the `Resources` section. It appears in the infobar area.
    * It is only applicable if the type is `InformationalMessage`. Specifying this parameter for an unsupported type results in an exception.
    * 
    * **Note**: At present, the custom icon is displayed in Outlook on Windows only and not on other clients (e.g., Mac, web browser).
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * The identifier for the notification message.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The text of the notification message. Maximum length is 150 characters.
    * If the developer passes in a longer string, an `ArgumentOutOfRange` exception is thrown.
    */
  var message: String = js.native
  /**
    * Only applicable when type is `InformationalMessage`. If true, the message remains until removed by this add-in or dismissed by the user.
    * If false, it is removed when the user navigates to a different item.
    * For error notifications, the message persists until the user sees it once.
    * Specifying this parameter for an unsupported type throws an exception.
    */
  var persistent: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the `ItemNotificationMessageType` of message. If type is `ProgressIndicator` or `ErrorMessage`, an icon is automatically supplied
    * and the message is not persistent. Therefore the icon and persistent properties are not valid for these types of messages.
    * Including them will result in an `ArgumentException`.
    * If type is `ProgressIndicator`, the developer should remove or replace the progress indicator when the action is complete.
    */
  var `type`: ItemNotificationMessageType | String = js.native
}

object NotificationMessageDetails {
  @scala.inline
  def apply(message: String, `type`: ItemNotificationMessageType | String): NotificationMessageDetails = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessageDetails]
  }
  @scala.inline
  implicit class NotificationMessageDetailsOps[Self <: NotificationMessageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ItemNotificationMessageType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
  }
  
}

