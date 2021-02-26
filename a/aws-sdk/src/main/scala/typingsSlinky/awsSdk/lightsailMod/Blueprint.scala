package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blueprint extends StObject {
  
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
  implicit class BlueprintMutableBuilder[Self <: Blueprint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlueprintId(value: NonEmptyString): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueprintIdUndefined: Self = StObject.set(x, "blueprintId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGroup(value: NonEmptyString): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setLicenseUrl(value: String): Self = StObject.set(x, "licenseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseUrlUndefined: Self = StObject.set(x, "licenseUrl", js.undefined)
    
    @scala.inline
    def setMinPower(value: integer): Self = StObject.set(x, "minPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPowerUndefined: Self = StObject.set(x, "minPower", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlatform(value: InstancePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setProductUrl(value: String): Self = StObject.set(x, "productUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUrlUndefined: Self = StObject.set(x, "productUrl", js.undefined)
    
    @scala.inline
    def setType(value: BlueprintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
