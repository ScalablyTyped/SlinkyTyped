package typingsSlinky.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeEmpty extends js.Object {
  var includeEmpty: Boolean = js.native
}

object IncludeEmpty {
  @scala.inline
  def apply(includeEmpty: Boolean): IncludeEmpty = {
    val __obj = js.Dynamic.literal(includeEmpty = includeEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmpty]
  }
  @scala.inline
  implicit class IncludeEmptyOps[Self <: IncludeEmpty] (val x: Self) extends AnyVal {
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

