package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosDeviceFeaturesConfiguration extends DeviceConfiguration {
  // Asset tag information for the device, displayed on the login window and lock screen.
  var assetTagTemplate: js.UndefOr[String] = js.native
  // A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
  var homeScreenDockIcons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.native
  // A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
  var homeScreenPages: js.UndefOr[js.Array[IosHomeScreenPage]] = js.native
  // A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
  var lockScreenFootnote: js.UndefOr[String] = js.native
  /**
    * Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This
    * collection can contain a maximum of 500 elements.
    */
  var notificationSettings: js.UndefOr[js.Array[IosNotificationSettings]] = js.native
}

object IosDeviceFeaturesConfiguration {
  @scala.inline
  def apply(): IosDeviceFeaturesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceFeaturesConfiguration]
  }
  @scala.inline
  implicit class IosDeviceFeaturesConfigurationOps[Self <: IosDeviceFeaturesConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetTagTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetTagTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetTagTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetTagTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeScreenDockIcons(value: js.Array[IosHomeScreenItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeScreenDockIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeScreenDockIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeScreenDockIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeScreenPages(value: js.Array[IosHomeScreenPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeScreenPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeScreenPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeScreenPages")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenFootnote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenFootnote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenFootnote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenFootnote")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationSettings(value: js.Array[IosNotificationSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSettings")(js.undefined)
        ret
    }
  }
  
}

