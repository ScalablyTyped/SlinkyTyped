package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.`type`.ILatLng
import typingsSlinky.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QueryParameters. */
@js.native
trait IQueryParameters extends js.Object {
  /** QueryParameters contexts */
  var contexts: js.UndefOr[js.Array[IContext] | Null] = js.native
  /** QueryParameters geoLocation */
  var geoLocation: js.UndefOr[ILatLng | Null] = js.native
  /** QueryParameters knowledgeBaseNames */
  var knowledgeBaseNames: js.UndefOr[js.Array[String] | Null] = js.native
  /** QueryParameters payload */
  var payload: js.UndefOr[IStruct | Null] = js.native
  /** QueryParameters resetContexts */
  var resetContexts: js.UndefOr[Boolean | Null] = js.native
  /** QueryParameters sentimentAnalysisRequestConfig */
  var sentimentAnalysisRequestConfig: js.UndefOr[ISentimentAnalysisRequestConfig | Null] = js.native
  /** QueryParameters sessionEntityTypes */
  var sessionEntityTypes: js.UndefOr[js.Array[ISessionEntityType] | Null] = js.native
  /** QueryParameters timeZone */
  var timeZone: js.UndefOr[String | Null] = js.native
}

object IQueryParameters {
  @scala.inline
  def apply(): IQueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryParameters]
  }
  @scala.inline
  implicit class IQueryParametersOps[Self <: IQueryParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[IContext]): Self = {
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
    def withContextsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(null)
        ret
    }
    @scala.inline
    def withGeoLocation(value: ILatLng): Self = {
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
    def withGeoLocationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoLocation")(null)
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
    def withKnowledgeBaseNamesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBaseNames")(null)
        ret
    }
    @scala.inline
    def withPayload(value: IStruct): Self = {
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
    def withPayloadNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(null)
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
    def withSentimentAnalysisRequestConfig(value: ISentimentAnalysisRequestConfig): Self = {
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
    def withSentimentAnalysisRequestConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentAnalysisRequestConfig")(null)
        ret
    }
    @scala.inline
    def withSessionEntityTypes(value: js.Array[ISessionEntityType]): Self = {
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
    def withSessionEntityTypesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityTypes")(null)
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

