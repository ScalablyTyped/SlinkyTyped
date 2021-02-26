package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`2`
import typingsSlinky.octokitTypes.octokitTypesStrings.action_required
import typingsSlinky.octokitTypes.octokitTypesStrings.cancelled
import typingsSlinky.octokitTypes.octokitTypesStrings.completed
import typingsSlinky.octokitTypes.octokitTypesStrings.failure
import typingsSlinky.octokitTypes.octokitTypesStrings.in_progress
import typingsSlinky.octokitTypes.octokitTypesStrings.neutral
import typingsSlinky.octokitTypes.octokitTypesStrings.queued
import typingsSlinky.octokitTypes.octokitTypesStrings.skipped
import typingsSlinky.octokitTypes.octokitTypesStrings.success
import typingsSlinky.octokitTypes.octokitTypesStrings.timed_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   name :string,   head_sha :string,   details_url :string | undefined,   external_id :string | undefined,   status :'queued' | 'in_progress' | 'completed' | undefined,   started_at :string | undefined,   conclusion :'success' | 'failure' | 'neutral' | 'cancelled' | 'skipped' | 'timed_out' | 'action_required' | undefined,   completed_at :string | undefined,   output :@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksCreateParamsOutput | undefined,   actions :std.Array<@octokit/types.@octokit/types/dist-types/generated/Endpoints.ChecksCreateParamsActions> | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksCreateEndpoint extends StObject {
  
  /**
    * Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [`check_run.requested_action` webhook](https://developer.github.com/webhooks/event-payloads/#check_run) to your app. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://developer.github.com/v3/checks/runs/#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://developer.github.com/v3/checks/runs/#check-runs-and-requested-actions)." To learn more about check runs and requested actions, see "[Check runs and requested actions](https://developer.github.com/v3/checks/runs/#check-runs-and-requested-actions)."
    */
  var actions: js.UndefOr[js.Array[ChecksCreateParamsActions]] = js.native
  
  /**
    * The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[String] = js.native
  
  /**
    * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check. Can be one of `success`, `failure`, `neutral`, `cancelled`, `skipped`, `timed_out`, or `action_required`. When the conclusion is `action_required`, additional details should be provided on the site specified by `details_url`.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. Only GitHub can change a check run conclusion to `stale`.
    */
  var conclusion: js.UndefOr[success | failure | neutral | cancelled | skipped | timed_out | action_required] = js.native
  
  /**
    * The URL of the integrator's site that has the full details of the check. If the integrator does not provide this, then the homepage of the GitHub app is used.
    */
  var details_url: js.UndefOr[String] = js.native
  
  /**
    * A reference for the run on the integrator's system.
    */
  var external_id: js.UndefOr[String] = js.native
  
  /**
    * The SHA of the commit.
    */
  var head_sha: String = js.native
  
  var mediaType: `2` = js.native
  
  /**
    * The name of the check. For example, "code-coverage".
    */
  var name: String = js.native
  
  /**
    * Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://developer.github.com/v3/checks/runs/#output-object) description.
    */
  var output: js.UndefOr[ChecksCreateParamsOutput] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.native
  
  /**
    * The current status. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.native
}
object ChecksCreateEndpoint {
  
  @scala.inline
  def apply(head_sha: String, mediaType: `2`, name: String, owner: String, repo: String): ChecksCreateEndpoint = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateEndpoint]
  }
  
  @scala.inline
  implicit class ChecksCreateEndpointMutableBuilder[Self <: ChecksCreateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ChecksCreateParamsActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: ChecksCreateParamsActions*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted_atUndefined: Self = StObject.set(x, "completed_at", js.undefined)
    
    @scala.inline
    def setConclusion(value: success | failure | neutral | cancelled | skipped | timed_out | action_required): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    @scala.inline
    def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails_urlUndefined: Self = StObject.set(x, "details_url", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    @scala.inline
    def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `2`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: ChecksCreateParamsOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
    
    @scala.inline
    def setStatus(value: queued | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
