package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEntitiesDetectionV2JobRequest extends js.Object {
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend Medical generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend Medical read access to your input data. For more information, see  Role-Based Permissions Required for Asynchronous Operations.
    */
  var DataAccessRoleArn: IamRoleArn = js.native
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: typingsSlinky.awsSdk.comprehendmedicalMod.InputDataConfig = js.native
  /**
    * The identifier of the job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.JobName] = js.native
  /**
    * An AWS Key Management Service key to encrypt your output files. If you do not specify a key, the files are written in plain text.
    */
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.KMSKey] = js.native
  /**
    * The language of the input documents. All documents must be in the same language.
    */
  var LanguageCode: typingsSlinky.awsSdk.comprehendmedicalMod.LanguageCode = js.native
  /**
    * Specifies where to send the output files.
    */
  var OutputDataConfig: typingsSlinky.awsSdk.comprehendmedicalMod.OutputDataConfig = js.native
}

object StartEntitiesDetectionV2JobRequest {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    OutputDataConfig: OutputDataConfig
  ): StartEntitiesDetectionV2JobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEntitiesDetectionV2JobRequest]
  }
  @scala.inline
  implicit class StartEntitiesDetectionV2JobRequestOps[Self <: StartEntitiesDetectionV2JobRequest] (val x: Self) extends AnyVal {
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
    def withInputDataConfig(value: InputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDataConfig(value: OutputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestTokenString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
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
  }
  
}

