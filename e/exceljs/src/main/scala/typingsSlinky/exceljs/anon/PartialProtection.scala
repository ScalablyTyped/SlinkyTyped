package typingsSlinky.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Protection> */
@js.native
trait PartialProtection extends js.Object {
  var locked: js.UndefOr[Boolean] = js.native
}

object PartialProtection {
  @scala.inline
  def apply(): PartialProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProtection]
  }
  @scala.inline
  implicit class PartialProtectionOps[Self <: PartialProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
  }
  
}

