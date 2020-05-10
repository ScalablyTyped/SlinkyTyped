package typingsSlinky.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origin extends js.Object {
  /**
    * The x position on the page, with 0 being the left edge and 1 being the right edge.
    * @default 0.5
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y position on the page, with 0 being the left edge and 1 being the right edge.
    * @default 0.5
    */
  var y: js.UndefOr[Double] = js.native
}

object Origin {
  @scala.inline
  def apply(): Origin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origin]
  }
  @scala.inline
  implicit class OriginOps[Self <: Origin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

