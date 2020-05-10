package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectVersionDescription extends js.Object {
  /**
    * The duration, in seconds, that the model version has been billed for training. This value is only returned if the model version has been successfully trained.
    */
  var BillableTrainingTimeInSeconds: js.UndefOr[ULong] = js.native
  /**
    * The Unix datetime for the date and time that training started.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The training results. EvaluationResult is only returned if training is successful.
    */
  var EvaluationResult: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.EvaluationResult] = js.native
  /**
    * The minimum number of inference units used by the model. For more information, see StartProjectVersion.
    */
  var MinInferenceUnits: js.UndefOr[InferenceUnits] = js.native
  /**
    * The location where training results are saved.
    */
  var OutputConfig: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.OutputConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the model version. 
    */
  var ProjectVersionArn: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ProjectVersionArn] = js.native
  /**
    * The current status of the model version.
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
  /**
    * A descriptive message for an error or warning that occurred.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * The manifest file that represents the testing results.
    */
  var TestingDataResult: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.TestingDataResult] = js.native
  /**
    * The manifest file that represents the training results.
    */
  var TrainingDataResult: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.TrainingDataResult] = js.native
  /**
    * The Unix date and time that training of the model ended.
    */
  var TrainingEndTimestamp: js.UndefOr[js.Date] = js.native
}

object ProjectVersionDescription {
  @scala.inline
  def apply(): ProjectVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectVersionDescription]
  }
  @scala.inline
  implicit class ProjectVersionDescriptionOps[Self <: ProjectVersionDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillableTrainingTimeInSeconds(value: ULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillableTrainingTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillableTrainingTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillableTrainingTimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationResult(value: EvaluationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResult")(js.undefined)
        ret
    }
    @scala.inline
    def withMinInferenceUnits(value: InferenceUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinInferenceUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinInferenceUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinInferenceUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputConfig(value: OutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectVersionArn(value: ProjectVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ProjectVersionStatus): Self = {
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
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTestingDataResult(value: TestingDataResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestingDataResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestingDataResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestingDataResult")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingDataResult(value: TrainingDataResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingDataResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingDataResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingDataResult")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingEndTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingEndTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingEndTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingEndTimestamp")(js.undefined)
        ret
    }
  }
  
}

