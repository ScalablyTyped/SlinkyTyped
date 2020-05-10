package typingsSlinky.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpand extends js.Object {
  val Expand: Boolean = js.native
}

object AnonExpand {
  @scala.inline
  def apply(Expand: Boolean): AnonExpand = {
    val __obj = js.Dynamic.literal(Expand = Expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpand]
  }
  @scala.inline
  implicit class AnonExpandOps[Self <: AnonExpand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

