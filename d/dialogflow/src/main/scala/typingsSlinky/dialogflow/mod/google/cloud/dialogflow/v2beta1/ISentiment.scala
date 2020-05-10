package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Sentiment. */
@js.native
trait ISentiment extends js.Object {
  /** Sentiment magnitude */
  var magnitude: js.UndefOr[Double | Null] = js.native
  /** Sentiment score */
  var score: js.UndefOr[Double | Null] = js.native
}

object ISentiment {
  @scala.inline
  def apply(): ISentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISentiment]
  }
  @scala.inline
  implicit class ISentimentOps[Self <: ISentiment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMagnitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagnitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMagnitudeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnitude")(null)
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(null)
        ret
    }
  }
  
}

