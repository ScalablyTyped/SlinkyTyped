package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectSentimentResponse extends js.Object {
  /**
    * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.native
  /**
    * An object that lists the sentiments, and their corresponding confidence levels.
    */
  var SentimentScore: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.SentimentScore] = js.native
}

object DetectSentimentResponse {
  @scala.inline
  def apply(): DetectSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectSentimentResponse]
  }
  @scala.inline
  implicit class DetectSentimentResponseOps[Self <: DetectSentimentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentiment(value: SentimentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withSentimentScore(value: SentimentScore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SentimentScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentimentScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SentimentScore")(js.undefined)
        ret
    }
  }
  
}

