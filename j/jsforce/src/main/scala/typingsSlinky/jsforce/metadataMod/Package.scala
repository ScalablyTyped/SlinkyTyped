package typingsSlinky.jsforce.metadataMod

import typingsSlinky.jsforce.jsforceStrings.Restricted
import typingsSlinky.jsforce.jsforceStrings.Unrestricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Package extends js.Object {
  var apiAccessLevel: js.UndefOr[Unrestricted | Restricted] = js.native
  var description: js.UndefOr[String] = js.native
  var fullName: js.UndefOr[String] = js.native
  var namespacePrefix: js.UndefOr[String] = js.native
  var objectPermissions: js.UndefOr[js.Array[ProfileObjectPermissions]] = js.native
  var postInstallClass: js.UndefOr[String] = js.native
  var setupWeblink: js.UndefOr[String] = js.native
  var types: js.Array[PackageTypeMembers] = js.native
  var uninstallClass: js.UndefOr[String] = js.native
  var version: String = js.native
}

object Package {
  @scala.inline
  def apply(types: js.Array[PackageTypeMembers], version: String): Package = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: js.Array[PackageTypeMembers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiAccessLevel(value: Unrestricted | Restricted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiAccessLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiAccessLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiAccessLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespacePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespacePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectPermissions(value: js.Array[ProfileObjectPermissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPostInstallClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postInstallClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostInstallClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postInstallClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupWeblink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupWeblink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupWeblink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupWeblink")(js.undefined)
        ret
    }
    @scala.inline
    def withUninstallClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninstallClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallClass")(js.undefined)
        ret
    }
  }
  
}

