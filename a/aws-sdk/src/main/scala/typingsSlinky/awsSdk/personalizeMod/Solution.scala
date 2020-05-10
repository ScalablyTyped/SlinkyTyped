package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Solution extends js.Object {
  /**
    * When performAutoML is true, specifies the best recipe found.
    */
  var autoMLResult: js.UndefOr[AutoMLResult] = js.native
  /**
    * The creation date and time (in Unix time) of the solution.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.native
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Describes the latest version of the solution, including the status and the ARN.
    */
  var latestSolutionVersion: js.UndefOr[SolutionVersionSummary] = js.native
  /**
    * The name of the solution.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified in the solution configuration (recipeArn must not be specified). When false (the default), Amazon Personalize uses recipeArn for training.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.native
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.native
  /**
    * The ARN of the recipe used to create the solution.
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
    * The status of the solution. A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object Solution {
  @scala.inline
  def apply(): Solution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Solution]
  }
  @scala.inline
  implicit class SolutionOps[Self <: Solution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMLResult(value: AutoMLResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMLResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMLResult")(js.undefined)
        ret
    }
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
    def withLatestSolutionVersion(value: SolutionVersionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestSolutionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestSolutionVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestSolutionVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
  }
  
}

