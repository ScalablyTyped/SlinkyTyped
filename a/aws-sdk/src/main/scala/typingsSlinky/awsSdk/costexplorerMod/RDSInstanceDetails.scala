package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  /**
    * The database edition that the recommended reservation supports.
    */
  var DatabaseEdition: js.UndefOr[GenericString] = js.native
  /**
    * The database engine that the recommended reservation supports.
    */
  var DatabaseEngine: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommendation is for a reservation in a single Availability Zone or a reservation with a backup in a second Availability Zone.
    */
  var DeploymentOption: js.UndefOr[GenericString] = js.native
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  /**
    * The type of instance that AWS recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  /**
    * The license model that the recommended reservation supports.
    */
  var LicenseModel: js.UndefOr[GenericString] = js.native
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}

object RDSInstanceDetails {
  @scala.inline
  def apply(): RDSInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RDSInstanceDetails]
  }
  @scala.inline
  implicit class RDSInstanceDetailsOps[Self <: RDSInstanceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDatabaseEdition(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseEdition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseEdition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseEdition")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseEngine(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentOption(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentOption")(js.undefined)
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
    def withLicenseModel(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseModel")(js.undefined)
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
  }
  
}

