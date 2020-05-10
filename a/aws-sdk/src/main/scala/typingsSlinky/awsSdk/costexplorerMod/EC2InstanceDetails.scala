package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2InstanceDetails extends js.Object {
  /**
    * The Availability Zone of the recommended reservation.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  /**
    * The type of instance that AWS recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  /**
    * The platform of the recommended reservation. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
  /**
    * Whether the recommended reservation is dedicated or shared.
    */
  var Tenancy: js.UndefOr[GenericString] = js.native
}

object EC2InstanceDetails {
  @scala.inline
  def apply(): EC2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceDetails]
  }
  @scala.inline
  implicit class EC2InstanceDetailsOps[Self <: EC2InstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentGeneration(value: GenericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Family")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeFlexEligible(value: GenericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeFlexEligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeFlexEligible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeFlexEligible")(js.undefined)
        ret
    }
    @scala.inline
    def withTenancy(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(js.undefined)
        ret
    }
  }
  
}

