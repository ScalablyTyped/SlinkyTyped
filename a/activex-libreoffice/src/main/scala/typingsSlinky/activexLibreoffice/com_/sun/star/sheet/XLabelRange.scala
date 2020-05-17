package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a label range in a spreadsheet document.
  *
  * These can be column or row labels, depending on where they are used.
  * @see com.sun.star.sheet.LabelRange
  */
@js.native
trait XLabelRange extends XInterface {
  /** returns the cell range address for which the labels are valid. */
  var DataArea: CellRangeAddress = js.native
  /** returns the cell range address that contains the labels. */
  var LabelArea: CellRangeAddress = js.native
  /** returns the cell range address for which the labels are valid. */
  def getDataArea(): CellRangeAddress = js.native
  /** returns the cell range address that contains the labels. */
  def getLabelArea(): CellRangeAddress = js.native
  /** sets the cell range address for which the labels are valid. */
  def setDataArea(aDataArea: CellRangeAddress): Unit = js.native
  /** sets the cell range address that contains the labels. */
  def setLabelArea(aLabelArea: CellRangeAddress): Unit = js.native
}

object XLabelRange {
  @scala.inline
  def apply(
    DataArea: CellRangeAddress,
    LabelArea: CellRangeAddress,
    acquire: () => Unit,
    getDataArea: () => CellRangeAddress,
    getLabelArea: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDataArea: CellRangeAddress => Unit,
    setLabelArea: CellRangeAddress => Unit
  ): XLabelRange = {
    val __obj = js.Dynamic.literal(DataArea = DataArea.asInstanceOf[js.Any], LabelArea = LabelArea.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataArea = js.Any.fromFunction0(getDataArea), getLabelArea = js.Any.fromFunction0(getLabelArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDataArea = js.Any.fromFunction1(setDataArea), setLabelArea = js.Any.fromFunction1(setLabelArea))
    __obj.asInstanceOf[XLabelRange]
  }
  @scala.inline
  implicit class XLabelRangeOps[Self <: XLabelRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataArea(value: CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelArea(value: CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDataArea(value: () => CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataArea")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabelArea(value: () => CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelArea")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataArea(value: CellRangeAddress => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataArea")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabelArea(value: CellRangeAddress => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelArea")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

