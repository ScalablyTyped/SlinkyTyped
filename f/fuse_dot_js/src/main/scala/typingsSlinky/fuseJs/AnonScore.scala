package typingsSlinky.fuseJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScore extends js.Object {
  var score: Double = js.native
}

object AnonScore {
  @scala.inline
  def apply(score: Double): AnonScore = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScore]
  }
  @scala.inline
  implicit class AnonScoreOps[Self <: AnonScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

