package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentimentScore extends js.Object {
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the MIXED sentiment.
    */
  var Mixed: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEGATIVE sentiment.
    */
  var Negative: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEUTRAL sentiment.
    */
  var Neutral: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the POSITIVE sentiment.
    */
  var Positive: js.UndefOr[Float] = js.native
}

object SentimentScore {
  @scala.inline
  def apply(): SentimentScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentScore]
  }
  @scala.inline
  implicit class SentimentScoreOps[Self <: SentimentScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMixed(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mixed")(js.undefined)
        ret
    }
    @scala.inline
    def withNegative(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Negative")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutral(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Neutral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Neutral")(js.undefined)
        ret
    }
    @scala.inline
    def withPositive(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Positive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Positive")(js.undefined)
        ret
    }
  }
  
}

