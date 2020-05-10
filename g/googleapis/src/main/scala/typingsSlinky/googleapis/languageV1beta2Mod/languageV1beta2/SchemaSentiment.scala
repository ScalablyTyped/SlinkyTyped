package typingsSlinky.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the feeling associated with the entire text or entities in the
  * text. Next ID: 6
  */
@js.native
trait SchemaSentiment extends js.Object {
  /**
    * A non-negative number in the [0, +inf) range, which represents the
    * absolute magnitude of sentiment regardless of score (positive or
    * negative).
    */
  var magnitude: js.UndefOr[Double] = js.native
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
    * sentiment).
    */
  var score: js.UndefOr[Double] = js.native
}

object SchemaSentiment {
  @scala.inline
  def apply(): SchemaSentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSentiment]
  }
  @scala.inline
  implicit class SchemaSentimentOps[Self <: SchemaSentiment] (val x: Self) extends AnyVal {
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
  }
  
}

