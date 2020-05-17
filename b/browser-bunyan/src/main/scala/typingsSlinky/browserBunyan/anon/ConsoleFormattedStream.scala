package typingsSlinky.browserBunyan.anon

import typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleFormattedStream extends js.Object {
  var ConsoleFormattedStream: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream = js.native
  var ConsoleRawStream: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleRawStream = js.native
}

object ConsoleFormattedStream {
  @scala.inline
  def apply(
    ConsoleFormattedStream: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream,
    ConsoleRawStream: ConsoleRawStream
  ): ConsoleFormattedStream = {
    val __obj = js.Dynamic.literal(ConsoleFormattedStream = ConsoleFormattedStream.asInstanceOf[js.Any], ConsoleRawStream = ConsoleRawStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFormattedStream]
  }
  @scala.inline
  implicit class ConsoleFormattedStreamOps[Self <: ConsoleFormattedStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsoleFormattedStream(value: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsoleFormattedStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsoleRawStream(value: ConsoleRawStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsoleRawStream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

