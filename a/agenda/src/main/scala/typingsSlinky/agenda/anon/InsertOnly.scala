package typingsSlinky.agenda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertOnly extends js.Object {
  var insertOnly: js.UndefOr[Boolean] = js.native
}

object InsertOnly {
  @scala.inline
  def apply(): InsertOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOnly]
  }
  @scala.inline
  implicit class InsertOnlyOps[Self <: InsertOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOnly")(js.undefined)
        ret
    }
  }
  
}

