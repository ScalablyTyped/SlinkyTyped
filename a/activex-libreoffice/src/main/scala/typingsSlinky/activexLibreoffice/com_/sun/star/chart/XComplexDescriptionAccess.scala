package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Offers access to complex column and row descriptions.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.3
  */
@js.native
trait XComplexDescriptionAccess extends XChartDataArray {
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  var ComplexColumnDescriptions: SafeArray[SafeArray[String]] = js.native
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  var ComplexRowDescriptions: SafeArray[SafeArray[String]] = js.native
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  def getComplexColumnDescriptions(): SafeArray[SafeArray[String]] = js.native
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  def getComplexRowDescriptions(): SafeArray[SafeArray[String]] = js.native
  /**
    * sets the description texts for all columns.
    * @param rColumnDescriptions a sequence of sequences of strings which represent the descriptions of all columns. The outer index represents different colu
    */
  def setComplexColumnDescriptions(rColumnDescriptions: SeqEquiv[SeqEquiv[String]]): Unit = js.native
  /**
    * sets the description texts for all rows.
    * @param rRowDescriptions a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inn
    */
  def setComplexRowDescriptions(rRowDescriptions: SeqEquiv[SeqEquiv[String]]): Unit = js.native
}

object XComplexDescriptionAccess {
  @scala.inline
  def apply(
    ColumnDescriptions: SafeArray[String],
    ComplexColumnDescriptions: SafeArray[SafeArray[String]],
    ComplexRowDescriptions: SafeArray[SafeArray[String]],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    getColumnDescriptions: () => SafeArray[String],
    getComplexColumnDescriptions: () => SafeArray[SafeArray[String]],
    getComplexRowDescriptions: () => SafeArray[SafeArray[String]],
    getData: () => SafeArray[SafeArray[Double]],
    getNotANumber: () => Double,
    getRowDescriptions: () => SafeArray[String],
    isNotANumber: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setComplexColumnDescriptions: SeqEquiv[SeqEquiv[String]] => Unit,
    setComplexRowDescriptions: SeqEquiv[SeqEquiv[String]] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit
  ): XComplexDescriptionAccess = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], ComplexColumnDescriptions = ComplexColumnDescriptions.asInstanceOf[js.Any], ComplexRowDescriptions = ComplexRowDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getComplexColumnDescriptions = js.Any.fromFunction0(getComplexColumnDescriptions), getComplexRowDescriptions = js.Any.fromFunction0(getComplexRowDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setComplexColumnDescriptions = js.Any.fromFunction1(setComplexColumnDescriptions), setComplexRowDescriptions = js.Any.fromFunction1(setComplexRowDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
    __obj.asInstanceOf[XComplexDescriptionAccess]
  }
  @scala.inline
  implicit class XComplexDescriptionAccessOps[Self <: XComplexDescriptionAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplexColumnDescriptions(value: SafeArray[SafeArray[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplexColumnDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplexRowDescriptions(value: SafeArray[SafeArray[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplexRowDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComplexColumnDescriptions(value: () => SafeArray[SafeArray[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComplexColumnDescriptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetComplexRowDescriptions(value: () => SafeArray[SafeArray[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComplexRowDescriptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetComplexColumnDescriptions(value: SeqEquiv[SeqEquiv[String]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComplexColumnDescriptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetComplexRowDescriptions(value: SeqEquiv[SeqEquiv[String]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComplexRowDescriptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

