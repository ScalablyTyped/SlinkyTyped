package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOStream extends js.Object {
  /**
    * The `InputStream` to read from.
    */
  var input: InputStream = js.native
  /**
    * The `OutputStream` to write to.
    */
  var output: OutputStream = js.native
  /**
    * Closes the stream, releasing resources related to it. This will also close the individual input and output
    * streams. Once the stream is closed, all other operations will fail. Closing a stream multiple times is allowed
    * and will not result in an error.
    */
  def close(): js.Promise[Unit] = js.native
}

object IOStream {
  @scala.inline
  def apply(close: () => js.Promise[Unit], input: InputStream, output: OutputStream): IOStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOStream]
  }
  @scala.inline
  implicit class IOStreamOps[Self <: IOStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInput(value: InputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: OutputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

