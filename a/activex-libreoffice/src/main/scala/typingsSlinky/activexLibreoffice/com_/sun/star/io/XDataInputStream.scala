package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read machine-independent simple data types from a stream.
  * @see com.sun.star.io.XDataOutputStream
  */
@js.native
trait XDataInputStream extends XInputStream {
  /** reads in a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def readBoolean(): Double = js.native
  /** reads an 8-bit byte. */
  def readByte(): Double = js.native
  /** reads a 16-bit unicode character. */
  def readChar(): String = js.native
  /** reads a 64-bit IEEE double. */
  def readDouble(): Double = js.native
  /** reads a 32-bit IEEE float. */
  def readFloat(): Double = js.native
  /** reads a 64-bit big endian integer. */
  def readHyper(): Double = js.native
  /** reads a 32-bit big endian integer. */
  def readLong(): Double = js.native
  /** reads a 16-bit big endian integer. */
  def readShort(): Double = js.native
  /** reads a string of UTF encoded characters. */
  def readUTF(): String = js.native
}

object XDataInputStream {
  @scala.inline
  def apply(
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    queryInterface: `type` => js.Any,
    readBoolean: () => Double,
    readByte: () => Double,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readChar: () => String,
    readDouble: () => Double,
    readFloat: () => Double,
    readHyper: () => Double,
    readLong: () => Double,
    readShort: () => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readUTF: () => String,
    release: () => Unit,
    skipBytes: Double => Unit
  ): XDataInputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction2(readBytes), readChar = js.Any.fromFunction0(readChar), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readHyper = js.Any.fromFunction0(readHyper), readLong = js.Any.fromFunction0(readLong), readShort = js.Any.fromFunction0(readShort), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = js.Any.fromFunction0(readUTF), release = js.Any.fromFunction0(release), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[XDataInputStream]
  }
  @scala.inline
  implicit class XDataInputStreamOps[Self <: XDataInputStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadBoolean(value: () => Double): Self = {
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
    def withReadChar(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readChar")(js.Any.fromFunction0(value))
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
    def withReadHyper(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readHyper")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadLong(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readLong")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadShort(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readShort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadUTF(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUTF")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

