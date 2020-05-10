package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HsmConfiguration extends js.Object {
  /**
    * A text description of the HSM configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.native
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: js.UndefOr[String] = js.native
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: js.UndefOr[String] = js.native
  /**
    * The list of tags for the HSM configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object HsmConfiguration {
  @scala.inline
  def apply(): HsmConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmConfiguration]
  }
  @scala.inline
  implicit class HsmConfigurationOps[Self <: HsmConfiguration] (val x: Self) extends AnyVal {
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
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmConfigurationIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmConfigurationIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmConfigurationIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmConfigurationIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmPartitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmPartitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmPartitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmPartitionName")(js.undefined)
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

