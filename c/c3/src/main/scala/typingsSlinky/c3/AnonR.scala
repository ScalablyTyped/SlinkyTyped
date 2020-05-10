package typingsSlinky.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonR extends js.Object {
  /**
    * The radius size of each point on selected.
    */
  var r: js.UndefOr[Double] = js.native
}

object AnonR {
  @scala.inline
  def apply(): AnonR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonR]
  }
  @scala.inline
  implicit class AnonROps[Self <: AnonR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(js.undefined)
        ret
    }
  }
  
}

