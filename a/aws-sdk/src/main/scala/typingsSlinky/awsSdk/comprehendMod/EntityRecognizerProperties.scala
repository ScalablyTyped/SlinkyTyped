package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerProperties extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The time that the recognizer creation completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.EntityRecognizerArn] = js.native
  /**
    * The input data properties of an entity recognizer.
    */
  var InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig] = js.native
  /**
    *  The language of the input documents. All documents must be in the same language. Only English ("en") is currently supported.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.LanguageCode] = js.native
  /**
    *  A description of the status of the recognizer.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  /**
    *  Provides information about an entity recognizer.
    */
  var RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata] = js.native
  /**
    * Provides the status of the entity recognizer.
    */
  var Status: js.UndefOr[ModelStatus] = js.native
  /**
    * The time that the recognizer was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
  /**
    * The time that training of the entity recognizer was completed.
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The time that training of the entity recognizer started.
    */
  var TrainingStartTime: js.UndefOr[js.Date] = js.native
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your custom entity recognizer. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.VpcConfig] = js.native
}

object EntityRecognizerProperties {
  @scala.inline
  def apply(): EntityRecognizerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerProperties]
  }
  @scala.inline
  implicit class EntityRecognizerPropertiesOps[Self <: EntityRecognizerProperties] (val x: Self) extends AnyVal {
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
    def withEntityRecognizerArn(value: EntityRecognizerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityRecognizerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityRecognizerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityRecognizerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDataConfig(value: EntityRecognizerInputDataConfig): Self = {
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
    def withRecognizerMetadata(value: EntityRecognizerMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecognizerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognizerMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecognizerMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ModelStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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
    def withTrainingEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingStartTime")(js.undefined)
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

