package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectSentimentItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * The sentiment detected in the document.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
    */
  var SentimentScore: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.SentimentScore] = js.native
}

object BatchDetectSentimentItemResult {
  @scala.inline
  def apply(): BatchDetectSentimentItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectSentimentItemResult]
  }
  @scala.inline
  implicit class BatchDetectSentimentItemResultOps[Self <: BatchDetectSentimentItemResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(js.undefined)
        ret
    }
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

