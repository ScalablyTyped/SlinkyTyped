package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an intent. Intents convert a number of user expressions or
  * patterns into an action. An action is an extraction of a user command or
  * sentence semantics.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2Intent extends js.Object {
  /**
    * Optional. The name of the action associated with the intent. Note: The
    * action name must not contain whitespaces.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Optional. The list of platforms for which the first response will be
    * taken from among the messages assigned to the DEFAULT_PLATFORM.
    */
  var defaultResponsePlatforms: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The name of this intent.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of event names that trigger the intent. If the
    * collection of input contexts is not empty, all of the contexts must be
    * present in the active user session for an event to trigger this intent.
    */
  var events: js.UndefOr[js.Array[String]] = js.native
  /**
    * Read-only. Information about all followup intents that have this intent
    * as a direct or indirect parent. We populate this field only in the
    * output.
    */
  var followupIntentInfo: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo]] = js.native
  /**
    * Optional. The list of context names required for this intent to be
    * triggered. Format: `projects/&lt;Project
    * ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
    */
  var inputContextNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Indicates whether this is a fallback intent.
    */
  var isFallback: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The collection of rich messages corresponding to the `Response`
    * field in the Dialogflow console.
    */
  var messages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]] = js.native
  /**
    * Optional. Indicates whether Machine Learning is disabled for the intent.
    * Note: If `ml_diabled` setting is set to true, then this intent is not
    * taken into account during inference in `ML ONLY` match mode. Also,
    * auto-markup in the UI is turned off.
    */
  var mlDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier of this intent. Required for Intents.UpdateIntent
    * and Intents.BatchUpdateIntents methods. Format: `projects/&lt;Project
    * ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of contexts that are activated when the intent
    * is matched. Context messages in this collection should not set the
    * parameters field. Setting the `lifespan_count` to 0 will reset the
    * context when the intent is matched. Format: `projects/&lt;Project
    * ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.native
  /**
    * Optional. The collection of parameters associated with the intent.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentParameter]] = js.native
  /**
    * Read-only after creation. The unique identifier of the parent intent in
    * the chain of followup intents. You can set this field when creating an
    * intent, for example with CreateIntent or BatchUpdateIntents, in order to
    * make this intent a followup intent.  It identifies the parent followup
    * intent. Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent
    * ID&gt;`.
    */
  var parentFollowupIntentName: js.UndefOr[String] = js.native
  /**
    * Optional. The priority of this intent. Higher numbers represent higher
    * priorities. If this is zero or unspecified, we use the default priority
    * 500000.  Negative numbers mean that the intent is disabled.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * Optional. Indicates whether to delete all contexts in the current session
    * when this intent is matched.
    */
  var resetContexts: js.UndefOr[Boolean] = js.native
  /**
    * Read-only. The unique identifier of the root intent in the chain of
    * followup intents. It identifies the correct followup intents chain for
    * this intent. We populate this field only in the output.  Format:
    * `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var rootFollowupIntentName: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of examples that the agent is trained on.
    */
  var trainingPhrases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentTrainingPhrase]] = js.native
  /**
    * Optional. Indicates whether webhooks are enabled for the intent.
    */
  var webhookState: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2Intent {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Intent]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentOps[Self <: SchemaGoogleCloudDialogflowV2Intent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultResponsePlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResponsePlatforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultResponsePlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResponsePlatforms")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowupIntentInfo(value: js.Array[SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupIntentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowupIntentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupIntentInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withInputContextNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContextNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputContextNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContextNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMlDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mlDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMlDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mlDisabled")(js.undefined)
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
    def withOutputContexts(value: js.Array[SchemaGoogleCloudDialogflowV2Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[SchemaGoogleCloudDialogflowV2IntentParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withParentFollowupIntentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFollowupIntentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFollowupIntentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFollowupIntentName")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withResetContexts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFollowupIntentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFollowupIntentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootFollowupIntentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFollowupIntentName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingPhrases(value: js.Array[SchemaGoogleCloudDialogflowV2IntentTrainingPhrase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingPhrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingPhrases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingPhrases")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhookState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookState")(js.undefined)
        ret
    }
  }
  
}

