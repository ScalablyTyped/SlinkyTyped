package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a sheet into which contents of the clipboard can be pasted.
  * @deprecated Deprecated
  */
@js.native
trait XSheetPastable extends XInterface {
  /** pastes the contents of the clipboard at the specified position on the sheet. */
  def paste(aDestination: CellAddress): Unit = js.native
  /**
    * pastes clipboard data from a cell range into another cell range.
    *
    * The contents of the clipboard must be from a cell range.
    */
  def pasteCellRange(
    aDestination: CellRangeAddress,
    nOperation: PasteOperation,
    nContents: Double,
    bSkipEmpty: Boolean,
    bTranspose: Boolean,
    bAsLink: Boolean,
    nInsert: CellInsertMode
  ): Unit = js.native
  /** pastes the contents of the clipboard at the specified position on the sheet, using the specified format. */
  def pasteFormat(aDestination: CellAddress, aFormat: String): Unit = js.native
}

object XSheetPastable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    paste: CellAddress => Unit,
    pasteCellRange: (CellRangeAddress, PasteOperation, Double, Boolean, Boolean, Boolean, CellInsertMode) => Unit,
    pasteFormat: (CellAddress, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetPastable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), paste = js.Any.fromFunction1(paste), pasteCellRange = js.Any.fromFunction7(pasteCellRange), pasteFormat = js.Any.fromFunction2(pasteFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetPastable]
  }
  @scala.inline
  implicit class XSheetPastableOps[Self <: XSheetPastable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaste(value: CellAddress => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPasteCellRange(
      value: (CellRangeAddress, PasteOperation, Double, Boolean, Boolean, Boolean, CellInsertMode) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteCellRange")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withPasteFormat(value: (CellAddress, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFormat")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

