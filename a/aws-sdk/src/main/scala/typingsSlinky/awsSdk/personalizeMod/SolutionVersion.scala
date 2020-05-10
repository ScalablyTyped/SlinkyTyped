package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionVersion extends js.Object {
  /**
    * The date and time (in Unix time) that this version of the solution was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group providing the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.native
  /**
    * If training a solution version fails, the reason for the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When false (the default), Amazon Personalize uses recipeArn.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.native
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.native
  /**
    * The ARN of the recipe used in the solution.
    */
  var recipeArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.native
  /**
    * Describes the configuration properties for the solution.
    */
  var solutionConfig: js.UndefOr[SolutionConfig] = js.native
  /**
    * The ARN of the solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the solution version. A solution version can be in one of the following states:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The time used to train the model. You are billed for the time it takes to train a model. This field is visible only after Amazon Personalize successfully trains a model.
    */
  var trainingHours: js.UndefOr[TrainingHours] = js.native
  /**
    * The scope of training used to create the solution version. The FULL option trains the solution version based on the entirety of the input solution's training data, while the UPDATE option processes only the training data that has changed since the creation of the last solution version. Choose UPDATE when you want to start recommending items added to the dataset without retraining the model.  The UPDATE option can only be used after you've created a solution version with the FULL option and the training solution uses the native-recipe-hrnn-coldstart. 
    */
  var trainingMode: js.UndefOr[TrainingMode] = js.native
  /**
    * If hyperparameter optimization was performed, contains the hyperparameter values of the best performing model.
    */
  var tunedHPOParams: js.UndefOr[TunedHPOParams] = js.native
}

object SolutionVersion {
  @scala.inline
  def apply(): SolutionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionVersion]
  }
  @scala.inline
  implicit class SolutionVersionOps[Self <: SolutionVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEventType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformAutoML(value: PerformAutoML): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performAutoML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformAutoML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performAutoML")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformHPO(value: PerformHPO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performHPO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformHPO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performHPO")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipeArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipeArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionConfig(value: SolutionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionVersionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingHours(value: TrainingHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingHours")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingMode(value: TrainingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTunedHPOParams(value: TunedHPOParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunedHPOParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunedHPOParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunedHPOParams")(js.undefined)
        ret
    }
  }
  
}

