package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterRequest extends js.Object {
  /**
    * The ID for the address that you want the cluster shipped to.
    */
  var AddressId: typingsSlinky.awsSdk.snowballMod.AddressId = js.native
  /**
    * An optional description of this specific cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The forwarding address ID for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: typingsSlinky.awsSdk.snowballMod.JobType = js.native
  /**
    * The KmsKeyARN value that you want to associate with this cluster. KmsKeyARN values are created by using the CreateKey API action in AWS Key Management Service (AWS KMS). 
    */
  var KmsKeyARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typingsSlinky.awsSdk.snowballMod.Notification] = js.native
  /**
    * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda functions written in the Python language. 
    */
  var Resources: JobResource = js.native
  /**
    * The RoleARN that you want to associate with this cluster. RoleArn values are created by using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: typingsSlinky.awsSdk.snowballMod.RoleARN = js.native
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowball Edges are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: typingsSlinky.awsSdk.snowballMod.ShippingOption = js.native
  /**
    * The type of AWS Snowball device to use for this cluster. Currently, the only supported device type for cluster jobs is EDGE. For more information, see Snowball Edge Device Options in the Snowball Edge Developer Guide.
    */
  var SnowballType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.SnowballType] = js.native
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typingsSlinky.awsSdk.snowballMod.TaxDocuments] = js.native
}

object CreateClusterRequest {
  @scala.inline
  def apply(
    AddressId: AddressId,
    JobType: JobType,
    Resources: JobResource,
    RoleARN: RoleARN,
    ShippingOption: ShippingOption
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Resources = Resources.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], ShippingOption = ShippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  @scala.inline
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
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
    def withJobType(value: JobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: JobResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShippingOption(value: ShippingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingOption")(value.asInstanceOf[js.Any])
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

