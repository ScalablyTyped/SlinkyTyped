package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Date
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to update data which is collected in a row. */
@js.native
trait XColumnUpdate extends XInterface {
  /**
    * updates a column with a stream value.
    * @param x the new column value
    * @param length the length of the stream
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBinaryStream(x: XInputStream, length: Double): Unit = js.native
  /**
    * updates a column with a boolean value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBoolean(x: Boolean): Unit = js.native
  /**
    * updates a column with a byte value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateByte(x: Double): Unit = js.native
  /**
    * updates a column with a byte array value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBytes(x: SeqEquiv[Double]): Unit = js.native
  /**
    * updates a column with a stream value.
    * @param x the new column value
    * @param length the length of the stream
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateCharacterStream(x: XInputStream, length: Double): Unit = js.native
  /**
    * updates a column with a Date value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateDate(x: Date): Unit = js.native
  /**
    * updates a column with a double value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateDouble(x: Double): Unit = js.native
  /**
    * updates a column with a float value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateFloat(x: Double): Unit = js.native
  /**
    * updates a column with a long value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateInt(x: Double): Unit = js.native
  /**
    * updates a column with a hyper value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateLong(x: Double): Unit = js.native
  /**
    * gives a nullable column a null value.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateNull(): Unit = js.native
  /**
    * updates a column with an Object value.
    * @param x the new column value
    * @param scale the scale
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateNumericObject(x: js.Any, scale: Double): Unit = js.native
  /**
    * updates a column with an Object value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateObject(x: js.Any): Unit = js.native
  /**
    * updates a column with a short value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateShort(x: Double): Unit = js.native
  /**
    * updates a column with a string value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateString(x: String): Unit = js.native
  /**
    * updates a column with a Time value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateTime(x: Time): Unit = js.native
  /**
    * updates a column with a Timestamp value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateTimestamp(x: DateTime): Unit = js.native
}

object XColumnUpdate {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateBinaryStream: (XInputStream, Double) => Unit,
    updateBoolean: Boolean => Unit,
    updateByte: Double => Unit,
    updateBytes: SeqEquiv[Double] => Unit,
    updateCharacterStream: (XInputStream, Double) => Unit,
    updateDate: Date => Unit,
    updateDouble: Double => Unit,
    updateFloat: Double => Unit,
    updateInt: Double => Unit,
    updateLong: Double => Unit,
    updateNull: () => Unit,
    updateNumericObject: (js.Any, Double) => Unit,
    updateObject: js.Any => Unit,
    updateShort: Double => Unit,
    updateString: String => Unit,
    updateTime: Time => Unit,
    updateTimestamp: DateTime => Unit
  ): XColumnUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateBinaryStream = js.Any.fromFunction2(updateBinaryStream), updateBoolean = js.Any.fromFunction1(updateBoolean), updateByte = js.Any.fromFunction1(updateByte), updateBytes = js.Any.fromFunction1(updateBytes), updateCharacterStream = js.Any.fromFunction2(updateCharacterStream), updateDate = js.Any.fromFunction1(updateDate), updateDouble = js.Any.fromFunction1(updateDouble), updateFloat = js.Any.fromFunction1(updateFloat), updateInt = js.Any.fromFunction1(updateInt), updateLong = js.Any.fromFunction1(updateLong), updateNull = js.Any.fromFunction0(updateNull), updateNumericObject = js.Any.fromFunction2(updateNumericObject), updateObject = js.Any.fromFunction1(updateObject), updateShort = js.Any.fromFunction1(updateShort), updateString = js.Any.fromFunction1(updateString), updateTime = js.Any.fromFunction1(updateTime), updateTimestamp = js.Any.fromFunction1(updateTimestamp))
    __obj.asInstanceOf[XColumnUpdate]
  }
  @scala.inline
  implicit class XColumnUpdateOps[Self <: XColumnUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateBinaryStream(value: (XInputStream, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBinaryStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateBoolean(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBoolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateByte(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateByte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateBytes(value: SeqEquiv[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBytes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateCharacterStream(value: (XInputStream, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCharacterStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateDate(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateDouble(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDouble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateFloat(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFloat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateInt(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateLong(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLong")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateNull(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateNumericObject(value: (js.Any, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNumericObject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateObject(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateShort(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateShort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateTime(value: Time => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateTimestamp(value: DateTime => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTimestamp")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

