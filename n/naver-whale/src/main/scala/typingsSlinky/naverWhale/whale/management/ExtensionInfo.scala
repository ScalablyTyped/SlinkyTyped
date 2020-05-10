package typingsSlinky.naverWhale.whale.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionInfo extends js.Object {
  /** Optional. The launch url (only present for apps). */
  var appLaunchUrl: js.UndefOr[String] = js.native
  /**
    * Optional.
    * The currently available launch types (only present for apps).
    * @since Chrome 37.
    */
  var availableLaunchTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The description of this extension, app, or theme.
    * @since Chrome 9.
    */
  var description: String = js.native
  /**
    * Optional.
    * A reason the item is disabled.
    * @since Chrome 17.
    */
  var disabledReason: js.UndefOr[String] = js.native
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean = js.native
  /**
    * Optional.
    * The URL of the homepage of this extension, app, or theme.
    * @since Chrome 11.
    */
  var homepageUrl: js.UndefOr[String] = js.native
  /**
    * Returns a list of host based permissions.
    * @since Chrome 9.
    */
  var hostPermissions: js.Array[String] = js.native
  /**
    * Optional.
    * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual image at that url may be larger or smaller than what was declared, so you might consider using explicit width and height attributes on img tags referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[typingsSlinky.chrome.chrome.management.IconInfo]] = js.native
  /** The extension's unique identifier. */
  var id: String = js.native
  /**
    * How the extension was installed.
    * @since Chrome 22.
    */
  var installType: String = js.native
  /**
    * True if this is an app.
    * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
    */
  var isApp: Boolean = js.native
  /**
    * Optional.
    * The app launch type (only present for apps).
    * @since Chrome 37.
    */
  var launchType: js.UndefOr[String] = js.native
  /**
    * Whether this extension can be disabled or uninstalled by the user.
    * @since Chrome 12.
    */
  var mayDisable: Boolean = js.native
  /** The name of this extension, app, or theme. */
  var name: String = js.native
  /**
    * Whether the extension, app, or theme declares that it supports offline.
    * @since Chrome 15.
    */
  var offlineEnabled: Boolean = js.native
  /** The url for the item's options page, if it has one. */
  var optionsUrl: String = js.native
  /**
    * Returns a list of API based permissions.
    * @since Chrome 9.
    */
  var permissions: js.Array[String] = js.native
  /**
    * A short version of the name of this extension, app, or theme.
    * @since Chrome 31.
    */
  var shortName: String = js.native
  /**
    * The type of this extension, app, or theme.
    * @since Chrome 23.
    */
  var `type`: String = js.native
  /**
    * Optional.
    * The update URL of this extension, app, or theme.
    * @since Chrome 16.
    */
  var updateUrl: js.UndefOr[String] = js.native
  /** The version of this extension, app, or theme. */
  var version: String = js.native
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    hostPermissions: js.Array[String],
    id: String,
    installType: String,
    isApp: Boolean,
    mayDisable: Boolean,
    name: String,
    offlineEnabled: Boolean,
    optionsUrl: String,
    permissions: js.Array[String],
    shortName: String,
    `type`: String,
    version: String
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hostPermissions = hostPermissions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], isApp = isApp.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offlineEnabled = offlineEnabled.asInstanceOf[js.Any], optionsUrl = optionsUrl.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  @scala.inline
  implicit class ExtensionInfoOps[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMayDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfflineEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppLaunchUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLaunchUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppLaunchUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLaunchUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableLaunchTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableLaunchTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableLaunchTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableLaunchTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledReason")(js.undefined)
        ret
    }
    @scala.inline
    def withHomepageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomepageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: js.Array[typingsSlinky.chrome.chrome.management.IconInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchType")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(js.undefined)
        ret
    }
  }
  
}

