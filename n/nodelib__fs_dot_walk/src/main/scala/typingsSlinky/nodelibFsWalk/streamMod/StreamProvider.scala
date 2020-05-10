package typingsSlinky.nodelibFsWalk.streamMod

import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProvider extends js.Object {
  val _reader: typingsSlinky.nodelibFsWalk.readersAsyncMod.default = js.native
  val _root: js.Any = js.native
  val _settings: js.Any = js.native
  val _stream: Readable = js.native
  def read(): Readable = js.native
}

object StreamProvider {
  @scala.inline
  def apply(
    _reader: typingsSlinky.nodelibFsWalk.readersAsyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    _stream: Readable,
    read: () => Readable
  ): StreamProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _stream = _stream.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[StreamProvider]
  }
  @scala.inline
  implicit class StreamProviderOps[Self <: StreamProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_reader(value: typingsSlinky.nodelibFsWalk.readersAsyncMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_reader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_root(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_settings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_stream(value: Readable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: () => Readable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

