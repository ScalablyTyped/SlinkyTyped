package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstancesRequest extends StObject {
  
  /**
    * An array of objects representing the add-ons to enable for the new instance.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.native
  
  /**
    * The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). You can get a list of Availability Zones by using the get regions operation. Be sure to add the include Availability Zones parameter to your request.
    */
  var availabilityZone: String = js.native
  
  /**
    * The ID for a virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0). Use the get blueprints operation to return a list of available images (or blueprints).  Use active blueprints when creating new instances. Inactive blueprints are listed to support customers with existing instances and are not necessarily available to create new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases. 
    */
  var blueprintId: NonEmptyString = js.native
  
  /**
    * The bundle of specification information for your virtual private server (or instance), including the pricing plan (e.g., micro_1_0).
    */
  var bundleId: NonEmptyString = js.native
  
  /**
    * (Deprecated) The name for your custom image.  In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated. 
    */
  var customImageName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The names to use for your new Lightsail instances. Separate multiple values using quotation marks and commas, for example: ["MyFirstInstance","MySecondInstance"] 
    */
  var instanceNames: StringList = js.native
  
  /**
    * The name of your key pair.
    */
  var keyPairName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. For a complete list, see the Dev Guide. 
    */
  var userData: js.UndefOr[String] = js.native
}
object CreateInstancesRequest {
  
  @scala.inline
  def apply(
    availabilityZone: String,
    blueprintId: NonEmptyString,
    bundleId: NonEmptyString,
    instanceNames: StringList
  ): CreateInstancesRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], blueprintId = blueprintId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any], instanceNames = instanceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstancesRequest]
  }
  
  @scala.inline
  implicit class CreateInstancesRequestMutableBuilder[Self <: CreateInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOns(value: AddOnRequestList): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    @scala.inline
    def setAddOnsVarargs(value: AddOnRequest*): Self = StObject.set(x, "addOns", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueprintId(value: NonEmptyString): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomImageName(value: ResourceName): Self = StObject.set(x, "customImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomImageNameUndefined: Self = StObject.set(x, "customImageName", js.undefined)
    
    @scala.inline
    def setInstanceNames(value: StringList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNamesVarargs(value: String*): Self = StObject.set(x, "instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setKeyPairName(value: ResourceName): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairNameUndefined: Self = StObject.set(x, "keyPairName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
