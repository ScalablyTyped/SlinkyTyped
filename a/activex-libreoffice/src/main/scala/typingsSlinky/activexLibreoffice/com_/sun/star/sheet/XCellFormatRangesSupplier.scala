package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of equal-formatted cell ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
@js.native
trait XCellFormatRangesSupplier extends XInterface {
  /**
    * returns a collection of equal-formatted cell ranges.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    * @returns the collection of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  val CellFormatRanges: XIndexAccess = js.native
  /**
    * returns a collection of equal-formatted cell ranges.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    * @returns the collection of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  def getCellFormatRanges(): XIndexAccess = js.native
}

object XCellFormatRangesSupplier {
  @scala.inline
  def apply(
    CellFormatRanges: XIndexAccess,
    acquire: () => Unit,
    getCellFormatRanges: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellFormatRangesSupplier = {
    val __obj = js.Dynamic.literal(CellFormatRanges = CellFormatRanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCellFormatRanges = js.Any.fromFunction0(getCellFormatRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellFormatRangesSupplier]
  }
  @scala.inline
  implicit class XCellFormatRangesSupplierOps[Self <: XCellFormatRangesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellFormatRanges(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellFormatRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCellFormatRanges(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellFormatRanges")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

