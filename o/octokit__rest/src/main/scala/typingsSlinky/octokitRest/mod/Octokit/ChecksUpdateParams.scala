package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.action_required
import typingsSlinky.octokitRest.octokitRestStrings.cancelled
import typingsSlinky.octokitRest.octokitRestStrings.completed
import typingsSlinky.octokitRest.octokitRestStrings.failure
import typingsSlinky.octokitRest.octokitRestStrings.in_progress
import typingsSlinky.octokitRest.octokitRestStrings.neutral
import typingsSlinky.octokitRest.octokitRestStrings.queued
import typingsSlinky.octokitRest.octokitRestStrings.success
import typingsSlinky.octokitRest.octokitRestStrings.timed_out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksUpdateParams extends js.Object {
  /**
    * Possible further actions the integrator can perform, which a user may trigger. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://developer.github.com/v3/checks/runs/#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://developer.github.com/v3/checks/runs/#check-runs-and-requested-actions)."
    */
  var actions: js.UndefOr[js.Array[ChecksUpdateParamsActions]] = js.native
  var check_run_id: Double = js.native
  /**
    * The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[String] = js.native
  /**
    * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check. Can be one of `success`, `failure`, `neutral`, `cancelled`, `timed_out`, or `action_required`.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`.
    */
  var conclusion: js.UndefOr[success | failure | neutral | cancelled | timed_out | action_required] = js.native
  /**
    * The URL of the integrator's site that has the full details of the check.
    */
  var details_url: js.UndefOr[String] = js.native
  /**
    * A reference for the run on the integrator's system.
    */
  var external_id: js.UndefOr[String] = js.native
  /**
    * The name of the check. For example, "code-coverage".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://developer.github.com/v3/checks/runs/#output-object-1) description.
    */
  var output: js.UndefOr[ChecksUpdateParamsOutput] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.native
  /**
    * The current status. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.native
}

object ChecksUpdateParams {
  @scala.inline
  def apply(check_run_id: Double, owner: String, repo: String): ChecksUpdateParams = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParams]
  }
  @scala.inline
  implicit class ChecksUpdateParamsOps[Self <: ChecksUpdateParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck_run_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_run_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[ChecksUpdateParamsActions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleted_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed_at")(js.undefined)
        ret
    }
    @scala.inline
    def withConclusion(value: success | failure | neutral | cancelled | timed_out | action_required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConclusion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details_url")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(js.undefined)
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
    def withOutput(value: ChecksUpdateParamsOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarted_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started_at")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: queued | in_progress | completed): Self = {
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

