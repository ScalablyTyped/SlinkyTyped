package typingsSlinky.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeEmpty extends js.Object {
  var includeEmpty: Boolean = js.native
}

object AnonIncludeEmpty {
  @scala.inline
  def apply(includeEmpty: Boolean): AnonIncludeEmpty = {
    val __obj = js.Dynamic.literal(includeEmpty = includeEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeEmpty]
  }
  @scala.inline
  implicit class AnonIncludeEmptyOps[Self <: AnonIncludeEmpty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

