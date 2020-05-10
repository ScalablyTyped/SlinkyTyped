package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vote extends js.Object {
  var downs: Double = js.native
  var ups: Double = js.native
}

object Vote {
  @scala.inline
  def apply(downs: Double, ups: Double): Vote = {
    val __obj = js.Dynamic.literal(downs = downs.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vote]
  }
  @scala.inline
  implicit class VoteOps[Self <: Vote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDowns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

