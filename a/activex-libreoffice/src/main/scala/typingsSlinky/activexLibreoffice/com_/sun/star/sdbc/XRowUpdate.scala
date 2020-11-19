package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Date
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to update data which is collected in a row. */
@js.native
trait XRowUpdate extends XInterface {
  
  /**
    * updates a column with a stream value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param length how much data should be read out of the stream
    * @throws SQLException if a database access error occurs.
    */
  def updateBinaryStream(columnIndex: Double, x: XInputStream, length: Double): Unit = js.native
  
  /**
    * updates a column with a boolean value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateBoolean(columnIndex: Double, x: Boolean): Unit = js.native
  
  /**
    * updates a column with a byte value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateByte(columnIndex: Double, x: Double): Unit = js.native
  
  /**
    * updates a column with a byte array value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateBytes(columnIndex: Double, x: SeqEquiv[Double]): Unit = js.native
  
  /**
    * updates a column with a stream value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param length how much data should be read out of the stream
    * @throws SQLException if a database access error occurs.
    */
  def updateCharacterStream(columnIndex: Double, x: XInputStream, length: Double): Unit = js.native
  
  /**
    * updates a column with a date value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateDate(columnIndex: Double, x: Date): Unit = js.native
  
  /**
    * updates a column with a double value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateDouble(columnIndex: Double, x: Double): Unit = js.native
  
  /**
    * updates a column with a float value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateFloat(columnIndex: Double, x: Double): Unit = js.native
  
  /**
    * updates a column with an long value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateInt(columnIndex: Double, x: Double): Unit = js.native
  
  /**
    * updates a column with a hyper value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateLong(columnIndex: Double, x: Double): Unit = js.native
  
  /**
    * gives a nullable column a null value.
    * @param columnIndex the position of the column
    * @throws SQLException if a database access error occurs.
    */
  def updateNull(columnIndex: Double): Unit = js.native
  
  /**
    * updates a column with an object value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param scale defines the scale which should be used to write the numeric value
    * @throws SQLException if a database access error occurs.
    */
  def updateNumericObject(columnIndex: Double, x: js.Any, scale: Double): Unit = js.native
  
  /**
    * updates a column with an object value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateObject(columnIndex: Double, x: js.Any): Unit = js.native
  
  /**
    * updates a column with a short value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateShort(columnIndex: Double, x: Double): Unit = js.native
  
  /**
    * updates a column with a string value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateString(columnIndex: Double, x: String): Unit = js.native
  
  /**
    * updates a column with a time value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateTime(columnIndex: Double, x: Time): Unit = js.native
  
  /**
    * updates a column with a timestamp value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateTimestamp(columnIndex: Double, x: DateTime): Unit = js.native
}
object XRowUpdate {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateBinaryStream: (Double, XInputStream, Double) => Unit,
    updateBoolean: (Double, Boolean) => Unit,
    updateByte: (Double, Double) => Unit,
    updateBytes: (Double, SeqEquiv[Double]) => Unit,
    updateCharacterStream: (Double, XInputStream, Double) => Unit,
    updateDate: (Double, Date) => Unit,
    updateDouble: (Double, Double) => Unit,
    updateFloat: (Double, Double) => Unit,
    updateInt: (Double, Double) => Unit,
    updateLong: (Double, Double) => Unit,
    updateNull: Double => Unit,
    updateNumericObject: (Double, js.Any, Double) => Unit,
    updateObject: (Double, js.Any) => Unit,
    updateShort: (Double, Double) => Unit,
    updateString: (Double, String) => Unit,
    updateTime: (Double, Time) => Unit,
    updateTimestamp: (Double, DateTime) => Unit
  ): XRowUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateBinaryStream = js.Any.fromFunction3(updateBinaryStream), updateBoolean = js.Any.fromFunction2(updateBoolean), updateByte = js.Any.fromFunction2(updateByte), updateBytes = js.Any.fromFunction2(updateBytes), updateCharacterStream = js.Any.fromFunction3(updateCharacterStream), updateDate = js.Any.fromFunction2(updateDate), updateDouble = js.Any.fromFunction2(updateDouble), updateFloat = js.Any.fromFunction2(updateFloat), updateInt = js.Any.fromFunction2(updateInt), updateLong = js.Any.fromFunction2(updateLong), updateNull = js.Any.fromFunction1(updateNull), updateNumericObject = js.Any.fromFunction3(updateNumericObject), updateObject = js.Any.fromFunction2(updateObject), updateShort = js.Any.fromFunction2(updateShort), updateString = js.Any.fromFunction2(updateString), updateTime = js.Any.fromFunction2(updateTime), updateTimestamp = js.Any.fromFunction2(updateTimestamp))
    __obj.asInstanceOf[XRowUpdate]
  }
  
  @scala.inline
  implicit class XRowUpdateOps[Self <: XRowUpdate] (val x: Self) extends AnyVal {
    
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
    def setUpdateBinaryStream(value: (Double, XInputStream, Double) => Unit): Self = this.set("updateBinaryStream", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateBoolean(value: (Double, Boolean) => Unit): Self = this.set("updateBoolean", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateByte(value: (Double, Double) => Unit): Self = this.set("updateByte", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateBytes(value: (Double, SeqEquiv[Double]) => Unit): Self = this.set("updateBytes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateCharacterStream(value: (Double, XInputStream, Double) => Unit): Self = this.set("updateCharacterStream", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateDate(value: (Double, Date) => Unit): Self = this.set("updateDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateDouble(value: (Double, Double) => Unit): Self = this.set("updateDouble", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateFloat(value: (Double, Double) => Unit): Self = this.set("updateFloat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateInt(value: (Double, Double) => Unit): Self = this.set("updateInt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateLong(value: (Double, Double) => Unit): Self = this.set("updateLong", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateNull(value: Double => Unit): Self = this.set("updateNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateNumericObject(value: (Double, js.Any, Double) => Unit): Self = this.set("updateNumericObject", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateObject(value: (Double, js.Any) => Unit): Self = this.set("updateObject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateShort(value: (Double, Double) => Unit): Self = this.set("updateShort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateString(value: (Double, String) => Unit): Self = this.set("updateString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateTime(value: (Double, Time) => Unit): Self = this.set("updateTime", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateTimestamp(value: (Double, DateTime) => Unit): Self = this.set("updateTimestamp", js.Any.fromFunction2(value))
  }
}
