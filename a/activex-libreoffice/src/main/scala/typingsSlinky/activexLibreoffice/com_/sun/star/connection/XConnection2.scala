package typingsSlinky.activexLibreoffice.com_.sun.star.connection

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** {@link XConnection2} extends the `XConnection` interface with `available` and `readSomeBytes` */
@js.native
trait XConnection2 extends XConnection {
  /** Gives the number of bytes available via `read` without blocking. */
  def available(): Double = js.native
  /** Blocks if no data is available otherwise reads at max **nMaxBytesToRead** but at least 1 byte. */
  def readSomeBytes(aData: js.Array[SeqEquiv[Double]], nMaxBytesToRead: Double): Double = js.native
}

object XConnection2 {
  @scala.inline
  def apply(
    Description: String,
    acquire: () => Unit,
    available: () => Double,
    close: () => Unit,
    flush: () => Unit,
    getDescription: () => String,
    queryInterface: `type` => js.Any,
    read: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    write: SeqEquiv[Double] => Unit
  ): XConnection2 = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), getDescription = js.Any.fromFunction0(getDescription), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction2(read), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[XConnection2]
  }
  @scala.inline
  implicit class XConnection2Ops[Self <: XConnection2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadSomeBytes(value: (js.Array[SeqEquiv[Double]], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSomeBytes")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

