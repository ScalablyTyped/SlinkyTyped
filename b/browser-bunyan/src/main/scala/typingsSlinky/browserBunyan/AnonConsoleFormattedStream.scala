package typingsSlinky.browserBunyan

import typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream
import typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConsoleFormattedStream extends js.Object {
  var ConsoleFormattedStream: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream = js.native
  var ConsoleRawStream: typingsSlinky.browserBunyan.mod.BrowserBunyan.ConsoleRawStream = js.native
}

object AnonConsoleFormattedStream {
  @scala.inline
  def apply(ConsoleFormattedStream: ConsoleFormattedStream, ConsoleRawStream: ConsoleRawStream): AnonConsoleFormattedStream = {
    val __obj = js.Dynamic.literal(ConsoleFormattedStream = ConsoleFormattedStream.asInstanceOf[js.Any], ConsoleRawStream = ConsoleRawStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsoleFormattedStream]
  }
  @scala.inline
  implicit class AnonConsoleFormattedStreamOps[Self <: AnonConsoleFormattedStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsoleFormattedStream(value: ConsoleFormattedStream): Self = {
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

