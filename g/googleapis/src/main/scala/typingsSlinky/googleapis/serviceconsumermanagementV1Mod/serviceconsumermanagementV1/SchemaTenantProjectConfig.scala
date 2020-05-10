package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a tenant project to be added to the specified
  * tenancy unit and its initial configuration and properties. A project lien
  * is created for the tenant project to prevent the tenant project from being
  * deleted accidentally. The lien is deleted as part of tenant project
  * removal.
  */
@js.native
trait SchemaTenantProjectConfig extends js.Object {
  /**
    * Billing account properties. The billing account must be specified.
    */
  var billingConfig: js.UndefOr[SchemaBillingConfig] = js.native
  /**
    * Folder where project in this tenancy unit must be located This folder
    * must have been previously created with the required permissions for the
    * caller to create and configure a project in it. Valid folder resource
    * names have the format `folders/{folder_number}` (for example,
    * `folders/123456`).
    */
  var folder: js.UndefOr[String] = js.native
  /**
    * Labels that are applied to this project.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Configuration for the IAM service account on the tenant project.
    */
  var serviceAccountConfig: js.UndefOr[SchemaServiceAccountConfig] = js.native
  /**
    * Google Cloud API names of services that are activated on this project
    * during provisioning.  If any of these services can&#39;t be activated,
    * the request fails. For example:
    * &#39;compute.googleapis.com&#39;,&#39;cloudfunctions.googleapis.com&#39;
    */
  var services: js.UndefOr[js.Array[String]] = js.native
  /**
    * Describes ownership and policies for the new tenant project. Required.
    */
  var tenantProjectPolicy: js.UndefOr[SchemaTenantProjectPolicy] = js.native
}

object SchemaTenantProjectConfig {
  @scala.inline
  def apply(): SchemaTenantProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantProjectConfig]
  }
  @scala.inline
  implicit class SchemaTenantProjectConfigOps[Self <: SchemaTenantProjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingConfig(value: SchemaBillingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountConfig(value: SchemaServiceAccountConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantProjectPolicy(value: SchemaTenantProjectPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantProjectPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantProjectPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantProjectPolicy")(js.undefined)
        ret
    }
  }
  
}

