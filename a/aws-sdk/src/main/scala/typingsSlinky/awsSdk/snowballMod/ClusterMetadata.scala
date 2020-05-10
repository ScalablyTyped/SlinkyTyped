package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterMetadata extends js.Object {
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: js.UndefOr[typingsSlinky.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[String] = js.native
  /**
    * The current status of the cluster.
    */
  var ClusterState: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ClusterState] = js.native
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The optional description of the cluster.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the address that you want a cluster shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.JobType] = js.native
  /**
    * The KmsKeyARN Amazon Resource Name (ARN) associated with this cluster. This ARN was created using the CreateKey API action in AWS Key Management Service (AWS KMS).
    */
  var KmsKeyARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typingsSlinky.awsSdk.snowballMod.Notification] = js.native
  /**
    * The arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The role ARN associated with this cluster. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowball Edges are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ShippingOption] = js.native
  /**
    * The type of AWS Snowball device to use for this cluster. Currently, the only supported device type for cluster jobs is EDGE. For more information, see Snowball Edge Device Options in the Snowball Edge Developer Guide.
    */
  var SnowballType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.SnowballType] = js.native
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typingsSlinky.awsSdk.snowballMod.TaxDocuments] = js.native
}

object ClusterMetadata {
  @scala.inline
  def apply(): ClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMetadata]
  }
  @scala.inline
  implicit class ClusterMetadataOps[Self <: ClusterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressId(value: AddressId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterState(value: ClusterState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterState")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
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
    def withForwardingAddressId(value: AddressId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingAddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingAddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobType(value: JobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyARN(value: KmsKeyARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyARN")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: JobResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOption(value: ShippingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSnowballType(value: SnowballType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowballType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballType")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxDocuments(value: TaxDocuments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaxDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaxDocuments")(js.undefined)
        ret
    }
  }
  
}

