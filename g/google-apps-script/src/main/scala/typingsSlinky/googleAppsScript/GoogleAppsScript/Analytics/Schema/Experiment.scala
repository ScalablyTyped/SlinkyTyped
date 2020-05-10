package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Experiment extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var created: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var editableInGaUi: js.UndefOr[Boolean] = js.native
  var endTime: js.UndefOr[String] = js.native
  var equalWeighting: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var internalWebPropertyId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var minimumExperimentLengthInDays: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var objectiveMetric: js.UndefOr[String] = js.native
  var optimizationType: js.UndefOr[String] = js.native
  var parentLink: js.UndefOr[ExperimentParentLink] = js.native
  var profileId: js.UndefOr[String] = js.native
  var reasonExperimentEnded: js.UndefOr[String] = js.native
  var rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var servingFramework: js.UndefOr[String] = js.native
  var snippet: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var trafficCoverage: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[String] = js.native
  var variations: js.UndefOr[js.Array[ExperimentVariations]] = js.native
  var webPropertyId: js.UndefOr[String] = js.native
  var winnerConfidenceLevel: js.UndefOr[Double] = js.native
  var winnerFound: js.UndefOr[Boolean] = js.native
}

object Experiment {
  @scala.inline
  def apply(): Experiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Experiment]
  }
  @scala.inline
  implicit class ExperimentOps[Self <: Experiment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableInGaUi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableInGaUi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditableInGaUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableInGaUi")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualWeighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalWeighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualWeighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalWeighting")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumExperimentLengthInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumExperimentLengthInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumExperimentLengthInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumExperimentLengthInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withObjectiveMetric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectiveMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectiveMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectiveMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationType")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLink(value: ExperimentParentLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonExperimentEnded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonExperimentEnded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonExperimentEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonExperimentEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteVariationUrlsAsOriginal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteVariationUrlsAsOriginal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewriteVariationUrlsAsOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteVariationUrlsAsOriginal")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withServingFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServingFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingFramework")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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
    def withTrafficCoverage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficCoverage")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withVariations(value: js.Array[ExperimentVariations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variations")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
    @scala.inline
    def withWinnerConfidenceLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winnerConfidenceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWinnerConfidenceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winnerConfidenceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withWinnerFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winnerFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWinnerFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("winnerFound")(js.undefined)
        ret
    }
  }
  
}

