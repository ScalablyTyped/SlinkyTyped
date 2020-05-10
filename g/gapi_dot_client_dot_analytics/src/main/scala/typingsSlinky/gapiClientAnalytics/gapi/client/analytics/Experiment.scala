package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClientAnalytics.AnonHref
import typingsSlinky.gapiClientAnalytics.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Experiment extends js.Object {
  /** Account ID to which this experiment belongs. This field is read-only. */
  var accountId: js.UndefOr[String] = js.native
  /** Time the experiment was created. This field is read-only. */
  var created: js.UndefOr[String] = js.native
  /** Notes about this experiment. */
  var description: js.UndefOr[String] = js.native
  /** If true, the end user will be able to edit the experiment via the Google Analytics user interface. */
  var editableInGaUi: js.UndefOr[Boolean] = js.native
  /**
    * The ending time of the experiment (the time the status changed from RUNNING to ENDED). This field is present only if the experiment has ended. This
    * field is read-only.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether to distribute traffic evenly across all variations. If the value is False, content experiments follows the default behavior
    * of adjusting traffic dynamically based on variation performance. Optional -- defaults to False. This field may not be changed for an experiment whose
    * status is ENDED.
    */
  var equalWeighting: js.UndefOr[Boolean] = js.native
  /** Experiment ID. Required for patch and update. Disallowed for create. */
  var id: js.UndefOr[String] = js.native
  /** Internal ID for the web property to which this experiment belongs. This field is read-only. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** Resource type for an Analytics experiment. This field is read-only. */
  var kind: js.UndefOr[String] = js.native
  /**
    * An integer number in [3, 90]. Specifies the minimum length of the experiment. Can be changed for a running experiment. This field may not be changed
    * for an experiments whose status is ENDED.
    */
  var minimumExperimentLengthInDays: js.UndefOr[Double] = js.native
  /** Experiment name. This field may not be changed for an experiment whose status is ENDED. This field is required when creating an experiment. */
  var name: js.UndefOr[String] = js.native
  /**
    * The metric that the experiment is optimizing. Valid values: "ga:goal(n)Completions", "ga:adsenseAdsClicks", "ga:adsenseAdsViewed", "ga:adsenseRevenue",
    * "ga:bounces", "ga:pageviews", "ga:sessionDuration", "ga:transactions", "ga:transactionRevenue". This field is required if status is "RUNNING" and
    * servingFramework is one of "REDIRECT" or "API".
    */
  var objectiveMetric: js.UndefOr[String] = js.native
  /**
    * Whether the objectiveMetric should be minimized or maximized. Possible values: "MAXIMUM", "MINIMUM". Optional--defaults to "MAXIMUM". Cannot be
    * specified without objectiveMetric. Cannot be modified when status is "RUNNING" or "ENDED".
    */
  var optimizationType: js.UndefOr[String] = js.native
  /** Parent link for an experiment. Points to the view (profile) to which this experiment belongs. */
  var parentLink: js.UndefOr[AnonHref] = js.native
  /** View (Profile) ID to which this experiment belongs. This field is read-only. */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Why the experiment ended. Possible values: "STOPPED_BY_USER", "WINNER_FOUND", "EXPERIMENT_EXPIRED", "ENDED_WITH_NO_WINNER", "GOAL_OBJECTIVE_CHANGED".
    * "ENDED_WITH_NO_WINNER" means that the experiment didn't expire but no winner was projected to be found. If the experiment status is changed via the API
    * to ENDED this field is set to STOPPED_BY_USER. This field is read-only.
    */
  var reasonExperimentEnded: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether variations URLS are rewritten to match those of the original. This field may not be changed for an experiments whose status
    * is ENDED.
    */
  var rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean] = js.native
  /** Link for this experiment. This field is read-only. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The framework used to serve the experiment variations and evaluate the results. One of:
    * - REDIRECT: Google Analytics redirects traffic to different variation pages, reports the chosen variation and evaluates the results.
    * - API: Google Analytics chooses and reports the variation to serve and evaluates the results; the caller is responsible for serving the selected
    * variation.
    * - EXTERNAL: The variations will be served externally and the chosen variation reported to Google Analytics. The caller is responsible for serving the
    * selected variation and evaluating the results.
    */
  var servingFramework: js.UndefOr[String] = js.native
  /** The snippet of code to include on the control page(s). This field is read-only. */
  var snippet: js.UndefOr[String] = js.native
  /**
    * The starting time of the experiment (the time the status changed from READY_TO_RUN to RUNNING). This field is present only if the experiment has
    * started. This field is read-only.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Experiment status. Possible values: "DRAFT", "READY_TO_RUN", "RUNNING", "ENDED". Experiments can be created in the "DRAFT", "READY_TO_RUN" or "RUNNING"
    * state. This field is required when creating an experiment.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * A floating-point number in (0, 1]. Specifies the fraction of the traffic that participates in the experiment. Can be changed for a running experiment.
    * This field may not be changed for an experiments whose status is ENDED.
    */
  var trafficCoverage: js.UndefOr[Double] = js.native
  /** Time the experiment was last modified. This field is read-only. */
  var updated: js.UndefOr[String] = js.native
  /**
    * Array of variations. The first variation in the array is the original. The number of variations may not change once an experiment is in the RUNNING
    * state. At least two variations are required before status can be set to RUNNING.
    */
  var variations: js.UndefOr[js.Array[AnonName]] = js.native
  /** Web property ID to which this experiment belongs. The web property ID is of the form UA-XXXXX-YY. This field is read-only. */
  var webPropertyId: js.UndefOr[String] = js.native
  /**
    * A floating-point number in (0, 1). Specifies the necessary confidence level to choose a winner. This field may not be changed for an experiments whose
    * status is ENDED.
    */
  var winnerConfidenceLevel: js.UndefOr[Double] = js.native
  /** Boolean specifying whether a winner has been found for this experiment. This field is read-only. */
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
    def withParentLink(value: AnonHref): Self = {
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
    def withVariations(value: js.Array[AnonName]): Self = {
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

