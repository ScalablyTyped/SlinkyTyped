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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWriteArray(value: XArray => Unit): Self = this.set("writeArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteBinaryStream(value: XInputStream => Unit): Self = this.set("writeBinaryStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteBlob(value: XBlob => Unit): Self = this.set("writeBlob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteBoolean(value: Boolean => Unit): Self = this.set("writeBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteByte(value: Double => Unit): Self = this.set("writeByte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteBytes(value: SeqEquiv[Double] => Unit): Self = this.set("writeBytes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteCharacterStream(value: XInputStream => Unit): Self = this.set("writeCharacterStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteClob(value: XClob => Unit): Self = this.set("writeClob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteDate(value: Date => Unit): Self = this.set("writeDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteDouble(value: Double => Unit): Self = this.set("writeDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteFloat(value: Double => Unit): Self = this.set("writeFloat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteInt(value: Double => Unit): Self = this.set("writeInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteLong(value: Double => Unit): Self = this.set("writeLong", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteObject(value: XSQLData => Unit): Self = this.set("writeObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteRef(value: XRef => Unit): Self = this.set("writeRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteShort(value: Double => Unit): Self = this.set("writeShort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteString(value: String => Unit): Self = this.set("writeString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteStruct(value: XStruct => Unit): Self = this.set("writeStruct", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteTime(value: Time => Unit): Self = this.set("writeTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteTimestamp(value: DateTime => Unit): Self = this.set("writeTimestamp", js.Any.fromFunction1(value))
  }
}
