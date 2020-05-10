package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTranslationJobProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon Translate read access to the job's input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The time at which the translation job ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The input configuration properties that were specified when the job was requested.
    */
  var InputDataConfig: js.UndefOr[typingsSlinky.awsSdk.translateMod.InputDataConfig] = js.native
  /**
    * The number of documents successfully and unsuccessfully processed during the translation job.
    */
  var JobDetails: js.UndefOr[typingsSlinky.awsSdk.translateMod.JobDetails] = js.native
  /**
    * The ID of the translation job.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.translateMod.JobId] = js.native
  /**
    * The user-defined name of the translation job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.translateMod.JobName] = js.native
  /**
    * The status of the translation job.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.translateMod.JobStatus] = js.native
  /**
    * An explanation of any errors that may have occured during the translation job.
    */
  var Message: js.UndefOr[UnboundedLengthString] = js.native
  /**
    * The output configuration properties that were specified when the job was requested.
    */
  var OutputDataConfig: js.UndefOr[typingsSlinky.awsSdk.translateMod.OutputDataConfig] = js.native
  /**
    * The language code of the language of the source text. The language must be a language supported by Amazon Translate.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.native
  /**
    * The time at which the translation job was submitted.
    */
  var SubmittedTime: js.UndefOr[js.Date] = js.native
  /**
    * The language code of the language of the target text. The language must be a language supported by Amazon Translate.
    */
  var TargetLanguageCodes: js.UndefOr[TargetLanguageCodeStringList] = js.native
  /**
    * A list containing the names of the terminologies applied to a translation job. Only one terminology can be applied per StartTextTranslationJob request at this time.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.native
}

object TextTranslationJobProperties {
  @scala.inline
  def apply(): TextTranslationJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTranslationJobProperties]
  }
  @scala.inline
  implicit class TextTranslationJobPropertiesOps[Self <: TextTranslationJobProperties] (val x: Self) extends AnyVal {
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
    def withJobDetails(value: JobDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobDetails")(js.undefined)
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
    def withMessage(value: UnboundedLengthString): Self = {
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
    def withSourceLanguageCode(value: LanguageCodeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLanguageCodes(value: TargetLanguageCodeStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLanguageCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLanguageCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLanguageCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminologyNames(value: ResourceNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminologyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyNames")(js.undefined)
        ret
    }
  }
  
}

