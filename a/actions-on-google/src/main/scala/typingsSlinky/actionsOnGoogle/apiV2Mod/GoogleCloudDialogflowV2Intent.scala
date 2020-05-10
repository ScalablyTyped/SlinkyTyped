package typingsSlinky.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2Intent extends js.Object {
  var action: js.UndefOr[String] = js.native
  var defaultResponsePlatforms: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var events: js.UndefOr[js.Array[String]] = js.native
  var followupIntentInfo: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo]] = js.native
  var inputContextNames: js.UndefOr[js.Array[String]] = js.native
  var isFallback: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.native
  var mlDisabled: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.native
  var parameters: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentParameter]] = js.native
  var parentFollowupIntentName: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var resetContexts: js.UndefOr[Boolean] = js.native
  var rootFollowupIntentName: js.UndefOr[String] = js.native
  var trainingPhrases: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase]] = js.native
  var webhookState: js.UndefOr[GoogleCloudDialogflowV2IntentWebhookState] = js.native
}

object GoogleCloudDialogflowV2Intent {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Intent]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentOps[Self <: GoogleCloudDialogflowV2Intent] (val x: Self) extends AnyVal {
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
    def withDefaultResponsePlatforms(value: js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms]): Self = {
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
    def withFollowupIntentInfo(value: js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo]): Self = {
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
    def withMessages(value: js.Array[GoogleCloudDialogflowV2IntentMessage]): Self = {
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
    def withOutputContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = {
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
    def withParameters(value: js.Array[GoogleCloudDialogflowV2IntentParameter]): Self = {
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
    def withTrainingPhrases(value: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase]): Self = {
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
    def withWebhookState(value: GoogleCloudDialogflowV2IntentWebhookState): Self = {
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

