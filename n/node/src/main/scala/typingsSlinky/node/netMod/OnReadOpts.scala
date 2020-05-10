package typingsSlinky.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnReadOpts extends js.Object {
  var buffer: js.typedarray.Uint8Array | js.Function0[js.typedarray.Uint8Array] = js.native
  /**
    * This function is called for every chunk of incoming data.
    * Two arguments are passed to it: the number of bytes written to buffer and a reference to buffer.
    * Return false from this function to implicitly pause() the socket.
    */
  def callback(bytesWritten: Double, buf: js.typedarray.Uint8Array): Boolean = js.native
}

object OnReadOpts {
  @scala.inline
  def apply(
    buffer: js.typedarray.Uint8Array | js.Function0[js.typedarray.Uint8Array],
    callback: (Double, js.typedarray.Uint8Array) => Boolean
  ): OnReadOpts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback))
    __obj.asInstanceOf[OnReadOpts]
  }
  @scala.inline
  implicit class OnReadOptsOps[Self <: OnReadOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferFunction0(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuffer(value: js.typedarray.Uint8Array | js.Function0[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: (Double, js.typedarray.Uint8Array) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

