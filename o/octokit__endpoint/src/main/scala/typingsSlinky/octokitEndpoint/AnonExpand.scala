package typingsSlinky.octokitEndpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpand extends js.Object {
  def expand(context: js.Object): String = js.native
}

object AnonExpand {
  @scala.inline
  def apply(expand: js.Object => String): AnonExpand = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
    __obj.asInstanceOf[AnonExpand]
  }
  @scala.inline
  implicit class AnonExpandOps[Self <: AnonExpand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpand(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

