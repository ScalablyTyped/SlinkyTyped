package typingsSlinky.rnFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobReadStream extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.native
  var closed: Boolean = js.native
  var encoding: Encoding = js.native
  var path: String = js.native
  var tick: Double = js.native
  def onData(fn: js.Function1[/* chunk */ String | js.Array[Double], Unit]): Unit = js.native
  def onEnd(fn: js.Function0[Unit]): Unit = js.native
  def onError(fn: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def open(): Unit = js.native
}

object RNFetchBlobReadStream {
  @scala.inline
  def apply(
    closed: Boolean,
    encoding: Encoding,
    onData: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Unit,
    onEnd: js.Function0[Unit] => Unit,
    onError: js.Function1[/* err */ js.Any, Unit] => Unit,
    open: () => Unit,
    path: String,
    tick: Double
  ): RNFetchBlobReadStream = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], onData = js.Any.fromFunction1(onData), onEnd = js.Any.fromFunction1(onEnd), onError = js.Any.fromFunction1(onError), open = js.Any.fromFunction0(open), path = path.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobReadStream]
  }
  @scala.inline
  implicit class RNFetchBlobReadStreamOps[Self <: RNFetchBlobReadStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: Encoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnData(value: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEnd(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnError(value: js.Function1[/* err */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTick(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
  }
  
}

