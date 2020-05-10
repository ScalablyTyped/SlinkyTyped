package typingsSlinky.jupyterlabExtensionmanager.modelMod

import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.deprecated
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.error
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.ok
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInstalledEntry extends js.Object {
  /**
    * A short description of the extension.
    */
  var description: String = js.native
  /**
    * Whether the extension is currently enabled.
    */
  var enabled: Boolean = js.native
  /**
    * Whether the extension is currently installed.
    */
  var installed: js.UndefOr[Boolean] = js.native
  /**
    * The installed version of the extension.
    */
  var installed_version: String = js.native
  /**
    * The latest version of the extension.
    */
  var latest_version: String = js.native
  /**
    * The name of the extension.
    */
  var name: String = js.native
  /**
    * A flag indicating the status of an installed extension.
    */
  var status: ok | warning | error | deprecated | Null = js.native
  /**
    * A representative link of the package.
    */
  var url: String = js.native
}

object IInstalledEntry {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    installed_version: String,
    latest_version: String,
    name: String,
    url: String
  ): IInstalledEntry = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], installed_version = installed_version.asInstanceOf[js.Any], latest_version = latest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstalledEntry]
  }
  @scala.inline
  implicit class IInstalledEntryOps[Self <: IInstalledEntry] (val x: Self) extends AnyVal {
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
    def withInstalled_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installed")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ok | warning | error | deprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(null)
        ret
    }
  }
  
}

