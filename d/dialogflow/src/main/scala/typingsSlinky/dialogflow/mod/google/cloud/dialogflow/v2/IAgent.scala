package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Agent.ApiVersion
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Agent.MatchMode
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Agent.Tier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Agent. */
@js.native
trait IAgent extends js.Object {
  /** Agent apiVersion */
  var apiVersion: js.UndefOr[ApiVersion | Null] = js.native
  /** Agent avatarUri */
  var avatarUri: js.UndefOr[String | Null] = js.native
  /** Agent classificationThreshold */
  var classificationThreshold: js.UndefOr[Double | Null] = js.native
  /** Agent defaultLanguageCode */
  var defaultLanguageCode: js.UndefOr[String | Null] = js.native
  /** Agent description */
  var description: js.UndefOr[String | Null] = js.native
  /** Agent displayName */
  var displayName: js.UndefOr[String | Null] = js.native
  /** Agent enableLogging */
  var enableLogging: js.UndefOr[Boolean | Null] = js.native
  /** Agent matchMode */
  var matchMode: js.UndefOr[MatchMode | Null] = js.native
  /** Agent parent */
  var parent: js.UndefOr[String | Null] = js.native
  /** Agent supportedLanguageCodes */
  var supportedLanguageCodes: js.UndefOr[js.Array[String] | Null] = js.native
  /** Agent tier */
  var tier: js.UndefOr[Tier | Null] = js.native
  /** Agent timeZone */
  var timeZone: js.UndefOr[String | Null] = js.native
}

object IAgent {
  @scala.inline
  def apply(): IAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAgent]
  }
  @scala.inline
  implicit class IAgentOps[Self <: IAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: ApiVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withApiVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(null)
        ret
    }
    @scala.inline
    def withAvatarUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatarUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarUri")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatarUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarUri")(null)
        ret
    }
    @scala.inline
    def withClassificationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassificationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withClassificationThresholdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationThreshold")(null)
        ret
    }
    @scala.inline
    def withDefaultLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLanguageCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguageCode")(null)
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
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
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
    def withEnableLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLoggingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(null)
        ret
    }
    @scala.inline
    def withMatchMode(value: MatchMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchModeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMode")(null)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
    @scala.inline
    def withSupportedLanguageCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedLanguageCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedLanguageCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedLanguageCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedLanguageCodesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedLanguageCodes")(null)
        ret
    }
    @scala.inline
    def withTier(value: Tier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(js.undefined)
        ret
    }
    @scala.inline
    def withTierNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(null)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(null)
        ret
    }
  }
  
}

