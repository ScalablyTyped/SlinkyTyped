package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentClassificationJobProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. 
    */
  var DocumentClassifierArn: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.DocumentClassifierArn] = js.native
  /**
    * The time that the document classification job completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The input data configuration that you supplied when you created the document classification job.
    */
  var InputDataConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.InputDataConfig] = js.native
  /**
    * The identifier assigned to the document classification job.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobId] = js.native
  /**
    * The name that you assigned to the document classification job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobName] = js.native
  /**
    * The current status of the document classification job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobStatus] = js.native
  /**
    * A description of the status of the job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  /**
    * The output data configuration that you supplied when you created the document classification job.
    */
  var OutputDataConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.OutputDataConfig] = js.native
  /**
    * The time that the document classification job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your document classification job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.VpcConfig] = js.native
}

object DocumentClassificationJobProperties {
  @scala.inline
  def apply(): DocumentClassificationJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassificationJobProperties]
  }
  @scala.inline
  implicit class DocumentClassificationJobPropertiesOps[Self <: DocumentClassificationJobProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataAccessRoleArn(value: IamRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAccessRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAccessRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentClassifierArn(value: DocumentClassifierArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassifierArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentClassifierArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassifierArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDataConfig(value: InputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDataConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobName(value: JobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(js.undefined)
        ret
    }
    @scala.inline
    def withJobStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: AnyLengthString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDataConfig(value: OutputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDataConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeKmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: VpcConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(js.undefined)
        ret
    }
  }
  
}

