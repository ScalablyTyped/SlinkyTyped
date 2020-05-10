package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the types of sentiment analysis to perform.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig extends js.Object {
  /**
    * Optional. Instructs the service to perform sentiment analysis on
    * `query_text`. If not provided, sentiment analysis is not performed on
    * `query_text`.
    */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfigOps[Self <: SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzeQueryTextSentiment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeQueryTextSentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzeQueryTextSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeQueryTextSentiment")(js.undefined)
        ret
    }
  }
  
}

