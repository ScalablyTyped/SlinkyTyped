package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmConfigurationMessage extends js.Object {
  /**
    * A text description of the HSM configuration to be created.
    */
  var Description: String = js.native
  /**
    * The identifier to be assigned to the new Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: String = js.native
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: String = js.native
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: String = js.native
  /**
    * The password required to access the HSM partition.
    */
  var HsmPartitionPassword: String = js.native
  /**
    * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
    */
  var HsmServerPublicCertificate: String = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateHsmConfigurationMessage {
  @scala.inline
  def apply(
    Description: String,
    HsmConfigurationIdentifier: String,
    HsmIpAddress: String,
    HsmPartitionName: String,
    HsmPartitionPassword: String,
    HsmServerPublicCertificate: String
  ): CreateHsmConfigurationMessage = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HsmConfigurationIdentifier = HsmConfigurationIdentifier.asInstanceOf[js.Any], HsmIpAddress = HsmIpAddress.asInstanceOf[js.Any], HsmPartitionName = HsmPartitionName.asInstanceOf[js.Any], HsmPartitionPassword = HsmPartitionPassword.asInstanceOf[js.Any], HsmServerPublicCertificate = HsmServerPublicCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmConfigurationMessage]
  }
  @scala.inline
  implicit class CreateHsmConfigurationMessageOps[Self <: CreateHsmConfigurationMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsmConfigurationIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmConfigurationIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsmIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsmPartitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmPartitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsmPartitionPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmPartitionPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsmServerPublicCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmServerPublicCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

