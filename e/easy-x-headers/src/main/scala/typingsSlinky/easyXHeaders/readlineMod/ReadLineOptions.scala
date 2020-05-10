package typingsSlinky.easyXHeaders.readlineMod

import typingsSlinky.easyXHeaders.NodeJS.ReadableStream
import typingsSlinky.easyXHeaders.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[js.Function] = js.native
  var input: ReadableStream = js.native
  var output: WritableStream = js.native
  var terminal: js.UndefOr[Boolean] = js.native
}

object ReadLineOptions {
  @scala.inline
  def apply(input: ReadableStream, output: WritableStream): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLineOptions]
  }
  @scala.inline
  implicit class ReadLineOptionsOps[Self <: ReadLineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completer")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(js.undefined)
        ret
    }
  }
  
}

