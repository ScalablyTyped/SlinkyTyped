package typingsSlinky.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInsertOnly extends js.Object {
  var insertOnly: js.UndefOr[Boolean] = js.native
}

object AnonInsertOnly {
  @scala.inline
  def apply(): AnonInsertOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInsertOnly]
  }
  @scala.inline
  implicit class AnonInsertOnlyOps[Self <: AnonInsertOnly] (val x: Self) extends AnyVal {
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

