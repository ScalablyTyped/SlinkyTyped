package typingsSlinky.reactNative

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap {
  var readystatechange: Event_ = js.native
}

object XMLHttpRequestEventMap {
  @scala.inline
  def apply(
    abort: ProgressEvent,
    error: ProgressEvent,
    load: ProgressEvent,
    loadend: ProgressEvent,
    loadstart: ProgressEvent,
    progress: ProgressEvent,
    readystatechange: Event_,
    timeout: ProgressEvent
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
  @scala.inline
  implicit class XMLHttpRequestEventMapOps[Self <: XMLHttpRequestEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadystatechange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readystatechange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

