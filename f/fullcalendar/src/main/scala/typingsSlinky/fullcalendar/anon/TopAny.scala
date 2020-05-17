package typingsSlinky.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopAny extends js.Object {
  var top: js.Any = js.native
}

object TopAny {
  @scala.inline
  def apply(top: js.Any): TopAny = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopAny]
  }
  @scala.inline
  implicit class TopAnyOps[Self <: TopAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

