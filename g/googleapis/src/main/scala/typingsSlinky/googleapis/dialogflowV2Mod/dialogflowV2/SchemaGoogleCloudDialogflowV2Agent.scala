package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a conversational agent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2Agent extends js.Object {
  /**
    * Optional. The URI of the agent&#39;s avatar. Avatars are used throughout
    * the Dialogflow console and in the self-hosted [Web
    * Demo](https://cloud.google.com/dialogflow-enterprise/docs/integrations/web-demo)
    * integration.
    */
  var avatarUri: js.UndefOr[String] = js.native
  /**
    * Optional. To filter out false positive results and still get variety in
    * matched natural language inputs for your agent, you can tune the machine
    * learning classification threshold. If the returned score value is less
    * than the threshold value, then a fallback intent will be triggered or, if
    * there are no fallback intents defined, no intent will be triggered. The
    * score values range from 0.0 (completely uncertain) to 1.0 (completely
    * certain). If set to 0.0, the default of 0.3 is used.
    */
  var classificationThreshold: js.UndefOr[Double] = js.native
  /**
    * Required. The default language of the agent as a language tag. See
    * [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. This field cannot
    * be set by the `Update` method.
    */
  var defaultLanguageCode: js.UndefOr[String] = js.native
  /**
    * Optional. The description of this agent. The maximum length is 500
    * characters. If exceeded, the request is rejected.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The name of this agent.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. Determines whether this agent should log conversation queries.
    */
  var enableLogging: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Determines how intents are detected from user queries.
    */
  var matchMode: js.UndefOr[String] = js.native
  /**
    * Required. The project of this agent. Format: `projects/&lt;Project
    * ID&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Optional. The list of all languages supported by this agent (except for
    * the `default_language_code`).
    */
  var supportedLanguageCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The time zone of this agent from the [time zone
    * database](https://www.iana.org/time-zones), e.g., America/New_York,
    * Europe/Paris.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2Agent {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2Agent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Agent]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2AgentOps[Self <: SchemaGoogleCloudDialogflowV2Agent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMatchMode(value: String): Self = {
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
  }
  
}

