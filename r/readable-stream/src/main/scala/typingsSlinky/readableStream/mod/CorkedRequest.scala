package typingsSlinky.readableStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_writable ====
@js.native
trait CorkedRequest extends js.Object {
  var entry: js.Any = js.native
  var next: js.Any = js.native
  def finish(): Unit = js.native
}

object CorkedRequest {
  @scala.inline
  def apply(entry: js.Any, finish: () => Unit, next: js.Any): CorkedRequest = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorkedRequest]
  }
  @scala.inline
  implicit class CorkedRequestOps[Self <: CorkedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntry(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

