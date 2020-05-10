package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blueprint extends js.Object {
  /**
    * The ID for the virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The description of the blueprint.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The group name of the blueprint (e.g., amazon-linux).
    */
  var group: js.UndefOr[NonEmptyString] = js.native
  /**
    * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * The end-user license agreement URL for the image or blueprint.
    */
  var licenseUrl: js.UndefOr[String] = js.native
  /**
    * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500. 0 indicates that the blueprint runs on all instance sizes. 
    */
  var minPower: js.UndefOr[integer] = js.native
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
    */
  var platform: js.UndefOr[InstancePlatform] = js.native
  /**
    * The product URL to learn more about the image or blueprint.
    */
  var productUrl: js.UndefOr[String] = js.native
  /**
    * The type of the blueprint (e.g., os or app).
    */
  var `type`: js.UndefOr[BlueprintType] = js.native
  /**
    * The version number of the operating system, application, or stack (e.g., 2016.03.0).
    */
  var version: js.UndefOr[String] = js.native
  /**
    * The version code.
    */
  var versionCode: js.UndefOr[String] = js.native
}

object Blueprint {
  @scala.inline
  def apply(): Blueprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blueprint]
  }
  @scala.inline
  implicit class BlueprintOps[Self <: Blueprint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlueprintId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueprintId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintId")(js.undefined)
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
    def withGroup(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPower(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPower")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
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
    @scala.inline
    def withPlatform(value: InstancePlatform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withProductUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: BlueprintType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(js.undefined)
        ret
    }
  }
  
}

