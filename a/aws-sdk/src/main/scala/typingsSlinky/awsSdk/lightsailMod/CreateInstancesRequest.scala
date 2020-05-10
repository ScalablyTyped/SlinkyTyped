package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstancesRequest extends js.Object {
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
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
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
  implicit class CreateInstancesRequestOps[Self <: CreateInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlueprintId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBundleId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceNames(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOns(value: AddOnRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomImageName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomImageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customImageName")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPairName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPairName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPairName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPairName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
  }
  
}

