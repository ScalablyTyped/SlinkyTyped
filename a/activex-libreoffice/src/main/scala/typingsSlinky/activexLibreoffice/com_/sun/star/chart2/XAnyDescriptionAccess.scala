package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.XChartDataChangeEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.XComplexDescriptionAccess
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Offers any access to column and row descriptions. This allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.4
  */
@js.native
trait XAnyDescriptionAccess extends XComplexDescriptionAccess {
  
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  val AnyColumnDescriptions: SafeArray[SafeArray[_]] = js.native
  
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  val AnyRowDescriptions: SafeArray[SafeArray[_]] = js.native
  
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  def getAnyColumnDescriptions(): SafeArray[SafeArray[_]] = js.native
  
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  def getAnyRowDescriptions(): SafeArray[SafeArray[_]] = js.native
  
  /**
    * sets the descriptions for all columns.
    * @param rColumnDescriptions a sequence of sequences of anys which represent the descriptions of all columns. The outer index represents different columns
    */
  def setAnyColumnDescriptions(rColumnDescriptions: SeqEquiv[SeqEquiv[_]]): Unit = js.native
  
  /**
    * sets the descriptions for all rows.
    * @param rRowDescriptions a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner
    */
  def setAnyRowDescriptions(rRowDescriptions: SeqEquiv[SeqEquiv[_]]): Unit = js.native
}
object XAnyDescriptionAccess {
  
  @scala.inline
  def apply(
    AnyColumnDescriptions: SafeArray[SafeArray[_]],
    AnyRowDescriptions: SafeArray[SafeArray[_]],
    ColumnDescriptions: SafeArray[String],
    ComplexColumnDescriptions: SafeArray[SafeArray[String]],
    ComplexRowDescriptions: SafeArray[SafeArray[String]],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    getAnyColumnDescriptions: () => SafeArray[SafeArray[_]],
    getAnyRowDescriptions: () => SafeArray[SafeArray[_]],
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
    setAnyColumnDescriptions: SeqEquiv[SeqEquiv[_]] => Unit,
    setAnyRowDescriptions: SeqEquiv[SeqEquiv[_]] => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setComplexColumnDescriptions: SeqEquiv[SeqEquiv[String]] => Unit,
    setComplexRowDescriptions: SeqEquiv[SeqEquiv[String]] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit
  ): XAnyDescriptionAccess = {
    val __obj = js.Dynamic.literal(AnyColumnDescriptions = AnyColumnDescriptions.asInstanceOf[js.Any], AnyRowDescriptions = AnyRowDescriptions.asInstanceOf[js.Any], ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], ComplexColumnDescriptions = ComplexColumnDescriptions.asInstanceOf[js.Any], ComplexRowDescriptions = ComplexRowDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getAnyColumnDescriptions = js.Any.fromFunction0(getAnyColumnDescriptions), getAnyRowDescriptions = js.Any.fromFunction0(getAnyRowDescriptions), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getComplexColumnDescriptions = js.Any.fromFunction0(getComplexColumnDescriptions), getComplexRowDescriptions = js.Any.fromFunction0(getComplexRowDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setAnyColumnDescriptions = js.Any.fromFunction1(setAnyColumnDescriptions), setAnyRowDescriptions = js.Any.fromFunction1(setAnyRowDescriptions), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setComplexColumnDescriptions = js.Any.fromFunction1(setComplexColumnDescriptions), setComplexRowDescriptions = js.Any.fromFunction1(setComplexRowDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
    __obj.asInstanceOf[XAnyDescriptionAccess]
  }
  
  @scala.inline
  implicit class XAnyDescriptionAccessOps[Self <: XAnyDescriptionAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnyColumnDescriptions(value: SafeArray[SafeArray[_]]): Self = this.set("AnyColumnDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyRowDescriptions(value: SafeArray[SafeArray[_]]): Self = this.set("AnyRowDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAnyColumnDescriptions(value: () => SafeArray[SafeArray[_]]): Self = this.set("getAnyColumnDescriptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnyRowDescriptions(value: () => SafeArray[SafeArray[_]]): Self = this.set("getAnyRowDescriptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAnyColumnDescriptions(value: SeqEquiv[SeqEquiv[_]] => Unit): Self = this.set("setAnyColumnDescriptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnyRowDescriptions(value: SeqEquiv[SeqEquiv[_]] => Unit): Self = this.set("setAnyRowDescriptions", js.Any.fromFunction1(value))
  }
}
