package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationPolicy extends js.Object {
  /**
    * The default policy for all permissions requested by the app. If specified, this overrides the policy-level default_permission_policy which applies to
    * all apps.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  /** The type of installation to perform. */
  var installType: js.UndefOr[String] = js.native
  /** Whether the application is allowed to lock itself in full-screen mode. */
  var lockTaskAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Managed configuration applied to the app. The format for the configuration is dictated by the ManagedProperty values supported by the app. Each field
    * name in the managed configuration must match the key field of the ManagedProperty. The field value must be compatible with the type of the
    * ManagedProperty: <table> <tr><td><i>type</i></td><td><i>JSON value</i></td></tr> <tr><td>BOOL</td><td>true or false</td></tr>
    * <tr><td>STRING</td><td>string</td></tr> <tr><td>INTEGER</td><td>number</td></tr> <tr><td>CHOICE</td><td>string</td></tr>
    * <tr><td>MULTISELECT</td><td>array of strings</td></tr> <tr><td>HIDDEN</td><td>string</td></tr> <tr><td>BUNDLE_ARRAY</td><td>array of objects</td></tr>
    * </table>
    */
  var managedConfiguration: js.UndefOr[Record[String, _]] = js.native
  /** The package name of the app, e.g. com.google.android.youtube for the YouTube app. */
  var packageName: js.UndefOr[String] = js.native
  /** Explicit permission grants or denials for the app. These values override the default_permission_policy. */
  var permissionGrants: js.UndefOr[js.Array[PermissionGrant]] = js.native
}

object ApplicationPolicy {
  @scala.inline
  def apply(): ApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationPolicy]
  }
  @scala.inline
  implicit class ApplicationPolicyOps[Self <: ApplicationPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPermissionPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPermissionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPermissionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPermissionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installType")(js.undefined)
        ret
    }
    @scala.inline
    def withLockTaskAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockTaskAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockTaskAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockTaskAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedConfiguration(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionGrants(value: js.Array[PermissionGrant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionGrants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionGrants")(js.undefined)
        ret
    }
  }
  
}

