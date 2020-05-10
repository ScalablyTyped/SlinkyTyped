package typingsSlinky.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRank extends js.Object {
  var rank: Double = js.native
  var rank_img: String = js.native
}

object AnonRank {
  @scala.inline
  def apply(rank: Double, rank_img: String): AnonRank = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], rank_img = rank_img.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRank]
  }
  @scala.inline
  implicit class AnonRankOps[Self <: AnonRank] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank_img(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank_img")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

