package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IFollowupIntentInfo
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IMessage
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IParameter
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.ITrainingPhrase
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.WebhookState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Intent. */
@js.native
trait IIntent extends js.Object {
  /** Intent action */
  var action: js.UndefOr[String | Null] = js.native
  /** Intent defaultResponsePlatforms */
  var defaultResponsePlatforms: js.UndefOr[js.Array[Platform] | Null] = js.native
  /** Intent displayName */
  var displayName: js.UndefOr[String | Null] = js.native
  /** Intent endInteraction */
  var endInteraction: js.UndefOr[Boolean | Null] = js.native
  /** Intent events */
  var events: js.UndefOr[js.Array[String] | Null] = js.native
  /** Intent followupIntentInfo */
  var followupIntentInfo: js.UndefOr[js.Array[IFollowupIntentInfo] | Null] = js.native
  /** Intent inputContextNames */
  var inputContextNames: js.UndefOr[js.Array[String] | Null] = js.native
  /** Intent isFallback */
  var isFallback: js.UndefOr[Boolean | Null] = js.native
  /** Intent messages */
  var messages: js.UndefOr[js.Array[IMessage] | Null] = js.native
  /** Intent mlDisabled */
  var mlDisabled: js.UndefOr[Boolean | Null] = js.native
  /** Intent mlEnabled */
  var mlEnabled: js.UndefOr[Boolean | Null] = js.native
  /** Intent name */
  var name: js.UndefOr[String | Null] = js.native
  /** Intent outputContexts */
  var outputContexts: js.UndefOr[js.Array[IContext] | Null] = js.native
  /** Intent parameters */
  var parameters: js.UndefOr[js.Array[IParameter] | Null] = js.native
  /** Intent parentFollowupIntentName */
  var parentFollowupIntentName: js.UndefOr[String | Null] = js.native
  /** Intent priority */
  var priority: js.UndefOr[Double | Null] = js.native
  /** Intent resetContexts */
  var resetContexts: js.UndefOr[Boolean | Null] = js.native
  /** Intent rootFollowupIntentName */
  var rootFollowupIntentName: js.UndefOr[String | Null] = js.native
  /** Intent trainingPhrases */
  var trainingPhrases: js.UndefOr[js.Array[ITrainingPhrase] | Null] = js.native
  /** Intent webhookState */
  var webhookState: js.UndefOr[WebhookState | Null] = js.native
}

object IIntent {
  @scala.inline
  def apply(): IIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIntent]
  }
  @scala.inline
  implicit class IIntentOps[Self <: IIntent] (val x: Self) extends AnyVal {
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
    def withActionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(null)
        ret
    }
    @scala.inline
    def withDefaultResponsePlatforms(value: js.Array[Platform]): Self = {
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
    def withDefaultResponsePlatformsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResponsePlatforms")(null)
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
    def withDisplayNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(null)
        ret
    }
    @scala.inline
    def withEndInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withEndInteractionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInteraction")(null)
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
    def withEventsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(null)
        ret
    }
    @scala.inline
    def withFollowupIntentInfo(value: js.Array[IFollowupIntentInfo]): Self = {
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
    def withFollowupIntentInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupIntentInfo")(null)
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
    def withInputContextNamesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContextNames")(null)
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
    def withIsFallbackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFallback")(null)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[IMessage]): Self = {
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
    def withMessagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(null)
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
    def withMlDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mlDisabled")(null)
        ret
    }
    @scala.inline
    def withMlEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mlEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMlEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mlEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMlEnabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mlEnabled")(null)
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
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withOutputContexts(value: js.Array[IContext]): Self = {
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
    def withOutputContextsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContexts")(null)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[IParameter]): Self = {
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
    def withParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(null)
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
    def withParentFollowupIntentNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFollowupIntentName")(null)
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
    def withPriorityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(null)
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
    def withResetContextsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetContexts")(null)
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
    def withRootFollowupIntentNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFollowupIntentName")(null)
        ret
    }
    @scala.inline
    def withTrainingPhrases(value: js.Array[ITrainingPhrase]): Self = {
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
    def withTrainingPhrasesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingPhrases")(null)
        ret
    }
    @scala.inline
    def withWebhookState(value: WebhookState): Self = {
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
    @scala.inline
    def withWebhookStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookState")(null)
        ret
    }
  }
  
}

