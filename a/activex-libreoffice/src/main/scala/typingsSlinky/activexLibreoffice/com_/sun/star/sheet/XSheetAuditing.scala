package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods to access auditing (detective) features in a spreadsheet. */
@js.native
trait XSheetAuditing extends XInterface {
  /** removes all auditing arrows from the spreadsheet. */
  def clearArrows(): Unit = js.native
  /**
    * removes arrows for one level of dependents of a formula cell.
    *
    * If the method is executed again for the same cell, the previous level of dependent cells is removed.
    * @param aPosition the address of the formula cell.
    */
  def hideDependents(aPosition: CellAddress): Boolean = js.native
  /**
    * removes arrows for one level of precedents of a formula cell.
    *
    * If the method is executed again for the same cell, the previous level of dependent cells is removed.
    * @param aPosition the address of the formula cell.
    */
  def hidePrecedents(aPosition: CellAddress): Boolean = js.native
  /**
    * draws arrows between a formula cell and its dependents.
    *
    * If the method is executed again for the same cell, the next level of dependent cells is marked.
    * @param aPosition the address of the formula cell.
    */
  def showDependents(aPosition: CellAddress): Boolean = js.native
  /** draws arrows between a formula cell containing an error and the cells causing the error. */
  def showErrors(aPosition: CellAddress): Boolean = js.native
  /** marks all cells containing invalid values. */
  def showInvalid(): Boolean = js.native
  /**
    * draws arrows between a formula cell and its precedents.
    *
    * If the method is executed again for the same cell, the next level of dependent cells is marked.
    * @param aPosition the address of the formula cell.
    */
  def showPrecedents(aPosition: CellAddress): Boolean = js.native
}

object XSheetAuditing {
  @scala.inline
  def apply(
    acquire: () => Unit,
    clearArrows: () => Unit,
    hideDependents: CellAddress => Boolean,
    hidePrecedents: CellAddress => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    showDependents: CellAddress => Boolean,
    showErrors: CellAddress => Boolean,
    showInvalid: () => Boolean,
    showPrecedents: CellAddress => Boolean
  ): XSheetAuditing = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clearArrows = js.Any.fromFunction0(clearArrows), hideDependents = js.Any.fromFunction1(hideDependents), hidePrecedents = js.Any.fromFunction1(hidePrecedents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showDependents = js.Any.fromFunction1(showDependents), showErrors = js.Any.fromFunction1(showErrors), showInvalid = js.Any.fromFunction0(showInvalid), showPrecedents = js.Any.fromFunction1(showPrecedents))
    __obj.asInstanceOf[XSheetAuditing]
  }
  @scala.inline
  implicit class XSheetAuditingOps[Self <: XSheetAuditing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearArrows(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearArrows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideDependents(value: CellAddress => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDependents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHidePrecedents(value: CellAddress => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePrecedents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowDependents(value: CellAddress => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDependents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowErrors(value: CellAddress => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowInvalid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInvalid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowPrecedents(value: CellAddress => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrecedents")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

