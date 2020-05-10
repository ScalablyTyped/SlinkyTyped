package typingsSlinky.msgpackLite.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoder extends js.Object {
  var bufferish: js.Any = js.native
  var maxBufferSize: Double = js.native
  var minBufferSize: Double = js.native
  var offset: Double = js.native
  var start: Double = js.native
  def encode(chunk: js.Any): Unit = js.native
  def end(chunk: js.Any): Unit = js.native
  def fetch(): Unit = js.native
  def flush(): Unit = js.native
  def pull(): Double = js.native
  def push(chunk: js.Any): Unit = js.native
  def read(): Double = js.native
  def reserve(length: Double): Double = js.native
  def send(buffer: Buffer): Unit = js.native
  def write(chunk: js.Any): Unit = js.native
}

object Encoder {
  @scala.inline
  def apply(
    bufferish: js.Any,
    encode: js.Any => Unit,
    end: js.Any => Unit,
    fetch: () => Unit,
    flush: () => Unit,
    maxBufferSize: Double,
    minBufferSize: Double,
    offset: Double,
    pull: () => Double,
    push: js.Any => Unit,
    read: () => Double,
    reserve: Double => Double,
    send: Buffer => Unit,
    start: Double,
    write: js.Any => Unit
  ): Encoder = {
    val __obj = js.Dynamic.literal(bufferish = bufferish.asInstanceOf[js.Any], encode = js.Any.fromFunction1(encode), end = js.Any.fromFunction1(end), fetch = js.Any.fromFunction0(fetch), flush = js.Any.fromFunction0(flush), maxBufferSize = maxBufferSize.asInstanceOf[js.Any], minBufferSize = minBufferSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pull = js.Any.fromFunction0(pull), push = js.Any.fromFunction1(push), read = js.Any.fromFunction0(read), reserve = js.Any.fromFunction1(reserve), send = js.Any.fromFunction1(send), start = start.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Encoder]
  }
  @scala.inline
  implicit class EncoderOps[Self <: Encoder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferish(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncode(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFetch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaxBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReserve(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSend(value: Buffer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

