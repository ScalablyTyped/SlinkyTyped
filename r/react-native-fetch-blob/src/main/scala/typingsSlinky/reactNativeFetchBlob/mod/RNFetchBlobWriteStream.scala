package typingsSlinky.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobWriteStream extends js.Object {
  var append: Boolean = js.native
  var encoding: String = js.native
  var id: String = js.native
  def close(): Unit = js.native
  def write(data: String): js.Promise[Unit] = js.native
}

object RNFetchBlobWriteStream {
  @scala.inline
  def apply(
    append: Boolean,
    close: () => Unit,
    encoding: String,
    id: String,
    write: String => js.Promise[Unit]
  ): RNFetchBlobWriteStream = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), encoding = encoding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RNFetchBlobWriteStream]
  }
  @scala.inline
  implicit class RNFetchBlobWriteStreamOps[Self <: RNFetchBlobWriteStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

