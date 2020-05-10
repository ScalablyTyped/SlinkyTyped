package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * The ID for the address that you want the Snowball shipped to.
    */
  var AddressId: js.UndefOr[typingsSlinky.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this clusterId value. The other job attributes are inherited from the cluster.
    */
  var ClusterId: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ClusterId] = js.native
  /**
    * Defines an optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The forwarding address ID for a job. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * Defines the type of job that you're creating. 
    */
  var JobType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.JobType] = js.native
  /**
    * The KmsKeyARN that you want to associate with this job. KmsKeyARNs are created using the CreateKey AWS Key Management Service (KMS) API action.
    */
  var KmsKeyARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
    */
  var Notification: js.UndefOr[typingsSlinky.awsSdk.snowballMod.Notification] = js.native
  /**
    * Defines the Amazon S3 buckets associated with this job. With IMPORT jobs, you specify the bucket or buckets that your transferred data will be imported into. With EXPORT jobs, you specify the bucket or buckets that your transferred data will be exported from. Optionally, you can also specify a KeyRange value. If you choose to export a range, you define the length of the range by providing either an inclusive BeginMarker value, an inclusive EndMarker value, or both. Ranges are UTF-8 binary sorted.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The RoleARN that you want to associate with this job. RoleArns are created using the CreateRole AWS Identity and Access Management (IAM) API action.
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowballs are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ShippingOption] = js.native
  /**
    * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.native
  /**
    * The type of AWS Snowball device to use for this job. Currently, the only supported device type for cluster jobs is EDGE. For more information, see Snowball Edge Device Options in the Snowball Edge Developer Guide.
    */
  var SnowballType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.SnowballType] = js.native
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typingsSlinky.awsSdk.snowballMod.TaxDocuments] = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(): CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobRequest]
  }
  @scala.inline
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
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
    def withClusterId(value: ClusterId): Self = {
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
    def withSnowballCapacityPreference(value: SnowballCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballCapacityPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowballCapacityPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballCapacityPreference")(js.undefined)
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

