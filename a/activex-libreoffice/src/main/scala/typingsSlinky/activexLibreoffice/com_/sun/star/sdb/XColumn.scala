package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XArray
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XClob
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XRef
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Date
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Time
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to access data which is collected in a row. */
@js.native
trait XColumn extends XInterface {
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Array: XArray = js.native
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARBINARY or LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val BinaryStream: XInputStream = js.native
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Blob: XBlob = js.native
  /**
    * gets the value of a column in the current row as boolean.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Boolean: scala.Boolean = js.native
  /**
    * gets the value of a column in the current row as a byte.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Byte: scala.Double = js.native
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Bytes: SafeArray[scala.Double] = js.native
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val CharacterStream: XInputStream = js.native
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Clob: XClob = js.native
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Date: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date = js.native
  /**
    * gets the value of a column in the current row as a double.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Double: scala.Double = js.native
  /**
    * gets the value of a column in the current row as a float.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Float: scala.Double = js.native
  /**
    * gets the value of a column in the current row as a long.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Int: scala.Double = js.native
  /**
    * gets the value of a column in the current row as a hyper.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Long: scala.Double = js.native
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Ref: XRef = js.native
  /**
    * gets the value of a column in the current row as a short.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Short: scala.Double = js.native
  /**
    * gets the value of a column in the current row as a String.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val String: java.lang.String = js.native
  /**
    * gets the value of a column in the current row as a time object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Time: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time = js.native
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Timestamp: DateTime = js.native
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getArray(): XArray = js.native
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARBINARY or LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBinaryStream(): XInputStream = js.native
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBlob(): XBlob = js.native
  /**
    * gets the value of a column in the current row as boolean.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBoolean(): scala.Boolean = js.native
  /**
    * gets the value of a column in the current row as a byte.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getByte(): scala.Double = js.native
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBytes(): SafeArray[scala.Double] = js.native
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getCharacterStream(): XInputStream = js.native
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getClob(): XClob = js.native
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDate(): typingsSlinky.activexLibreoffice.com_.sun.star.util.Date = js.native
  /**
    * gets the value of a column in the current row as a double.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDouble(): scala.Double = js.native
  /**
    * gets the value of a column in the current row as a float.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getFloat(): scala.Double = js.native
  /**
    * gets the value of a column in the current row as a long.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getInt(): scala.Double = js.native
  /**
    * gets the value of a column in the current row as a hyper.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getLong(): scala.Double = js.native
  /**
    * @param typeMap the type map is used to fetch the correct type
    * @returns the value of a column in the current row as an object. This method uses the given `Map` object for the custom mapping of the SQL structure or dis
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getObject(typeMap: XNameAccess): js.Any = js.native
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getRef(): XRef = js.native
  /**
    * gets the value of a column in the current row as a short.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getShort(): scala.Double = js.native
  /**
    * gets the value of a column in the current row as a String.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getString(): java.lang.String = js.native
  /**
    * gets the value of a column in the current row as a time object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTime(): typingsSlinky.activexLibreoffice.com_.sun.star.util.Time = js.native
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTimestamp(): DateTime = js.native
  /**
    * reports whether the last column read had a value of SQL NULL. Note that you must first call getXXX on a column to try to read its value and then call
    * `wasNull()` to see if the value read was SQL NULL.
    * @returns `TRUE` if so
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def wasNull(): scala.Boolean = js.native
}

object XColumn {
  @scala.inline
  def apply(
    Array: XArray,
    BinaryStream: XInputStream,
    Blob: XBlob,
    Boolean: Boolean,
    Byte: Double,
    Bytes: SafeArray[Double],
    CharacterStream: XInputStream,
    Clob: XClob,
    Date: Date,
    Double: Double,
    Float: Double,
    Int: Double,
    Long: Double,
    Ref: XRef,
    Short: Double,
    String: String,
    Time: Time,
    Timestamp: DateTime,
    acquire: () => Unit,
    getArray: () => XArray,
    getBinaryStream: () => XInputStream,
    getBlob: () => XBlob,
    getBoolean: () => Boolean,
    getByte: () => Double,
    getBytes: () => SafeArray[Double],
    getCharacterStream: () => XInputStream,
    getClob: () => XClob,
    getDate: () => Date,
    getDouble: () => Double,
    getFloat: () => Double,
    getInt: () => Double,
    getLong: () => Double,
    getObject: XNameAccess => js.Any,
    getRef: () => XRef,
    getShort: () => Double,
    getString: () => String,
    getTime: () => Time,
    getTimestamp: () => DateTime,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    wasNull: () => Boolean
  ): XColumn = {
    val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], BinaryStream = BinaryStream.asInstanceOf[js.Any], Blob = Blob.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Byte = Byte.asInstanceOf[js.Any], Bytes = Bytes.asInstanceOf[js.Any], CharacterStream = CharacterStream.asInstanceOf[js.Any], Clob = Clob.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], Ref = Ref.asInstanceOf[js.Any], Short = Short.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getArray = js.Any.fromFunction0(getArray), getBinaryStream = js.Any.fromFunction0(getBinaryStream), getBlob = js.Any.fromFunction0(getBlob), getBoolean = js.Any.fromFunction0(getBoolean), getByte = js.Any.fromFunction0(getByte), getBytes = js.Any.fromFunction0(getBytes), getCharacterStream = js.Any.fromFunction0(getCharacterStream), getClob = js.Any.fromFunction0(getClob), getDate = js.Any.fromFunction0(getDate), getDouble = js.Any.fromFunction0(getDouble), getFloat = js.Any.fromFunction0(getFloat), getInt = js.Any.fromFunction0(getInt), getLong = js.Any.fromFunction0(getLong), getObject = js.Any.fromFunction1(getObject), getRef = js.Any.fromFunction0(getRef), getShort = js.Any.fromFunction0(getShort), getString = js.Any.fromFunction0(getString), getTime = js.Any.fromFunction0(getTime), getTimestamp = js.Any.fromFunction0(getTimestamp), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), wasNull = js.Any.fromFunction0(wasNull))
    __obj.asInstanceOf[XColumn]
  }
  @scala.inline
  implicit class XColumnOps[Self <: XColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: XArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryStream(value: XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlob(value: XBlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Byte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytes(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacterStream(value: XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClob(value: XClob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDouble(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Double")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Int")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLong(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: XRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("String")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArray(value: () => XArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBinaryStream(value: () => XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBinaryStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBlob(value: () => XBlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBoolean(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetByte(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByte")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBytes(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBytes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCharacterStream(value: () => XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharacterStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClob(value: () => XClob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDate(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDouble(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDouble")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFloat(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFloat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInt(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLong(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLong")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetObject(value: XNameAccess => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRef(value: () => XRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetShort(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTime(value: () => Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimestamp(value: () => DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimestamp")(js.Any.fromFunction0(value))
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

