package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the basic interface to read data from a stream.
  *
  * See the [streaming document]{@link url="http://udk.openoffice.org/common/man/concept/streams.html"} for further information on chaining and piping
  * streams.
  */
@js.native
trait XInputStream extends XInterface {
  
  /**
    * states how many bytes can be read or skipped without blocking.
    *
    * Note: This method offers no information on whether the EOF has been reached.
    */
  def available(): Double = js.native
  
  /**
    * closes the stream.
    *
    * Users must close the stream explicitly when no further reading should be done. (There may exist ring references to chained objects that can only be
    * released during this call. Thus not calling this method would result in a leak of memory or external resources.)
    */
  def closeInput(): Unit = js.native
  
  /**
    * reads the specified number of bytes in the given sequence.
    *
    * The return value specifies the number of bytes which have been put into the sequence. A difference between **nBytesToRead** and the return value
    * indicates that EOF has been reached. This means that the method blocks until the specified number of bytes are available or the EOF is reached.
    * @param aData after the call, the byte sequence contains the requested number of bytes (or less as a sign of EOF). ;  C++ only : Note that for unbridged
    * @param nBytesToRead the total number of bytes to read
    */
  def readBytes(aData: js.Array[SeqEquiv[Double]], nBytesToRead: Double): Double = js.native
  
  /**
    * reads the available number of bytes, at maximum **nMaxBytesToRead** .
    *
    * This method is very similar to the readBytes method, except that it has different blocking behaviour. The method blocks as long as at least 1 byte is
    * available or EOF has been reached. EOF has only been reached, when the method returns 0 and the corresponding byte sequence is empty. Otherwise, after
    * the call, aData contains the available, but no more than nMaxBytesToRead, bytes.
    * @param aData contains the data read from the stream.
    * @param nMaxBytesToRead The maximum number of bytes to be read from this stream during the call.
    * @see com.sun.star.io.XInputStream.readBytes
    */
  def readSomeBytes(aData: js.Array[SeqEquiv[Double]], nMaxBytesToRead: Double): Double = js.native
  
  /**
    * skips the next **nBytesToSkip** bytes (must be positive).
    *
    * It is up to the implementation whether this method is blocking the thread or not.
    * @param nBytesToSkip number of bytes to skip
    */
  def skipBytes(nBytesToSkip: Double): Unit = js.native
}
object XInputStream {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    queryInterface: `type` => js.Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    skipBytes: Double => Unit
  ): XInputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[XInputStream]
  }
  
  @scala.inline
  implicit class XInputStreamOps[Self <: XInputStream] (val x: Self) extends AnyVal {
    
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
    def setAvailable(value: () => Double): Self = this.set("available", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseInput(value: () => Unit): Self = this.set("closeInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadBytes(value: (js.Array[SeqEquiv[Double]], Double) => Double): Self = this.set("readBytes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReadSomeBytes(value: (js.Array[SeqEquiv[Double]], Double) => Double): Self = this.set("readSomeBytes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSkipBytes(value: Double => Unit): Self = this.set("skipBytes", js.Any.fromFunction1(value))
  }
}
