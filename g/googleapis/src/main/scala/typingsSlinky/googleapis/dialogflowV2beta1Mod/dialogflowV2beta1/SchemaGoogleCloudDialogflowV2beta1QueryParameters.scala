package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the parameters of the conversational query.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1QueryParameters extends js.Object {
  /**
    * Optional. The collection of contexts to be activated before this query is
    * executed.
    */
  var contexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Context]] = js.native
  /**
    * Optional. The geo location of this conversational query.
    */
  var geoLocation: js.UndefOr[SchemaGoogleTypeLatLng] = js.native
  /**
    * Optional. KnowledgeBases to get alternative results from. If not set, the
    * KnowledgeBases enabled in the agent (through UI) will be used. Format:
    * `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
    */
  var knowledgeBaseNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. This field can be used to pass custom data into the webhook
    * associated with the agent. Arbitrary JSON objects are supported.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Optional. Specifies whether to delete all contexts in the current session
    * before the new ones are activated.
    */
  var resetContexts: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Configures the type of sentiment analysis to perform. If not
    * provided, sentiment analysis is not performed. Note: Sentiment Analysis
    * is only currently available for Enterprise Edition agents.
    */
  var sentimentAnalysisRequestConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig] = js.native
  /**
    * Optional. Additional session entity types to replace or extend developer
    * entity types with. The entity synonyms apply to all languages and persist
    * for the session of this query.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]] = js.native
  /**
    * Optional. The time zone of this conversational query from the [time zone
    * database](https://www.iana.org/time-zones), e.g., America/New_York,
    * Europe/Paris. If not provided, the time zone specified in agent settings
    * is used.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1QueryParameters {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1QueryParameters]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1QueryParametersOps[Self <: SchemaGoogleCloudDialogflowV2beta1QueryParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoLocation(value: SchemaGoogleTypeLatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withKnowledgeBaseNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBaseNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnowledgeBaseNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBaseNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
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
    def withSentimentAnalysisRequestConfig(value: SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentAnalysisRequestConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentimentAnalysisRequestConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentAnalysisRequestConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionEntityTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityTypes")(js.undefined)
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

