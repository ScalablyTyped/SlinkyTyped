package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehendMedicalAsyncJobProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that gives Amazon Comprehend Medical read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The time that the detection job completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time that job metadata is deleted from the server. Output files in your S3 bucket will not be deleted. After the metadata is deleted, the job will no longer appear in the results of the ListEntitiesDetectionV2Job or the ListPHIDetectionJobs operation.
    */
  var ExpirationTime: js.UndefOr[js.Date] = js.native
  /**
    * The input data configuration that you supplied when you created the detection job.
    */
  var InputDataConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.InputDataConfig] = js.native
  /**
    * The identifier assigned to the detection job.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.JobId] = js.native
  /**
    * The name that you assigned to the detection job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.JobName] = js.native
  /**
    * The current status of the detection job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.JobStatus] = js.native
  /**
    * The AWS Key Management Service key, if any, used to encrypt the output files. 
    */
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.KMSKey] = js.native
  /**
    * The language code of the input documents.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.LanguageCode] = js.native
  /**
    * The path to the file that describes the results of a batch job.
    */
  var ManifestFilePath: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.ManifestFilePath] = js.native
  /**
    * A description of the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.ModelVersion] = js.native
  /**
    * The output data configuration that you supplied when you created the detection job.
    */
  var OutputDataConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.OutputDataConfig] = js.native
  /**
    * The time that the detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
}

object ComprehendMedicalAsyncJobProperties {
  @scala.inline
  def apply(): ComprehendMedicalAsyncJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComprehendMedicalAsyncJobProperties]
  }
  @scala.inline
  implicit class ComprehendMedicalAsyncJobPropertiesOps[Self <: ComprehendMedicalAsyncJobProperties] (val x: Self) extends AnyVal {
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
    def withExpirationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(js.undefined)
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
    def withKMSKey(value: KMSKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestFilePath(value: ManifestFilePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestFilePath")(js.undefined)
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
    def withModelVersion(value: ModelVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelVersion")(js.undefined)
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
  }
  
}

