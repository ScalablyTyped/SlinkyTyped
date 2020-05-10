package typingsSlinky.firefoxWebextBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an installed extension. */
@js.native
trait ExtensionInfo extends js.Object {
  /** The description of this extension. */
  var description: String = js.native
  /** A reason the item is disabled. */
  var disabledReason: js.UndefOr[ExtensionDisabledReason] = js.native
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean = js.native
  /** The URL of the homepage of this extension. */
  var homepageUrl: js.UndefOr[String] = js.native
  /** Returns a list of host based permissions. */
  var hostPermissions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual
    * image at that url may be larger or smaller than what was declared, so you might consider using explicit
    * width and height attributes on img tags referencing these images. See the manifest documentation on icons
    * for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.native
  /** The extension's unique identifier. */
  var id: String = js.native
  /** How the extension was installed. */
  var installType: ExtensionInstallType = js.native
  /** Whether this extension can be disabled or uninstalled by the user. */
  var mayDisable: Boolean = js.native
  /** The name of this extension. */
  var name: String = js.native
  /** The url for the item's options page, if it has one. */
  var optionsUrl: String = js.native
  /** Returns a list of API based permissions. */
  var permissions: js.UndefOr[js.Array[String]] = js.native
  /** A short version of the name of this extension. */
  var shortName: js.UndefOr[String] = js.native
  /** The type of this extension, 'extension' or 'theme'. */
  var `type`: ExtensionType = js.native
  /** The update URL of this extension. */
  var updateUrl: js.UndefOr[String] = js.native
  /** The version of this extension. */
  var version: String = js.native
  /** The version name of this extension if the manifest specified one. */
  var versionName: js.UndefOr[String] = js.native
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    id: String,
    installType: ExtensionInstallType,
    mayDisable: Boolean,
    name: String,
    optionsUrl: String,
    `type`: ExtensionType,
    version: String
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsUrl = optionsUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallType(value: ExtensionInstallType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installType")(value.asInstanceOf[js.Any])
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
    def withOptionsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExtensionType): Self = {
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
    def withDisabledReason(value: ExtensionDisabledReason): Self = {
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
    def withHostPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: js.Array[IconInfo]): Self = {
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
    def withPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(js.undefined)
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
    @scala.inline
    def withVersionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionName")(js.undefined)
        ret
    }
  }
  
}

