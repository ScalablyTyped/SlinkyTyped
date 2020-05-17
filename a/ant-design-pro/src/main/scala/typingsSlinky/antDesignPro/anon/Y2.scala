package typingsSlinky.antDesignPro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Y2 extends js.Object {
  var y1: String = js.native
  var y2: js.UndefOr[String] = js.native
}

object Y2 {
  @scala.inline
  def apply(y1: String): Y2 = {
    val __obj = js.Dynamic.literal(y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y2]
  }
  @scala.inline
  implicit class Y2Ops[Self <: Y2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withY1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(js.undefined)
        ret
    }
  }
  
}

