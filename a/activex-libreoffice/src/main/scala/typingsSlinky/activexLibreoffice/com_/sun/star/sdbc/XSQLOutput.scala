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
import scala.scalajs.js.annotation._

/**
  * is used as an output stream for writing the attributes of a user-defined type back to the database. This interface, used only for custom mapping, is
  * used by the driver, and its methods are never directly invoked by a programmer.
  *
  * When an object of a class implementing interface {@link com.sun.star.sdbc.XSQLData} is passed as an argument to a SQL statement, the JDBC driver calls
  * com::sun::star::sdbc::SQLData::getSQLType() to determine the kind of SQL datum being passed to the database. ;  The driver then creates an instance of
  * `XSQLOutput` and passes it to the method {@link com.sun.star.sdbc.XSQLData.writeSQL()} . The method `writeSQL` in turn calls the appropriate
  * `XSQLOutput.writeXXX` methods to write data from the {@link com.sun.star.sdbc.XSQLData} object to the `XSQLOutput` output stream as the representation
  * of a SQL user-defined type.
  */
@js.native
trait XSQLOutput extends XInterface {
  /**
    * writes an array to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeArray(x: XArray): Unit = js.native
  /**
    * writes the next attribute to the stream as a stream of uninterpreted bytes.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBinaryStream(x: XInputStream): Unit = js.native
  /**
    * writes a BLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBlob(x: XBlob): Unit = js.native
  /**
    * writes the next attribute to the stream as boolean.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBoolean(x: Boolean): Unit = js.native
  /**
    * writes the next attribute to the stream as byte.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeByte(x: Double): Unit = js.native
  /**
    * writes the next attribute to the stream as byte sequence.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBytes(x: SeqEquiv[Double]): Unit = js.native
  /**
    * writes the next attribute to the stream as a stream of Unicode string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeCharacterStream(x: XInputStream): Unit = js.native
  /**
    * writes a CLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeClob(x: XClob): Unit = js.native
  /**
    * writes the next attribute to the stream as a date.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDate(x: Date): Unit = js.native
  /**
    * writes the next attribute to the stream as double.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDouble(x: Double): Unit = js.native
  /**
    * writes the next attribute to the stream as float.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeFloat(x: Double): Unit = js.native
  /**
    * writes the next attribute to the stream as long.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeInt(x: Double): Unit = js.native
  /**
    * writes the next attribute to the stream as hyper.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeLong(x: Double): Unit = js.native
  /**
    * writes to the stream the data contained in the given `XSQLData` object.
    *
    * When the `XSQLData` object is `NULL` , this method writes an SQL NULL to the stream. Otherwise, it calls the {@link
    * com.sun.star.sdbc.XSQLData.writeSQL()} method of the given object, which writes the object's attributes to the stream. The implementation of the
    * method `XSQLData::writeSQL()` calls the appropriate `XSQLOutput.writeXXX` method(s) for writing each of the object's attributes in order. ;  The
    * attributes must be read from an {@link com.sun.star.sdbc.XSQLInput} input stream and written to an `XSQLOutput` output stream in the same order in
    * which they were listed in the SQL definition of the user-defined type.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeObject(x: XSQLData): Unit = js.native
  /**
    * writes a REF(&lt;structured-type&gt;) to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeRef(x: XRef): Unit = js.native
  /**
    * writes the next attribute to the stream as short.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeShort(x: Double): Unit = js.native
  /**
    * writes the next attribute to the stream as a string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeString(x: String): Unit = js.native
  /**
    * writes a structured-type to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeStruct(x: XStruct): Unit = js.native
  /**
    * writes the next attribute to the stream as a time.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTime(x: Time): Unit = js.native
  /**
    * writes the next attribute to the stream as a datetime.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTimestamp(x: DateTime): Unit = js.native
}

object XSQLOutput {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeArray: XArray => Unit,
    writeBinaryStream: XInputStream => Unit,
    writeBlob: XBlob => Unit,
    writeBoolean: Boolean => Unit,
    writeByte: Double => Unit,
    writeBytes: SeqEquiv[Double] => Unit,
    writeCharacterStream: XInputStream => Unit,
    writeClob: XClob => Unit,
    writeDate: Date => Unit,
    writeDouble: Double => Unit,
    writeFloat: Double => Unit,
    writeInt: Double => Unit,
    writeLong: Double => Unit,
    writeObject: XSQLData => Unit,
    writeRef: XRef => Unit,
    writeShort: Double => Unit,
    writeString: String => Unit,
    writeStruct: XStruct => Unit,
    writeTime: Time => Unit,
    writeTimestamp: DateTime => Unit
  ): XSQLOutput = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeArray = js.Any.fromFunction1(writeArray), writeBinaryStream = js.Any.fromFunction1(writeBinaryStream), writeBlob = js.Any.fromFunction1(writeBlob), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeCharacterStream = js.Any.fromFunction1(writeCharacterStream), writeClob = js.Any.fromFunction1(writeClob), writeDate = js.Any.fromFunction1(writeDate), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeInt = js.Any.fromFunction1(writeInt), writeLong = js.Any.fromFunction1(writeLong), writeObject = js.Any.fromFunction1(writeObject), writeRef = js.Any.fromFunction1(writeRef), writeShort = js.Any.fromFunction1(writeShort), writeString = js.Any.fromFunction1(writeString), writeStruct = js.Any.fromFunction1(writeStruct), writeTime = js.Any.fromFunction1(writeTime), writeTimestamp = js.Any.fromFunction1(writeTimestamp))
    __obj.asInstanceOf[XSQLOutput]
  }
  @scala.inline
  implicit class XSQLOutputOps[Self <: XSQLOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWriteArray(value: XArray => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteBinaryStream(value: XInputStream => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBinaryStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteBlob(value: XBlob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBlob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteBoolean(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBoolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteByte(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeByte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteBytes(value: SeqEquiv[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBytes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteCharacterStream(value: XInputStream => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeCharacterStream")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteClob(value: XClob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeClob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteDate(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteDouble(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeDouble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteFloat(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFloat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteInt(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteLong(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeLong")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteObject(value: XSQLData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteRef(value: XRef => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteShort(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeShort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteStruct(value: XStruct => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStruct")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteTime(value: Time => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteTimestamp(value: DateTime => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTimestamp")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

