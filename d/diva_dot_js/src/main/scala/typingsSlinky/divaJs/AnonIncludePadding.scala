package typingsSlinky.divaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludePadding extends js.Object {
  var includePadding: Boolean = js.native
}

object AnonIncludePadding {
  @scala.inline
  def apply(includePadding: Boolean): AnonIncludePadding = {
    val __obj = js.Dynamic.literal(includePadding = includePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludePadding]
  }
  @scala.inline
  implicit class AnonIncludePaddingOps[Self <: AnonIncludePadding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludePadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePadding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

