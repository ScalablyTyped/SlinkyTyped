package typingsSlinky.browserfs.emscriptenFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenStreamOps extends js.Object {
  def close(stream: EmscriptenStream): Unit = js.native
  def llseek(stream: EmscriptenStream, offset: Double, whence: Double): Double = js.native
  def open(stream: EmscriptenStream): Unit = js.native
  def read(
    stream: EmscriptenStream,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double
  ): Double = js.native
  def write(
    stream: EmscriptenStream,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double
  ): Double = js.native
}

object EmscriptenStreamOps {
  @scala.inline
  def apply(
    close: EmscriptenStream => Unit,
    llseek: (EmscriptenStream, Double, Double) => Double,
    open: EmscriptenStream => Unit,
    read: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double,
    write: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double
  ): EmscriptenStreamOps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), llseek = js.Any.fromFunction3(llseek), open = js.Any.fromFunction1(open), read = js.Any.fromFunction5(read), write = js.Any.fromFunction5(write))
    __obj.asInstanceOf[EmscriptenStreamOps]
  }
  @scala.inline
  implicit class EmscriptenStreamOpsOps[Self <: EmscriptenStreamOps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: EmscriptenStream => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLlseek(value: (EmscriptenStream, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("llseek")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOpen(value: EmscriptenStream => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withWrite(value: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

