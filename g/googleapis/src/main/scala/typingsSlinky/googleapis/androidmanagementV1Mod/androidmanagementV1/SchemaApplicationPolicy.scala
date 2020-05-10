package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policy for an individual app.
  */
@js.native
trait SchemaApplicationPolicy extends js.Object {
  /**
    * The default policy for all permissions requested by the app. If
    * specified, this overrides the policy-level default_permission_policy
    * which applies to all apps. It does not override the permission_grants
    * which applies to all apps.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  /**
    * The scopes delegated to the app from Android Device Policy.
    */
  var delegatedScopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the app is disabled. When disabled, the app data is still
    * preserved.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The type of installation to perform.
    */
  var installType: js.UndefOr[String] = js.native
  /**
    * Whether the app is allowed to lock itself in full-screen mode.
    */
  var lockTaskAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Managed configuration applied to the app. The format for the
    * configuration is dictated by the ManagedProperty values supported by the
    * app. Each field name in the managed configuration must match the key
    * field of the ManagedProperty. The field value must be compatible with the
    * type of the ManagedProperty: &lt;table&gt;
    * &lt;tr&gt;&lt;td&gt;&lt;i&gt;type&lt;/i&gt;&lt;/td&gt;&lt;td&gt;&lt;i&gt;JSON
    * value&lt;/i&gt;&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;BOOL&lt;/td&gt;&lt;td&gt;true or
    * false&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;STRING&lt;/td&gt;&lt;td&gt;string&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;INTEGER&lt;/td&gt;&lt;td&gt;number&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;CHOICE&lt;/td&gt;&lt;td&gt;string&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;MULTISELECT&lt;/td&gt;&lt;td&gt;array of
    * strings&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;HIDDEN&lt;/td&gt;&lt;td&gt;string&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;BUNDLE_ARRAY&lt;/td&gt;&lt;td&gt;array of
    * objects&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt;
    */
  var managedConfiguration: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The managed configurations template for the app, saved from the managed
    * configurations iframe. This field is ignored if managed_configuration is
    * set.
    */
  var managedConfigurationTemplate: js.UndefOr[SchemaManagedConfigurationTemplate] = js.native
  /**
    * The minimum version of the app that runs on the device. If set, the
    * device attempts to update the app to at least this version code. If the
    * app is not up-to-date, the device will contain a NonComplianceDetail with
    * non_compliance_reason set to APP_NOT_UPDATED. The app must already be
    * published to Google Play with a version code greater than or equal to
    * this value. At most 20 apps may specify a minimum version code per
    * policy.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.native
  /**
    * The package name of the app. For example, com.google.android.youtube for
    * the YouTube app.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Explicit permission grants or denials for the app. These values override
    * the default_permission_policy and permission_grants which apply to all
    * apps.
    */
  var permissionGrants: js.UndefOr[js.Array[SchemaPermissionGrant]] = js.native
}

object SchemaApplicationPolicy {
  @scala.inline
  def apply(): SchemaApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationPolicy]
  }
  @scala.inline
  implicit class SchemaApplicationPolicyOps[Self <: SchemaApplicationPolicy] (val x: Self) extends AnyVal {
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
    def withDelegatedScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegatedScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
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
    def withManagedConfiguration(value: StringDictionary[js.Any]): Self = {
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
    def withManagedConfigurationTemplate(value: SchemaManagedConfigurationTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurationTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedConfigurationTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedConfigurationTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumVersionCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVersionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVersionCode")(js.undefined)
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
    def withPermissionGrants(value: js.Array[SchemaPermissionGrant]): Self = {
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

