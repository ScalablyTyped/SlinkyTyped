package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentimentResponse extends js.Object {
  /**
    * The inferred sentiment that Amazon Comprehend has the highest confidence in.
    */
  var sentimentLabel: js.UndefOr[SentimentLabel] = js.native
  /**
    * The likelihood that the sentiment was correctly inferred.
    */
  var sentimentScore: js.UndefOr[SentimentScore] = js.native
}

object SentimentResponse {
  @scala.inline
  def apply(): SentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentResponse]
  }
  @scala.inline
  implicit class SentimentResponseOps[Self <: SentimentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentimentLabel(value: SentimentLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentimentLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSentimentScore(value: SentimentScore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentimentScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentScore")(js.undefined)
        ret
    }
  }
  
}

