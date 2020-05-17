package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Concat extends js.Object {
  var LeftSide: String | Concat = js.native
  var RightSide: String | Concat = js.native
}

object Concat {
  @scala.inline
  def apply(LeftSide: String | Concat, RightSide: String | Concat): Concat = {
    val __obj = js.Dynamic.literal(LeftSide = LeftSide.asInstanceOf[js.Any], RightSide = RightSide.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concat]
  }
  @scala.inline
  implicit class ConcatOps[Self <: Concat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftSide(value: String | Concat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightSide(value: String | Concat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightSide")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

