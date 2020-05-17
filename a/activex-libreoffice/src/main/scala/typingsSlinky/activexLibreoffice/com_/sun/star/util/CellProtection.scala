package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the kind of protection for a protectable cell. */
@js.native
trait CellProtection extends js.Object {
  /** specifies if the formula is hidden from the user. */
  var IsFormulaHidden: Boolean = js.native
  /** specifies if the cell is hidden from the user. */
  var IsHidden: Boolean = js.native
  /** specifies if the cell is locked from modifications by the user. */
  var IsLocked: Boolean = js.native
  /** specifies if the cell is hidden on printouts. */
  var IsPrintHidden: Boolean = js.native
}

object CellProtection {
  @scala.inline
  def apply(IsFormulaHidden: Boolean, IsHidden: Boolean, IsLocked: Boolean, IsPrintHidden: Boolean): CellProtection = {
    val __obj = js.Dynamic.literal(IsFormulaHidden = IsFormulaHidden.asInstanceOf[js.Any], IsHidden = IsHidden.asInstanceOf[js.Any], IsLocked = IsLocked.asInstanceOf[js.Any], IsPrintHidden = IsPrintHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProtection]
  }
  @scala.inline
  implicit class CellProtectionOps[Self <: CellProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFormulaHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFormulaHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrintHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPrintHidden")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

