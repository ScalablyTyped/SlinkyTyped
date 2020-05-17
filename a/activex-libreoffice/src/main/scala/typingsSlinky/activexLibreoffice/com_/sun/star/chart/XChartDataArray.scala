package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to data represented as an array of rows.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  *
  * If used for an {@link XYDiagram} , the row number 0 represents the **x** -values.
  */
@js.native
trait XChartDataArray extends XChartData {
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  var ColumnDescriptions: SafeArray[String] = js.native
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  var Data: SafeArray[SafeArray[Double]] = js.native
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  var RowDescriptions: SafeArray[String] = js.native
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  def getColumnDescriptions(): SafeArray[String] = js.native
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  def getData(): SafeArray[SafeArray[Double]] = js.native
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  def getRowDescriptions(): SafeArray[String] = js.native
  /**
    * sets the description texts for all columns.
    * @param aColumnDescriptions a sequence of strings which represent a description for each column.
    */
  def setColumnDescriptions(aColumnDescriptions: SeqEquiv[String]): Unit = js.native
  /**
    * sets the chart data as an array of numbers.
    * @param aData the values as a sequence of sequences. The inner sequence represents rows.
    */
  def setData(aData: SeqEquiv[SeqEquiv[Double]]): Unit = js.native
  /**
    * sets the description texts for all rows.
    * @param aRowDescriptions a sequence of strings which represent a description for each row.
    */
  def setRowDescriptions(aRowDescriptions: SeqEquiv[String]): Unit = js.native
}

object XChartDataArray {
  @scala.inline
  def apply(
    ColumnDescriptions: SafeArray[String],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    getColumnDescriptions: () => SafeArray[String],
    getData: () => SafeArray[SafeArray[Double]],
    getNotANumber: () => Double,
    getRowDescriptions: () => SafeArray[String],
    isNotANumber: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit
  ): XChartDataArray = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
    __obj.asInstanceOf[XChartDataArray]
  }
  @scala.inline
  implicit class XChartDataArrayOps[Self <: XChartDataArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnDescriptions(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: SafeArray[SafeArray[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowDescriptions(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColumnDescriptions(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnDescriptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetData(value: () => SafeArray[SafeArray[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRowDescriptions(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowDescriptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetColumnDescriptions(value: SeqEquiv[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumnDescriptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetData(value: SeqEquiv[SeqEquiv[Double]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRowDescriptions(value: SeqEquiv[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowDescriptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

