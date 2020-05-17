package typingsSlinky.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrecencyScore extends js.Object {
  var _frecencyScore: js.UndefOr[Double] = js.native
}

object FrecencyScore {
  @scala.inline
  def apply(): FrecencyScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrecencyScore]
  }
  @scala.inline
  implicit class FrecencyScoreOps[Self <: FrecencyScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_frecencyScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frecencyScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_frecencyScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frecencyScore")(js.undefined)
        ret
    }
  }
  
}

