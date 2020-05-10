package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User specified settings that are attached to the Cloud Security Command
  * Center (Cloud SCC) organization.
  */
@js.native
trait SchemaOrganizationSettings extends js.Object {
  /**
    * The configuration used for Asset Discovery runs.
    */
  var assetDiscoveryConfig: js.UndefOr[SchemaAssetDiscoveryConfig] = js.native
  /**
    * A flag that indicates if Asset Discovery should be enabled. If the flag
    * is set to `true`, then discovery of assets will occur. If it is set to
    * `false, all historical assets will remain, but discovery of future assets
    * will not occur.
    */
  var enableAssetDiscovery: js.UndefOr[Boolean] = js.native
  /**
    * The relative resource name of the settings. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/organizationSettings&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaOrganizationSettings {
  @scala.inline
  def apply(): SchemaOrganizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationSettings]
  }
  @scala.inline
  implicit class SchemaOrganizationSettingsOps[Self <: SchemaOrganizationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetDiscoveryConfig(value: SchemaAssetDiscoveryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetDiscoveryConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetDiscoveryConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetDiscoveryConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAssetDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAssetDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAssetDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAssetDiscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

