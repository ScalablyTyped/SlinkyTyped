package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SentimentAnalysisResult. */
@js.native
trait ISentimentAnalysisResult extends js.Object {
  /** SentimentAnalysisResult queryTextSentiment */
  var queryTextSentiment: js.UndefOr[ISentiment | Null] = js.native
}

object ISentimentAnalysisResult {
  @scala.inline
  def apply(): ISentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentimentAnalysisResult]
  }
  @scala.inline
  implicit class ISentimentAnalysisResultOps[Self <: ISentimentAnalysisResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryTextSentiment(value: ISentiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTextSentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryTextSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTextSentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryTextSentimentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTextSentiment")(null)
        ret
    }
  }
  
}

