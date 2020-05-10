package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SentimentAnalysisRequestConfig. */
@js.native
trait ISentimentAnalysisRequestConfig extends js.Object {
  /** SentimentAnalysisRequestConfig analyzeQueryTextSentiment */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean | Null] = js.native
}

object ISentimentAnalysisRequestConfig {
  @scala.inline
  def apply(): ISentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentimentAnalysisRequestConfig]
  }
  @scala.inline
  implicit class ISentimentAnalysisRequestConfigOps[Self <: ISentimentAnalysisRequestConfig] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withAnalyzeQueryTextSentimentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeQueryTextSentiment")(null)
        ret
    }
  }
  
}

