package typingsSlinky.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiagonal extends js.Object {
  var diagonal: js.UndefOr[Boolean] = js.native
}

object AnonDiagonal {
  @scala.inline
  def apply(): AnonDiagonal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDiagonal]
  }
  @scala.inline
  implicit class AnonDiagonalOps[Self <: AnonDiagonal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagonal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagonal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonal")(js.undefined)
        ret
    }
  }
  
}

