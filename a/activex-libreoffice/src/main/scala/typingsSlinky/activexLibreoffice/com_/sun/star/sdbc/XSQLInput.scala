package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Date
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Time
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an input stream that contains a stream of values representing an instance of a SQL structured or distinct type.
  *
  * This interface, used only for custom mapping, is used by the driver behind the scenes, and a programmer never directly invokes `SQLInput` methods.
  *
  * When the method `getObject` is called with an object of a service implementing the interface `SQLData` , the SDBC driver calls the method
  * com::sun::star::sdbc::XSQLData::getSQLType() to determine the SQL type of the user-defined type (UDT) being custom mapped. The driver creates an
  * instance of {@link com.sun.star.sdbc.XSQLInput} , populating it with the attributes of the UDT. The driver then passes the input stream to the method
  * {@link com.sun.star.sdbc.XSQLData.readSQL()} , which in turn calls the `XSQLInput.readXXX` methods in its implementation for reading the attributes
  * from the input stream.
  */
@js.native
trait XSQLInput extends XInterface {
  /**
    * reads an array from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readArray(): XArray = js.native
  /**
    * reads the next attribute in the stream as sequence of bytes.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBinaryStream(): XInputStream = js.native
  /**
    * reads a BLOB from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBlob(): XBlob = js.native
  /**
    * reads the next attribute in the stream as boolean.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBoolean(): Boolean = js.native
  /**
    * reads the next attribute in the stream as byte.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readByte(): Double = js.native
  /**
    * reads the next attribute in the stream as sequence of bytes.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBytes(): SafeArray[Double] = js.native
  /**
    * reads the next attribute in the stream as a Unicode string.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readCharacterStream(): XInputStream = js.native
  /**
    * reads a CLOB from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readClob(): XClob = js.native
  /**
    * reads the next attribute in the stream as date.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readDate(): Date = js.native
  /**
    * reads the next attribute in the stream as double.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readDouble(): Double = js.native
  /**
    * reads the next attribute in the stream as float.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readFloat(): Double = js.native
  /**
    * reads the next attribute in the stream as long.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readInt(): Double = js.native
  /**
    * reads the next attribute in the stream as hyper.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readLong(): Double = js.native
  /**
    * returns the datum at the head of the stream as an any.
    *
    * The actual type of the any returned is determined by the default type mapping, and any customizations present in this stream's type map.
    *
    * ;  A type map is registered with the stream by the SDBC driver before the stream is passed to the application.
    *
    * ;  When the datum at the head of the stream is a SQL NULL, the method returns `VOID` . If the datum is a SQL structured or distinct type, it
    * determines the SQL type of the datum at the head of the stream, constructs an object of the appropriate service, and calls the method {@link
    * com.sun.star.sdbc.XSQLData.readSQL()} on that object, which reads additional data from the stream using the protocol described for that method.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readObject(): js.Any = js.native
  /**
    * reads a REF(&lt;structured-type&gt;) from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readRef(): XRef = js.native
  /**
    * reads the next attribute in the stream as short.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readShort(): Double = js.native
  /**
    * reads the next attribute in the stream as string.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readString(): String = js.native
  /**
    * reads the next attribute in the stream as time.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readTime(): Time = js.native
  /**
    * reads the next attribute in the stream as datetime.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readTimestamp(): DateTime = js.native
  /**
    * determines whether the last value read was null.
    * @returns `TRUE` if the most recently gotten SQL value was null; otherwise, `FALSE`
    * @throws SQLException if a database access error occurs.
    */
  def wasNull(): Boolean = js.native
}

object XSQLInput {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    readArray: () => XArray,
    readBinaryStream: () => XInputStream,
    readBlob: () => XBlob,
    readBoolean: () => Boolean,
    readByte: () => Double,
    readBytes: () => SafeArray[Double],
    readCharacterStream: () => XInputStream,
    readClob: () => XClob,
    readDate: () => Date,
    readDouble: () => Double,
    readFloat: () => Double,
    readInt: () => Double,
    readLong: () => Double,
    readObject: () => js.Any,
    readRef: () => XRef,
    readShort: () => Double,
    readString: () => String,
    readTime: () => Time,
    readTimestamp: () => DateTime,
    release: () => Unit,
    wasNull: () => Boolean
  ): XSQLInput = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readArray = js.Any.fromFunction0(readArray), readBinaryStream = js.Any.fromFunction0(readBinaryStream), readBlob = js.Any.fromFunction0(readBlob), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction0(readBytes), readCharacterStream = js.Any.fromFunction0(readCharacterStream), readClob = js.Any.fromFunction0(readClob), readDate = js.Any.fromFunction0(readDate), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readInt = js.Any.fromFunction0(readInt), readLong = js.Any.fromFunction0(readLong), readObject = js.Any.fromFunction0(readObject), readRef = js.Any.fromFunction0(readRef), readShort = js.Any.fromFunction0(readShort), readString = js.Any.fromFunction0(readString), readTime = js.Any.fromFunction0(readTime), readTimestamp = js.Any.fromFunction0(readTimestamp), release = js.Any.fromFunction0(release), wasNull = js.Any.fromFunction0(wasNull))
    __obj.asInstanceOf[XSQLInput]
  }
  @scala.inline
  implicit class XSQLInputOps[Self <: XSQLInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadArray(value: () => XArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadBinaryStream(value: () => XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBinaryStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadBlob(value: () => XBlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBlob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadBoolean(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBoolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadByte(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readByte")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadBytes(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBytes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadCharacterStream(value: () => XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCharacterStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadClob(value: () => XClob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readClob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadDate(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadDouble(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDouble")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadFloat(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFloat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadInt(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readInt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadLong(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readLong")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadObject(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadRef(value: () => XRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadShort(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readShort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadTime(value: () => Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadTimestamp(value: () => DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimestamp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWasNull(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasNull")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

