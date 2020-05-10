package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintWriter extends js.Object {
  /**
    *   Clears the data already written to the PrintWriter
    *   object
    */
  def clear(): Unit = js.native
  /**
    *   Closes the PrintWriter
    */
  def close(): Unit = js.native
  /**
    *   Writes data to the PrintWriter stream, and adds a
    *   new line at the end
    *   @param data all data to be printed by the
    *   PrintWriter
    */
  def print(data: js.Array[_]): Unit = js.native
  /**
    *   Writes data to the PrintWriter stream
    *   @param data all data to be written by the
    *   PrintWriter
    */
  def write(data: js.Array[_]): Unit = js.native
}

object PrintWriter {
  @scala.inline
  def apply(clear: () => Unit, close: () => Unit, print: js.Array[_] => Unit, write: js.Array[_] => Unit): PrintWriter = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), close = js.Any.fromFunction0(close), print = js.Any.fromFunction1(print), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[PrintWriter]
  }
  @scala.inline
  implicit class PrintWriterOps[Self <: PrintWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrint(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

